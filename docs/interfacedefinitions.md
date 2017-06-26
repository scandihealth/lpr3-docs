### Clinical Document Architecture LPR3 definition ###
The specific design details of LPR3 based on Clinical Document Architecture (CDA) is documented at [ART-DECOR](http://art-decor.org/art-decor/decor-project--lpr-)

### IHE XDR WSDL with national SSI additions ###
The following section shows the IHE XDR WSDL with the danish national SSI additions
```xml
<?xml version='1.0' encoding='UTF-8'?>
<definitions xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:saml="urn:oasis:names:tc:SAML:2.0:assertion" xmlns:rs="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0" xmlns:medcom="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd" xmlns:ihe="urn:ihe:iti:xds-b:2007" xmlns:hsuid="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd" xmlns="http://schemas.xmlsoap.org/wsdl/" name="DocumentRepository" targetNamespace="urn:ihe:iti:xds-b:2007">

	<documentation>IHE XDR Service with national SSI additions
	</documentation>
	<types>

		<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
			xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
			xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
			xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
			xmlns:saml="urn:oasis:names:tc:SAML:2.0:assertion" xmlns:rs="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
			xmlns:medcom="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd"
			xmlns:ihe="urn:ihe:iti:xds-b:2007" xmlns:hsuid="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd"
			xmlns="http://schemas.xmlsoap.org/wsdl/"
			targetNamespace="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd">

			<xsd:include
				schemaLocation="http://localhost:8080/xdr.endpoint?xsd=xsd/dgws/wsse.xsd" />

		</xsd:schema>
		<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
			xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
			xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
			xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
			xmlns:saml="urn:oasis:names:tc:SAML:2.0:assertion" xmlns:rs="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
			xmlns:medcom="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd"
			xmlns:ihe="urn:ihe:iti:xds-b:2007" xmlns:hsuid="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd"
			xmlns="http://schemas.xmlsoap.org/wsdl/" targetNamespace="urn:oasis:names:tc:SAML:2.0:assertion">

			<xsd:include
				schemaLocation="http://localhost:8080/xdr.endpoint?xsd=xsd/dgws/saml.xsd" />

		</xsd:schema>
		<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
			xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
			xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
			xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
			xmlns:saml="urn:oasis:names:tc:SAML:2.0:assertion" xmlns:rs="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
			xmlns:medcom="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd"
			xmlns:ihe="urn:ihe:iti:xds-b:2007" xmlns:hsuid="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd"
			xmlns="http://schemas.xmlsoap.org/wsdl/" targetNamespace="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd">

			<xsd:include
				schemaLocation="http://localhost:8080/xdr.endpoint?xsd=xsd/dgws/medcom.xsd" />

		</xsd:schema>
		<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
			xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
			xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
			xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
			xmlns:saml="urn:oasis:names:tc:SAML:2.0:assertion" xmlns:rs="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
			xmlns:medcom="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd"
			xmlns:ihe="urn:ihe:iti:xds-b:2007" xmlns:hsuid="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd"
			xmlns="http://schemas.xmlsoap.org/wsdl/" targetNamespace="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd">

			<xsd:include
				schemaLocation="http://localhost:8080/xdr.endpoint?xsd=xsd/hsuid/hsuid-1_1.xsd" />

		</xsd:schema>
		<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
			xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
			xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
			xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
			xmlns:saml="urn:oasis:names:tc:SAML:2.0:assertion" xmlns:rs="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
			xmlns:medcom="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd"
			xmlns:ihe="urn:ihe:iti:xds-b:2007" xmlns:hsuid="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd"
			xmlns="http://schemas.xmlsoap.org/wsdl/" elementFormDefault="qualified"
			targetNamespace="urn:ihe:iti:xds-b:2007">
			<!-- Include the message schema -->

			<xsd:include
				schemaLocation="http://localhost:8080/xdr.endpointy?xsd=../schema/IHE/XDS.b_DocumentRepository.xsd" />

		</xsd:schema>
		<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
			xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
			xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
			xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
			xmlns:saml="urn:oasis:names:tc:SAML:2.0:assertion" xmlns:rs="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
			xmlns:medcom="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd"
			xmlns:ihe="urn:ihe:iti:xds-b:2007" xmlns:hsuid="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd"
			xmlns="http://schemas.xmlsoap.org/wsdl/" elementFormDefault="qualified"
			targetNamespace="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0">
			<!-- Include the message schema -->

			<xsd:include
				schemaLocation="http://localhost:8080/xdr.endpoint?xsd=../schema/ebRS/rs.xsd" />

		</xsd:schema>
		<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
			xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
			xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
			xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
			xmlns:saml="urn:oasis:names:tc:SAML:2.0:assertion" xmlns:rs="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
			xmlns:query="urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0"
			xmlns:medcom="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd"
			xmlns:ihe="urn:ihe:iti:xds-b:2007" xmlns:hsuid="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd"
			xmlns="http://schemas.xmlsoap.org/wsdl/" elementFormDefault="qualified"
			targetNamespace="urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0">
			<!-- Include the message schema -->

			<xsd:include
				schemaLocation="http://localhost:8080/xdr.endpoint?xsd=../schema/ebRS/query.xsd" />

		</xsd:schema>
		<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
			xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
			xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
			xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
			xmlns:saml="urn:oasis:names:tc:SAML:2.0:assertion" xmlns:rs="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
			xmlns:medcom="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd"
			xmlns:lcm="urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0" xmlns:ihe="urn:ihe:iti:xds-b:2007"
			xmlns:hsuid="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd" xmlns="http://schemas.xmlsoap.org/wsdl/"
			elementFormDefault="qualified" targetNamespace="urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0">
			<!-- Include the message schema -->

			<xsd:include
				schemaLocation="http://localhost:8080/xdr.endpoint?xsd=../schema/ebRS/lcm.xsd" />

		</xsd:schema>
		<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
			xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
			xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
			xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
			xmlns:saml="urn:oasis:names:tc:SAML:2.0:assertion" xmlns:rs="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
			xmlns:medcom="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd"
			xmlns:lcm="urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0" xmlns:ihe="urn:ihe:iti:xds-b:2007"
			xmlns:hsuid="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd" xmlns="http://schemas.xmlsoap.org/wsdl/"
			elementFormDefault="qualified" targetNamespace="urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0">
			<!-- Include the message schema -->

			<xsd:include
				schemaLocation="http://localhost:8080/xdr.endpoint?xsd=../schema/ebRS/rim.xsd" />

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
		<soap:binding style="document"
			transport="http://schemas.xmlsoap.org/soap/http" />
		<operation name="DocumentRepository_ProvideAndRegisterDocumentSet-b">
			<soap:operation soapAction="urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-b"></soap:operation>
			<input>
				<soap:header message="ihe:SecurityHeader" part="security_header"
					use="literal"></soap:header>
				<soap:header message="ihe:MedcomHeader" part="medcom_header"
					use="literal"></soap:header>
				<soap:header message="ihe:HsuidHeader" part="hsuid_header"
					use="literal"></soap:header>
				<soap:body use="literal"></soap:body>
			</input>
			<output>
				<soap:header message="ihe:MedcomHeader" part="medcom_header"
					use="literal"></soap:header>
				<soap:body use="literal"></soap:body>
			</output>
		</operation>
	</binding>
	<service name="DocumentRepository_Service">
		<port binding="ihe:DocumentRepository_Binding" name="DocumentRepository_Port_Soap12">
			<soap:address location="http://localhost:8080/xdr.endpoint" />
		</port>
	</service>
</definitions>
```