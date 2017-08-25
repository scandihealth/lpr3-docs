## The document paradigm and CDA R2
LPR3 is based on a profiled version CDA R2 according to the needs of the LPR3 data model. The reported documents can be considered as containers of information that are bound to a single patient. Each document can contain zero to many elements, where elements can e.g. be episode of care, encounter, procedure, observation and act. The elements are arranged into sections according to CDA R2. Each element shall be marked up with the appropriate templateId in order to be evaluated and stored as part of LPR3. While elements that are not marked up with the corresponding templateId's according to the LPR3 CDA specification are permitted, they are not evaluated and as such should be avoided.

## What documents can be submitted
LPR3 supports two kinds of reporting:

- Full state reporting
- Partial reporting

Full state reporting concerns the case where the client system reports an entire document covering a set of selected services and treatments chosen by the client where the state of eventual previous reported documents with the same document ID is completely overwritten.

Partial state reporting concerns the case where the client system reports a document covering a set of selected services and treatments chosen by the client where the state of an eventual previous reported document is updated. The items that are to be updated are explicitly stated within the newly reported document. Within the newly reported document items can be nullified, items can be updated or items can be added.

## Documents and versioning
All reported documents (initial state and corrections) must be versioned using ClinicalDocument.id, ClinicalDocument.setId and ClinicalDocument.versionNumber. Initial versionNumber MUST be '1'. Whenever the document is appended to or replaced (collectively known as *update*), the ClinicalDocument.versionNumber must be incremented and the ClinicalDocument.id must unique. ClinicalDocument.setId must remain the same across all versions.

Note: *Replace* will replace all previous documents and addendums.

This stated use of id, setId and versionNumber ensures that no updates to documents are appended in the wrong order. While this somewhat contradicts the standard (see section 4.2.1.7, 4.2.1.8 and 4.2.3.1 - [CDA R2](http://www.hl7.org/implement/standards/product_brief.cfm?product_id=7)), it is the least ambiguous way to handle document updates.![](/img/L-cda_figure1-changed.png)

## What rules apply and what errors can be reported and how
All documents submitted to LPR3 are validated at three levels:

 1. Execute schema validation (XSD) according to CDA R2 standard.
 2. Execute schematron validation (SHCEMATRON) according to the profile specificed at the ART-DECOR site
 3. Execute drools validation rules aka. business rules (BUSINESS_RULE).

![](https://www.websequencediagrams.com/cgi-bin/cdraw?lz=dGl0bGUgVmFsaWRhdGlvbiBzZXF1ZW5jZQoKUmVnaW9uYWwgRUhSLT5MUFIzIFdTOiBJSEUgWERSIFBuUiBDREEtREsKbm90ZSBsZWZ0IG9mIAAgCWViWE1MIGFuZCBER1dTIHYAWwkKb3B0IFByb3RvY29sIGZhaWx1cmUKICAgADQILS0-AHEMOiBJbmNvcnJlY3QgdXNlIG9mAIEABQBRBVBuUiB0cmFuc2FjAFYFZW5kAIEJBm92ZXIAgQMJAIFUDHRlcCAxCgBiCD4AgXALRW5naW5lOiBTY2hlbWEgYXNzZXJ0aW9ucwoAFBEtAIIHClJlcG9ydGVkIGVycm9ycwCBWAVMYWNraW5nIHMARAZjb25mb3JtYW5jAIFJHkRvY3VtZW50IGRvZXMgbm90IGNvbXBseSB3aXRoIHRoZSBzdGFuZGFyZABTB3MAgUknMgCBTSN0cm9uAIE8OACCUCIzAIJVHUJ1c2luZXNzIHJ1bGVzAIJCOACEJhhBY2tub3dsZWRnZQCCWQVhbmQAhQMLIHIAgzwFCgo&s=qsd)

Errors in submitted documents can be found at any of the three levels and reported on all three levels at the same time. While level 1 is static and level 2 should be considered static (variance can occour in valuesets dependening on the business needs), level 3 is considered dynamic in that sense that business rules are subject to change or be deprecated over time. Level 3 is referred to as <b>"Dyb validering"</b> in the reporting guidelines supplied by <b>Sundhedsdatastyrelsen</b>.

All rules are exportable in the formats XSD, Schematron and KIE jar (kjar) files, respectively. The XSD and Schematron files does not include LPR3 assigned error codes - instead, when executed on a document, the XSD and Schematron reported errors will point out exactly where in the document the errors are and what has been violated. That said, XSD reported errors and Schematron reported errors will each be reported within their own category. Below illustrates an example of error codes wrapped in a RegistryResponse according to IHE XDR/XDS ebXml:

~~~xml
<rs:RegistryResponse status="urn:oasis:names:tc:ebxml-regrep:ResponseStatusType:Failure">
		<rs:RegistryErrorList highestSeverity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error">
        	<rs:RegistryError codeContext="XSD|||cvc-complex-type.2.4.a: Invalid content was found starting with element 'assignedAthor'. One of '{&amp;quot;urn:hl7-org:v3&amp;quot;:assignedAuthor}' is expected." errorCode="InvalidDocumentContent" location="1.2.3.999-example-only|||||||||48" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" />
            <rs:RegistryError codeContext="SCHEMATRON|(DKSpecializationLevelAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.18' DK Specialization Level Act Codes (DYNAMIC)." errorCode="InvalidDocumentContent" location="1.2.3.999-example-only|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][4]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][3]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]||||||438" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" />
			<rs:RegistryError codeContext="BUSINESS_RULES|||Ved fødsler efter 31.12.1996 skal bidiagnose DUH* findes." errorCode="InvalidDocumentContent" location="1.2.3.999-example-only|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][4]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][3]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]|||dk.sds:lpr-rules:1.0.0#0141#1.1|||148" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" />
		</rs:RegistryErrorList>
</rs:RegistryResponse>
~~~

The `codeContext` attribute is used in the following way:

 * The value of `codeContext` is split into two mandatory segments separated by `|||` having the values `<validation type>|||<validation text>`. `<validation type>` can be any of the following `XSD`, `SCHEMATRON`, `BUSINESS_RULE`. `<validation text>` contains an explanation of what has been violated in technical terms.

The `location` attribute is used in the following way:

 * The value of `location` is split into one mandatory segment and three conditional segments having the following values `<document id>|||(<xpath expression>)|||(<business rule unique identifier>)|||(<line number>)`. `<document id>` is the DocumentEntry.uniqueId - see ["IHE IT Infrastructure (ITI TF-3) "](http://www.ihe.net/uploadedFiles/Documents/ITI/IHE_ITI_TF_Vol3.pdf) *(section 4.2.3.2.26)*. `<xpath expression>` is the conditional segment containing an XPath expression pointing into the document where the error is detected - this is present only when `<validation type>` is SCHEMATRON or BUSINESS_RULE. `<business rule unique identifier>` is the conditional segment containing the unique ID of the violated business rule - this is present only when `<validation type>` is BUSINESS_RULE.  `<line number>` is the line in the CDA document where the error is detected - this is present only when `<validation type>` is XDS. 

`<business rule unique identifier>` is an identifier that is a combination of a [maven coordinate](https://maven.apache.org/pom.html#Maven_Coordinates) of the drools bundle jar (the exportable KIE jar), the `LPR3 Fejlnummer` and the `LPR3 Fejl version` (`LPR3 Fejlnummer` and `LPR3 Fejl version` are terms already present in **LPR2**) separated by **#**.

In the sample above, the value of the `<business rule unique identifier>` error with `codeContext` **BUSINESS_RULES** is the following: `dk.sds:lpr-rules:1.0.0#0141#1.1`. Here, the maven coordinate is **dk.sds:lpr-rules:1.0.0**, the LPR3 Fejlnummer is **00141** and the LPR3 Fejl version is **1.1**. 

## Supported reporting strategies
Submission of reports from a client perspective can be carried out as either synchronous reporting or asynchronous reporting. In a synchronous reporting scenario, the client submitting the reports is immediatly made aware of any errors that are present and either all reports are accepted or none at all, aka. transactions. Because of this nature, reported bundles should be kept as small and atomic as possible. This is also alligned with the strict nature of IHE XDR [Batch oriented reporting](#batch-oriented-reporting). In an asynchronous reporting scenario, the client submitting the reports will immediatly receive errors from level 1 and level 2 (see [What rules apply and what errors can be reported and how](#what-rules-apply-and-what-errors-can-be-reported-and-how)). If no errors are present on level 1 and level 2 the submission is preapproved for further processing and the client will receive a positive receipt. If errors are found at level 3 in the given asynchronous submission the error(s) will be reported in a prior-to-submission designated folder, accessible by <b>SFTP</b> in the same <b>ebXML</b>-format as used in IHE XDR.

## Service endpoint setup
In order to support both synchronous and asynchronous reporting three services endpoints are available:

 * One service endpoint supporting the synchronous scenario that does validation on level 1, 2 and 3 and reports back accordingly. If the submission contains no errors on all levels the reporting is stored.
 * One service endpoint supporting the asynchronous scenario that does validation on level 1, and level 2. If the submission contains no errors on level 1 and level 2 the reporting is stored for further processing. If errors are found at level 3, the error report is available at the prior-to-submission designated folder.
 * One service endpoint supporting validation on all three levels but no storing - aka. dry-run validation.

All three services adhere to the same system interface, making it up to the client to decide which service constallation is the best fit.

## IHE XDR
The IHE XDR service implemented as part of LPR3 will implement and act as **Document Recipient** and will support transaction **ITI-41** but only metadata compliant with the **Metadata-Limited Document Source** will processed (see also [Danish Metadata profile](http://svn.medcom.dk/svn/drafts/Standarder/IHE/DK_profil_metadata/Metadata-v095.docx)). Only SOAP with MTOM/XOP optimized content will be processed. Use of HTTP compression is encouraged.

### Batch oriented reporting
IHE XDR defines that submissions of mulitple documents pr. request are allowed as long as all documents are concerning the same patient. Hence, batch-oriented reporting is supported for a single patient having multiple documents to be reported (see ["IHE ITI TF-3"](http://www.ihe.net/uploadedFiles/Documents/ITI/IHE_ITI_TF_Vol3.pdf) *(section 4.2.1.2)*. If mulitple documents for a single patient are submitted in a single submission the documents shall <b>NOT</b> be different versions of each other as processing order is not guaranteed within a single submission.

More realistic samples for 
 * creation of data
 * update of data
 * deletion of data 

## Mapping to the logical model
The following diagram illustrates the logical data model of LPR3:
![](/img/LPR3.png)
This model is mapped to CDA and divided into the following sections:

- CDA Header
This section contains the elements `Patient` and `Bopael` from LPR3. The use of elements in the header follows the national ["MedCom guidelines"](http://svn.medcom.dk/svn/releases/Standarder/HL7/CDA%20Header/Dokumentation/DK-CDA-Header-v1.1.pdf) for CDA header usage.
- Episode of Care
This section contains the main elements `ForloebElement`, `ForloebReference` and `ForloebMarkoer` from LPR3 that maps to `DK Episode Of Care Act`, `DK Episode of Care Link Act` and `DK Episode of Care Marker Act` 
- Encounters
This section contains the main elements `Kontakt`, `Betalingsoplysning`, `Henvisning`, `Diagnose` og `Opholdsaddresse` from LPR3 that maps to `DK Encounter`, `DK Payment Contract Act`, `DK Referral Act`, `DK Main Condition Observation`/`DK Minor Condition Observation` and `DK Service Delivery Location Participant`.
- Procedures
This section contains the main elements `Procedure` and `Betalingsoplysning` from LPR3 that maps to `DK Procedure Act`/`DK Procedure Observation`/`DK Procedure Procedure` and `DK Payment Contract Act`.
- Observation Organizers
This section contains the main elements `Resultatindberetning` and `Resultat` from LPR3 that maps to `DK Observation Organizer` and `DK Observation Organizer Entry Reference Act`.

All attributes on the elements are mapped to CDA elements and can be found in at the ART-DECOR site/LPR3 offline documentation, marked with the description `LPR3:`.

## Granularity and constraints to submitted documents
The minimum viable document that will be accepted as a valid submission is a document that adheres to the constraints mentioned in [What rules apply and what errors can be reported and how](#what-rules-apply-and-what-errors-can-be-reported-and-how) - meaning that cardinalities to other elemets must be respected (as outlined in ART-DECOR), values from valuesets must be part of the valuesets (as outlined in ART-DECOR) and the use of correct template ID's as well as the volatile business rules. Any submitted document that adheres to these rules can be submitted for further processing. This means that documents can contain whatever granularity (that adhere to the rules) the submitter would like it to have regarding submission of addendums, corrections and deletions thereby providing a flexible solution that can fit all submitters. 

## HL7 CDA Naming convention
All CDA templates are named after the following naming convention:

- All LPR3 templates prefixed with `DK`
- Templates that are named `Internal` `<some LPR3 term>` `<CDA type>` are used as interal references within the document.
- Templates that are named `External` `<some LPR3 term>` `<CDA type>` are used as external references to other/previous versions of CDA documents.
- Template names that contains the word `Nullify` are used to delete previous registrations in previous documents.
- The type of the template is found in the name of the template as the last word e.g. `Act` or `Reference`, except those that are prefixed with `Internal`.
- The type of the template for templates that are prefixed with `DK Internal` is found in the name of the template as the second last word. These templates acts as references to other instances within the same document. 

For instance, using the HL7 CDA definition and following the naming convention explains that the template named `DK Internal Procedure Procedure Reference` concerns an internal reference to a LPR3 term "Procedure" instance in the document and is represented as a HL7 CDA type `Procedure`.

### Notes on the use of HL7 CDA elements in a danish setting
HL7 defines procedures, acts and observations (the main building blocks of the LPR3 HL7 CDA documents) in the following terms:

<b>Procedure:</b>
> *An Act whose immediate and primary outcome (post-condition) is the alteration of the physical condition of the subject* [*- see 3.1.15 in the specification*](http://www.hl7.org/implement/standards/product_brief.cfm?product_id=7)

<b>Observation:</b>
> *An Act of recognizing and noting information about the subject, and whose immediate and primary outcome (post-condition) is new data about a subject. Observations often involve measurement or other elaborate methods of investigation, but may also be simply assertive statements* [*- see 3.1.13 in the specification*](http://www.hl7.org/implement/standards/product_brief.cfm?product_id=7)

<b>Act:</b>
> *A record of something that is being done, has been done, can be done, or is intended or requested to be done.* [*- see 3.1.1 in the specification*](http://www.hl7.org/implement/standards/product_brief.cfm?product_id=7)

The danish term '[Procedure](http://sundhedsdata.iterm.dk/?TermId=1853&SrcLang=da&TrgLang=en)' can cover all three HL7 defined terms but doing so violates the standard. Hence, when reporting to LPR3, submitters of reports must differ between the types `Procedure`, `Observation` and `Act`. The distinction between these three types will documented using valuesets by <b>Sundhedsdatastyrelsen</b>.

## ID usage and referencing in LPR3
Unique identifiers can be supplied by the submitter to almost all elements using [UUID v5 identifiers](https://en.wikipedia.org/wiki/Universally_unique_identifier#Versions_3_and_5_.28namespace_name-based.29). Unique identifiers are needed when previously submitted entities needs to be referenced, removed or updated. If unique identifiers are not provided, internal references between the entities can be used and must be done using UUID v4 identifiers.

`Act`s, `Procedure`s and `Observation`s references the `Encounter`/`Episode of Care`, which means that e.g. nullifying the the `Encounter` also nullifies all entities that points toward the `Encounter`. Nullifying only the `Act`/`Procedure`/`Observation` that points towards the encounter removes only the entity itself and the encounter is left unchanged.