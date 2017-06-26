**Sample request using MTOM/XOP**

```http
POST /axis2/services/repositoryBonedoc HTTP/1.1
Content-Type: multipart/related; boundary=MIMEBoundaryurn_uuid_806D8FD2D542EDCC2C1199332890718; type="application/xop+xml"; start="0.urn:uuid:806D8FD2D542EDCC2C1199332890719@apache.org"; start-info="application/soap+xml"; action="urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-b"
User-Agent: Axis2
Host: localhost:9085

--MIMEBoundaryurn_uuid_806D8FD2D542EDCC2C1199332890718
Content-Type: application/xop+xml; charset=UTF-8; type="application/soap+xml"
Content-Transfer-Encoding: binary
Content-ID: <0.urn:uuid:806D8FD2D542EDCC2C1199332890719@apache.org>
```
```xml
<?xml version='1.0' encoding='UTF-8'?>
<soapenv:Envelope xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope"
	xmlns:wsa="http://www.w3.org/2005/08/addressing">
	<!-- headers are inserted here -->
	<soapenv:Body>
		<xdsb:ProvideAndRegisterDocumentSetRequest
			xmlns:xdsb="urn:ihe:iti:xds-b:2007">
			<lcm:SubmitObjectsRequest
				xmlns:lcm="urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0">

				<!-- This submission demonstrates the absolute minimum metadata that 
					can be supplied in a Limited Metadata XDR submission -->
				<rim:RegistryObjectList
					xmlns:rim="urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0">


					<!-- DocumentEntry labeled as Limited Metadata -->
					<rim:ExtrinsicObject id="SomeDocument01"
						mimeType="text/plain" objectType="urn:uuid:7edca82f-054d-47f2-a032-9b2a5b5186c1">

						<!-- this classification labels this DocumentEntry as Limited Metadata 
							note that each object (DocumentEntry, SubmissionSet, Folder (if this example 
							had one) are independently labeled. No requirement that all or none are tagged 
							as Limited Metadata -->
						<rim:Classification classifiedObject="SomeDocument01"
							classificationNode="urn:uuid:ab9b591b-83ab-4d03-8f5d-f93b1fb92e85"
							id="ID_6144893_5"
							objectType="urn:oasis:names:tc:ebxml-regrep:ObjectType:RegistryObject:Classification" />

						<!-- uniqueId -->
						<rim:ExternalIdentifier
							identificationScheme="urn:uuid:2e82c1f6-a085-4c72-9da3-8640a32e42ab"
							value="1.42.20100312105241.2"
							objectType="urn:oasis:names:tc:ebxml-regrep:ObjectType:RegistryObject:ExternalIdentifier"
							id="id_10" registryObject="SomeDocument01">
							<rim:Name>
								<rim:LocalizedString value="XDSDocumentEntry.uniqueId" />
							</rim:Name>
						</rim:ExternalIdentifier>
					</rim:ExtrinsicObject>

					<rim:RegistryPackage id="SubmissionSet01"
						objectType="urn:oasis:names:tc:ebxml-regrep:ObjectType:RegistryObject:RegistryPackage">

						<!-- submissionTime required even for Limited Metadata -->
						<rim:Slot name="submissionTime">
							<rim:ValueList>
								<rim:Value>20170225235050</rim:Value>
							</rim:ValueList>
						</rim:Slot>

						<!-- this classification labels this SubmissionSet as Limited Metadata 
							note that each object (DocumentEntry, SubmissionSet, Folder (if this example 
							had one) are independently labeled. No requirement that all or none are tagged 
							as Limited Metadata -->
						<rim:Classification classifiedObject="SomeSubmissionSet01"
							classificationNode="urn:uuid:5003a9db-8d8d-49e6-bf0c-990e34ac7707"
							id="ID_6144893_4"
							objectType="urn:oasis:names:tc:ebxml-regrep:ObjectType:RegistryObject:Classification" />

						<!-- uniqueId -->
						<rim:ExternalIdentifier
							identificationScheme="urn:uuid:96fdda7c-d067-4183-912e-bf5ee74998a8"
							value="1.42.20100312105241.4"
							objectType="urn:oasis:names:tc:ebxml-regrep:ObjectType:RegistryObject:ExternalIdentifier"
							id="id_22" registryObject="SomeSubmissionSet01">
							<rim:Name>
								<rim:LocalizedString value="XDSSubmissionSet.uniqueId" />
							</rim:Name>
						</rim:ExternalIdentifier>

						<!-- sourceId -->
						<rim:ExternalIdentifier
							identificationScheme="urn:uuid:554ac39e-e3fe-47fe-b233-965d2a147832"
							value="1.42.2012105241.4.1.1.1"
							objectType="urn:oasis:names:tc:ebxml-regrep:ObjectType:RegistryObject:ExternalIdentifier"
							id="id_122" registryObject="SomeSubmissionSet01">
							<rim:Name>
								<rim:LocalizedString value="XDSSubmissionSet.sourceId" />
							</rim:Name>
						</rim:ExternalIdentifier>
					</rim:RegistryPackage>

					<rim:Association
						associationType="urn:oasis:names:tc:ebxml-regrep:AssociationType:HasMember"
						sourceObject="SomeSubmissionSet01" targetObject="SomeDocument01"
						id="ID_6144893_1"
						objectType="urn:oasis:names:tc:ebxml-regrep:ObjectType:RegistryObject:Association">
						<rim:Slot name="SubmissionSetStatus">
							<rim:ValueList>
								<rim:Value>Original</rim:Value>
							</rim:ValueList>
						</rim:Slot>
					</rim:Association>

					<rim:Classification classifiedObject="SomeSubmissionSet01"
						classificationNode="urn:uuid:a54d6aa5-d40d-43f9-88c5-b4633d873bdd"
						id="ID_6144893_3"
						objectType="urn:oasis:names:tc:ebxml-regrep:ObjectType:RegistryObject:Classification" />
				</rim:RegistryObjectList>
			</lcm:SubmitObjectsRequest>
			<xdsb:Document id="SomeDocument01">
				<xop:Include
					href="cid:1.urn:uuid:806D8FD2D542EDCC2C1199332890776@apache.org"
					xmlns:xop="http://www.w3.org/2004/08/xop/include" />
			</xdsb:Document>
		</xdsb:ProvideAndRegisterDocumentSetRequest>
	</soapenv:Body>
</soapenv:Envelope>
```
```http
--MIMEBoundaryurn_uuid_806D8FD2D542EDCC2C1199332890718
Content-Type: text/plain
Content-Transfer-Encoding: binary
Content-ID: <1.urn:uuid:806D8FD2D542EDCC2C1199332890776@apache.org>
```
```xml
<?xml version="1.0" encoding="utf-8"?>
<?xml-stylesheet type="text/xsl" href="https://raw.githubusercontent.com/chb/sample_ccdas/master/CDA.xsl"?>
<ClinicalDocument xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="https://raw.githubusercontent.com/cdaapi/cdaapi_core/master/reference/CDA.xsd"
	xmlns="urn:hl7-org:v3" xmlns:cda="urn:hl7-org:v3" xmlns:sdtc="urn:hl7-org:sdtc">
	<realmCode code="DK" />
	<typeId extension="POCD_HD000040" root="2.16.840.1.113883.1.3" />
	<templateId root="1.2.208.176.7.1.10.71" />
	<templateId root="2.16.840.1.113883.10.12.1" />
...
</ClinicalDocument>
```
```http
--MIMEBoundaryurn_uuid_806D8FD2D542EDCC2C1199332890718--
```

**Sample response with a valid document**

```http
HTTP/1.1 200 OK
Server: Apache-Coyote/1.1
Content-Type: multipart/related; boundary=MIMEBoundaryurn_uuid_7BFFF2BD24C642EA531247750913327; type="application/xop+xml"; 
start="<0.urn:uuid:7BFFF2BD24C642EA531247750913328@apache.org>"; 
start-info="application/soap+xml"; action="urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-bResponse"
Date: Thu, 16 Jul 2009 13:28:32 GMT

--MIMEBoundaryurn_uuid_7BFFF2BD24C642EA531247750913327
Content-Type: application/xop+xml; charset=UTF-8; type="application/soap+xml"
Content-Transfer-Encoding: binary
Content-ID: <0.urn:uuid:7BFFF2BD24C642EA531247750913328@apache.org>
```
```xml
<?xml version='1.0' encoding='UTF-8'?>
<soapenv:Envelope xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope">
    <soapenv:Header xmlns:wsa="http://www.w3.org/2005/08/addressing">
        <wsa:Action soapenv:mustUnderstand="true">urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-bResponse</wsa:Action>
        <wsa:RelatesTo>urn:uuid:AD33D8190CB655E8751247750894152</wsa:RelatesTo>
    </soapenv:Header>
    <soapenv:Body>
        <rs:RegistryResponse xmlns:rs="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
            status="urn:oasis:names:tc:ebxml-regrep:ResponseStatusType:Success"/>
    </soapenv:Body>
</soapenv:Envelope>
```
```http
--MIMEBoundaryurn_uuid_7BFFF2BD24C642EA531247750913327--
```
**Sample response with an invalid document**

```http
HTTP/1.1 200 OK
Server: Apache-Coyote/1.1
Content-Type: multipart/related; boundary=MIMEBoundaryurn_uuid_7BFFF2BD24C642EA531247750913327; type="application/xop+xml"; 
start="<0.urn:uuid:7BFFF2BD24C642EA531247750913328@apache.org>"; 
start-info="application/soap+xml"; action="urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-bResponse"
Date: Thu, 16 Jul 2009 13:28:32 GMT

--MIMEBoundaryurn_uuid_7BFFF2BD24C642EA531247750913327
Content-Type: application/xop+xml; charset=UTF-8; type="application/soap+xml"
Content-Transfer-Encoding: binary
Content-ID: <0.urn:uuid:7BFFF2BD24C642EA531247750913328@apache.org>
```
```xml
<?xml version='1.0' encoding='UTF-8'?>
<soapenv:Envelope xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope">
	<soapenv:Header xmlns:wsa="http://www.w3.org/2005/08/addressing">
		<wsa:Action soapenv:mustUnderstand="true">urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-bResponse</wsa:Action>
		<wsa:RelatesTo>urn:uuid:AD33D8190CB655E8751247750894152</wsa:RelatesTo>
	</soapenv:Header>
	<soapenv:Body>
		<rs:RegistryResponse
			status="urn:oasis:names:tc:ebxml-regrep:ResponseStatusType:Failure">
			<rs:RegistryErrorList highestSeverity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error">
        	<rs:RegistryError codeContext="XSD|||cvc-complex-type.2.4.a: Invalid content was found starting with element 'assignedAthor'. One of '{&amp;quot;urn:hl7-org:v3&amp;quot;:assignedAuthor}' is expected." errorCode="InvalidDocumentContent" location="1.2.3.999-example-only|||48" 		severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" />
            <rs:RegistryError codeContext="SCHEMATRON|(DKSpecializationLevelAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.18' DK Specialization Level Act Codes (DYNAMIC)." errorCode="InvalidDocumentContent" location="1.2.3.999-example-only|||438|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][4]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][3]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" />
		</rs:RegistryErrorList>
		</rs:RegistryResponse>
	</soapenv:Body>
</soapenv:Envelope>
```
```http
--MIMEBoundaryurn_uuid_7BFFF2BD24C642EA531247750913327--
```
## Example usage of ID's and UUIDv4
The sample below shows the essential parts of the initial state of a given document containing a procedure. Note the use of ClinicalDocument.id, ClinicalDocument.setId and ClinicalDocument.versionNumber in the samples.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:voc="urn:hl7-org:v3/voc"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" classCode="DOCCLIN"
	moodCode="EVN">
	<realmCode code="DK" />
	<typeId extension="POCD_HD000040" root="2.16.840.1.113883.1.3" />
	<templateId root="1.2.208.176.7.1.10.71" />
	<templateId root="2.16.840.1.113883.10.12.2" />
	<templateId root="2.16.840.1.113883.10.12.1" />
	<id root="1.2.345.6789.123" />
	<code code="34133-9" codeSystem="2.16.840.1.113883.6.1"
		codeSystemName="LOINC" displayName="Summary of episode note" />
	<effectiveTime value="20000407" />
	<confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" />
	<setId root="1.2.345.6789.35" />
	<versionNumber value="1" />
	<recordTarget>
		<templateId root="1.2.208.176.7.1.10.101" />
		<templateId root="2.16.840.1.113883.10.12.101" />
		<patientRole classCode="PAT">
			<templateId root="1.2.208.176.7.1.10.107" />
			<id root="2.16.840.1.113883.4.3" extension="08119675AG1"
				assigningAuthorityName="Region Nordjylland" />
			<addr>
				<streetAddressLine>P.O. Pedersens Vej 2</streetAddressLine>
				<postalCode>8200</postalCode>
				<city>Aarhus N</city>
				<county>751</county>
				<country>5100</country>

			</addr>
			<patient classCode="PSN">
				<name>
					<family>Soort-Nielsen</family>
					<given>Jakob</given>
				</name>
				<administrativeGenderCode code="M"
					displayName="Male" codeSystem="2.16.840.1.113883.5.1" />
			</patient>
		</patientRole>
	</recordTarget>
	<author typeCode="AUT">
		<templateId root="1.2.208.176.7.10.102" />
		<templateId root="2.16.840.1.113883.10.12.102" />
		<time value="20170228101500+0100" />
		<assignedAuthor classCode="ASSIGNED">
			<id nullFlavor="NI" />
			<representedOrganization classCode="ORG"
				determinerCode="INSTANCE">
				<id root="1.2.208.176.1.1" extension="6071000016008"
					assigningAuthorityName="SOR" />
			</representedOrganization>
		</assignedAuthor>
	</author>
	<custodian typeCode="CST">
		<templateId root="1.2.208.176.7.1.10.103" />
		<templateId root="2.16.840.1.113883.10.12.104" />
		<assignedCustodian classCode="ASSIGNED">
			<representedCustodianOrganization
				classCode="ORG" determinerCode="INSTANCE">
				<id root="2.16.840.1.113883.2.24.1.1" extension="25469364"
					assigningAuthorityName="Erhvervs- og Selskabsstyrelsen" />
			</representedCustodianOrganization>
		</assignedCustodian>
	</custodian>
	<component contextConductionInd="true">
		<structuredBody>
			<component>
				<section>
					<templateId root="1.2.208.176.7.1.10.95" />
					<templateId root="2.16.840.1.113883.10.12.201" />
					<entry>
						<act classCode="PCPR" moodCode="EVN">
							<templateId root="1.2.208.176.7.1.10.80" />
							<templateId root="2.16.840.1.113883.10.12.301" />
							<id root="1.2.208.176.7.1.2.1" extension="BBBFA3EA-2AD7-571C-986C-D72F7443BA4B" />
                            ...
						</act>
					</entry>
				</section>
			</component>
			<component>
				<section>
					<!-- DK Procedures Section -->
					<templateId root="1.2.208.176.7.1.10.76" />
					<templateId root="2.16.840.1.113883.10.12.201" />
					<entry>
						<act classCode="ACT" moodCode="EVN">
							<templateId root="1.2.208.176.7.1.10.25" />
							<templateId root="2.16.840.1.113883.10.12.301" />
							<id root="1.2.208.176.7.1.2.1" extension="50009866-1B81-53FD-BD67-B132A68415FA" />
							<id root="1.2.208.176.7.1.2.2" extension="94FF6BDB-2075-43DE-BA33-7DAFD7DC66CC" />
							<code codeSystemName="Sundhedsvæsenets Klassifikations System"
								codeSystem="1.2.208.176.2.4" displayName="Behandling med protesehæmmer"
								code="BPHM91" />
							<effectiveTime>
								<low value="20170115080000+0200" />
								<high value="20170115083000+0200" />
							</effectiveTime>
							<!-- ... -->
						</act>
					</entry>
				</section>
			</component>
		</structuredBody>
	</component>
</ClinicalDocument>
```

The sample below shows the addendum to the initial state where a procedure is removed (nullified). In order to remove a previously submitted entity, the *Nullify* templates are used.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:voc="urn:hl7-org:v3/voc"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" classCode="DOCCLIN"
	moodCode="EVN">
	<realmCode code="DK" />
	<typeId extension="POCD_HD000040" root="2.16.840.1.113883.1.3" />
	<templateId root="1.2.208.176.7.1.10.71" />
	<templateId root="2.16.840.1.113883.10.12.2" />
	<templateId root="2.16.840.1.113883.10.12.1" />
	<id root="1.2.345.6789.1234" />
	<code code="34133-9" codeSystem="2.16.840.1.113883.6.1"
		codeSystemName="LOINC" displayName="Summary of episode note" />
	<effectiveTime value="20000407" />
	<confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" />
	<setId root="1.2.345.6789.35" />
	<versionNumber value="2" />
	<!-- ... -->
	<relatedDocument typeCode="APND">
		<parentDocument classCode="DOCCLIN" moodCode="EVN">
			<id root="1.2.345.6789.123" />
			<setId root="1.2.345.6789.35" />
			<versionNumber value="1" />
		</parentDocument>
	</relatedDocument>
	<component contextConductionInd="true">
		<structuredBody>
			<component>
				<section>
					<!-- DK Procedures Section -->
					<templateId root="1.2.208.176.7.1.10.76" />
					<templateId root="2.16.840.1.113883.10.12.201" />
					<entry>
						<act classCode="ACT" moodCode="EVN">
							<templateId root="1.2.208.176.7.1.10.86" />
							<templateId root="2.16.840.1.113883.10.12.301" />
							<id root="1.2.208.176.7.1.2.1" extension="50009866-1B81-53FD-BD67-B132A68415FA" />
							<code nullFlavor="NA" />
							<statusCode code="nullified" />
						</act>
					</entry>
				</section>
			</component>
		</structuredBody>
	</component>
</ClinicalDocument>
```

The sample below shows the addendum to the initial state where two encounters and one procedure are added and one of the encounters are referenced from the procedure using temporary UUIDv4 identifiers. As can be seen, the reference link between encounter and procedure is stated within the procedure. This also means that when removing (nullifying) encounters, all entities (procedues, acts, observations) must be updated accordingly to point to the new encounter. Updating eg. a procedure does however not mean that an update is necessary on the encounter. The same goes for procedures that references an Episode Of Care.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:voc="urn:hl7-org:v3/voc"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" classCode="DOCCLIN"
	moodCode="EVN">
	<realmCode code="DK" />
	<typeId extension="POCD_HD000040" root="2.16.840.1.113883.1.3" />
	<templateId root="1.2.208.176.7.1.10.71" />
	<templateId root="2.16.840.1.113883.10.12.2" />
	<templateId root="2.16.840.1.113883.10.12.1" />
	<id root="1.2.345.6789.1235" />
	<code code="34133-9" codeSystem="2.16.840.1.113883.6.1"
		codeSystemName="LOINC" displayName="Summary of episode note" />
	<effectiveTime value="20000407" />
	<confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" />
	<setId root="1.2.345.6789.35" />
	<versionNumber value="2" />
	<!-- ... -->
	<relatedDocument typeCode="APND">
		<parentDocument classCode="DOCCLIN" moodCode="EVN">
			<id root="1.2.345.6789.1235" />
			<setId root="1.2.345.6789.35" />
			<versionNumber value="1" />
		</parentDocument>
	</relatedDocument>
	<component contextConductionInd="true">
		<structuredBody>
			<component>
				<section>
					<!-- DK Procedures Section -->
					<templateId root="1.2.208.176.7.1.10.76" />
					<templateId root="2.16.840.1.113883.10.12.201" />
					<entry>
						<act classCode="ACT" moodCode="EVN">
							<templateId root="1.2.208.176.7.1.10.25" />
							<templateId root="2.16.840.1.113883.10.12.301" />
							<id root="1.2.208.176.7.1.2.1" extension="94FF6BDB-2075-43DE-BA33-7DAFD7DC66CE" />
							<code codeSystemName="Sundhedsvæsenets Klassifikations System"
								codeSystem="1.2.208.176.2.4" displayName="Behandling med direkte aktive antivirale lægemidler"
								code="BPHM92" />
							<effectiveTime>
								<low value="20170115080000+0200" />
								<high value="20170115083000+0200" />
							</effectiveTime>
							<!-- Reference to the encounter with id 1.2.208.176.7.1.2.2#187EAC1A-D053-4D1C-92DF-F66B429F9B51 -->
							<entryRelationship typeCode="REFR">
								<encounter classCode="ENC" moodCode="EVN">
									<templateId root="1.2.208.176.7.1.10.77" />
									<templateId root="2.16.840.1.113883.10.12.301" />
									<id root="1.2.208.176.7.1.2.2" extension="187EAC1A-D053-4D1C-92DF-F66B429F9B51" />
									<code nullFlavor="NA" />
								</encounter>
							</entryRelationship>
						</act>
					</entry>
				</section>
			</component>
			<component>
				<section>
					<!-- DK Encounters Section -->
					<templateId root="1.2.208.176.7.1.10.75" />
					<templateId root="2.16.840.1.113883.10.12.201" />
					<entry>
						<encounter classCode="ENC" moodCode="EVN">
							<templateId root="1.2.208.176.7.1.10.74" />
							<templateId root="2.16.840.1.113883.10.12.302" />
							<id root="1.2.208.176.7.1.2.2" extension="187EAC1A-D053-4D1C-92DF-F66B429F9B51" />
							<code codeSystemName="Sundhedsvæsenets Klassifikations System"
								codeSystem="1.2.208.176.2.4" displayName="fysisk fremmøde" code="ALCA00" />
							<effectiveTime>
								<low value="20170216060000+0200" />
								<high value="20170224120000+0200" />
							</effectiveTime>
                            <reference typeCode="REFR">
                                <templateId root="1.2.208.176.7.1.10.69"/>
                                <templateId root="2.16.840.1.113883.10.12.324"/>
                                <externalAct classCode="ACT" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.65"/>
                                    <templateId root="2.16.840.1.113883.10.12.325"/>
                                    <id root="1.2.208.176.1.2.1" extension="BBBFA3EA-2AD7-571C-986C-D72F7443BA4B"/>
                                </externalAct>
                            </reference>
						</encounter>
					</entry>
					<entry>
						<encounter classCode="ENC" moodCode="EVN">
							<templateId root="1.2.208.176.7.1.10.74" />
							<templateId root="2.16.840.1.113883.10.12.302" />
							<id root="1.2.208.176.7.1.2.1" extension="94FF6BDB-2075-43DE-BA33-7DAFD7DC66CF" />
							<code codeSystemName="Sundhedsvæsenets Klassifikations System"
								codeSystem="1.2.208.176.2.4" displayName="fysisk fremmøde" code="ALCA00" />
							<effectiveTime>
								<low value="20160216060000+0200" />
								<high value="20160224120000+0200" />
							</effectiveTime>
                            <reference typeCode="REFR">
                                <templateId root="1.2.208.176.7.1.10.69"/>
                                <templateId root="2.16.840.1.113883.10.12.324"/>
                                <externalAct classCode="ACT" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.65"/>
                                    <templateId root="2.16.840.1.113883.10.12.325"/>
                                    <id root="1.2.208.176.1.2.1" extension="BBBFA3EA-2AD7-571C-986C-D72F7443BA4B"/>
                                </externalAct>
                            </reference>
                            ...
						</encounter>
					</entry>
				</section>
			</component>
		</structuredBody>
	</component>
</ClinicalDocument>
```

## Updating values in documents
Below shows the inital state of a fragment of a reported encounter within a CDA document.

```xml
<entry>
    <encounter classCode="ENC" moodCode="EVN">
    <templateId root="1.2.208.176.7.1.10.74"/>
    <templateId root="2.16.840.1.113883.10.12.302"/>
    <id root="1.2.208.176.7.1.2.1" extension="47041012-132F-5DE1-B16A-DF273F8F000F"/>
    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="fysisk fremmøde" code="ALCA00"/>
    <effectiveTime>
        <low value="20170216060000+0200"/>
        <high value="20170224120000+0200"/>
    </effectiveTime>
    <priorityCode codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Akut" code="ATA1"/>
    ...
    </encounter>
</entry>
```

In order to eg. update the priorityCode on the encounter either the entire document can be replaced or the encounter can be nullified and replaced with a new encounter containing all the same data but the `id`. A fragment of the updated CDA is shown below. 

```xml
<entry>
    <encounter classCode="ENC" moodCode="EVN">
    <templateId root="1.2.208.176.7.1.10.87"/>
    <templateId root="2.16.840.1.113883.10.12.301"/>
    <id root="1.2.208.176.7.1.2.1" extension="47041012-132F-5DE1-B16A-DF273F8F000F"/>
    <code nullFlavor="NA"/>
    <statusCode code="nullified"/>
    </encounter>
</entry>
<entry>
    <encounter classCode="ENC" moodCode="EVN">
    <templateId root="1.2.208.176.7.1.10.74"/>
    <templateId root="2.16.840.1.113883.10.12.302"/>
    <id root="1.2.208.176.7.1.2.1" extension="CB7F4122-9963-56B6-8A34-2FB4E7C640D7"/>
    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="fysisk fremmøde" code="ALCA00"/>
    <effectiveTime>
        <low value="20170216060000+0200"/>
        <high value="20170224120000+0200"/>
    </effectiveTime>
    <priorityCode codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Akut i dagarbejdstiden, uden konsekvens for dagsprogram" code="ATA11B"/>
    ...
    <reference typeCode="REFR">
        <templateId root="1.2.208.176.7.1.10.69"/>
        <templateId root="2.16.840.1.113883.10.12.324"/>
        <externalAct classCode="ACT" moodCode="EVN">
            <templateId root="1.2.208.176.7.1.10.65"/>
            <templateId root="2.16.840.1.113883.10.12.325"/>
            <id root="1.2.208.176.1.2.1" extension="BBBFA3EA-2AD7-571C-986C-D72F7443BA4B"/>
        </externalAct>
    </reference>
    </encounter>
</entry>
```

## Adding new procedures to a previous submitted document
When in a need to add eg. new procedure to a previous submitted document the procedure can reference either an existing encounter or an existing episode of care. Both types of references are shown below. They must however not be present at the same time in submissions.

```xml
<procedure classCode="PROC" moodCode="EVN">
  <templateId root="1.2.208.176.7.1.10.30"/>
  <templateId root="2.16.840.1.113883.10.12.306"/>
  <id root="1.2.208.176.7.1.2.1" extension="7dfa91a1-e19e-57d0-bdbe-fea7f8582df5"/>
  <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Indlæggelse af intracerebralt trykmålingsudstyr" code="KAAA27"/>
  <effectiveTime>
    <low value="20170122084500+0200"/>
    <high value="20170122123000+0200"/>
  </effectiveTime>
...
    <!-- External Episode of Care Reference -->
    <reference typeCode="REFR">
        <templateId root="1.2.208.176.7.1.10.69"/>
        <templateId root="2.16.840.1.113883.10.12.324"/>
        <externalAct classCode="ACT" moodCode="EVN">
            <templateId root="1.2.208.176.7.1.10.65"/>
            <templateId root="2.16.840.1.113883.10.12.325"/>
            <id root="1.2.208.176.1.2.1" extension="bbbfa3ea-2ad7-571c-986c-d72f7443ba4b"/>
        </externalAct>
    </reference>

    <!-- External Encounter Reference -->
    <reference typeCode="REFR">
        <templateId root="1.2.208.176.7.1.10.69"/>
        <templateId root="2.16.840.1.113883.10.12.324"/>
        <externalAct classCode="ACT" moodCode="EVN">
            <templateId root="1.2.208.176.7.1.10.78"/>
            <templateId root="2.16.840.1.113883.10.12.325"/>
            <id root="1.2.208.176.1.2.1" extension="47041012-132f-5de1-b16a-df273f8f000f"/>
        </externalAct>
    </reference>
</procedure>
```
