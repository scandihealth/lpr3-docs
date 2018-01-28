# Test environment
DXC hosts a test environment that integrators can use do finalize their solution.

## Address
Accessing the test environment requires access to the [Sundhedsdatanettet (SDN)](https://www.medcom.dk/opslag/support).  
The following three endpoint are available.

 * [Safe if no errors](https://lprws-test.sds.dsdn.dk/cda-ws/PatientHealthcareSaveIfNoErrorsReportingService)
 * [Safe with errors](https://lprws-test.sds.dsdn.dk/cda-ws/PatientHealthcareReportingService)
 * [Validate](https://lprws-test.sds.dsdn.dk/cda-ws/PatientHealthcareValidateReportingService)

## Nightly build deployments
To increase velocity and success DXC will continuously deliver new versions of the LPR3 solution.  
As such DXC may deploy new builds on a nightly basis.  
New deployments will be notified through GitHub no later than end of business day before nightly deploy.

## Weekly data purge
As the test progresses and issues are resolved, it may be necessary to delete data in the test enviroment.  
Therefore, DXC may purge data during weekends.  
Data purges will be notified through GitHub no later than friday end of business day.

## Rules implemented on Test System
The document [Rules implemented on test system](/res/Rule implemented on test system.docx) contains a full list of rules from the Indberetningsvejledning implemented on the environment at any given time.
