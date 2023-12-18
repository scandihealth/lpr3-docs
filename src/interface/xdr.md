# XDR interface

## Clinical Document Architecture LPR3 definition
The specific design details of LPR3 based on Clinical Document Architecture (CDA) is documented at [ART-DECOR](http://lpr-art-decor.westeurope.cloudapp.azure.com:8080/art-decor/decor-project--lpr-)

## HTTP status codes
The XDR endpoints are build on SOAP 1.2 and as such any LPR XDR client should interpret HTTP status code as defined [SOAP Version 1.2 Part 2: Adjuncts (Second Edition)](https://www.w3.org/TR/soap12-part2/) section 7.5.1.2

> The SOAP HTTP binding follows the rules of any HTTP application which means that an implementation of the SOAP HTTP binding must understand the class of any status code, as indicated by the first digit, and treat any unrecognized response as being equivalent to the x00 status code of that class, with the exception that an unrecognized response must not be cached.

The following HTTP status codes in addition to table 17 of [SOAP Version 1.2 Part 2: Adjuncts (Second Edition)](https://www.w3.org/TR/soap12-part2/) SHOULD be recognized by a LPR XDR client.

### 100 Continue
The 100 (Continue) status code indicates that the initial part of a request has been received and has not yet been rejected by the server.  The server intends to send a final response after the request has been fully received and acted upon.

### 403 Forbidden 
The 403 (Forbidden) status code indicates that the server understood the request but refuses to authorize it.

### 404 Not Found
The 404 (Not Found) status code indicates that the origin server did not find a current representation for the target resource or is not willing to disclose that one exists.

### 406 Not Acceptable
The 406 (Not Acceptable) status code indicates that the target resource does not have a current representation that would be acceptable to the user agent.

### 413 Payload Too Large
The 413 (Payload Too Large) status code indicates that the server is refusing to process a request because the request payload is larger than the server is willing or able to process.

### 501 Not Implemented
The 501 (Not Implemented) status code indicates that the server does not support the functionality required to fulfill the request.
 
### 503 Service Unavailable
The 503 (Service Unavailable) status code indicates that the server is currently unable to handle the request due to a temporary overload or scheduled maintenance, which will likely be alleviated after some delay.

### 504 Gateway Time-out
The 504 (Gateway Time-out) status code indicates that the server took too long to process the request. When the error occurs everything is rolled back and nothing is stored in the database. The answer is returned in html.

## IHE XDR WSDL with national SSI additions
The following section shows the IHE XDR WSDL with the danish national SSI additions.

The raw WSDL file can be found [here](wsdl/ihe-xdr.wsdl).

```xml
<?xml version='1.0' encoding='UTF-8'?>

<definitions xmlns:xsd="http://www.w3.org/2001/XMLSchema"
             xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
             xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl"
             xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
             xmlns:rs="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
             xmlns:medcom="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd"
             xmlns:ihe="urn:ihe:iti:xds-b:2007"
             xmlns:hsuid="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd"
             xmlns="http://schemas.xmlsoap.org/wsdl/"
             xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/"
             name="DocumentRepository"
             targetNamespace="urn:ihe:iti:xds-b:2007">

    <documentation>IHE XDR Service with national SSI additions
    </documentation>
    <types>

        <!-- Danish national extensions start -->

        <xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                    xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
                    xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
                    xmlns:rs="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
                    xmlns:medcom="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd"
                    xmlns:ihe="urn:ihe:iti:xds-b:2007" xmlns:hsuid="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd"
                    xmlns="http://schemas.xmlsoap.org/wsdl/"
                    targetNamespace="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd">
            <xsd:include
                schemaLocation="xsd/dgws/wsse.xsd"/>

        </xsd:schema>
        <xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                    xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
                    xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
                    xmlns:rs="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
                    xmlns:medcom="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd"
                    xmlns:ihe="urn:ihe:iti:xds-b:2007" xmlns:hsuid="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd"
                    xmlns="http://schemas.xmlsoap.org/wsdl/" targetNamespace="urn:oasis:names:tc:SAML:2.0:assertion">
            <xsd:include
                schemaLocation="xsd/dgws/saml.xsd"/>

        </xsd:schema>
        <xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                    xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
                    xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
                    xmlns:rs="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
                    xmlns:medcom="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd"
                    xmlns:ihe="urn:ihe:iti:xds-b:2007" xmlns:hsuid="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd"
                    xmlns="http://schemas.xmlsoap.org/wsdl/" targetNamespace="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd">
            <xsd:include
                schemaLocation="xsd/dgws/medcom.xsd"/>

        </xsd:schema>
        <xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                    xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
                    xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
                    xmlns:rs="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
                    xmlns:medcom="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd"
                    xmlns:ihe="urn:ihe:iti:xds-b:2007" xmlns:hsuid="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd"
                    xmlns="http://schemas.xmlsoap.org/wsdl/" targetNamespace="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd">
            <xsd:include
                schemaLocation="xsd/hsuid/hsuid-1_1.xsd"/>

            <!-- Danish national extensions stop -->

        </xsd:schema>
        <xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                    xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
                    xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
                    xmlns:rs="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
                    xmlns:medcom="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd"
                    xmlns:ihe="urn:ihe:iti:xds-b:2007" xmlns:hsuid="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd"
                    xmlns="http://schemas.xmlsoap.org/wsdl/" elementFormDefault="qualified"
                    targetNamespace="urn:ihe:iti:xds-b:2007">
            <xsd:include
                schemaLocation="xsd/IHE/XDS.b_DocumentRepository.xsd"/>

        </xsd:schema>
        <xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                    xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
                    xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
                    xmlns:rs="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
                    xmlns:medcom="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd"
                    xmlns:ihe="urn:ihe:iti:xds-b:2007" xmlns:hsuid="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd"
                    xmlns="http://schemas.xmlsoap.org/wsdl/" elementFormDefault="qualified"
                    targetNamespace="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0">
            <xsd:include
                schemaLocation="xsd/ebRS/rs.xsd"/>

        </xsd:schema>
        <xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                    xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
                    xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
                    xmlns:rs="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
                    xmlns:medcom="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd"
                    xmlns:ihe="urn:ihe:iti:xds-b:2007" xmlns:hsuid="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd"
                    xmlns="http://schemas.xmlsoap.org/wsdl/" elementFormDefault="qualified"
                    targetNamespace="urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0">
            <xsd:include
                schemaLocation="xsd/ebRS/query.xsd"/>

        </xsd:schema>
        <xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                    xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
                    xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
                    xmlns:rs="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
                    xmlns:medcom="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd"
                    xmlns:ihe="urn:ihe:iti:xds-b:2007"
                    xmlns:hsuid="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd" xmlns="http://schemas.xmlsoap.org/wsdl/"
                    elementFormDefault="qualified" targetNamespace="urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0">
            <xsd:include
                schemaLocation="xsd/ebRS/lcm.xsd"/>

        </xsd:schema>
        <xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                    xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
                    xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
                    xmlns:rs="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
                    xmlns:medcom="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd"
                    xmlns:ihe="urn:ihe:iti:xds-b:2007"
                    xmlns:hsuid="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd" xmlns="http://schemas.xmlsoap.org/wsdl/"
                    elementFormDefault="qualified" targetNamespace="urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0">
            <xsd:include
                schemaLocation="xsd/ebRS/rim.xsd"/>

        </xsd:schema>

    </types>
    <message name="SecurityHeader">
        <part element="wsse:Security" name="security_header">
        </part>
    </message>
    <message name="MedcomHeader">
        <part element="medcom:Header" name="medcom_header">
        </part>
    </message>
    <message name="ProvideAndRegisterDocumentSet-b_Message">
        <documentation>Provide and Register Document Set</documentation>
        <part element="ihe:ProvideAndRegisterDocumentSetRequest" name="body"></part>
    </message>
    <message name="ProvideAndRegisterDocumentSet-bResponse_Message">
        <documentation>Provide And Register Document Set Response
        </documentation>
        <part element="rs:RegistryResponse" name="body"></part>
    </message>
    <message name="HsuidHeader">
        <part element="hsuid:HsuidHeader" name="hsuid_header">
        </part>
    </message>
    <portType name="DocumentRepository_PortType">
        <operation name="DocumentRepository_ProvideAndRegisterDocumentSet-b">
            <input message="ihe:ProvideAndRegisterDocumentSet-b_Message"
                   wsaw:Action="urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-b"></input>
            <output message="ihe:ProvideAndRegisterDocumentSet-bResponse_Message"
                    wsaw:Action="urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-bResponse"></output>
        </operation>
    </portType>
    <binding name="DocumentRepository_Binding" type="ihe:DocumentRepository_PortType">
        <soap12:binding style="document" transport="http://schemas.xmlsoap.org/soap/http"/>
        <operation name="DocumentRepository_ProvideAndRegisterDocumentSet-b">
            <soap12:operation soapAction="urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-b"></soap12:operation>
            <input>
                <soap12:header message="ihe:SecurityHeader" part="security_header"
                               use="literal"></soap12:header>
                <soap12:header message="ihe:MedcomHeader" part="medcom_header"
                               use="literal"></soap12:header>
                <soap12:header message="ihe:HsuidHeader" part="hsuid_header"
                               use="literal"></soap12:header>
                <soap12:body use="literal"></soap12:body>
            </input>
            <output>
                <soap12:header message="ihe:MedcomHeader" part="medcom_header"
                               use="literal"></soap12:header>
                <soap12:body use="literal"></soap12:body>
            </output>
        </operation>
    </binding>
    <service name="DocumentRepository_Service">
        <port name="DocumentRepository_Port_Soap12" binding="ihe:DocumentRepository_Binding">
            <soap:address location="https://lprws.sds.dsdn.dk/cda-ws/DocumentRepository_Service/PatientHealthcareReportingService"/>
        </port>
    </service>
</definitions>
```
