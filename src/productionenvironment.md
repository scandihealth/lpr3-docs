# Production environment

## Access

Accessing the production environment requires access to the [Sundhedsdatanettet (SDN)](https://www.medcom.dk/opslag/support).  

### CDA reporting endpoints

The following three endpoint are available.

* [Save if no errors](https://lprws.sds.dsdn.dk/cda-ws/DocumentRepository_Service/PatientHealthcareSaveIfNoErrorsReportingService?wsdl)
    * https://lprws.sds.dsdn.dk/cda-ws/DocumentRepository_Service/PatientHealthcareSaveIfNoErrorsReportingService
* [Save with errors](https://lprws.sds.dsdn.dk/cda-ws/DocumentRepository_Service/PatientHealthcareReportingService?wsdl)
    * https://lprws.sds.dsdn.dk/cda-ws/DocumentRepository_Service/PatientHealthcareReportingService
* [Validate](https://lprws.sds.dsdn.dk/cda-ws/DocumentRepository_Service/PatientHealthcareValidateReportingService?wsdl)
    * https://lprws.sds.dsdn.dk/cda-ws/DocumentRepository_Service/PatientHealthcareValidateReportingService


The same three endpoints are also available where the `medcom` header is defined by the medcom namespace `http://svn.medcom.dk/svn/releases/Standarder/DGWS/Schemas/medcom-1.0.1.xsd` (see [#240](https://github.com/scandihealth/lpr3-docs/issues/240) and [ihe-xdr-medcom-1.0.1.wsdl](https://github.com/scandihealth/lpr3-docs/blob/master/src/interface/wsdl/ihe-xdr-medcom-1.0.1.wsdl))

* [Save if no errors](https://lprws.sds.dsdn.dk/cda-ws/medcom-1.0.1/DocumentRepository_Service/PatientHealthcareSaveIfNoErrorsReportingService?wsdl)
    * https://lprws.sds.dsdn.dk/cda-ws/medcom-1.0.1/DocumentRepository_Service/PatientHealthcareSaveIfNoErrorsReportingService 
* [Save with errors](https://lprws.sds.dsdn.dk/cda-ws/medcom-1.0.1/DocumentRepository_Service/PatientHealthcareReportingService?wsdl)
    * https://lprws.sds.dsdn.dk/cda-ws/medcom-1.0.1/DocumentRepository_Service/PatientHealthcareReportingService
* [Validate](https://lprws.sds.dsdn.dk/cda-ws/medcom-1.0.1/DocumentRepository_Service/PatientHealthcareValidateReportingService?wsdl)
    * https://lprws.sds.dsdn.dk/cda-ws/medcom-1.0.1/DocumentRepository_Service/PatientHealthcareValidateReportingService
 
### Accumulated Error List

Access the [Accumulated Error List](interface/accumulated-error-list.html) files:

> sftp://lpr2indberet.sds.dsdn.dk:2222

Access to FTP servers are done thorugh sFTP and requires a dedicated user setup by Dedalus.