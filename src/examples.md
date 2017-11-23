**Sample request using MTOM/XOP**

```http
POST /cda-ws/PatientHealthcareReportingService HTTP/1.1 
Accept: application/soap+xml, multipart/related 
Content-Type: multipart/related;start="<rootpart*a80594a2-e5de-425d-9fdc-f6ba27d58f05@example.jaxws.sun.com>";type="application/xop+xml";boundary="uuid:a80594a2-e5de-425d-9fdc-f6ba27d58f05";start-info="application/soap+xml;action=\"urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-b\"" 
User-Agent: JAX-WS RI 2.2.9-b130926.1035 svn-revision#5f6196f2b90e9460065a4c2f4e30e065b245e51e 
Host: sc155887:8080 
Connection: keep-alive 
Content-Length: 52396 
```

```http
--uuid:a80594a2-e5de-425d-9fdc-f6ba27d58f05 
Content-Id: <rootpart*a80594a2-e5de-425d-9fdc-f6ba27d58f05@example.jaxws.sun.com> 
Content-Type: application/xop+xml;charset=utf-8;type="application/soap+xml;action=\"urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-b\"" 
Content-Transfer-Encoding: binary 
```

```xml
<?xml version='1.0' encoding='UTF-8'?>
<S:Envelope 
    xmlns:S="http://www.w3.org/2003/05/soap-envelope">
    <S:Header>
        <ns11:Security 
            xmlns:ns2="http://www.w3.org/2000/09/xmldsig#" 
            xmlns:ns3="urn:ihe:iti:xds-b:2007" 
            xmlns:ns4="urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0" 
            xmlns:ns5="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0" 
            xmlns:ns6="urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0" 
            xmlns:ns7="urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0" 
            xmlns:ns8="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd" 
            xmlns:ns9="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd" 
            xmlns:ns10="urn:oasis:names:tc:SAML:2.0:assertion" 
            xmlns:ns11="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" 
            xmlns:ns12="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd">
            <ns10:Assertion IssueInstant="2017-11-23T08:51:30.945+01:00" id="IDCard">
                <ns10:Conditions NotBefore="2017-11-21T08:51:30.940+01:00" NotOnOrAfter="2017-11-27T08:51:30.945+01:00"/>
                <ns10:AttributeStatement id="IDCardData">
                    <ns10:Attribute Name="sosi:IDCardID">
                        <ns10:AttributeValue>123213131231</ns10:AttributeValue>
                    </ns10:Attribute>
                    <ns10:Attribute Name="sosi:IDCardVersion">
                        <ns10:AttributeValue>1.0</ns10:AttributeValue>
                    </ns10:Attribute>
                    <ns10:Attribute Name="sosi:IDCardType">
                        <ns10:AttributeValue>system</ns10:AttributeValue>
                    </ns10:Attribute>
                    <ns10:Attribute Name="sosi:AuthenticationLevel">
                        <ns10:AttributeValue>3</ns10:AttributeValue>
                    </ns10:Attribute>
                    <ns10:Attribute Name="sosi:OCESCertHash">
                        <ns10:AttributeValue>#hanseman</ns10:AttributeValue>
                    </ns10:Attribute>
                </ns10:AttributeStatement>
                <ns10:AttributeStatement id="SystemLog">
                    <ns10:Attribute Name="medcom:ITSystemName">
                        <ns10:AttributeValue>..ge</ns10:AttributeValue>
                    </ns10:Attribute>
                    <ns10:Attribute Name="medcom:CareProviderID">
                        <ns10:AttributeValue>121212</ns10:AttributeValue>
                    </ns10:Attribute>
                    <ns10:Attribute Name="medcom:CareProviderName">
                        <ns10:AttributeValue>Brodtg..rd L..gehus</ns10:AttributeValue>
                    </ns10:Attribute>
                </ns10:AttributeStatement>
                <ns2:Signature id="OCESSignature">
                    <ns2:SignedInfo>
                        <ns2:Reference URI="#IDCard">
                            <ns2:DigestValue>AQID</ns2:DigestValue>
                        </ns2:Reference>
                    </ns2:SignedInfo>
                    <ns2:SignatureValue>BAUG</ns2:SignatureValue>
                    <ns2:KeyInfo>
                        <ns2:X509Data>
                            <ns2:X509Certificate>BwgJ</ns2:X509Certificate>
                        </ns2:X509Data>
                    </ns2:KeyInfo>
                </ns2:Signature>
            </ns10:Assertion>
        </ns11:Security>
        <ns9:Header 
            xmlns:ns2="http://www.w3.org/2000/09/xmldsig#" 
            xmlns:ns3="urn:ihe:iti:xds-b:2007" 
            xmlns:ns4="urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0" 
            xmlns:ns5="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0" 
            xmlns:ns6="urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0" 
            xmlns:ns7="urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0" 
            xmlns:ns8="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd" 
            xmlns:ns9="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd" 
            xmlns:ns10="urn:oasis:names:tc:SAML:2.0:assertion" 
            xmlns:ns11="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" 
            xmlns:ns12="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd">
            <ns9:TimeOut>3</ns9:TimeOut>
        </ns9:Header>
        <ns8:HsuidHeader 
            xmlns:ns2="http://www.w3.org/2000/09/xmldsig#" 
            xmlns:ns3="urn:ihe:iti:xds-b:2007" 
            xmlns:ns4="urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0" 
            xmlns:ns5="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0" 
            xmlns:ns6="urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0" 
            xmlns:ns7="urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0" 
            xmlns:ns8="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd" 
            xmlns:ns9="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd" 
            xmlns:ns10="urn:oasis:names:tc:SAML:2.0:assertion" 
            xmlns:ns11="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" 
            xmlns:ns12="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd">
            <ns8:Assertion IssueInstant="2017-11-23T08:51:30.946+01:00" id="HSUID">
                <ns8:Issuer>HansemanIT</ns8:Issuer>
                <ns8:AttributeStatement id="HSUIDdata">
                    <ns8:Attribute Name="nsi:UserType">
                        <ns8:AttributeValue>nsi:HealthcareProfessional</ns8:AttributeValue>
                    </ns8:Attribute>
                    <ns8:Attribute Name="nsi:OrgResponsibleName">
                        <ns8:AttributeValue>HansemanIT Org.</ns8:AttributeValue>
                    </ns8:Attribute>
                    <ns8:Attribute Name="nsi:SystemOwnerName">
                        <ns8:AttributeValue>HansemanIT</ns8:AttributeValue>
                    </ns8:Attribute>
                    <ns8:Attribute Name="nsi:SystemName">
                        <ns8:AttributeValue>Hanseman</ns8:AttributeValue>
                    </ns8:Attribute>
                    <ns8:Attribute Name="nsi:SystemVersion">
                        <ns8:AttributeValue>1.0</ns8:AttributeValue>
                    </ns8:Attribute>
                </ns8:AttributeStatement>
            </ns8:Assertion>
        </ns8:HsuidHeader>
    </S:Header>
    <S:Body>
        <ns3:ProvideAndRegisterDocumentSetRequest 
            xmlns:ns2="http://www.w3.org/2000/09/xmldsig#" 
            xmlns:ns3="urn:ihe:iti:xds-b:2007" 
            xmlns:ns4="urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0" 
            xmlns:ns5="urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0" 
            xmlns:ns6="urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0" 
            xmlns:ns7="urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0" 
            xmlns:ns8="http://www.nsi.dk/hsuid/2016/08/hsuid-1.1.xsd" 
            xmlns:ns9="http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd" 
            xmlns:ns10="urn:oasis:names:tc:SAML:2.0:assertion" 
            xmlns:ns11="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" 
            xmlns:ns12="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd">
            <ns6:SubmitObjectsRequest id="a89c96e7-aa32-47b5-856f-2603f8c88ea6" comment="This is a brave comment">
                <ns4:RegistryObjectList>
                    <ns4:RegistryPackage/>
                    <ns4:Association/>
                    <ns4:ExtrinsicObject mimeType="text/xml" objectType="urn:uuid:7edca82f-054d-47f2-a032-9b2a5b5186c1" id="urn:uuid:35014204-1818-4aa8-b968-4c3d39f280eb"/>
                    <ns4:ClassificationNode code="urn:uuid:ab9b591b-83ab-4d03-8f5d-f93b1fb92e85"/>
                </ns4:RegistryObjectList>
            </ns6:SubmitObjectsRequest>
            <ns3:Document id="Patient-with-CPR-number-identification.xml">
                <xop:Include 
                    xmlns:xop="http://www.w3.org/2004/08/xop/include" href="cid:8ae60adb-d8f5-4837-a779-3a64e25850a3@example.jaxws.sun.com"/>
            </ns3:Document>
        </ns3:ProvideAndRegisterDocumentSetRequest>
    </S:Body>
</S:Envelope> 
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
                                            <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Tumorer i hjerne- og rygmarvshinder af usikker og ukendt karakter" code="DD42"/>
                                            <entryRelationship typeCode="COMP">
                                                <act classCode="REG" moodCode="EVN">
                                                    <templateId root="1.2.208.176.7.1.10.5"/>
                                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                                    <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="diagnosen stillet f..rste gang" code="ZDW10"/>
                                                </act>
                                            </entryRelationship>
                                        </act>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <act classCode="REG" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.53"/>
                                            <templateId root="2.16.840.1.113883.10.12.301"/>
                                            <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="fritvalg ikke relevant" code="ALDB00"/>
                                        </act>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <act classCode="REG" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.54"/>
                                            <templateId root="2.16.840.1.113883.10.12.301"/>
                                            <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="akutordning" code="ALDA11"/>
                                        </act>
                                    </entryRelationship>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <act classCode="REG" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.81"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Kr..ftsygdomme" code="ALAL01"/>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <act classCode="REG" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.82"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <id root="1.2.208.176.7.1.2.1" extension="c770b34c-9854-519b-8239-2d7794a94bef"/>
                                    <id root="1.2.208.176.7.1.2.2" extension="2217c913-c721-498a-a8d5-04a80fe2e0de"/>
                                    <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Kr..ft i hjernen: beslutning: initial behandling ikke relevant, radikal operation i udredningsforl..bet" code="AFB23C2B"/>
                                    <effectiveTime value="20170222130000+0200"/>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <act classCode="REG" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.83"/>
                                    <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="henvist i samme sygdomsforl..b" code="ALAA01"/>
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
                                    <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="afsluttet ved patientens d..d" code="ALAC70"/>
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
                            <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="fysisk fremm..de" code="ALCA00"/>
                            <effectiveTime>
                                <low value="20170216060000+0200"/>
                                <high value="20170224120000+0200"/>
                            </effectiveTime>
                            <priorityCode codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Akut" code="ATA1"/>
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
                                    <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Kr..ft i hjernens tindingelap med metastaser" code="DC712M"/>
                                    <targetSiteCode codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="venstresidig" code="TUL2"/>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.40"/>
                                            <templateId root="2.16.840.1.113883.10.12.303"/>
                                            <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Lokalrecidiv fra kr..ft i hjernen" code="DT636C"/>
                                        </observation>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.37"/>
                                            <templateId root="2.16.840.1.113883.10.12.303"/>
                                            <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Metastase i rygmarvshinde" code="DC793C"/>
                                        </observation>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.43"/>
                                            <templateId root="2.16.840.1.113883.10.12.303"/>
                                            <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="aktionsdiagnose" code="ALGA01"/>
                                        </observation>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <act classCode="REG" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.5"/>
                                            <templateId root="2.16.840.1.113883.10.12.301"/>
                                            <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="behandles ikke" code="ZDW29"/>
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
                                    <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="h..jt specialiseret" code="ALFA2"/>
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
                                            <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="h..jt specialiseret funktion" code="ALFC4"/>
                                        </act>
                                    </entryRelationship>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="RSON">
                                <act classCode="REG" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.48"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Sygdom" code="ALCC01"/>
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
                                            <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Tumorer i hjerne- og rygmarvshinder af usikker og ukendt karakter" code="DD42"/>
                                            <entryRelationship typeCode="COMP">
                                                <act classCode="REG" moodCode="EVN">
                                                    <templateId root="1.2.208.176.7.1.10.5"/>
                                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                                    <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="diagnosen stillet f..rste gang" code="ZDW10"/>
                                                </act>
                                            </entryRelationship>
                                        </act>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <act classCode="REG" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.53"/>
                                            <templateId root="2.16.840.1.113883.10.12.301"/>
                                            <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="fritvalg ikke relevant" code="ALDB00"/>
                                        </act>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <act classCode="REG" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.54"/>
                                            <templateId root="2.16.840.1.113883.10.12.301"/>
                                            <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="akutordning" code="ALDA11"/>
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
                            <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Behandling med proteaseh..mmer" code="BPHM91"/>
                            <effectiveTime>
                                <low value="20170115080000+0200"/>
                                <high value="20170115083000+0200"/>
                            </effectiveTime>
                            <participant typeCode="PRF">
                                <templateId root="1.2.208.176.7.1.10.16"/>
                                <templateId root="2.16.840.1.113883.10.12.321"/>
                                <participantRole classCode="ROL">
                                    <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Sygeplejerske p.. klinisk sygehusafdeling" code="APBA1"/>
                                    <scopingEntity classCode="ORG">
                                        <id root="1.2.208.176.1.1" extension="369041000016006" assigningAuthorityName="SOR"/>
                                    </scopingEntity>
                                </participantRole>
                            </participant>
                            <entryRelationship typeCode="COMP">
                                <act classCode="ACT" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.22"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="igangsat" code="???"/>
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
                            <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="CT-skanning af cerebrum" code="UXCA00"/>
                            <effectiveTime>
                                <low value="20170116080000+0200"/>
                                <high value="20170116083000+0200"/>
                            </effectiveTime>
                            <participant typeCode="PRF">
                                <templateId root="1.2.208.176.7.1.10.16"/>
                                <templateId root="2.16.840.1.113883.10.12.321"/>
                                <participantRole classCode="ROL">
                                    <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Radiograf" code="APFE2"/>
                                    <scopingEntity classCode="ORG">
                                        <id root="1.2.208.176.1.1" extension="275861000016001" assigningAuthorityName="SOR"/>
                                    </scopingEntity>
                                </participantRole>
                            </participant>
                            <entryRelationship typeCode="COMP">
                                <act classCode="REG" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.5"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="med CT-angiografi" code="UXZ41"/>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <act classCode="REG" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.5"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="med 3D rekonstruktion" code="UXZ45"/>
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
                                                <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="diatrizoinsyre" code="MV08AA01"/>
                                            </manufacturedMaterial>
                                        </manufacturedProduct>
                                    </consumable>
                                </substanceAdministration>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <act classCode="ACT" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.7"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="h..jt specialiseret" code="ALFA2"/>
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
                                            <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="h..jt specialiseret funktion" code="ALFC4"/>
                                        </act>
                                    </entryRelationship>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="RSON">
                                <observation classCode="OBS" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.19"/>
                                    <templateId root="2.16.840.1.113883.10.12.303"/>
                                    <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Traumatisk bl..dning i lillehjernen" code="DS068B"/>
                                    <entryRelationship typeCode="COMP">
                                        <act classCode="REG" moodCode="EVN">
                                            <templateId root="1.2.208.176.7.1.10.5"/>
                                            <templateId root="2.16.840.1.113883.10.12.301"/>
                                            <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="komplikation opst..et i forbindelse med procedure" code="ZDA01"/>
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
                            <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Indl..ggelse af intracerebralt trykm..lingsudstyr" code="KAAA27"/>
                            <effectiveTime>
                                <low value="20170122084500+0200"/>
                                <high value="20170122123000+0200"/>
                            </effectiveTime>
                            <participant typeCode="PRF">
                                <templateId root="1.2.208.176.7.1.10.16"/>
                                <templateId root="2.16.840.1.113883.10.12.321"/>
                                <participantRole classCode="ROL">
                                    <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Overl..ge" code="APAA2"/>
                                    <scopingEntity classCode="ORG">
                                        <id root="1.2.208.176.1.1" extension="635841000016002" assigningAuthorityName="SOR"/>
                                    </scopingEntity>
                                </participantRole>
                            </participant>
                            <entryRelationship typeCode="COMP">
                                <act classCode="REG" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.5"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Sedation og smertelindring uden bevidsthedstab" code="NAAB"/>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <act classCode="ACT" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.7"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <id root="ASSDD" extension="123123213"/>
                                    <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="h..jt specialiseret" code="ALFA2"/>
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
                                            <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="h..jt specialiseret funktion" code="ALFC4"/>
                                        </act>
                                    </entryRelationship>
                                </act>
                            </entryRelationship>
                            <entryRelationship typeCode="RSON">
                                <observation classCode="OBS" moodCode="EVN">
                                    <templateId root="1.2.208.176.7.1.10.19"/>
                                    <templateId root="2.16.840.1.113883.10.12.301"/>
                                    <code codeSystemName="Sundhedsv..senets Klassifikations System" codeSystem="1.2.208.176.2.4" displayName="Tumorer i hjerne- og rygmarvshinder af usikker og ukendt karakter" code="DD42"/>
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

**Sample response with a valid document**

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

### Examples from selected scenarios
[Indberetning af sletning af procedure uden kontakt](/examples/Removal.Procedure.xml)

[Indberetning af sletning af forløbselement](/examples/Removal.EpisodeOfCare.xml)

[Indberetning af sletning af kontaktelement](/examples/Removal.Encounter.xml)

[Indberetning af procedure uden kontakt med reference til forløbselement](/examples/Procedure.ReferenceToEpisodeOfCare.xml)

[Indberetning kun med forløbselement](/examples/EpisodeOfCare.xml)

[Indberetning af kontakt med reference til forløbselement og hvor der i samme besked er en resultatindberetning af typen ”Fødselsanmeldelse - mor” på kontakten med flere](/examples/Encounter.ReferenceToEpisodeOfCare.Results-Mother.xml)

[Indberetning af kontakt med reference til forløbselement og hvor der i samme besked er en resultatindberetning af typen ”Neonatal hørescreening” på kontakten med flere resultater](/examples/Encounter.ReferenceToEpisodeOfCare.Results-Hearingtests.xml)

[Indberetning af kontakt med reference til forløbselement og hvor der i samme besked er en resultatindberetning af typen ”Beslutning vedrørende personligt alarm- og pejlesystem” på kontakten med flere resultater](/examples/Encounter.ReferenceToEpisodeOfCare.Results-Decision.Alarm.xml)

[Indberetning af kontakt med reference til forløbselement og hvor der i samme besked er en resultatindberetning af typen ”Fødselsanmeldelse - barn” på kontakten med flere resultater](/examples/Encounter.ReferenceToEpisodeOfCare.Results-Child.xml)

[Indberetning af kontakt med reference til forløbselement og hvor der i samme besked er en resultatindberetning af typen ”Canceranmeldelse” på kontakten med flere resultater](/examples/Encounter.ReferenceToEpisodeOfCare.Results-Cancer.xml)

[Indberetning af kontakt med reference til forløbselement og hvor der i samme besked er en resultatindberetning af typen ”Canceranmeldelse” på kontakten med flere resultater](/examples/Encounter.ReferenceToEpisodeOfCare.Results-Accident.xml)

[Indberetning af kontakt med reference til forløbselement og hvor der i samme besked er en resultatindberetning af typen ”Abortoplysninger” på kontakten med flere resultater](/examples/Encounter.ReferenceToEpisodeOfCare.Results-Abortion.xml)

[Indberetning af komplet kontakt med reference til forløbselement og med tilhørende procedurer og diagnoser og til diagnoserne (cancer)	hørende metastaser og lokalrecidiv](/examples/Encounter.ReferenceToEpisodeOfCare.Proceduce.Diagnose-Cancer.xml)
