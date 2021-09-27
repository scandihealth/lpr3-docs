# Test environment
Dedalus hosts a test environment that integrators can use do finalize their solution.

## Access

Accessing the test environment requires access to the [Sundhedsdatanettet (SDN)](https://www.medcom.dk/opslag/support).  

### CDA reporting endpoints

The following three endpoint are available:

* [Save if no errors](https://lprws-test.sds.dsdn.dk/cda-ws/DocumentRepository_Service/PatientHealthcareSaveIfNoErrorsReportingService?wsdl)
    * https://lprws-test.sds.dsdn.dk/cda-ws/DocumentRepository_Service/PatientHealthcareSaveIfNoErrorsReportingService
* [Save with errors](https://lprws-test.sds.dsdn.dk/cda-ws/DocumentRepository_Service/PatientHealthcareReportingService?wsdl)
    * https://lprws-test.sds.dsdn.dk/cda-ws/DocumentRepository_Service/PatientHealthcareReportingService
* [Validate](https://lprws-test.sds.dsdn.dk/cda-ws/DocumentRepository_Service/PatientHealthcareValidateReportingService?wsdl)
    * https://lprws-test.sds.dsdn.dk/cda-ws/DocumentRepository_Service/PatientHealthcareValidateReportingService 

The same three endpoints are also available where the `medcom` header is defined by the medcom namespace `http://svn.medcom.dk/svn/releases/Standarder/DGWS/Schemas/medcom-1.0.1.xsd` (see [#240](https://github.com/scandihealth/lpr3-docs/issues/240) and [ihe-xdr-medcom-1.0.1.wsdl](https://github.com/scandihealth/lpr3-docs/blob/master/src/interface/wsdl/ihe-xdr-medcom-1.0.1.wsdl))

* [Save if no errors](https://lprws-test.sds.dsdn.dk/cda-ws/medcom-1.0.1/DocumentRepository_Service/PatientHealthcareSaveIfNoErrorsReportingService?wsdl)
    * https://lprws-test.sds.dsdn.dk/cda-ws/medcom-1.0.1/DocumentRepository_Service/PatientHealthcareSaveIfNoErrorsReportingService
* [Save with errors](https://lprws-test.sds.dsdn.dk/cda-ws/medcom-1.0.1/DocumentRepository_Service/PatientHealthcareReportingService?wsdl)
    * https://lprws-test.sds.dsdn.dk/cda-ws/medcom-1.0.1/DocumentRepository_Service/PatientHealthcareReportingService
* [Validate](https://lprws-test.sds.dsdn.dk/cda-ws/medcom-1.0.1/DocumentRepository_Service/PatientHealthcareValidateReportingService?wsdl)
    * https://lprws-test.sds.dsdn.dk/cda-ws/medcom-1.0.1/DocumentRepository_Service/PatientHealthcareValidateReportingService

### Accumulated Error List

Access the [Accumulated Error List](interface/accumulated-error-list.html) files:

> sftp://lpr2indberet-test.sds.dsdn.dk:2222

Access to FTP servers are done thorugh sFTP and requires a dedicated user setup by Dedalus.

## Deployments
To increase velocity and success Dedalus will continuously deliver new versions of the LPR3 solution. Time of deployment will be communicated by SDS project management and communication through milestones.

## Weekly data purge
As the test progresses and issues are resolved, it may be necessary to delete data in the test enviroment.  
Therefore, Dedalus may purge data during weekends.  
Data purges will be notified through GitHub no later than friday end of business day.

## Rules implemented on Test System
The document [Regel-liste incl fejltekst.xlsx](res/Regel-liste incl fejltekst.xlsx) contains a list of rules from the Indberetningsvejledning implemented on the environment.
