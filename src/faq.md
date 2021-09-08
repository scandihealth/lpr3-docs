# FAQ

## Why are there three different templates for procedure
The three different templates
[DK Procedure Act](http://lpr-art-decor.westeurope.cloudapp.azure.com:8080/art-decor/decor-templates--lpr-?section=templates&id=1.2.208.176.7.1.10.25),
[DK Procedure Observation](http://lpr-art-decor.westeurope.cloudapp.azure.com:8080/art-decor/decor-templates--lpr-?section=templates&id=1.2.208.176.7.1.10.29), and
[DK Procedure Procedure](http://lpr-art-decor.westeurope.cloudapp.azure.com:8080/art-decor/decor-templates--lpr-?section=templates&id=1.2.208.176.7.1.10.30)
are used to report procedures.

HL7 defines act, observation, and procedure in the following terms:

**Act:**
> *A record of something that is being done, has been done, can be done, or is intended or requested to be done.* [*- see 3.1.1 in the specification*](http://www.hl7.org/implement/standards/product_brief.cfm?product_id=7)

**Observation:**
> *An Act of recognizing and noting information about the subject, and whose immediate and primary outcome (post-condition) is new data about a subject.  
Observations often involve measurement or other elaborate methods of investigation, but may also be simply assertive statements* [*- see 3.1.13 in the specification*](http://www.hl7.org/implement/standards/product_brief.cfm?product_id=7)

**Procedure:**
> *An Act whose immediate and primary outcome (post-condition) is the alteration of the physical condition of the subject* [*- see 3.1.15 in the specification*](http://www.hl7.org/implement/standards/product_brief.cfm?product_id=7)

The LPR term [Procedure](definitions.md#Procedure) can cover all three HL7 defined terms, but doing so violates the standard. Hence, when reporting to LPR, submitters of reports must differenciate between the types `Procedure`, `Observation` and `Act`. The distinction between these three types is defined by three different value sets maintained externally to LPR by **Sundhedsdatastyrelsen**; the valueset `proc.act` `urn:oid:1.2.208.176.2.4.19` for `Act`,`proc.und` `urn:oid:1.2.208.176.2.4.21` for `Observation`, and `proc.oper` `urn:oid:1.2.208.176.2.4.20` for `Procedure`.

## I want to report a procedure, which template should I use
If you want to report a procedure you must choose a template that can contain the primary procedure code you want to report.
If the primary procedure code is present in the value set

 1. `urn:oid:1.2.208.176.2.4.19` you can use [DK Procedure Act](http://lpr-art-decor.westeurope.cloudapp.azure.com:8080/art-decor/decor-templates--lpr-?section=templates&id=1.2.208.176.7.1.10.25),
 2. `urn:oid:1.2.208.176.2.4.21` you can use [DK Procedure Observation](http://lpr-art-decor.westeurope.cloudapp.azure.com:8080/art-decor/decor-templates--lpr-?section=templates&id=1.2.208.176.7.1.10.29),
 3. `urn:oid:1.2.208.176.2.4.20` you can use [DK Procedure Procedure](http://lpr-art-decor.westeurope.cloudapp.azure.com:8080/art-decor/decor-templates--lpr-?section=templates&id=1.2.208.176.7.1.10.30).

If your code is present in more than one value set, you can choose which corresponding template to use.

***_UPDATE_*** To ease integration **Sundhedsdatastyrelsen** has decided that `proc.opr` `urn:oid:1.2.208.176.2.4.20` will contain values for `Act`, `Procedure`, and `Observation` while the two other valuesets `proc.act` `urn:oid:1.2.208.176.2.4.19` and `proc.und` `urn:oid:1.2.208.176.2.4.21` will be empty allowing organizations to use the template [`DK Procedure Procedure`](http://lpr-art-decor.westeurope.cloudapp.azure.com:8080/art-decor/decor-templates--lpr-?section=templates&id=1.2.208.176.7.1.10.30&language=en-US) for all mandatory procedure reporting to LPR3.
