# Sambles

## Sample request using MTOM/XOP

```http
POST /cda-ws/PatientHealthcareReportingService HTTP/1.1 
Accept: application/soap+xml, multipart/related 
Content-Type: multipart/related;start="<rootpart*a80594a2-e5de-425d-9fdc-f6ba27d58f05@example.jaxws.sun.com>";type="application/xop+xml";boundary="uuid:a80594a2-e5de-425d-9fdc-f6ba27d58f05";start-info="application/soap+xml;action=\"urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-b\"" 
User-Agent: JAX-WS RI 2.2.9-b130926.1035 svn-revision#5f6196f2b90e9460065a4c2f4e30e065b245e51e 
Host: sc155887:8080 
Connection: keep-alive 
```

```http
--uuid:a80594a2-e5de-425d-9fdc-f6ba27d58f05 
Content-Id: <rootpart*a80594a2-e5de-425d-9fdc-f6ba27d58f05@example.jaxws.sun.com> 
Content-Type: application/xop+xml;charset=utf-8;type="application/soap+xml;action=\"urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-b\"" 
Content-Transfer-Encoding: binary 
```

```xml
<soap:Envelope
	xmlns:soap="http://www.w3.org/2003/05/soap-envelope">
	<soap:Header>
		<wsse:Security
			xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd">
			<wsu:Timestamp
				xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd">
				<wsu:Created>2018-04-05T07:57:03Z</wsu:Created>
			</wsu:Timestamp>
			<saml:Assertion
				xmlns:saml="urn:oasis:names:tc:SAML:2.0:assertion"
				IssueInstant="2018-04-05T07:52:03Z" Version="2.0" id="IDCard">
				<saml:Issuer>TEST1-NSP-STS</saml:Issuer>
				<saml:Subject>
					<saml:NameID Format="medcom:other">SubjectDN={SERIALNUMBER=CVR:25469364-FID:96988661
						+ CN=DXC Technology - LPR Indberettersystem (funktionscertifikat),
						O=CSC SCANDIHEALTH A/S // CVR:25469364,
						C=DK},IssuerDN={CN=TRUST2408 Systemtest XXII CA, O=TRUST2408,
						C=DK},CertSerial={1494965723}
					</saml:NameID>
					<saml:SubjectConfirmation>
						<saml:ConfirmationMethod>urn:oasis:names:tc:SAML:2.0:cm:holder-of-key
						</saml:ConfirmationMethod>
						<saml:SubjectConfirmationData>
							<ds:KeyInfo
								xmlns:ds="http://www.w3.org/2000/09/xmldsig#">
								<ds:KeyName>OCESSignature</ds:KeyName>
							</ds:KeyInfo>
						</saml:SubjectConfirmationData>
					</saml:SubjectConfirmation>
				</saml:Subject>
				<saml:Conditions NotBefore="2018-04-05T07:52:03Z"
					NotOnOrAfter="2018-04-06T07:52:03Z" />
				<saml:AttributeStatement id="IDCardData">
					<saml:Attribute Name="sosi:IDCardID">
						<saml:AttributeValue>D/JsXK+ToUO8ErmLd5pVzw==
						</saml:AttributeValue>
					</saml:Attribute>
					<saml:Attribute Name="sosi:IDCardVersion">
						<saml:AttributeValue>1.0.1</saml:AttributeValue>
					</saml:Attribute>
					<saml:Attribute Name="sosi:IDCardType">
						<saml:AttributeValue>system</saml:AttributeValue>
					</saml:Attribute>
					<saml:Attribute Name="sosi:AuthenticationLevel">
						<saml:AttributeValue>3</saml:AttributeValue>
					</saml:Attribute>
					<saml:Attribute Name="sosi:OCESCertHash">
						<saml:AttributeValue>GXaVFH7J+YHFZ8hYp/7c7l9fvAo=
						</saml:AttributeValue>
					</saml:Attribute>
				</saml:AttributeStatement>
				<saml:AttributeStatement id="SystemLog">
					<saml:Attribute Name="medcom:ITSystemName">
						<saml:AttributeValue>TRUST2408 Systemtest XIX CA
						</saml:AttributeValue>
					</saml:Attribute>
					<saml:Attribute Name="medcom:CareProviderID"
						NameFormat="medcom:cvrnumber">
						<saml:AttributeValue>25469364</saml:AttributeValue>
					</saml:Attribute>
					<saml:Attribute Name="medcom:CareProviderName">
						<saml:AttributeValue>DXCTechnology</saml:AttributeValue>
					</saml:Attribute>
				</saml:AttributeStatement>
				<ds:Signature
					xmlns:ds="http://www.w3.org/2000/09/xmldsig#" id="OCESSignature">
					<ds:SignedInfo>
						<ds:CanonicalizationMethod
							Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#" />
						<ds:SignatureMethod
							Algorithm="http://www.w3.org/2000/09/xmldsig#rsa-sha1" />
						<ds:Reference URI="#IDCard">
							<ds:Transforms>
								<ds:Transform
									Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature" />
								<ds:Transform
									Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#" />
							</ds:Transforms>
							<ds:DigestMethod
								Algorithm="http://www.w3.org/2000/09/xmldsig#sha1" />
							<ds:DigestValue>Nror9L7H5JS2ywqUkuc+3Q9DbYY=</ds:DigestValue>
						</ds:Reference>
					</ds:SignedInfo>
					<ds:SignatureValue>URCeKOJfp+IrrO1+m1NNLc31diP12aUNSHRXGdQyWdZOUGOzqCA8eX6RVy6rOjvX68nZIwklKzPAdyJ5RU/YYbKlehROeSMDHuus3BLG5eRieNPS5u64XcGrtGgCQRSDvU6vnV+A6dSCgE6s06OUKYEPHn9FmRChZqjVpVSNP2YDn/FOT9WkMy85N9pjwzrAvo4NjAgdxKGv5g0Evl+1M/CcX4IZ0ui1CTCNClMzOTncUpkrnD0HZZGHTt8HyKuV5KLNQY08CD9e7B2h9U4HoQII8ImMf4Qme3cj0fT4GOQmbs/UFeMI772xrWwS62y/FGH2SKZb+RGvc5BF13P3JA==
					</ds:SignatureValue>
					<ds:KeyInfo>
						<ds:X509Data>
							<ds:X509Certificate>MIIGJjCCBQ6gAwIBAgIEVp5mfDANBgkqhkiG9w0BAQsFADBHMQswCQYDVQQGEwJESzESMBAGA1UECgwJVFJVU1QyNDA4MSQwIgYDVQQDDBtUUlVTVDI0MDggU3lzdGVtdGVzdCBYSVggQ0EwHhcNMTYwNTA0MDg1NTAwWhcNMTkwNTA0MDg1NDAxWjCBlDELMAkGA1UEBhMCREsxLjAsBgNVBAoMJVN1bmRoZWRzZGF0YXN0eXJlbHNlbiAvLyBDVlI6MzMyNTc4NzIxVTAgBgNVBAUTGUNWUjozMzI1Nzg3Mi1GSUQ6NzY3OTQ4ODQwMQYDVQQDDCpTT1NJIFRlc3QgRmVkZXJhdGlvbiAoZnVua3Rpb25zY2VydGlmaWthdCkwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCQipkwYq5Ncc68/6/ACLJK1k/I7wTMNq0lho7NvnGWGNAJkblmRksq6meGEGYgw5ZdvDqwsudKE+mU7YjZZ+EqW9HgceYYeoEObwR81r0/tAIbDTN2kLA8L2ZautRXI4+kq/+8tvqTwfCZjfx6AmbeL1Ky7npMlGZoluc5YjTR7bsJACr/caSzE6rf8bEFiJappjTCtIBQlQDuwGVUWjRU37SAr3mGlzgH7DnaVOJoBrjHW0OuPSm8mVImdym3sKlNleX8jiBhsvfaXl720aISg+dkVU4iEsXphlckV8GxQKfqNMuqGg2itLEEhJitBCrHYMlRtMx/kVtXJk/saMQjAgMBAAGjggLKMIICxjAOBgNVHQ8BAf8EBAMCA7gwgZcGCCsGAQUFBwEBBIGKMIGHMDwGCCsGAQUFBzABhjBodHRwOi8vb2NzcC5zeXN0ZW10ZXN0MTkudHJ1c3QyNDA4LmNvbS9yZXNwb25kZXIwRwYIKwYBBQUHMAKGO2h0dHA6Ly9mLmFpYS5zeXN0ZW10ZXN0MTkudHJ1c3QyNDA4LmNvbS9zeXN0ZW10ZXN0MTktY2EuY2VyMIIBIAYDVR0gBIIBFzCCARMwggEPBg0rBgEEAYH0UQIEBgQCMIH9MC8GCCsGAQUFBwIBFiNodHRwOi8vd3d3LnRydXN0MjQwOC5jb20vcmVwb3NpdG9yeTCByQYIKwYBBQUHAgIwgbwwDBYFRGFuSUQwAwIBARqBq0RhbklEIHRlc3QgY2VydGlmaWthdGVyIGZyYSBkZW5uZSBDQSB1ZHN0ZWRlcyB1bmRlciBPSUQgMS4zLjYuMS40LjEuMzEzMTMuMi40LjYuNC4yLiBEYW5JRCB0ZXN0IGNlcnRpZmljYXRlcyBmcm9tIHRoaXMgQ0EgYXJlIGlzc3VlZCB1bmRlciBPSUQgMS4zLjYuMS40LjEuMzEzMTMuMi40LjYuNC4yLjCBqgYDVR0fBIGiMIGfMDygOqA4hjZodHRwOi8vY3JsLnN5c3RlbXRlc3QxOS50cnVzdDI0MDguY29tL3N5c3RlbXRlc3QxOS5jcmwwX6BdoFukWTBXMQswCQYDVQQGEwJESzESMBAGA1UECgwJVFJVU1QyNDA4MSQwIgYDVQQDDBtUUlVTVDI0MDggU3lzdGVtdGVzdCBYSVggQ0ExDjAMBgNVBAMMBUNSTDYyMB8GA1UdIwQYMBaAFMwCVQzkgXSvIFTVERRXnJFSOH+gMB0GA1UdDgQWBBReXoe6mR11zHQv0ijlArnWLWd+2zAJBgNVHRMEAjAAMA0GCSqGSIb3DQEBCwUAA4IBAQB282klteVINHqXZstuEV10hfn/4C2q/XcjFFlgayapYXcL6p+5Znw49fldmRKGvQ0nvjAIQD3soQNK3VBgnV7pL+KdmpyCQVv59WDjSNFeMbxwE1V5O3MDHw4S4DKivz1EDPgdZNPkgGOZQAA96ZmHsO4tq8n+TrNEDMkpHzcEQz9Ngu/H8/YYjRm8Dk+ffN7U2btu/XOXr5xhX3RCXhgoGuNY74Q7BsETO5ErIRKgtpX01iwwjs/HGKA50GZJnWeum1ssNXx2aT83hTGu96m1YvX3LnLPkOXsA1ocwv0USwadblrWlxDbULluC8THO7MpX+/uhLptwFXWgZv/Pr5k
							</ds:X509Certificate>
						</ds:X509Data>
					</ds:KeyInfo>
				</ds:Signature>
			</saml:Assertion>
		</wsse:Security>
		<medcom:Header
			xmlns:medcom="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd">
			<medcom:SecurityLevel>3</medcom:SecurityLevel>
			<medcom:Linking>
				<medcom:MessageID>AAABYpTPGSRRusL+aHC5XVNPU0k=</medcom:MessageID>
			</medcom:Linking>
			<medcom:RequireNonRepudiationReceipt>no
			</medcom:RequireNonRepudiationReceipt>
		</medcom:Header>
	</soap:Header>
	<soap:Body>
		<ns4:ProvideAndRegisterDocumentSetRequest
			xmlns:ns6="urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0"
			xmlns:ns5="urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0"
			xmlns:ns4="urn:ihe:iti:xds-b:2007"
			xmlns:ns3="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
			xmlns:ns2="urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0">
			<ns5:SubmitObjectsRequest>
				<ns3:RequestSlotList />
				<ns2:RegistryObjectList>
					<ns2:ExtrinsicObject mimeType="text/xml"
						objectType="urn:uuid:7edca82f-054d-47f2-a032-9b2a5b5186c1"
						id="15ab4406-321e-47f7-8ded-bf1de0396943">
						<ns2:Classification
							classificationScheme="urn:uuid:ab9b591b-83ab-4d03-8f5d-f93b1fb92e85"
							classifiedObject="15ab4406-321e-47f7-8ded-bf1de0396943"
							id="urn:uuid:015dc335-ea07-40cf-8b43-fa8933c895ba" />
						<ns2:ExternalIdentifier
							registryObject="15ab4406-321e-47f7-8ded-bf1de0396943"
							identificationScheme="urn:uuid:2e82c1f6-a085-4c72-9da3-8640a32e42ab"
							value="15ab4406-321e-47f7-8ded-bf1de0396943"
							id="urn:uuid:cd344ffd-96cf-4ace-8073-211ec351051f">
							<ns2:Name>
								<ns2:LocalizedString
									value="XDSDocumentEntry.uniqueId" />
							</ns2:Name>
						</ns2:ExternalIdentifier>
					</ns2:ExtrinsicObject>
					<ns2:RegistryPackage
						id="f82bf816-6628-4b62-9c7c-b9fe0a320a2f">
						<ns2:Slot name="submissionTime">
							<ns2:ValueList>
								<ns2:Value>20180405075701</ns2:Value>
							</ns2:ValueList>
						</ns2:Slot>
						<ns2:Classification
							classificationScheme="urn:uuid:a7058bb9-b4e4-4307-ba5b-e3f0ab85e12d"
							classifiedObject="f82bf816-6628-4b62-9c7c-b9fe0a320a2f"
							nodeRepresentation=""
							id="urn:uuid:a2feaecc-0527-447b-ba83-3e454afc0a6c">
							<ns2:Slot name="authorInstitution">
								<ns2:ValueList>	
								<ns2:Value>Region Nordjylland^^^^^&amp;1.2.208.176.1.1&amp;ISO^^^^6071000016008</ns2:Value>
								</ns2:ValueList>
							</ns2:Slot>
						</ns2:Classification>
						<ns2:Classification
							classificationScheme="urn:uuid:5003a9db-8d8d-49e6-bf0c-990e34ac7707"
							classifiedObject="f82bf816-6628-4b62-9c7c-b9fe0a320a2f"
							id="urn:uuid:8ea167f4-7dd3-43dd-945a-3e4d9c1fef3d" />
						<ns2:ExternalIdentifier
							registryObject="f82bf816-6628-4b62-9c7c-b9fe0a320a2f"
							identificationScheme="urn:uuid:96fdda7c-d067-4183-912e-bf5ee74998a8"
							value="f82bf816-6628-4b62-9c7c-b9fe0a320a2f"
							id="urn:uuid:9fb08146-91be-4a38-a00f-223abf7ff31d">
							<ns2:Name>
								<ns2:LocalizedString
									value="XDSSubmissionSet.uniqueId" />
							</ns2:Name>
						</ns2:ExternalIdentifier>
						<ns2:ExternalIdentifier
							registryObject="f82bf816-6628-4b62-9c7c-b9fe0a320a2f"
							identificationScheme="urn:uuid:554ac39e-e3fe-47fe-b233-965d2a147832"
							value="f82bf816-6628-4b62-9c7c-b9fe0a320a2f"
							id="urn:uuid:2ac30e25-389d-4f0c-b41b-514d5a557c9a">
							<ns2:Name>
								<ns2:LocalizedString
									value="XDSSubmissionSet.sourceId" />
							</ns2:Name>
						</ns2:ExternalIdentifier>
					</ns2:RegistryPackage>
					<ns2:Classification
						classifiedObject="f82bf816-6628-4b62-9c7c-b9fe0a320a2f"
						classificationNode="urn:uuid:a54d6aa5-d40d-43f9-88c5-b4633d873bdd"
						id="urn:uuid:220cb2db-e272-42ea-946f-be895f0627a5" />
					<ns2:Association
						associationType="urn:oasis:names:tc:ebxml-regrep:AssociationType:HasMember"
						sourceObject="f82bf816-6628-4b62-9c7c-b9fe0a320a2f"
						targetObject="15ab4406-321e-47f7-8ded-bf1de0396943"
						status="urn:oasis:names:tc:ebxml-regrep:StatusType:Approved"
						id="656eeecf-81c0-4ea8-a346-9f2d900aa4de">
						<ns2:Slot name="SubmissionSetStatus">
							<ns2:ValueList>
								<ns2:Value>Original</ns2:Value>
							</ns2:ValueList>
						</ns2:Slot>
					</ns2:Association>
				</ns2:RegistryObjectList>
			</ns5:SubmitObjectsRequest>
			<ns4:Document id="15ab4406-321e-47f7-8ded-bf1de0396943">
				<xop:Include
					xmlns:xop="http://www.w3.org/2004/08/xop/include"
					href="cid:8ae60adb-d8f5-4837-a779-3a64e25850a3@example.jaxws.sun.com" />
			</ns4:Document>
		</ns4:ProvideAndRegisterDocumentSetRequest>
	</soap:Body>
</soap:Envelope>
```

```http
--uuid:a80594a2-e5de-425d-9fdc-f6ba27d58f05 
Content-Id: <8ae60adb-d8f5-4837-a779-3a64e25850a3@example.jaxws.sun.com> 
Content-Type: application/octet-stream 
Content-Transfer-Encoding: binary 
```

```xml
<?xml version="1.0" encoding="utf-8"?>
<?xml-stylesheet type="text/xsl" href="https://raw.githubusercontent.com/chb/sample_ccdas/master/CDA.xsl"?>
<ClinicalDocument 
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="https://raw.githubusercontent.com/cdaapi/cdaapi_core/master/reference/CDA.xsd" 
    xmlns="urn:hl7-org:v3" 
    xmlns:cda="urn:hl7-org:v3" 
    xmlns:sdtc="urn:hl7-org:sdtc">
    <realmCode code="DK" />
    <typeId extension="POCD_HD000040" root="2.16.840.1.113883.1.3"/>
    <templateId root="1.2.208.176.7.1.10.71"/>
    <templateId root="2.16.840.1.113883.10.12.2"/>
    <templateId root="2.16.840.1.113883.10.12.1"/>
    <id root="1.2.3.999" extension="example4" />
    <code code="34133-9" codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC" displayName="Summary of episode note"/>
    <title>Totalindberetning</title>
    <effectiveTime value="20160608155010+0200" />
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25"/>
    <setId assigningAuthorityName="--TODO--" root="1.2.3.999" />
    <versionNumber value="1"/>
    <recordTarget>
        <templateId root="1.2.208.176.7.1.10.101"/>
        <templateId root="2.16.840.1.113883.10.12.101"/>
        <patientRole classCode="PAT">
            <templateId root="1.2.208.176.7.1.10.106"/>
            <id root="1.2.208.176.1.2" extension="0811967001" assigningAuthorityName="CPR"/>
        </patientRole>
    </recordTarget>
    <author typeCode="AUT">
        <templateId root="1.2.208.176.7.10.102"/>
        <templateId root="2.16.840.1.113883.10.12.102"/>
        <time value="20170228101500+0100"/>
        <assignedAuthor classCode="ASSIGNED">
            <id nullFlavor="NI"/>
            <representedOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="1.2.208.176.1.1" extension="6071000016008" assigningAuthorityName="SOR"/>
            </representedOrganization>
        </assignedAuthor>
    </author>
    <custodian typeCode="CST">
        <templateId root="1.2.208.176.7.1.10.103"/>
        <templateId root="2.16.840.1.113883.10.12.104"/>
        <assignedCustodian classCode="ASSIGNED">
            <representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.840.1.113883.2.24.1.1" extension="25469364" assigningAuthorityName="DXC"/>
            </representedCustodianOrganization>
        </assignedCustodian>
    </custodian>
    <component contextConductionInd="true">
        <structuredBody>
            <component>
                <section>
                    <templateId root="1.2.208.176.7.1.10.95"/>
                    <templateId root="2.16.840.1.113883.10.12.201"/>
                    <entry typeCode="COMP">
                        <act classCode="PCPR" moodCode="EVN">
                            <templateId root="1.2.208.176.7.1.10.80"/>
                            <templateId root="2.16.840.1.113883.10.12.301"/>
                            <id root="1.2.208.176.7.1.2.1" extension="bbbfa3ea-2ad7-571c-986c-d72f7443ba4b"/>
                            <id root="1.2.208.176.7.1.2.2" extension="2217c913-c721-498a-a8d5-04a80fe2e0de"/>
                            <code nullFlavor="NA"/>
                            <effectiveTime>
                                <low value="20170218140000+0200"/>
                                <high value="20170218150000+0200"/>
                            </effectiveTime>
                            <entryRelationship typeCode="RSON">
                                <act classCode="PCPR" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.51"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <code nullFlavor="NA"/>
                                    <effectiveTime value="20170218140000+0200"/>
                                    <participant typeCode="REF">
                                        <templateId root="1.2.208.176.7.1.10.52"/>
                                        <templateId root="2.16.840.1.113883.10.12.321"/>
                                        <participantRole classCode="ROL">
                                            <scopingEntity classCode="ORG">
                                                <id root="1.2.208.176.1.1" extension="486811000016002" assigningAuthorityName="SOR"/>
                                            </scopingEntity>
                                        </participantRole>
                                    </participant>
                                    <entryRelationship typeCode="RSON">
                                        <act classCode="REG" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.55"/>
                                            <templateId root="2.16.840.1.113883.10.12.301"/>
                                            <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Tumorer i hjerne- og rygmarvshinder af usikker og ukendt karakter" code="DD42"/>
                                            <entryRelationship typeCode="COMP">
                                                <act classCode="REG" moodCode="EVN">
                                                    <templateId root="1.2.208.176.7.1.10.5"/>
                                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                                    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="diagnosen stillet første gang" code="ZDW10"/>
                                                </act>
                                            </entryRelationship>
                                        </act>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <act classCode="REG" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.53"/>
                                            <templateId root="2.16.840.1.113883.10.12.301"/>
                                            <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="fritvalg ikke relevant" code="ALDB00"/>
                                        </act>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <act classCode="REG" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.54"/>
                                            <templateId root="2.16.840.1.113883.10.12.301"/>
                                            <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="akutordning" code="ALDA11"/>
                                        </act>
                                    </entryRelationship>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <act classCode="REG" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.81"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Kræftsygdomme" code="ALAL01"/>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <act classCode="REG" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.82"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <id root="1.2.208.176.7.1.2.1" extension="c770b34c-9854-519b-8239-2d7794a94bef"/>
                                    <id root="1.2.208.176.7.1.2.2" extension="2217c913-c721-498a-a8d5-04a80fe2e0de"/>
                                    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Kræft i hjernen: beslutning: initial behandling ikke relevant, radikal operation i udredningsforløbet" code="AFB23C2B"/>
                                    <effectiveTime value="20170222130000+0200"/>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <act classCode="REG" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.83"/>
                                    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="henvist i samme sygdomsforløb" code="ALAA01"/>
                                    <entryRelationship typeCode="REFR">
                                        <act classCode="PCPR" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.72"/>
                                            <templateId root="2.16.840.1.113883.10.12.301"/>
                                            <id root="1.2.208.176.7.1.2.2" extension="21157122-1d29-4111-b233-51585dddf9b2"/>
                                            <code nullFlavor="NA"/>
                                        </act>
                                    </entryRelationship>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.105"/>
                                    <templateId root="2.16.840.1.113883.10.12.303"/>
                                    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="afsluttet ved patientens død" code="ALAC70"/>
                                </observation>
                            </entryRelationship>
                        </act>
                    </entry>
                </section>
            </component>
            <component>
                <section>
                    <templateId root="1.2.208.176.7.1.10.75"/>
                    <templateId root="2.16.840.1.113883.10.12.201"/>
                    <entry typeCode="COMP">
                        <encounter classCode="ENC" moodCode="EVN">
                            <templateId root="1.2.208.176.7.1.10.74"/>
                            <templateId root="2.16.840.1.113883.10.12.302"/>
                            <id root="1.2.208.176.7.1.2.1" extension="47041012-132f-5de1-b16a-df273f8f000f"/>
                            <id root="1.2.208.176.7.1.2.2" extension="3c56bc4d-c2ce-41f3-b921-87f5845302fb"/>
                            <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="fysisk fremmøde" code="ALCA00"/>
                            <effectiveTime>
                                <low value="20170216060000+0200"/>
                                <high value="20170224120000+0200"/>
                            </effectiveTime>
                            <priorityCode codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Akut" code="ATA1"/>
                            <participtant typeCode="RESP">
                                <templateId root="1.2.208.176.7.1.10.49"/>
                                <templateId root="2.16.840.1.113883.10.12.321"/>
                                <participantRole classCode="ROL">
                                    <scopingEntity classCode="ORG">
                                        <id root="1.2.208.176.1.1" extension="276231000016004" assigningAuthorityName="SOR"/>
                                    </scopingEntity>
                                </participantRole>
                            </participtant>
                            <participant typeCode="LOC">
                                <templateId root="1.2.208.176.7.1.10.50"/>
                                <templateId root="2.16.840.1.113883.10.12.321"/>
                                <time>
                                    <low value="20170222120000+0200"/>
                                    <high value="20170222130000+0200"/>
                                </time>
                                <participantRole classCode="SDLOC">
                                    <scopingEntity classCode="ORG">
                                        <id root="1.2.208.176.1.1" extension="276231000016004" assigningAuthorityName="SOR"/>
                                    </scopingEntity>
                                </participantRole>
                            </participant>
                            <entryRelationship typeCode="REFR">
                                <observation negationInd="false" classCode="OBS" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.45"/>
                                    <templateId root="1.2.208.176.7.1.10.36"/>
                                    <templateId root="2.16.840.1.113883.10.12.303"/>
                                    <id root="1.2.208.176.7.1.2.1" extension="d0438ac2-bf27-532f-88e8-c029aca9492b"/>
                                    <id root="1.2.208.176.7.1.2.2" extension="e309346f-8d5e-4f5a-82e9-f1841fb89be8"/>
                                    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Kræft i hjernens tindingelap med metastaser" code="DC712M"/>
                                    <targetSiteCode codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="venstresidig" code="TUL2"/>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.40"/>
                                            <templateId root="2.16.840.1.113883.10.12.303"/>
                                            <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Lokalrecidiv fra kræft i hjernen" code="DT636C"/>
                                        </observation>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.37"/>
                                            <templateId root="2.16.840.1.113883.10.12.303"/>
                                            <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Metastase i rygmarvshinde" code="DC793C"/>
                                        </observation>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.43"/>
                                            <templateId root="2.16.840.1.113883.10.12.303"/>
                                            <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="aktionsdiagnose" code="ALGA01"/>
                                        </observation>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <act classCode="REG" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.5"/>
                                            <templateId root="2.16.840.1.113883.10.12.301"/>
                                            <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="behandles ikke" code="ZDW29"/>
                                        </act>
                                    </entryRelationship>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="REFR">
                                <!-- include template 1.2.208.176.7.1.10.46 'DK Minor Condition Observation'
                                                                    (dynamic) .. O -->
                            </entryRelationship>
                            <entryRelationship typeCode="REFR">
                                <act classCode="ACT" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.7"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="højt specialiseret" code="ALFA2"/>
                                    <effectiveTime>
                                        <low value="20170117123000+0200"/>
                                        <high value="20170117151500+0200"/>
                                    </effectiveTime>
                                    <participant typeCode="IND">
                                        <templateId root="1.2.208.176.7.1.10.8"/>
                                        <templateId root="2.16.840.1.113883.10.12.321"/>
                                        <participantRole classCode="PAYOR">
                                            <scopingEntity>
                                                <id root="1.2.208.176.2.4" extension="ALFB01" assigningAuthorityName="Sundhedsdatastyrelsen"/>
                                            </scopingEntity>
                                        </participantRole>
                                    </participant>
                                    <entryRelationship typeCode="COMP">
                                        <act classCode="ACT" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.10"/>
                                            <templateId root="2.16.840.1.113883.10.12.301"/>
                                            <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="højt specialiseret funktion" code="ALFC4"/>
                                        </act>
                                    </entryRelationship>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="RSON">
                                <act classCode="REG" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.48"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Sygdom" code="ALCC01"/>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="RSON">
                                <act classCode="PCPR" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.51"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <code nullFlavor="NA"/>
                                    <effectiveTime value="20170218140000+0200"/>
                                    <participant typeCode="REF">
                                        <templateId root="1.2.208.176.7.1.10.52"/>
                                        <templateId root="2.16.840.1.113883.10.12.321"/>
                                        <participantRole classCode="ROL">
                                            <scopingEntity classCode="ORG">
                                                <id root="1.2.208.176.1.1" extension="486811000016002" assigningAuthorityName="SOR"/>
                                            </scopingEntity>
                                        </participantRole>
                                    </participant>
                                    <entryRelationship typeCode="RSON">
                                        <act classCode="REG" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.55"/>
                                            <templateId root="2.16.840.1.113883.10.12.301"/>
                                            <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Tumorer i hjerne- og rygmarvshinder af usikker og ukendt karakter" code="DD42"/>
                                            <entryRelationship typeCode="COMP">
                                                <act classCode="REG" moodCode="EVN">
                                                    <templateId root="1.2.208.176.7.1.10.5"/>
                                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                                    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="diagnosen stillet første gang" code="ZDW10"/>
                                                </act>
                                            </entryRelationship>
                                        </act>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <act classCode="REG" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.53"/>
                                            <templateId root="2.16.840.1.113883.10.12.301"/>
                                            <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="fritvalg ikke relevant" code="ALDB00"/>
                                        </act>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <act classCode="REG" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.54"/>
                                            <templateId root="2.16.840.1.113883.10.12.301"/>
                                            <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="akutordning" code="ALDA11"/>
                                        </act>
                                    </entryRelationship>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <act classCode="REG" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.112"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <code nullFlavor="NA"/>
                                    <effectiveTime value="20170228043900+0100"/>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="REFR">
                                <act classCode="PCPR" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.72"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <id root="1.2.208.176.7.1.2.2" extension="1859041a-8dbb-488b-ae2f-66f368ef5d17"/>
                                    <code nullFlavor="NA"/>
                                </act>
                            </entryRelationship>
                        </encounter>
                    </entry>
                </section>
            </component>
            <component>
                <section>
                    <templateId root="1.2.208.176.7.1.10.76"/>
                    <templateId root="2.16.840.1.113883.10.12.201"/>
                    <component>
                        <act classCode="ACT" moodCode="EVN">
                            <templateId root="1.2.208.176.7.1.10.25"/>
                            <templateId root="2.16.840.1.113883.10.12.301"/>
                            <id root="1.2.208.176.7.1.2.1" extension="50009866-1b81-53fd-bd67-b132a68415fa"/>
                            <id root="1.2.208.176.7.1.2.2" extension="94ff6bdb-2075-43de-ba33-7dafd7dc66cc"/>
                            <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Behandling med proteasehæmmer" code="BPHM91"/>
                            <effectiveTime>
                                <low value="20170115080000+0200"/>
                                <high value="20170115083000+0200"/>
                            </effectiveTime>
                            <participant typeCode="PRF">
                                <templateId root="1.2.208.176.7.1.10.16"/>
                                <templateId root="2.16.840.1.113883.10.12.321"/>
                                <participantRole classCode="ROL">
                                    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Sygeplejerske på klinisk sygehusafdeling" code="APBA1"/>
                                    <scopingEntity classCode="ORG">
                                        <id root="1.2.208.176.1.1" extension="369041000016006" assigningAuthorityName="SOR"/>
                                    </scopingEntity>
                                </participantRole>
                            </participant>
                            <entryRelationship typeCode="COMP">
                                <act classCode="ACT" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.22"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="igangsat" code="???"/>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="REFR">
                                <encounter classCode="ENC" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.77"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <id root="1.2.208.176.7.1.2.2" extension="3c56bc4d-c2ce-41f3-b921-87f5845302fb"/>
                                    <code nullFlavor="NA"/>
                                </encounter>
                            </entryRelationship>
                        </act>
                    </component>
                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <templateId root="1.2.208.176.7.1.10.29"/>
                            <templateId root="2.16.840.1.113883.10.12.303"/>
                            <id root="1.2.208.176.7.1.2.1" extension="ffa7bcb2-0ca4-57d9-a7f9-f37fbb1c5482"/>
                            <id root="1.2.208.176.7.1.2.2" extension="a659b5f7-e5d7-4d48-97f2-591a4a07da09"/>
                            <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="CT-skanning af cerebrum" code="UXCA00"/>
                            <effectiveTime>
                                <low value="20170116080000+0200"/>
                                <high value="20170116083000+0200"/>
                            </effectiveTime>
                            <participant typeCode="PRF">
                                <templateId root="1.2.208.176.7.1.10.16"/>
                                <templateId root="2.16.840.1.113883.10.12.321"/>
                                <participantRole classCode="ROL">
                                    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Radiograf" code="APFE2"/>
                                    <scopingEntity classCode="ORG">
                                        <id root="1.2.208.176.1.1" extension="275861000016001" assigningAuthorityName="SOR"/>
                                    </scopingEntity>
                                </participantRole>
                            </participant>
                            <entryRelationship typeCode="COMP">
                                <act classCode="REG" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.5"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="med CT-angiografi" code="UXZ41"/>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <act classCode="REG" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.5"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="med 3D rekonstruktion" code="UXZ45"/>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <substanceAdministration classCode="SBADM" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.2"/>
                                    <templateId root="2.16.840.1.113883.10.12.308"/>
                                    <consumable typeCode="CSM">
                                        <manufacturedProduct classCode="MANU">
                                            <templateId root="1.2.208.176.7.1.10.4"/>
                                            <templateId root="2.16.840.1.113883.10.12.312"/>
                                            <manufacturedMaterial classCode="MMAT">
                                                <templateId root="1.2.208.176.7.1.10.3"/>
                                                <templateId root="2.16.840.1.113883.10.12.311"/>
                                                <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="diatrizoinsyre" code="MV08AA01"/>
                                            </manufacturedMaterial>
                                        </manufacturedProduct>
                                    </consumable>
                                </substanceAdministration>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <act classCode="ACT" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.7"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="højt specialiseret" code="ALFA2"/>
                                    <effectiveTime>
                                        <low value="20170117123000+0200"/>
                                        <high value="20170117151500+0200"/>
                                    </effectiveTime>
                                    <participant typeCode="IND">
                                        <templateId root="1.2.208.176.7.1.10.8"/>
                                        <templateId root="2.16.840.1.113883.10.12.321"/>
                                        <participantRole classCode="PAYOR">
                                            <scopingEntity>
                                                <id root="1.2.208.176.2.4" extension="ALFB01" assigningAuthorityName="Sundhedsdatastyrelsen"/>
                                            </scopingEntity>
                                        </participantRole>
                                    </participant>
                                    <entryRelationship typeCode="COMP">
                                        <act classCode="ACT" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.10"/>
                                            <templateId root="2.16.840.1.113883.10.12.301"/>
                                            <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="højt specialiseret funktion" code="ALFC4"/>
                                        </act>
                                    </entryRelationship>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="RSON">
                                <observation classCode="OBS" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.19"/>
                                    <templateId root="2.16.840.1.113883.10.12.303"/>
                                    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Traumatisk blødning i lillehjernen" code="DS068B"/>
                                    <entryRelationship typeCode="COMP">
                                        <act classCode="REG" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.5"/>
                                            <templateId root="2.16.840.1.113883.10.12.301"/>
                                            <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="komplikation opstået i forbindelse med procedure" code="ZDA01"/>
                                        </act>
                                    </entryRelationship>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="REFR">
                                <encounter classCode="ENC" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.77"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <id root="1.2.208.176.7.1.2.2" extension="3c56bc4d-c2ce-41f3-b921-87f5845302fb"/>
                                    <code nullFlavor="NA"/>
                                </encounter>
                            </entryRelationship>
                        </observation>
                    </component>
                    <component>
                        <procedure classCode="PROC" moodCode="EVN">
                            <templateId root="1.2.208.176.7.1.10.30"/>
                            <templateId root="2.16.840.1.113883.10.12.306"/>
                            <id root="1.2.208.176.7.1.2.1" extension="7dfa91a1-e19e-57d0-bdbe-fea7f8582df5"/>
                            <id root="1.2.208.176.7.1.2.2" extension="96f2ea53-41c5-477a-bd02-69962f1be8d6"/>
                            <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Indlæggelse af intracerebralt trykmålingsudstyr" code="KAAA27"/>
                            <effectiveTime>
                                <low value="20170122084500+0200"/>
                                <high value="20170122123000+0200"/>
                            </effectiveTime>
                            <participant typeCode="PRF">
                                <templateId root="1.2.208.176.7.1.10.16"/>
                                <templateId root="2.16.840.1.113883.10.12.321"/>
                                <participantRole classCode="ROL">
                                    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Overlæge" code="APAA2"/>
                                    <scopingEntity classCode="ORG">
                                        <id root="1.2.208.176.1.1" extension="635841000016002" assigningAuthorityName="SOR"/>
                                    </scopingEntity>
                                </participantRole>
                            </participant>
                            <entryRelationship typeCode="COMP">
                                <act classCode="REG" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.5"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Sedation og smertelindring uden bevidsthedstab" code="NAAB"/>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <act classCode="ACT" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.7"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <id root="ASSDD" extension="123123213"/>
                                    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="højt specialiseret" code="ALFA2"/>
                                    <effectiveTime>
                                        <low value="20170117123000+0200"/>
                                        <high value="20170117151500+0200"/>
                                    </effectiveTime>
                                    <participant typeCode="IND">
                                        <templateId root="1.2.208.176.7.1.10.8"/>
                                        <templateId root="2.16.840.1.113883.10.12.321"/>
                                        <participantRole classCode="PAYOR">
                                            <scopingEntity>
                                                <id root="1.2.208.176.2.4" extension="ALFB01" assigningAuthorityName="Sundhedsdatastyrelsen"/>
                                            </scopingEntity>
                                        </participantRole>
                                    </participant>
                                    <entryRelationship typeCode="COMP">
                                        <act classCode="ACT" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.10"/>
                                            <templateId root="2.16.840.1.113883.10.12.301"/>
                                            <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="højt specialiseret funktion" code="ALFC4"/>
                                        </act>
                                    </entryRelationship>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="RSON">
                                <observation classCode="OBS" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.19"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Tumorer i hjerne- og rygmarvshinder af usikker og ukendt karakter" code="DD42"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="REFR">
                                <encounter classCode="ENC" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.77"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <id root="1.2.208.176.7.1.2.2" extension="3c56bc4d-c2ce-41f3-b921-87f5845302fb"/>
                                    <code nullFlavor="NA"/>
                                </encounter>
                            </entryRelationship>
                        </procedure>
                    </component>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument> 
```

```http
--uuid:a80594a2-e5de-425d-9fdc-f6ba27d58f05--
```

## Sample response with an invalid document

```http
HTTP/1.1 200 OK 
Connection: keep-alive 
X-Powered-By: Undertow/1 
Server: WildFly/10 
Transfer-Encoding: chunked 
Content-Type: multipart/related; type="application/xop+xml"; boundary="uuid:51e51260-f08c-4500-b486-5fd8ffaaddf9"; start="<root.message@cxf.apache.org>"; start-info="application/soap+xml" 
Date: Thu, 23 Nov 2017 07:51:32 GMT 
```

```http
--uuid:51e51260-f08c-4500-b486-5fd8ffaaddf9 
Content-Type: application/xop+xml; charset=UTF-8; type="application/soap+xml" 
Content-Transfer-Encoding: binary 
Content-ID: <root.message@cxf.apache.org> 
```

```xml
<soap:Envelope 
    xmlns:soap="http://www.w3.org/2003/05/soap-envelope">
    <soap:Header>
        <ns11:Header 
            xmlns:ns12="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd" 
            xmlns:ns11="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd" 
            xmlns:ns10="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" 
            xmlns:ns9="http://www.w3.org/2000/09/xmldsig#" 
            xmlns:ns8="urn:oasis:names:tc:SAML:2.0:assertion" 
            xmlns:ns7="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" 
            xmlns:ns6="urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0" 
            xmlns:ns5="urn:ihe:iti:xds-b:2007" 
            xmlns:ns4="urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0" 
            xmlns:ns3="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0" 
            xmlns:ns2="urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0">
            <ns11:TimeOut>3</ns11:TimeOut>
            <ns11:FlowStatus>flow_finalized_succesfully</ns11:FlowStatus>
        </ns11:Header>
    </soap:Header>
    <soap:Body>
        <ns2:RegistryResponse 
            xmlns="urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0" 
            xmlns:ns2="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0" 
            xmlns:ns3="urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0" 
            xmlns:ns4="urn:ihe:iti:xds-b:2007" 
            xmlns:ns5="urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0" 
            xmlns:ns6="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" 
            xmlns:ns7="urn:oasis:names:tc:SAML:2.0:assertion" 
            xmlns:ns8="http://www.w3.org/2000/09/xmldsig#" 
            xmlns:ns9="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" 
            xmlns:ns10="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd" 
            xmlns:ns11="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd" status="urn:oasis:names:tc:ebxml-regrep:ResponseStatusType:Failure">
            <ns2:RegistryErrorList highestSeverity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error">
                <ns2:RegistryError codeContext="XSD|||cvc-complex-type.2.4.a: Invalid content was found starting with element 'participtant'. One of '{&quot;urn:hl7-org:v3&quot;:subject, &quot;urn:hl7-org:v3&quot;:specimen, &quot;urn:hl7-org:v3&quot;:performer, &quot;urn:hl7-org:v3&quot;:author, &quot;urn:hl7-org:v3&quot;:informant, &quot;urn:hl7-org:v3&quot;:participant, &quot;urn:hl7-org:v3&quot;:entryRelationship, &quot;urn:hl7-org:v3&quot;:reference, &quot;urn:hl7-org:v3&quot;:precondition}' is expected." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||188"/>
                <ns2:RegistryError codeContext="XSD|||cvc-complex-type.2.4.b: The content of element 'entryRelationship' is not complete. One of '{&quot;urn:hl7-org:v3&quot;:realmCode, &quot;urn:hl7-org:v3&quot;:typeId, &quot;urn:hl7-org:v3&quot;:templateId, &quot;urn:hl7-org:v3&quot;:sequenceNumber, &quot;urn:hl7-org:v3&quot;:seperatableInd, &quot;urn:hl7-org:v3&quot;:act, &quot;urn:hl7-org:v3&quot;:encounter, &quot;urn:hl7-org:v3&quot;:observation, &quot;urn:hl7-org:v3&quot;:observationMedia, &quot;urn:hl7-org:v3&quot;:organizer, &quot;urn:hl7-org:v3&quot;:procedure, &quot;urn:hl7-org:v3&quot;:regionOfInterest, &quot;urn:hl7-org:v3&quot;:substanceAdministration, &quot;urn:hl7-org:v3&quot;:supply}' is expected." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||266"/>
                <ns2:RegistryError codeContext="XSD|||cvc-complex-type.2.4.a: Invalid content was found starting with element 'act'. One of '{&quot;urn:hl7-org:v3&quot;:realmCode, &quot;urn:hl7-org:v3&quot;:typeId, &quot;urn:hl7-org:v3&quot;:templateId, &quot;urn:hl7-org:v3&quot;:section}' is expected." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||385"/>
                <ns2:RegistryError codeContext="XSD|||cvc-complex-type.2.4.a: Invalid content was found starting with element 'observation'. One of '{&quot;urn:hl7-org:v3&quot;:realmCode, &quot;urn:hl7-org:v3&quot;:typeId, &quot;urn:hl7-org:v3&quot;:templateId, &quot;urn:hl7-org:v3&quot;:section}' is expected." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||428"/>
                <ns2:RegistryError codeContext="XSD|||cvc-complex-type.2.4.a: Invalid content was found starting with element 'procedure'. One of '{&quot;urn:hl7-org:v3&quot;:realmCode, &quot;urn:hl7-org:v3&quot;:typeId, &quot;urn:hl7-org:v3&quot;:templateId, &quot;urn:hl7-org:v3&quot;:section}' is expected." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||548"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKEpisodeOfCareSummariesDocument): /setId/@root must have same value as /relatedDocument/parentDocument/setId/@root" errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKEpisodeOfCareSummariesDocument): /versionNumber must be precisely 1 higher than /relatedDocument/parentDocument/versionNumber" errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKEpisodeOfCareSummariesDocument): Initial documents require /id/@root has the same value as /setId/@root" errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKEpisodeOfCareSummariesDocument): Initial documents require that /versionNumber has a value of 1" errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKEpisodeOfCareSummariesDocument): The value for @codeSystem SHALL be '1.0.3166.2.2.2'." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:realmCode[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKCustodian): The value for @assigningAuthorityName SHALL be 'Erhvervs- og Selskabsstyrelsen'." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:custodian[namespace-uri()='urn:hl7-org:v3'][1]/*:assignedCustodian[namespace-uri()='urn:hl7-org:v3'][1]/*:representedCustodianOrganization[namespace-uri()='urn:hl7-org:v3'][1]/*:id[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKSpecializationLevelAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.18' DK Specialization Level Act Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][3]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKSpecializationLevelAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.18' DK Specialization Level Act Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][4]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKSpecializationLevelAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.18' DK Specialization Level Act Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:procedure[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][2]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKEpisodeOfCareCompletionObservation): The value for code SHALL be selected from value set '1.2.208.176.2.4.3' DK Episode Of Care Completion Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][5]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKProcedureReasonObservation): The value for code SHALL be selected from value set '1.2.208.176.2.4.12' DK Condition Observation Primary Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][5]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKProcedureStatusAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.23' DK Procedure Status Act Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKProcedureAct): choice (hl7:entryRelationShip or hl7:reference) does not contain enough elements [min 1x]" errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKProcedureAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.19' DK Procedure Act Primary Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKProcedureProducerParticipationBody): The value for code SHALL be selected from value set '1.2.208.176.2.4.25' DK Staff Category Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:participant[namespace-uri()='urn:hl7-org:v3'][1]/*:participantRole[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKProcedureObservation): element hl7:entryRelationship[hl7:act[hl7:templateId[@root='1.2.208.176.7.1.10.5']][hl7:templateId[@root='2.16.840.1.113883.10.12.301']]] appears too often [max 1x]." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKProcedureObservation): choice (hl7:entryRelationShip or hl7:reference) does not contain enough elements [min 1x]" errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKProcedureObservation): The value for code SHALL be selected from value set '1.2.208.176.2.4.21' DK Procedure Observation Primary Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKProcedureProducerParticipationBody): The value for code SHALL be selected from value set '1.2.208.176.2.4.25' DK Staff Category Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]/*:participant[namespace-uri()='urn:hl7-org:v3'][1]/*:participantRole[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKProcedureProcedure): choice (hl7:entryRelationShip or hl7:reference) does not contain enough elements [min 1x]" errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:procedure[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKProcedureProcedure): The value for code SHALL be selected from value set '1.2.208.176.2.4.20' DK Procedure Procedure Primary Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:procedure[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKProcedureProducerParticipationBody): The value for code SHALL be selected from value set '1.2.208.176.2.4.25' DK Staff Category Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:procedure[namespace-uri()='urn:hl7-org:v3'][1]/*:participant[namespace-uri()='urn:hl7-org:v3'][1]/*:participantRole[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKMetastasisObservation): The value for code SHALL be selected from value set '1.2.208.176.2.4.13' DK Metastasis Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][2]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKLocalRecidivismObservation): The value for code SHALL be selected from value set '1.2.208.176.2.4.14' DK Local Recidivism Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKConditionKindObservation): The value for code SHALL be selected from value set '1.2.208.176.2.4.11' DK Condition Observation Kind Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][3]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKMainConditionObservation): element hl7:entryRelationship appears too often [max 1x]." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKMainConditionObservation): choice (hl7:entryRelationShip or hl7:reference) does not contain enough elements [min 1x]" errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKMainConditionObservation): The value for code SHALL be selected from value set '1.2.208.176.2.4.12' DK Condition Observation Primary Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKMainConditionObservation): The value for code SHALL be selected from value set '1.2.208.176.2.4.15' DK Condition Target Site Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]/*:targetSiteCode[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKEncounterReasonAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.9' DK Encounter Reason Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][4]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKSupplementaryCodeAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.29' DK Supplementary Code Act Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKSupplementaryCodeAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.29' DK Supplementary Code Act Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][4]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKSupplementaryCodeAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.29' DK Supplementary Code Act Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][5]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKSupplementaryCodeAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.29' DK Supplementary Code Act Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKSupplementaryCodeAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.29' DK Supplementary Code Act Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][2]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKSupplementaryCodeAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.29' DK Supplementary Code Act Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][5]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKSupplementaryCodeAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.29' DK Supplementary Code Act Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:procedure[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKRightToChooseHospitalAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.6' DK Right To Choose Hospital Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][2]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKRightToChooseHospitalAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.6' DK Right To Choose Hospital Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][5]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][2]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKReferralOriginAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.5' DK Referral Origin Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][3]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKReferralOriginAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.5' DK Referral Origin Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][5]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][3]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKReferralReasonAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.30' DK Referral Primary Reason Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKReferralReasonAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.30' DK Referral Primary Reason Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][5]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKPaymentContractAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.16' DK Payment Contract Act Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][3]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKPaymentContractPayorParticipantBody): The value for extension SHALL be selected from value set '1.2.208.176.2.4.17' DK Payment Contract Payor Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][3]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:participant[namespace-uri()='urn:hl7-org:v3'][1]/*:participantRole[namespace-uri()='urn:hl7-org:v3'][1]/*:scopingEntity[namespace-uri()='urn:hl7-org:v3'][1]/*:id[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKPaymentContractAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.16' DK Payment Contract Act Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][4]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKPaymentContractPayorParticipantBody): The value for extension SHALL be selected from value set '1.2.208.176.2.4.17' DK Payment Contract Payor Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:observation[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][4]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:participant[namespace-uri()='urn:hl7-org:v3'][1]/*:participantRole[namespace-uri()='urn:hl7-org:v3'][1]/*:scopingEntity[namespace-uri()='urn:hl7-org:v3'][1]/*:id[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKPaymentContractAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.16' DK Payment Contract Act Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:procedure[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][2]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKPaymentContractPayorParticipantBody): The value for extension SHALL be selected from value set '1.2.208.176.2.4.17' DK Payment Contract Payor Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:procedure[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][2]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:participant[namespace-uri()='urn:hl7-org:v3'][1]/*:participantRole[namespace-uri()='urn:hl7-org:v3'][1]/*:scopingEntity[namespace-uri()='urn:hl7-org:v3'][1]/*:id[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKEncounter): element hl7:participant[hl7:templateId[@root='1.2.208.176.7.1.10.49']][hl7:templateId[@root='2.16.840.1.113883.10.12.321']] is mandatory [min 1x]." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKEncounter): choice (hl7:entryRelationShip[hl7:act[hl7:templateId[@root='1.2.208.176.7.1.10.72']][hl7:templateId[@root='1.2.208.176.7.1.10.70']]] or hl7:reference[hl7:templateId[@root='1.2.208.176.7.1.10.69']][hl7:templateId[@root='2.16.840.1.113883.10.12.324']]) does not contain enough elements [min 1x]" errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKEncounter): The value for code SHALL be selected from value set '1.2.208.176.2.4.7' DK Encounter Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||CONF-DK: 34: attribute @value SHALL be present." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:effectiveTime[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKEncounter): The representation of time SHALL use the format YYYYMMDDhhmmss..ZZzz" errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:effectiveTime[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKEncounter): The value for code SHALL be selected from value set '1.2.208.176.2.4.8' DK Priority Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:priorityCode[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKEncounterServiceDeliveryLocationParticipantBody): The value for @nullFlavor SHALL be 'NI'." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][2]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:encounter[namespace-uri()='urn:hl7-org:v3'][1]/*:participant[namespace-uri()='urn:hl7-org:v3'][1]/*:participantRole[namespace-uri()='urn:hl7-org:v3'][1]/*:scopingEntity[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKProceduresSection): element hl7:entry[not(@nullFlavor)] is mandatory [min 1x]." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][3]/*:section[namespace-uri()='urn:hl7-org:v3'][1]"/>
                <ns2:RegistryError codeContext="SCHEMATRON|||(DKEpisodeOfCareMarkerAct): The value for code SHALL be selected from value set '1.2.208.176.2.4.4' DK Episode Of Care Marker Codes (DYNAMIC)." errorCode="InvalidDocumentContent" severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error" location="1.2.3.999-example4|||/*:ClinicalDocument[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:structuredBody[namespace-uri()='urn:hl7-org:v3'][1]/*:component[namespace-uri()='urn:hl7-org:v3'][1]/*:section[namespace-uri()='urn:hl7-org:v3'][1]/*:entry[namespace-uri()='urn:hl7-org:v3'][1]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:entryRelationship[namespace-uri()='urn:hl7-org:v3'][3]/*:act[namespace-uri()='urn:hl7-org:v3'][1]/*:code[namespace-uri()='urn:hl7-org:v3'][1]"/>
            </ns2:RegistryErrorList>
        </ns2:RegistryResponse>
    </soap:Body>
</soap:Envelope> 
```

```http
--uuid:51e51260-f08c-4500-b486-5fd8ffaaddf9--
```

## Sample response with a valid document

```http
HTTP/1.1 200 OK 
Connection: keep-alive 
X-Powered-By: Undertow/1 
Server: WildFly/10 
Transfer-Encoding: chunked 
Content-Type: multipart/related; type="application/xop+xml"; boundary="uuid:51e51260-f08c-4500-b486-5fd8ffaaddf9"; start="<root.message@cxf.apache.org>"; start-info="application/soap+xml" 
Date: Thu, 23 Nov 2017 07:51:32 GMT 
```

```http
--uuid:51e51260-f08c-4500-b486-5fd8ffaaddf9 
Content-Type: application/xop+xml; charset=UTF-8; type="application/soap+xml" 
Content-Transfer-Encoding: binary 
Content-ID: <root.message@cxf.apache.org> 
```

```xml
<soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope">
	<soap:Header>
		<ns10:Header xmlns="urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0"
			xmlns:ns10="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd"
			xmlns:ns11="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd" xmlns:ns2="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
			xmlns:ns3="urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0" xmlns:ns4="urn:ihe:iti:xds-b:2007"
			xmlns:ns5="urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0"
			xmlns:ns6="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
			xmlns:ns7="urn:oasis:names:tc:SAML:2.0:assertion" xmlns:ns8="http://www.w3.org/2000/09/xmldsig#"
			xmlns:ns9="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd">
			<ns10:TimeOut>3</ns10:TimeOut>
			<ns10:FlowStatus>flow_finalized_succesfully</ns10:FlowStatus>
		</ns10:Header>
	</soap:Header>
	<soap:Body>
		<ns2:RegistryResponse xmlns="urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0"
			xmlns:ns10="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd"
			xmlns:ns11="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd" xmlns:ns2="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"
			xmlns:ns3="urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0" xmlns:ns4="urn:ihe:iti:xds-b:2007"
			xmlns:ns5="urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0"
			xmlns:ns6="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
			xmlns:ns7="urn:oasis:names:tc:SAML:2.0:assertion" xmlns:ns8="http://www.w3.org/2000/09/xmldsig#"
			xmlns:ns9="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
			status="urn:oasis:names:tc:ebxml-regrep:ResponseStatusType:Success" />
	</soap:Body>
</soap:Envelope>
```

```http
--uuid:51e51260-f08c-4500-b486-5fd8ffaaddf9--
```

## Example usage of ID's and UUIDv4
The sample below shows the essential parts of the initial state of a given document containing a procedure. Note the use of ClinicalDocument.id, ClinicalDocument.setId and ClinicalDocument.versionNumber in the samples.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument 
    xmlns="urn:hl7-org:v3" 
    xmlns:voc="urn:hl7-org:v3/voc" 
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" classCode="DOCCLIN" moodCode="EVN">
    <realmCode code="DK" />
    <typeId extension="POCD_HD000040" root="2.16.840.1.113883.1.3" />
    <templateId root="1.2.208.176.7.1.10.71" />
    <templateId root="2.16.840.1.113883.10.12.2" />
    <templateId root="2.16.840.1.113883.10.12.1" />
    <id root="1.2.345.6789.123" />
    <code code="34133-9" codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC" displayName="Summary of episode note" />
    <effectiveTime value="20000407" />
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" />
    <setId root="1.2.345.6789.35" />
    <versionNumber value="1" />
    <recordTarget>
        <templateId root="1.2.208.176.7.1.10.101" />
        <templateId root="2.16.840.1.113883.10.12.101" />
        <patientRole classCode="PAT">
            <templateId root="1.2.208.176.7.1.10.107" />
            <id root="2.16.840.1.113883.4.3" extension="08119675AG1" assigningAuthorityName="Region Nordjylland" />
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
                <administrativeGenderCode code="M" displayName="Male" codeSystem="2.16.840.1.113883.5.1" />
            </patient>
        </patientRole>
    </recordTarget>
    <author typeCode="AUT">
        <templateId root="1.2.208.176.7.10.102" />
        <templateId root="2.16.840.1.113883.10.12.102" />
        <time value="20170228101500+0100" />
        <assignedAuthor classCode="ASSIGNED">
            <id nullFlavor="NI" />
            <representedOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="1.2.208.176.1.1" extension="6071000016008" assigningAuthorityName="SOR" />
            </representedOrganization>
        </assignedAuthor>
    </author>
    <custodian typeCode="CST">
        <templateId root="1.2.208.176.7.1.10.103" />
        <templateId root="2.16.840.1.113883.10.12.104" />
        <assignedCustodian classCode="ASSIGNED">
            <representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.840.1.113883.2.24.1.1" extension="25469364" assigningAuthorityName="Erhvervs- og Selskabsstyrelsen" />
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
                            <code codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Behandling med protesehæmmer" code="BPHM91" />
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
<ClinicalDocument 
    xmlns="urn:hl7-org:v3" 
    xmlns:voc="urn:hl7-org:v3/voc" 
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" classCode="DOCCLIN" moodCode="EVN">
    <realmCode code="DK" />
    <typeId extension="POCD_HD000040" root="2.16.840.1.113883.1.3" />
    <templateId root="1.2.208.176.7.1.10.71" />
    <templateId root="2.16.840.1.113883.10.12.2" />
    <templateId root="2.16.840.1.113883.10.12.1" />
    <id root="1.2.345.6789.1234" />
    <code code="34133-9" codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC" displayName="Summary of episode note" />
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

### Sample of how to create a UUIDv5

```bash
#!/bin/bash

EPISODE_OF_CARE_IDENTIFIER_OID=1.2.208.176.7.1.10.80
AUTHOR_SOR_IDENTIFIER=$1
INTERNAL_EPISODE_OF_CARE_UID=$2

CMD='uuid -v5 ns:OID '$EPISODE_OF_CARE_IDENTIFIER_OID
EPISODE_OF_CARE_IDENTIFIER_UUID=`$CMD`
CMD='uuid -v5 '$EPISODE_OF_CARE_IDENTIFIER_UUID' '$AUTHOR_SOR_IDENTIFIER
AUTHOR_SOR_UUID=`$CMD`
CMD='uuid -v5 '$AUTHOR_SOR_UUID' '$INTERNAL_EPISODE_OF_CARE_UID
EPISODE_OF_CARE_UUID=`$CMD`


echo 'EpisodeOfCareIdentifierUUID: '$EPISODE_OF_CARE_IDENTIFIER_UUID
echo 'AuthorSORUUID: '$AUTHOR_SOR_UUID
echo 'EpisodeOfCareUUID: '$EPISODE_OF_CARE_UUID
```

### Examples from selected scenarios
[Indberetning af sletning af procedure uden kontakt](examples/Removal.Procedure.xml)

[Indberetning af sletning af forløbselement](examples/Removal.EpisodeOfCare.xml)

[Indberetning af sletning af kontaktelement](examples/Removal.Encounter.xml)

[Indberetning af procedure uden kontakt med reference til forløbselement](examples/Procedure.ReferenceToEpisodeOfCare.xml)

[Indberetning kun med forløbselement](examples/EpisodeOfCare.xml)

[Indberetning af kontakt med reference til forløbselement og hvor der i samme besked er en resultatindberetning af typen ”Fødselsanmeldelse - mor” på kontakten med flere](examples/Encounter.ReferenceToEpisodeOfCare.Results-Mother.xml)

[Indberetning af kontakt med reference til forløbselement og hvor der i samme besked er en resultatindberetning af typen ”Neonatal hørescreening” på kontakten med flere resultater](examples/Encounter.ReferenceToEpisodeOfCare.Results-Hearingtests.xml)

[Indberetning af kontakt med reference til forløbselement og hvor der i samme besked er en resultatindberetning af typen ”Beslutning vedrørende personligt alarm- og pejlesystem” på kontakten med flere resultater](examples/Encounter.ReferenceToEpisodeOfCare.Results-Decision.Alarm.xml)

[Indberetning af kontakt med reference til forløbselement og hvor der i samme besked er en resultatindberetning af typen ”Fødselsanmeldelse - barn” på kontakten med flere resultater](examples/Encounter.ReferenceToEpisodeOfCare.Results-Child.xml)

[Indberetning af kontakt med reference til forløbselement og hvor der i samme besked er en resultatindberetning af typen ”Canceranmeldelse” på kontakten med flere resultater](examples/Encounter.ReferenceToEpisodeOfCare.Results-Cancer.xml)

[Indberetning af kontakt med reference til forløbselement og hvor der i samme besked er en resultatindberetning af typen ”Canceranmeldelse” på kontakten med flere resultater](examples/Encounter.ReferenceToEpisodeOfCare.Results-Accident.xml)

[Indberetning af kontakt med reference til forløbselement og hvor der i samme besked er en resultatindberetning af typen ”Abortoplysninger” på kontakten med flere resultater](examples/Encounter.ReferenceToEpisodeOfCare.Results-Abortion.xml)

[Indberetning af komplet kontakt med reference til forløbselement og med tilhørende procedurer og diagnoser og til diagnoserne (cancer)	hørende metastaser og lokalrecidiv](examples/Encounter.ReferenceToEpisodeOfCare.Proceduce.Diagnose-Cancer.xml)
