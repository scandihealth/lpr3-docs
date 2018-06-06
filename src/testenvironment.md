# Test environment
DXC hosts a test environment that integrators can use do finalize their solution.

## Address
Accessing the test environment requires access to the [Sundhedsdatanettet (SDN)](https://www.medcom.dk/opslag/support).  
The following three endpoint are available.

 * [Save if no errors](https://lprws-test.sds.dsdn.dk/cda-ws/DocumentRepository_Service/PatientHealthcareSaveIfNoErrorsReportingService)
 * [Save with errors](https://lprws-test.sds.dsdn.dk/cda-ws/DocumentRepository_Service/PatientHealthcareReportingService)
 * [Validate](https://lprws-test.sds.dsdn.dk/cda-ws/DocumentRepository_Service/PatientHealthcareValidateReportingService)

## Deployments
To increase velocity and success DXC will continuously deliver new versions of the LPR3 solution. Time of deployment will be communicated by SDS project management and communication through milestones.

## Weekly data purge
As the test progresses and issues are resolved, it may be necessary to delete data in the test enviroment.  
Therefore, DXC may purge data during weekends.  
Data purges will be notified through GitHub no later than friday end of business day.

## Rules implemented on Test System
The document [Rules implemented on test system](/res/Regel-liste incl fejltekst.xlsx) contains a full list of rules from the Indberetningsvejledning implemented on the environment at any given time.
