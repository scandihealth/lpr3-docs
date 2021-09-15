# Submission scheme

## Creating object

## Updating objects

## Deleting objects

## Special cases

### Update main condition
Create an episode of care with an encounter and a main condition observation.
```xml
<hl7:ClinicalDocument xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
    xmlns:hl7="urn:hl7-org:v3" xsi:schemaLocation="urn:hl7-org:v3 https://raw.githubusercontent.com/cdaapi/cdaapi_core/master/reference/CDA.xsd">
    <hl7:realmCode code="DK"/>
    <hl7:typeId root="2.16.840.1.113883.1.3" extension="POCD_HD000040"/>
    <hl7:templateId root="1.2.208.176.7.1.10.71"/>
    <hl7:templateId root="2.16.840.1.113883.10.12.2"/>
    <hl7:templateId root="2.16.840.1.113883.10.12.1"/>
    <hl7:id root="5016AD8F-26A5-47A4-AB7B-EDB035B88595" extension="05D12F25-D420-46B5-BEC3-19C671404672"/>
    <hl7:code codeSystem="2.16.840.1.113883.6.1" code="34133-9"/>
    <hl7:effectiveTime value="20180814085746+0200"/>
    <hl7:confidentialityCode codeSystem="2.16.840.1.113883.5.25" code="N"/>
    <hl7:setId assigningAuthorityName="DXC Technology" root="5016AD8F-26A5-47A4-AB7B-EDB035B88595"/>
    <hl7:versionNumber value="-731548"/>
    <hl7:recordTarget>
        <hl7:templateId root="2.16.840.1.113883.10.12.101"/>
        <hl7:templateId root="1.2.208.176.7.1.10.101"/>
        <hl7:patientRole classCode="PAT">
            <hl7:templateId root="1.2.208.176.7.1.10.106"/>
            <hl7:id assigningAuthorityName="CPR" root="1.2.208.176.1.2" extension="1304621201"/>
        </hl7:patientRole>
    </hl7:recordTarget>
    <hl7:author typeCode="AUT">
        <hl7:templateId root="2.16.840.1.113883.10.12.102"/>
        <hl7:templateId root="1.2.208.176.7.1.10.102"/>
        <hl7:time value="20180814075746+0200"/>
        <hl7:assignedAuthor classCode="ASSIGNED">
            <hl7:id nullFlavor="NI"/>
            <hl7:representedOrganization classCode="ORG" determinerCode="INSTANCE">
                <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="6071000016008"/>
            </hl7:representedOrganization>
        </hl7:assignedAuthor>
    </hl7:author>
    <hl7:custodian typeCode="CST">
        <hl7:templateId root="2.16.840.1.113883.10.12.104"/>
        <hl7:templateId root="1.2.208.176.7.1.10.103"/>
        <hl7:assignedCustodian classCode="ASSIGNED">
            <hl7:representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <hl7:id root="2.16.840.1.113883.2.24.1.1" extension="25469364"/>
            </hl7:representedCustodianOrganization>
        </hl7:assignedCustodian>
    </hl7:custodian>
    <hl7:component contextConductionInd="true">
        <hl7:structuredBody>
            <hl7:component contextConductionInd="true">
                <hl7:section>
                    <hl7:templateId root="1.2.208.176.7.1.10.75"/>
                    <hl7:templateId root="2.16.840.1.113883.10.12.201"/>
                    <hl7:entry typeCode="COMP">
                        <hl7:encounter classCode="ENC" moodCode="EVN">
                            <hl7:templateId root="2.16.840.1.113883.10.12.302"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.74"/>
                            <hl7:id root="5016AD8F-26A5-47A4-AB7B-EDB035B88595" extension="A37ECD01-9C3B-5507-ABE3-59154CBDA852"/>
                            <hl7:code codeSystem="1.2.208.176.2.4" code="ALCA00"/>
                            <hl7:effectiveTime>
                                <hl7:low value="20180814085746+0200"/>
                            </hl7:effectiveTime>
                            <hl7:priorityCode codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" code="ATA1"/>
                            <hl7:participant typeCode="RESP">
                                <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                <hl7:templateId root="1.2.208.176.7.1.10.49"/>
                                <hl7:participantRole classCode="ROL">
                                    <hl7:scopingEntity classCode="ORG">
                                        <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="276231000016004"/>
                                    </hl7:scopingEntity>
                                </hl7:participantRole>
                            </hl7:participant>
                            <hl7:participant typeCode="LOC">
                                <hl7:templateId root="1.2.208.176.7.1.10.50"/>
                                <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                <hl7:time>
                                    <hl7:low value="20180814085746+0200"/>
                                </hl7:time>
                                <hl7:participantRole classCode="SDLOC">
                                    <hl7:templateId root="1.2.208.176.7.1.22.4"/>
                                    <hl7:scopingEntity classCode="ORG">
                                        <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="276231000016004"/>
                                    </hl7:scopingEntity>
                                </hl7:participantRole>
                            </hl7:participant>
                            <hl7:entryRelationship typeCode="RSON">
                                <hl7:act classCode="REG" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.48"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALCC01"/>
                                </hl7:act>
                            </hl7:entryRelationship>
                            <hl7:entryRelationship typeCode="REFR">
                                <hl7:act classCode="PCPR" moodCode="EVN">
                                    <hl7:templateId root="1.2.208.176.7.1.10.72"/>
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:id root="5016AD8F-26A5-47A4-AB7B-EDB035B88595" extension="24821928-5521-5B2A-A54D-0BF135B16FFC"/>
                                    <hl7:code nullFlavor="NA"/>
                                </hl7:act>
                            </hl7:entryRelationship>
                            <hl7:entryRelationship typeCode="REFR">
                                <hl7:act classCode="ACT" moodCode="EVN">
                                    <hl7:templateId root="1.2.208.176.7.1.10.7"/>
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALFA2"/>
                                    <hl7:effectiveTime>
                                        <hl7:low value="20180814085746+0200"/>
                                    </hl7:effectiveTime>
                                    <hl7:participant typeCode="IND">
                                        <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                        <hl7:templateId root="1.2.208.176.7.1.10.8"/>
                                        <hl7:participantRole classCode="PAYOR">
                                            <hl7:scopingEntity classCode="ORG">
                                                <hl7:id assigningAuthorityName="Sundhedsdatastyrelsen" root="1.2.208.176.2.4" extension="ALFB01"/>
                                            </hl7:scopingEntity>
                                        </hl7:participantRole>
                                    </hl7:participant>
                                    <hl7:entryRelationship typeCode="COMP">
                                        <hl7:act classCode="ACT" moodCode="EVN">
                                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                            <hl7:templateId root="1.2.208.176.7.1.10.10"/>
                                            <hl7:code codeSystem="1.2.208.176.2.4" code="ALFC4"/>
                                        </hl7:act>
                                    </hl7:entryRelationship>
                                </hl7:act>
                            </hl7:entryRelationship>
                        </hl7:encounter>
                    </hl7:entry>
                </hl7:section>
            </hl7:component>
            <hl7:component contextConductionInd="true">
                <hl7:section>
                    <hl7:templateId root="2.16.840.1.113883.10.12.201"/>
                    <hl7:templateId root="1.2.208.176.7.1.10.113"/>
                    <hl7:entry typeCode="COMP">
                        <hl7:observation classCode="OBS" moodCode="EVN" negationInd="false">
                            <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.36"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.45"/>
                            <hl7:id root="5016AD8F-26A5-47A4-AB7B-EDB035B88595" extension="1011BE6B-072B-59C6-831E-71B9632678B6"/>
                            <hl7:code codeSystem="1.2.208.176.2.4" code="DO000"/>
                            <hl7:entryRelationship typeCode="COMP">
                                <hl7:observation classCode="OBS" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.43"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALGA01"/>
                                </hl7:observation>
                            </hl7:entryRelationship>
                            <hl7:entryRelationship typeCode="REFR">
                                <hl7:encounter classCode="ENC" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.77"/>
                                    <hl7:id root="5016AD8F-26A5-47A4-AB7B-EDB035B88595" extension="A37ECD01-9C3B-5507-ABE3-59154CBDA852"/>
                                    <hl7:code nullFlavor="NA"/>
                                </hl7:encounter>
                            </hl7:entryRelationship>
                        </hl7:observation>
                    </hl7:entry>
                </hl7:section>
            </hl7:component>
            <hl7:component contextConductionInd="true">
                <hl7:section>
                    <hl7:templateId root="2.16.840.1.113883.10.12.201"/>
                    <hl7:templateId root="1.2.208.176.7.1.10.95"/>
                    <hl7:entry typeCode="COMP">
                        <hl7:act classCode="PCPR" moodCode="EVN">
                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.80"/>
                            <hl7:id root="5016AD8F-26A5-47A4-AB7B-EDB035B88595" extension="24821928-5521-5B2A-A54D-0BF135B16FFC"/>
                            <hl7:code nullFlavor="NA"/>
                            <hl7:effectiveTime>
                                <hl7:low value="20180814085746+0200"/>
                            </hl7:effectiveTime>
                            <hl7:participant typeCode="RESP">
                                <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                <hl7:templateId root="1.2.208.176.7.1.10.49"/>
                                <hl7:participantRole classCode="ROL">
                                    <hl7:scopingEntity classCode="ORG">
                                        <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="276231000016004"/>
                                    </hl7:scopingEntity>
                                </hl7:participantRole>
                            </hl7:participant>
                            <hl7:entryRelationship typeCode="RSON">
                                <hl7:act classCode="PCPR" moodCode="RQO">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.51"/>
                                    <hl7:code nullFlavor="NA"/>
                                    <hl7:effectiveTime value="20180814085746+0200"/>
                                    <hl7:participant typeCode="REF">
                                        <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                        <hl7:templateId root="1.2.208.176.7.1.10.52"/>
                                        <hl7:participantRole classCode="ROL">
                                            <hl7:scopingEntity classCode="ORG">
                                                <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="486811000016002"/>
                                            </hl7:scopingEntity>
                                        </hl7:participantRole>
                                    </hl7:participant>
                                    <hl7:entryRelationship typeCode="COMP">
                                        <hl7:act classCode="REG" moodCode="EVN">
                                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                            <hl7:templateId root="1.2.208.176.7.1.10.54"/>
                                            <hl7:code codeSystem="1.2.208.176.2.4" code="ALDA11"/>
                                        </hl7:act>
                                    </hl7:entryRelationship>
                                    <hl7:entryRelationship typeCode="RSON">
                                        <hl7:act classCode="REG" moodCode="EVN">
                                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                            <hl7:templateId root="1.2.208.176.7.1.10.55"/>
                                            <hl7:code codeSystem="1.2.208.176.2.4" code="DD429"/>
                                            <hl7:entryRelationship typeCode="COMP">
                                                <hl7:act classCode="REG" moodCode="EVN">
                                                    <hl7:templateId root="1.2.208.176.7.1.10.5"/>
                                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ZDW10"/>
                                                </hl7:act>
                                            </hl7:entryRelationship>
                                        </hl7:act>
                                    </hl7:entryRelationship>
                                    <hl7:entryRelationship typeCode="COMP">
                                        <hl7:act classCode="REG" moodCode="EVN">
                                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                            <hl7:templateId root="1.2.208.176.7.1.10.53"/>
                                            <hl7:code codeSystem="1.2.208.176.2.4" code="ALDB00"/>
                                        </hl7:act>
                                    </hl7:entryRelationship>
                                </hl7:act>
                            </hl7:entryRelationship>
                            <hl7:entryRelationship typeCode="COMP">
                                <hl7:act classCode="REG" moodCode="EVN">
                                    <hl7:templateId root="1.2.208.176.7.1.10.81"/>
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALAL01"/>
                                </hl7:act>
                            </hl7:entryRelationship>
                        </hl7:act>
                    </hl7:entry>
                </hl7:section>
            </hl7:component>
        </hl7:structuredBody>
    </hl7:component>
</hl7:ClinicalDocument>
```
Replace it with the new data.
```xml
<hl7:ClinicalDocument xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
    xmlns:hl7="urn:hl7-org:v3" xsi:schemaLocation="urn:hl7-org:v3 https://raw.githubusercontent.com/cdaapi/cdaapi_core/master/reference/CDA.xsd">
    <hl7:realmCode code="DK"/>
    <hl7:typeId root="2.16.840.1.113883.1.3" extension="POCD_HD000040"/>
    <hl7:templateId root="1.2.208.176.7.1.10.71"/>
    <hl7:templateId root="2.16.840.1.113883.10.12.2"/>
    <hl7:templateId root="2.16.840.1.113883.10.12.1"/>
    <hl7:id root="5016AD8F-26A5-47A4-AB7B-EDB035B88595" extension="6071E737-EABF-4D1C-8C97-75AF79A2AF1B"/>
    <hl7:code codeSystem="2.16.840.1.113883.6.1" code="34133-9"/>
    <hl7:effectiveTime value="20180814085746+0200"/>
    <hl7:confidentialityCode codeSystem="2.16.840.1.113883.5.25" code="N"/>
    <hl7:setId assigningAuthorityName="DXC Technology" root="5016AD8F-26A5-47A4-AB7B-EDB035B88595"/>
    <hl7:versionNumber value="-596947"/>
    <hl7:recordTarget>
        <hl7:templateId root="2.16.840.1.113883.10.12.101"/>
        <hl7:templateId root="1.2.208.176.7.1.10.101"/>
        <hl7:patientRole classCode="PAT">
            <hl7:templateId root="1.2.208.176.7.1.10.106"/>
            <hl7:id assigningAuthorityName="CPR" root="1.2.208.176.1.2" extension="1304621201"/>
        </hl7:patientRole>
    </hl7:recordTarget>
    <hl7:author typeCode="AUT">
        <hl7:templateId root="2.16.840.1.113883.10.12.102"/>
        <hl7:templateId root="1.2.208.176.7.1.10.102"/>
        <hl7:time value="20180814075746+0200"/>
        <hl7:assignedAuthor classCode="ASSIGNED">
            <hl7:id nullFlavor="NI"/>
            <hl7:representedOrganization classCode="ORG" determinerCode="INSTANCE">
                <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="6071000016008"/>
            </hl7:representedOrganization>
        </hl7:assignedAuthor>
    </hl7:author>
    <hl7:custodian typeCode="CST">
        <hl7:templateId root="2.16.840.1.113883.10.12.104"/>
        <hl7:templateId root="1.2.208.176.7.1.10.103"/>
        <hl7:assignedCustodian classCode="ASSIGNED">
            <hl7:representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <hl7:id root="2.16.840.1.113883.2.24.1.1" extension="25469364"/>
            </hl7:representedCustodianOrganization>
        </hl7:assignedCustodian>
    </hl7:custodian>
    <hl7:relatedDocument typeCode="APND">
        <hl7:parentDocument classCode="DOCCLIN" moodCode="EVN">
            <hl7:id root="5016AD8F-26A5-47A4-AB7B-EDB035B88595" extension="05D12F25-D420-46B5-BEC3-19C671404672"/>
            <hl7:setId root="5016AD8F-26A5-47A4-AB7B-EDB035B88595"/>
            <hl7:versionNumber value="-731548"/>
        </hl7:parentDocument>
    </hl7:relatedDocument>
    <hl7:component contextConductionInd="true">
        <hl7:structuredBody>
            <hl7:component contextConductionInd="true">
                <hl7:section>
                    <hl7:templateId root="2.16.840.1.113883.10.12.201"/>
                    <hl7:templateId root="1.2.208.176.7.1.10.113"/>
                    <hl7:entry typeCode="COMP">
                        <hl7:observation classCode="OBS" moodCode="EVN" negationInd="true">
                            <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.36"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.45"/>
                            <hl7:id root="5016AD8F-26A5-47A4-AB7B-EDB035B88595" extension="1011BE6B-072B-59C6-831E-71B9632678B6"/>
                            <hl7:code codeSystem="1.2.208.176.2.4" code="DO000"/>
                            <hl7:entryRelationship typeCode="COMP">
                                <hl7:observation classCode="OBS" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.43"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALGA01"/>
                                </hl7:observation>
                            </hl7:entryRelationship>
                            <hl7:reference typeCode="RPLC">
                                <hl7:externalObservation classCode="OBS" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.326"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.100"/>
                                    <hl7:id root="5016AD8F-26A5-47A4-AB7B-EDB035B88595" extension="1011BE6B-072B-59C6-831E-71B9632678B6"/>
                                </hl7:externalObservation>
                            </hl7:reference>
                            <hl7:reference typeCode="REFR">
                                <hl7:templateId root="2.16.840.1.113883.10.12.324"/>
                                <hl7:externalAct classCode="ACT" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.325"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.78"/>
                                    <hl7:id root="5016AD8F-26A5-47A4-AB7B-EDB035B88595" extension="A37ECD01-9C3B-5507-ABE3-59154CBDA852"/>
                                </hl7:externalAct>
                            </hl7:reference>
                        </hl7:observation>
                    </hl7:entry>
                </hl7:section>
            </hl7:component>
        </hl7:structuredBody>
    </hl7:component>
</hl7:ClinicalDocument>
```
## Update minor condition
Create an episode of care with an encounter and a minor condition
```xml
<hl7:ClinicalDocument xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
    xmlns:hl7="urn:hl7-org:v3" xsi:schemaLocation="urn:hl7-org:v3 https://raw.githubusercontent.com/cdaapi/cdaapi_core/master/reference/CDA.xsd">
    <hl7:realmCode code="DK"/>
    <hl7:typeId root="2.16.840.1.113883.1.3" extension="POCD_HD000040"/>
    <hl7:templateId root="1.2.208.176.7.1.10.71"/>
    <hl7:templateId root="2.16.840.1.113883.10.12.2"/>
    <hl7:templateId root="2.16.840.1.113883.10.12.1"/>
    <hl7:id root="E2A1742C-F9BF-47DB-B922-3B8EBBFCB859" extension="F1617307-4273-412C-82C0-CCF6DB96A370"/>
    <hl7:code codeSystem="2.16.840.1.113883.6.1" code="34133-9"/>
    <hl7:effectiveTime value="20180814085744+0200"/>
    <hl7:confidentialityCode codeSystem="2.16.840.1.113883.5.25" code="N"/>
    <hl7:setId assigningAuthorityName="DXC Technology" root="E2A1742C-F9BF-47DB-B922-3B8EBBFCB859"/>
    <hl7:versionNumber value="-571219"/>
    <hl7:recordTarget>
        <hl7:templateId root="2.16.840.1.113883.10.12.101"/>
        <hl7:templateId root="1.2.208.176.7.1.10.101"/>
        <hl7:patientRole classCode="PAT">
            <hl7:templateId root="1.2.208.176.7.1.10.106"/>
            <hl7:id assigningAuthorityName="CPR" root="1.2.208.176.1.2" extension="1304621201"/>
        </hl7:patientRole>
    </hl7:recordTarget>
    <hl7:author typeCode="AUT">
        <hl7:templateId root="2.16.840.1.113883.10.12.102"/>
        <hl7:templateId root="1.2.208.176.7.1.10.102"/>
        <hl7:time value="20180814075744+0200"/>
        <hl7:assignedAuthor classCode="ASSIGNED">
            <hl7:id nullFlavor="NI"/>
            <hl7:representedOrganization classCode="ORG" determinerCode="INSTANCE">
                <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="6071000016008"/>
            </hl7:representedOrganization>
        </hl7:assignedAuthor>
    </hl7:author>
    <hl7:custodian typeCode="CST">
        <hl7:templateId root="2.16.840.1.113883.10.12.104"/>
        <hl7:templateId root="1.2.208.176.7.1.10.103"/>
        <hl7:assignedCustodian classCode="ASSIGNED">
            <hl7:representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <hl7:id root="2.16.840.1.113883.2.24.1.1" extension="25469364"/>
            </hl7:representedCustodianOrganization>
        </hl7:assignedCustodian>
    </hl7:custodian>
    <hl7:component contextConductionInd="true">
        <hl7:structuredBody>
            <hl7:component contextConductionInd="true">
                <hl7:section>
                    <hl7:templateId root="2.16.840.1.113883.10.12.201"/>
                    <hl7:templateId root="1.2.208.176.7.1.10.113"/>
                    <hl7:entry typeCode="COMP">
                        <hl7:observation classCode="OBS" moodCode="EVN" negationInd="false">
                            <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.36"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.46"/>
                            <hl7:id root="E2A1742C-F9BF-47DB-B922-3B8EBBFCB859" extension="E53C1AC6-A5EC-527A-9EEC-C67358C09D99"/>
                            <hl7:code codeSystem="1.2.208.176.2.4" code="DA000"/>
                            <hl7:entryRelationship typeCode="REFR">
                                <hl7:encounter classCode="ENC" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.77"/>
                                    <hl7:id root="E2A1742C-F9BF-47DB-B922-3B8EBBFCB859" extension="E9772494-5F67-583C-B383-5FBF3EA71217"/>
                                    <hl7:code nullFlavor="NA"/>
                                </hl7:encounter>
                            </hl7:entryRelationship>
                            <hl7:entryRelationship typeCode="COMP">
                                <hl7:observation classCode="OBS" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.43"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALGA02"/>
                                </hl7:observation>
                            </hl7:entryRelationship>
                        </hl7:observation>
                    </hl7:entry>
                </hl7:section>
            </hl7:component>
            <hl7:component contextConductionInd="true">
                <hl7:section>
                    <hl7:templateId root="1.2.208.176.7.1.10.75"/>
                    <hl7:templateId root="2.16.840.1.113883.10.12.201"/>
                    <hl7:entry typeCode="COMP">
                        <hl7:encounter classCode="ENC" moodCode="EVN">
                            <hl7:templateId root="2.16.840.1.113883.10.12.302"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.74"/>
                            <hl7:id root="E2A1742C-F9BF-47DB-B922-3B8EBBFCB859" extension="E9772494-5F67-583C-B383-5FBF3EA71217"/>
                            <hl7:code codeSystem="1.2.208.176.2.4" code="ALCA00"/>
                            <hl7:effectiveTime>
                                <hl7:low value="20180814085744+0200"/>
                            </hl7:effectiveTime>
                            <hl7:priorityCode codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" code="ATA1"/>
                            <hl7:participant typeCode="RESP">
                                <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                <hl7:templateId root="1.2.208.176.7.1.10.49"/>
                                <hl7:participantRole classCode="ROL">
                                    <hl7:scopingEntity classCode="ORG">
                                        <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="276231000016004"/>
                                    </hl7:scopingEntity>
                                </hl7:participantRole>
                            </hl7:participant>
                            <hl7:participant typeCode="LOC">
                                <hl7:templateId root="1.2.208.176.7.1.10.50"/>
                                <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                <hl7:time>
                                    <hl7:low value="20180814085744+0200"/>
                                </hl7:time>
                                <hl7:participantRole classCode="SDLOC">
                                    <hl7:templateId root="1.2.208.176.7.1.22.4"/>
                                    <hl7:scopingEntity classCode="ORG">
                                        <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="276231000016004"/>
                                    </hl7:scopingEntity>
                                </hl7:participantRole>
                            </hl7:participant>
                            <hl7:entryRelationship typeCode="REFR">
                                <hl7:act classCode="ACT" moodCode="EVN">
                                    <hl7:templateId root="1.2.208.176.7.1.10.7"/>
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALFA2"/>
                                    <hl7:effectiveTime>
                                        <hl7:low value="20180814085744+0200"/>
                                    </hl7:effectiveTime>
                                    <hl7:participant typeCode="IND">
                                        <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                        <hl7:templateId root="1.2.208.176.7.1.10.8"/>
                                        <hl7:participantRole classCode="PAYOR">
                                            <hl7:scopingEntity classCode="ORG">
                                                <hl7:id assigningAuthorityName="Sundhedsdatastyrelsen" root="1.2.208.176.2.4" extension="ALFB01"/>
                                            </hl7:scopingEntity>
                                        </hl7:participantRole>
                                    </hl7:participant>
                                    <hl7:entryRelationship typeCode="COMP">
                                        <hl7:act classCode="ACT" moodCode="EVN">
                                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                            <hl7:templateId root="1.2.208.176.7.1.10.10"/>
                                            <hl7:code codeSystem="1.2.208.176.2.4" code="ALFC4"/>
                                        </hl7:act>
                                    </hl7:entryRelationship>
                                </hl7:act>
                            </hl7:entryRelationship>
                            <hl7:entryRelationship typeCode="REFR">
                                <hl7:act classCode="PCPR" moodCode="EVN">
                                    <hl7:templateId root="1.2.208.176.7.1.10.72"/>
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:id root="E2A1742C-F9BF-47DB-B922-3B8EBBFCB859" extension="241EF3ED-B086-5497-B27D-B8C2500BED99"/>
                                    <hl7:code nullFlavor="NA"/>
                                </hl7:act>
                            </hl7:entryRelationship>
                            <hl7:entryRelationship typeCode="RSON">
                                <hl7:act classCode="REG" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.48"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALCC01"/>
                                </hl7:act>
                            </hl7:entryRelationship>
                        </hl7:encounter>
                    </hl7:entry>
                </hl7:section>
            </hl7:component>
            <hl7:component contextConductionInd="true">
                <hl7:section>
                    <hl7:templateId root="2.16.840.1.113883.10.12.201"/>
                    <hl7:templateId root="1.2.208.176.7.1.10.95"/>
                    <hl7:entry typeCode="COMP">
                        <hl7:act classCode="PCPR" moodCode="EVN">
                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.80"/>
                            <hl7:id root="E2A1742C-F9BF-47DB-B922-3B8EBBFCB859" extension="241EF3ED-B086-5497-B27D-B8C2500BED99"/>
                            <hl7:code nullFlavor="NA"/>
                            <hl7:effectiveTime>
                                <hl7:low value="20180814085744+0200"/>
                            </hl7:effectiveTime>
                            <hl7:participant typeCode="RESP">
                                <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                <hl7:templateId root="1.2.208.176.7.1.10.49"/>
                                <hl7:participantRole classCode="ROL">
                                    <hl7:scopingEntity classCode="ORG">
                                        <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="276231000016004"/>
                                    </hl7:scopingEntity>
                                </hl7:participantRole>
                            </hl7:participant>
                            <hl7:entryRelationship typeCode="COMP">
                                <hl7:act classCode="REG" moodCode="EVN">
                                    <hl7:templateId root="1.2.208.176.7.1.10.81"/>
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALAL01"/>
                                </hl7:act>
                            </hl7:entryRelationship>
                            <hl7:entryRelationship typeCode="RSON">
                                <hl7:act classCode="PCPR" moodCode="RQO">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.51"/>
                                    <hl7:code nullFlavor="NA"/>
                                    <hl7:effectiveTime value="20180814085744+0200"/>
                                    <hl7:participant typeCode="REF">
                                        <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                        <hl7:templateId root="1.2.208.176.7.1.10.52"/>
                                        <hl7:participantRole classCode="ROL">
                                            <hl7:scopingEntity classCode="ORG">
                                                <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="486811000016002"/>
                                            </hl7:scopingEntity>
                                        </hl7:participantRole>
                                    </hl7:participant>
                                    <hl7:entryRelationship typeCode="COMP">
                                        <hl7:act classCode="REG" moodCode="EVN">
                                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                            <hl7:templateId root="1.2.208.176.7.1.10.54"/>
                                            <hl7:code codeSystem="1.2.208.176.2.4" code="ALDA11"/>
                                        </hl7:act>
                                    </hl7:entryRelationship>
                                    <hl7:entryRelationship typeCode="COMP">
                                        <hl7:act classCode="REG" moodCode="EVN">
                                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                            <hl7:templateId root="1.2.208.176.7.1.10.53"/>
                                            <hl7:code codeSystem="1.2.208.176.2.4" code="ALDB00"/>
                                        </hl7:act>
                                    </hl7:entryRelationship>
                                    <hl7:entryRelationship typeCode="RSON">
                                        <hl7:act classCode="REG" moodCode="EVN">
                                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                            <hl7:templateId root="1.2.208.176.7.1.10.55"/>
                                            <hl7:code codeSystem="1.2.208.176.2.4" code="DD429"/>
                                            <hl7:entryRelationship typeCode="COMP">
                                                <hl7:act classCode="REG" moodCode="EVN">
                                                    <hl7:templateId root="1.2.208.176.7.1.10.5"/>
                                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ZDW10"/>
                                                </hl7:act>
                                            </hl7:entryRelationship>
                                        </hl7:act>
                                    </hl7:entryRelationship>
                                </hl7:act>
                            </hl7:entryRelationship>
                        </hl7:act>
                    </hl7:entry>
                </hl7:section>
            </hl7:component>
        </hl7:structuredBody>
    </hl7:component>
</hl7:ClinicalDocument>
```
Replace it with the new data
```xml
<hl7:ClinicalDocument xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
    xmlns:hl7="urn:hl7-org:v3" xsi:schemaLocation="urn:hl7-org:v3 https://raw.githubusercontent.com/cdaapi/cdaapi_core/master/reference/CDA.xsd">
    <hl7:realmCode code="DK"/>
    <hl7:typeId root="2.16.840.1.113883.1.3" extension="POCD_HD000040"/>
    <hl7:templateId root="1.2.208.176.7.1.10.71"/>
    <hl7:templateId root="2.16.840.1.113883.10.12.2"/>
    <hl7:templateId root="2.16.840.1.113883.10.12.1"/>
    <hl7:id root="E2A1742C-F9BF-47DB-B922-3B8EBBFCB859" extension="F22E9967-C93A-4E37-9CEC-17D540BD07DD"/>
    <hl7:code codeSystem="2.16.840.1.113883.6.1" code="34133-9"/>
    <hl7:effectiveTime value="20180814085744+0200"/>
    <hl7:confidentialityCode codeSystem="2.16.840.1.113883.5.25" code="N"/>
    <hl7:setId assigningAuthorityName="DXC Technology" root="E2A1742C-F9BF-47DB-B922-3B8EBBFCB859"/>
    <hl7:versionNumber value="408263"/>
    <hl7:recordTarget>
        <hl7:templateId root="2.16.840.1.113883.10.12.101"/>
        <hl7:templateId root="1.2.208.176.7.1.10.101"/>
        <hl7:patientRole classCode="PAT">
            <hl7:templateId root="1.2.208.176.7.1.10.106"/>
            <hl7:id assigningAuthorityName="CPR" root="1.2.208.176.1.2" extension="1304621201"/>
        </hl7:patientRole>
    </hl7:recordTarget>
    <hl7:author typeCode="AUT">
        <hl7:templateId root="2.16.840.1.113883.10.12.102"/>
        <hl7:templateId root="1.2.208.176.7.1.10.102"/>
        <hl7:time value="20180814075744+0200"/>
        <hl7:assignedAuthor classCode="ASSIGNED">
            <hl7:id nullFlavor="NI"/>
            <hl7:representedOrganization classCode="ORG" determinerCode="INSTANCE">
                <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="6071000016008"/>
            </hl7:representedOrganization>
        </hl7:assignedAuthor>
    </hl7:author>
    <hl7:custodian typeCode="CST">
        <hl7:templateId root="2.16.840.1.113883.10.12.104"/>
        <hl7:templateId root="1.2.208.176.7.1.10.103"/>
        <hl7:assignedCustodian classCode="ASSIGNED">
            <hl7:representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <hl7:id root="2.16.840.1.113883.2.24.1.1" extension="25469364"/>
            </hl7:representedCustodianOrganization>
        </hl7:assignedCustodian>
    </hl7:custodian>
    <hl7:relatedDocument typeCode="APND">
        <hl7:parentDocument classCode="DOCCLIN" moodCode="EVN">
            <hl7:id root="E2A1742C-F9BF-47DB-B922-3B8EBBFCB859" extension="F1617307-4273-412C-82C0-CCF6DB96A370"/>
            <hl7:setId root="E2A1742C-F9BF-47DB-B922-3B8EBBFCB859"/>
            <hl7:versionNumber value="-571219"/>
        </hl7:parentDocument>
    </hl7:relatedDocument>
    <hl7:component contextConductionInd="true">
        <hl7:structuredBody>
            <hl7:component contextConductionInd="true">
                <hl7:section>
                    <hl7:templateId root="2.16.840.1.113883.10.12.201"/>
                    <hl7:templateId root="1.2.208.176.7.1.10.113"/>
                    <hl7:entry typeCode="COMP">
                        <hl7:observation classCode="OBS" moodCode="EVN" negationInd="true">
                            <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.36"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.46"/>
                            <hl7:id root="E2A1742C-F9BF-47DB-B922-3B8EBBFCB859" extension="E53C1AC6-A5EC-527A-9EEC-C67358C09D99"/>
                            <hl7:code codeSystem="1.2.208.176.2.4" code="DA000"/>
                            <hl7:entryRelationship typeCode="COMP">
                                <hl7:observation classCode="OBS" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.43"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALGA02"/>
                                </hl7:observation>
                            </hl7:entryRelationship>
                            <hl7:reference typeCode="RPLC">
                                <hl7:externalObservation classCode="OBS" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.326"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.100"/>
                                    <hl7:id root="E2A1742C-F9BF-47DB-B922-3B8EBBFCB859" extension="E53C1AC6-A5EC-527A-9EEC-C67358C09D99"/>
                                </hl7:externalObservation>
                            </hl7:reference>
                            <hl7:reference typeCode="REFR">
                                <hl7:templateId root="2.16.840.1.113883.10.12.324"/>
                                <hl7:externalAct classCode="ACT" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.325"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.78"/>
                                    <hl7:id root="E2A1742C-F9BF-47DB-B922-3B8EBBFCB859" extension="E9772494-5F67-583C-B383-5FBF3EA71217"/>
                                </hl7:externalAct>
                            </hl7:reference>
                        </hl7:observation>
                    </hl7:entry>
                </hl7:section>
            </hl7:component>
        </hl7:structuredBody>
    </hl7:component>
</hl7:ClinicalDocument>
```
## Update main condition switch to minor
Create an episode of care with an encounter and a main condition
```xml
<hl7:ClinicalDocument xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
    xmlns:hl7="urn:hl7-org:v3" xsi:schemaLocation="urn:hl7-org:v3 https://raw.githubusercontent.com/cdaapi/cdaapi_core/master/reference/CDA.xsd">
    <hl7:realmCode code="DK"/>
    <hl7:typeId root="2.16.840.1.113883.1.3" extension="POCD_HD000040"/>
    <hl7:templateId root="1.2.208.176.7.1.10.71"/>
    <hl7:templateId root="2.16.840.1.113883.10.12.2"/>
    <hl7:templateId root="2.16.840.1.113883.10.12.1"/>
    <hl7:id root="8BF23D6D-72FD-4B5F-B44F-1BAAC2F51FDB" extension="0A3E9113-36E0-47E8-A876-2958E1D3518A"/>
    <hl7:code codeSystem="2.16.840.1.113883.6.1" code="34133-9"/>
    <hl7:effectiveTime value="20180814085748+0200"/>
    <hl7:confidentialityCode codeSystem="2.16.840.1.113883.5.25" code="N"/>
    <hl7:setId assigningAuthorityName="DXC Technology" root="8BF23D6D-72FD-4B5F-B44F-1BAAC2F51FDB"/>
    <hl7:versionNumber value="-730876"/>
    <hl7:recordTarget>
        <hl7:templateId root="2.16.840.1.113883.10.12.101"/>
        <hl7:templateId root="1.2.208.176.7.1.10.101"/>
        <hl7:patientRole classCode="PAT">
            <hl7:templateId root="1.2.208.176.7.1.10.106"/>
            <hl7:id assigningAuthorityName="CPR" root="1.2.208.176.1.2" extension="1304621201"/>
        </hl7:patientRole>
    </hl7:recordTarget>
    <hl7:author typeCode="AUT">
        <hl7:templateId root="2.16.840.1.113883.10.12.102"/>
        <hl7:templateId root="1.2.208.176.7.1.10.102"/>
        <hl7:time value="20180814075748+0200"/>
        <hl7:assignedAuthor classCode="ASSIGNED">
            <hl7:id nullFlavor="NI"/>
            <hl7:representedOrganization classCode="ORG" determinerCode="INSTANCE">
                <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="6071000016008"/>
            </hl7:representedOrganization>
        </hl7:assignedAuthor>
    </hl7:author>
    <hl7:custodian typeCode="CST">
        <hl7:templateId root="2.16.840.1.113883.10.12.104"/>
        <hl7:templateId root="1.2.208.176.7.1.10.103"/>
        <hl7:assignedCustodian classCode="ASSIGNED">
            <hl7:representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <hl7:id root="2.16.840.1.113883.2.24.1.1" extension="25469364"/>
            </hl7:representedCustodianOrganization>
        </hl7:assignedCustodian>
    </hl7:custodian>
    <hl7:component contextConductionInd="true">
        <hl7:structuredBody>
            <hl7:component contextConductionInd="true">
                <hl7:section>
                    <hl7:templateId root="2.16.840.1.113883.10.12.201"/>
                    <hl7:templateId root="1.2.208.176.7.1.10.113"/>
                    <hl7:entry typeCode="COMP">
                        <hl7:observation classCode="OBS" moodCode="EVN" negationInd="false">
                            <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.36"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.45"/>
                            <hl7:id root="8BF23D6D-72FD-4B5F-B44F-1BAAC2F51FDB" extension="7C832BBB-FC9B-5803-BFE6-E887474FA7F6"/>
                            <hl7:code codeSystem="1.2.208.176.2.4" code="DO000"/>
                            <hl7:entryRelationship typeCode="REFR">
                                <hl7:encounter classCode="ENC" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.77"/>
                                    <hl7:id root="8BF23D6D-72FD-4B5F-B44F-1BAAC2F51FDB" extension="11BA6EF4-4375-5C73-9757-B6F8C55DAA0F"/>
                                    <hl7:code nullFlavor="NA"/>
                                </hl7:encounter>
                            </hl7:entryRelationship>
                            <hl7:entryRelationship typeCode="COMP">
                                <hl7:observation classCode="OBS" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.43"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALGA01"/>
                                </hl7:observation>
                            </hl7:entryRelationship>
                        </hl7:observation>
                    </hl7:entry>
                </hl7:section>
            </hl7:component>
            <hl7:component contextConductionInd="true">
                <hl7:section>
                    <hl7:templateId root="1.2.208.176.7.1.10.75"/>
                    <hl7:templateId root="2.16.840.1.113883.10.12.201"/>
                    <hl7:entry typeCode="COMP">
                        <hl7:encounter classCode="ENC" moodCode="EVN">
                            <hl7:templateId root="2.16.840.1.113883.10.12.302"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.74"/>
                            <hl7:id root="8BF23D6D-72FD-4B5F-B44F-1BAAC2F51FDB" extension="11BA6EF4-4375-5C73-9757-B6F8C55DAA0F"/>
                            <hl7:code codeSystem="1.2.208.176.2.4" code="ALCA00"/>
                            <hl7:effectiveTime>
                                <hl7:low value="20180814085748+0200"/>
                            </hl7:effectiveTime>
                            <hl7:priorityCode codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" code="ATA1"/>
                            <hl7:participant typeCode="RESP">
                                <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                <hl7:templateId root="1.2.208.176.7.1.10.49"/>
                                <hl7:participantRole classCode="ROL">
                                    <hl7:scopingEntity classCode="ORG">
                                        <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="276231000016004"/>
                                    </hl7:scopingEntity>
                                </hl7:participantRole>
                            </hl7:participant>
                            <hl7:participant typeCode="LOC">
                                <hl7:templateId root="1.2.208.176.7.1.10.50"/>
                                <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                <hl7:time>
                                    <hl7:low value="20180814085748+0200"/>
                                </hl7:time>
                                <hl7:participantRole classCode="SDLOC">
                                    <hl7:templateId root="1.2.208.176.7.1.22.4"/>
                                    <hl7:scopingEntity classCode="ORG">
                                        <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="276231000016004"/>
                                    </hl7:scopingEntity>
                                </hl7:participantRole>
                            </hl7:participant>
                            <hl7:entryRelationship typeCode="RSON">
                                <hl7:act classCode="REG" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.48"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALCC01"/>
                                </hl7:act>
                            </hl7:entryRelationship>
                            <hl7:entryRelationship typeCode="REFR">
                                <hl7:act classCode="PCPR" moodCode="EVN">
                                    <hl7:templateId root="1.2.208.176.7.1.10.72"/>
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:id root="8BF23D6D-72FD-4B5F-B44F-1BAAC2F51FDB" extension="C707318E-6BFF-5BFE-909C-BC9EC492CB47"/>
                                    <hl7:code nullFlavor="NA"/>
                                </hl7:act>
                            </hl7:entryRelationship>
                            <hl7:entryRelationship typeCode="REFR">
                                <hl7:act classCode="ACT" moodCode="EVN">
                                    <hl7:templateId root="1.2.208.176.7.1.10.7"/>
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALFA2"/>
                                    <hl7:effectiveTime>
                                        <hl7:low value="20180814085748+0200"/>
                                    </hl7:effectiveTime>
                                    <hl7:participant typeCode="IND">
                                        <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                        <hl7:templateId root="1.2.208.176.7.1.10.8"/>
                                        <hl7:participantRole classCode="PAYOR">
                                            <hl7:scopingEntity classCode="ORG">
                                                <hl7:id assigningAuthorityName="Sundhedsdatastyrelsen" root="1.2.208.176.2.4" extension="ALFB01"/>
                                            </hl7:scopingEntity>
                                        </hl7:participantRole>
                                    </hl7:participant>
                                    <hl7:entryRelationship typeCode="COMP">
                                        <hl7:act classCode="ACT" moodCode="EVN">
                                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                            <hl7:templateId root="1.2.208.176.7.1.10.10"/>
                                            <hl7:code codeSystem="1.2.208.176.2.4" code="ALFC4"/>
                                        </hl7:act>
                                    </hl7:entryRelationship>
                                </hl7:act>
                            </hl7:entryRelationship>
                        </hl7:encounter>
                    </hl7:entry>
                </hl7:section>
            </hl7:component>
            <hl7:component contextConductionInd="true">
                <hl7:section>
                    <hl7:templateId root="2.16.840.1.113883.10.12.201"/>
                    <hl7:templateId root="1.2.208.176.7.1.10.95"/>
                    <hl7:entry typeCode="COMP">
                        <hl7:act classCode="PCPR" moodCode="EVN">
                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.80"/>
                            <hl7:id root="8BF23D6D-72FD-4B5F-B44F-1BAAC2F51FDB" extension="C707318E-6BFF-5BFE-909C-BC9EC492CB47"/>
                            <hl7:code nullFlavor="NA"/>
                            <hl7:effectiveTime>
                                <hl7:low value="20180814085748+0200"/>
                            </hl7:effectiveTime>
                            <hl7:participant typeCode="RESP">
                                <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                <hl7:templateId root="1.2.208.176.7.1.10.49"/>
                                <hl7:participantRole classCode="ROL">
                                    <hl7:scopingEntity classCode="ORG">
                                        <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="276231000016004"/>
                                    </hl7:scopingEntity>
                                </hl7:participantRole>
                            </hl7:participant>
                            <hl7:entryRelationship typeCode="RSON">
                                <hl7:act classCode="PCPR" moodCode="RQO">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.51"/>
                                    <hl7:code nullFlavor="NA"/>
                                    <hl7:effectiveTime value="20180814085748+0200"/>
                                    <hl7:participant typeCode="REF">
                                        <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                        <hl7:templateId root="1.2.208.176.7.1.10.52"/>
                                        <hl7:participantRole classCode="ROL">
                                            <hl7:scopingEntity classCode="ORG">
                                                <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="486811000016002"/>
                                            </hl7:scopingEntity>
                                        </hl7:participantRole>
                                    </hl7:participant>
                                    <hl7:entryRelationship typeCode="RSON">
                                        <hl7:act classCode="REG" moodCode="EVN">
                                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                            <hl7:templateId root="1.2.208.176.7.1.10.55"/>
                                            <hl7:code codeSystem="1.2.208.176.2.4" code="DD429"/>
                                            <hl7:entryRelationship typeCode="COMP">
                                                <hl7:act classCode="REG" moodCode="EVN">
                                                    <hl7:templateId root="1.2.208.176.7.1.10.5"/>
                                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ZDW10"/>
                                                </hl7:act>
                                            </hl7:entryRelationship>
                                        </hl7:act>
                                    </hl7:entryRelationship>
                                    <hl7:entryRelationship typeCode="COMP">
                                        <hl7:act classCode="REG" moodCode="EVN">
                                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                            <hl7:templateId root="1.2.208.176.7.1.10.54"/>
                                            <hl7:code codeSystem="1.2.208.176.2.4" code="ALDA11"/>
                                        </hl7:act>
                                    </hl7:entryRelationship>
                                    <hl7:entryRelationship typeCode="COMP">
                                        <hl7:act classCode="REG" moodCode="EVN">
                                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                            <hl7:templateId root="1.2.208.176.7.1.10.53"/>
                                            <hl7:code codeSystem="1.2.208.176.2.4" code="ALDB00"/>
                                        </hl7:act>
                                    </hl7:entryRelationship>
                                </hl7:act>
                            </hl7:entryRelationship>
                            <hl7:entryRelationship typeCode="COMP">
                                <hl7:act classCode="REG" moodCode="EVN">
                                    <hl7:templateId root="1.2.208.176.7.1.10.81"/>
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALAL01"/>
                                </hl7:act>
                            </hl7:entryRelationship>
                        </hl7:act>
                    </hl7:entry>
                </hl7:section>
            </hl7:component>
        </hl7:structuredBody>
    </hl7:component>
</hl7:ClinicalDocument>
```
Replace it with the new data using the minor condition template
```xml
<hl7:ClinicalDocument xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
    xmlns:hl7="urn:hl7-org:v3" xsi:schemaLocation="urn:hl7-org:v3 https://raw.githubusercontent.com/cdaapi/cdaapi_core/master/reference/CDA.xsd">
    <hl7:realmCode code="DK"/>
    <hl7:typeId root="2.16.840.1.113883.1.3" extension="POCD_HD000040"/>
    <hl7:templateId root="1.2.208.176.7.1.10.71"/>
    <hl7:templateId root="2.16.840.1.113883.10.12.2"/>
    <hl7:templateId root="2.16.840.1.113883.10.12.1"/>
    <hl7:id root="8BF23D6D-72FD-4B5F-B44F-1BAAC2F51FDB" extension="1A482AFA-F261-41D7-9FB2-0D5CC38494BD"/>
    <hl7:code codeSystem="2.16.840.1.113883.6.1" code="34133-9"/>
    <hl7:effectiveTime value="20180814085748+0200"/>
    <hl7:confidentialityCode codeSystem="2.16.840.1.113883.5.25" code="N"/>
    <hl7:setId assigningAuthorityName="DXC Technology" root="8BF23D6D-72FD-4B5F-B44F-1BAAC2F51FDB"/>
    <hl7:versionNumber value="-229094"/>
    <hl7:recordTarget>
        <hl7:templateId root="2.16.840.1.113883.10.12.101"/>
        <hl7:templateId root="1.2.208.176.7.1.10.101"/>
        <hl7:patientRole classCode="PAT">
            <hl7:templateId root="1.2.208.176.7.1.10.106"/>
            <hl7:id assigningAuthorityName="CPR" root="1.2.208.176.1.2" extension="1304621201"/>
        </hl7:patientRole>
    </hl7:recordTarget>
    <hl7:author typeCode="AUT">
        <hl7:templateId root="2.16.840.1.113883.10.12.102"/>
        <hl7:templateId root="1.2.208.176.7.1.10.102"/>
        <hl7:time value="20180814075748+0200"/>
        <hl7:assignedAuthor classCode="ASSIGNED">
            <hl7:id nullFlavor="NI"/>
            <hl7:representedOrganization classCode="ORG" determinerCode="INSTANCE">
                <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="6071000016008"/>
            </hl7:representedOrganization>
        </hl7:assignedAuthor>
    </hl7:author>
    <hl7:custodian typeCode="CST">
        <hl7:templateId root="2.16.840.1.113883.10.12.104"/>
        <hl7:templateId root="1.2.208.176.7.1.10.103"/>
        <hl7:assignedCustodian classCode="ASSIGNED">
            <hl7:representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <hl7:id root="2.16.840.1.113883.2.24.1.1" extension="25469364"/>
            </hl7:representedCustodianOrganization>
        </hl7:assignedCustodian>
    </hl7:custodian>
    <hl7:relatedDocument typeCode="APND">
        <hl7:parentDocument classCode="DOCCLIN" moodCode="EVN">
            <hl7:id root="8BF23D6D-72FD-4B5F-B44F-1BAAC2F51FDB" extension="0A3E9113-36E0-47E8-A876-2958E1D3518A"/>
            <hl7:setId root="8BF23D6D-72FD-4B5F-B44F-1BAAC2F51FDB"/>
            <hl7:versionNumber value="-730876"/>
        </hl7:parentDocument>
    </hl7:relatedDocument>
    <hl7:component contextConductionInd="true">
        <hl7:structuredBody>
            <hl7:component contextConductionInd="true">
                <hl7:section>
                    <hl7:templateId root="2.16.840.1.113883.10.12.201"/>
                    <hl7:templateId root="1.2.208.176.7.1.10.113"/>
                    <hl7:entry typeCode="COMP">
                        <hl7:observation classCode="OBS" moodCode="EVN" negationInd="false">
                            <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.36"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.46"/>
                            <hl7:id root="8BF23D6D-72FD-4B5F-B44F-1BAAC2F51FDB" extension="7C832BBB-FC9B-5803-BFE6-E887474FA7F6"/>
                            <hl7:code codeSystem="1.2.208.176.2.4" code="DA000"/>
                            <hl7:entryRelationship typeCode="COMP">
                                <hl7:observation classCode="OBS" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.43"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALGA02"/>
                                </hl7:observation>
                            </hl7:entryRelationship>
                            <hl7:reference typeCode="REFR">
                                <hl7:templateId root="2.16.840.1.113883.10.12.324"/>
                                <hl7:externalAct classCode="ACT" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.325"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.78"/>
                                    <hl7:id root="8BF23D6D-72FD-4B5F-B44F-1BAAC2F51FDB" extension="11BA6EF4-4375-5C73-9757-B6F8C55DAA0F"/>
                                </hl7:externalAct>
                            </hl7:reference>
                            <hl7:reference typeCode="RPLC">
                                <hl7:externalObservation classCode="OBS" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.326"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.100"/>
                                    <hl7:id root="8BF23D6D-72FD-4B5F-B44F-1BAAC2F51FDB" extension="7C832BBB-FC9B-5803-BFE6-E887474FA7F6"/>
                                </hl7:externalObservation>
                            </hl7:reference>
                        </hl7:observation>
                    </hl7:entry>
                </hl7:section>
            </hl7:component>
        </hl7:structuredBody>
    </hl7:component>
</hl7:ClinicalDocument>
```

## Update minor condition switch to main
In order update a minor condition and switch it to a main condition, one has to deal with any existing main condition, as the model only allow one main condition per encounter.

### No existing main condition
Create an episode of care with an encounter and a minor condition
```xml
<hl7:ClinicalDocument xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
    xmlns:hl7="urn:hl7-org:v3" xsi:schemaLocation="urn:hl7-org:v3 https://raw.githubusercontent.com/cdaapi/cdaapi_core/master/reference/CDA.xsd">
    <hl7:realmCode code="DK"/>
    <hl7:typeId root="2.16.840.1.113883.1.3" extension="POCD_HD000040"/>
    <hl7:templateId root="1.2.208.176.7.1.10.71"/>
    <hl7:templateId root="2.16.840.1.113883.10.12.2"/>
    <hl7:templateId root="2.16.840.1.113883.10.12.1"/>
    <hl7:id root="65154A18-95A4-433C-8240-9CB7B3D6B051" extension="FA1CCB91-B40F-4E26-B2F3-DDAA0A8F366A"/>
    <hl7:code codeSystem="2.16.840.1.113883.6.1" code="34133-9"/>
    <hl7:effectiveTime value="20180814085745+0200"/>
    <hl7:confidentialityCode codeSystem="2.16.840.1.113883.5.25" code="N"/>
    <hl7:setId assigningAuthorityName="DXC Technology" root="65154A18-95A4-433C-8240-9CB7B3D6B051"/>
    <hl7:versionNumber value="-377002"/>
    <hl7:recordTarget>
        <hl7:templateId root="2.16.840.1.113883.10.12.101"/>
        <hl7:templateId root="1.2.208.176.7.1.10.101"/>
        <hl7:patientRole classCode="PAT">
            <hl7:templateId root="1.2.208.176.7.1.10.106"/>
            <hl7:id assigningAuthorityName="CPR" root="1.2.208.176.1.2" extension="1304621201"/>
        </hl7:patientRole>
    </hl7:recordTarget>
    <hl7:author typeCode="AUT">
        <hl7:templateId root="2.16.840.1.113883.10.12.102"/>
        <hl7:templateId root="1.2.208.176.7.1.10.102"/>
        <hl7:time value="20180814075745+0200"/>
        <hl7:assignedAuthor classCode="ASSIGNED">
            <hl7:id nullFlavor="NI"/>
            <hl7:representedOrganization classCode="ORG" determinerCode="INSTANCE">
                <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="6071000016008"/>
            </hl7:representedOrganization>
        </hl7:assignedAuthor>
    </hl7:author>
    <hl7:custodian typeCode="CST">
        <hl7:templateId root="2.16.840.1.113883.10.12.104"/>
        <hl7:templateId root="1.2.208.176.7.1.10.103"/>
        <hl7:assignedCustodian classCode="ASSIGNED">
            <hl7:representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <hl7:id root="2.16.840.1.113883.2.24.1.1" extension="25469364"/>
            </hl7:representedCustodianOrganization>
        </hl7:assignedCustodian>
    </hl7:custodian>
    <hl7:component contextConductionInd="true">
        <hl7:structuredBody>
            <hl7:component contextConductionInd="true">
                <hl7:section>
                    <hl7:templateId root="2.16.840.1.113883.10.12.201"/>
                    <hl7:templateId root="1.2.208.176.7.1.10.95"/>
                    <hl7:entry typeCode="COMP">
                        <hl7:act classCode="PCPR" moodCode="EVN">
                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.80"/>
                            <hl7:id root="65154A18-95A4-433C-8240-9CB7B3D6B051" extension="E593F3EF-80BF-5B2C-80AF-A36B8E62967C"/>
                            <hl7:code nullFlavor="NA"/>
                            <hl7:effectiveTime>
                                <hl7:low value="20180814085745+0200"/>
                            </hl7:effectiveTime>
                            <hl7:participant typeCode="RESP">
                                <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                <hl7:templateId root="1.2.208.176.7.1.10.49"/>
                                <hl7:participantRole classCode="ROL">
                                    <hl7:scopingEntity classCode="ORG">
                                        <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="276231000016004"/>
                                    </hl7:scopingEntity>
                                </hl7:participantRole>
                            </hl7:participant>
                            <hl7:entryRelationship typeCode="RSON">
                                <hl7:act classCode="PCPR" moodCode="RQO">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.51"/>
                                    <hl7:code nullFlavor="NA"/>
                                    <hl7:effectiveTime value="20180814085745+0200"/>
                                    <hl7:participant typeCode="REF">
                                        <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                        <hl7:templateId root="1.2.208.176.7.1.10.52"/>
                                        <hl7:participantRole classCode="ROL">
                                            <hl7:scopingEntity classCode="ORG">
                                                <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="486811000016002"/>
                                            </hl7:scopingEntity>
                                        </hl7:participantRole>
                                    </hl7:participant>
                                    <hl7:entryRelationship typeCode="COMP">
                                        <hl7:act classCode="REG" moodCode="EVN">
                                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                            <hl7:templateId root="1.2.208.176.7.1.10.54"/>
                                            <hl7:code codeSystem="1.2.208.176.2.4" code="ALDA11"/>
                                        </hl7:act>
                                    </hl7:entryRelationship>
                                    <hl7:entryRelationship typeCode="COMP">
                                        <hl7:act classCode="REG" moodCode="EVN">
                                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                            <hl7:templateId root="1.2.208.176.7.1.10.53"/>
                                            <hl7:code codeSystem="1.2.208.176.2.4" code="ALDB00"/>
                                        </hl7:act>
                                    </hl7:entryRelationship>
                                    <hl7:entryRelationship typeCode="RSON">
                                        <hl7:act classCode="REG" moodCode="EVN">
                                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                            <hl7:templateId root="1.2.208.176.7.1.10.55"/>
                                            <hl7:code codeSystem="1.2.208.176.2.4" code="DD429"/>
                                            <hl7:entryRelationship typeCode="COMP">
                                                <hl7:act classCode="REG" moodCode="EVN">
                                                    <hl7:templateId root="1.2.208.176.7.1.10.5"/>
                                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ZDW10"/>
                                                </hl7:act>
                                            </hl7:entryRelationship>
                                        </hl7:act>
                                    </hl7:entryRelationship>
                                </hl7:act>
                            </hl7:entryRelationship>
                            <hl7:entryRelationship typeCode="COMP">
                                <hl7:act classCode="REG" moodCode="EVN">
                                    <hl7:templateId root="1.2.208.176.7.1.10.81"/>
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALAL01"/>
                                </hl7:act>
                            </hl7:entryRelationship>
                        </hl7:act>
                    </hl7:entry>
                </hl7:section>
            </hl7:component>
            <hl7:component contextConductionInd="true">
                <hl7:section>
                    <hl7:templateId root="1.2.208.176.7.1.10.75"/>
                    <hl7:templateId root="2.16.840.1.113883.10.12.201"/>
                    <hl7:entry typeCode="COMP">
                        <hl7:encounter classCode="ENC" moodCode="EVN">
                            <hl7:templateId root="2.16.840.1.113883.10.12.302"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.74"/>
                            <hl7:id root="65154A18-95A4-433C-8240-9CB7B3D6B051" extension="9F164F8D-9069-5D8F-8C90-0217691DC3B3"/>
                            <hl7:code codeSystem="1.2.208.176.2.4" code="ALCA00"/>
                            <hl7:effectiveTime>
                                <hl7:low value="20180814085745+0200"/>
                            </hl7:effectiveTime>
                            <hl7:priorityCode codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" code="ATA1"/>
                            <hl7:participant typeCode="RESP">
                                <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                <hl7:templateId root="1.2.208.176.7.1.10.49"/>
                                <hl7:participantRole classCode="ROL">
                                    <hl7:scopingEntity classCode="ORG">
                                        <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="276231000016004"/>
                                    </hl7:scopingEntity>
                                </hl7:participantRole>
                            </hl7:participant>
                            <hl7:participant typeCode="LOC">
                                <hl7:templateId root="1.2.208.176.7.1.10.50"/>
                                <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                <hl7:time>
                                    <hl7:low value="20180814085745+0200"/>
                                </hl7:time>
                                <hl7:participantRole classCode="SDLOC">
                                    <hl7:templateId root="1.2.208.176.7.1.22.4"/>
                                    <hl7:scopingEntity classCode="ORG">
                                        <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="276231000016004"/>
                                    </hl7:scopingEntity>
                                </hl7:participantRole>
                            </hl7:participant>
                            <hl7:entryRelationship typeCode="RSON">
                                <hl7:act classCode="REG" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.48"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALCC01"/>
                                </hl7:act>
                            </hl7:entryRelationship>
                            <hl7:entryRelationship typeCode="REFR">
                                <hl7:act classCode="ACT" moodCode="EVN">
                                    <hl7:templateId root="1.2.208.176.7.1.10.7"/>
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALFA2"/>
                                    <hl7:effectiveTime>
                                        <hl7:low value="20180814085745+0200"/>
                                    </hl7:effectiveTime>
                                    <hl7:participant typeCode="IND">
                                        <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                        <hl7:templateId root="1.2.208.176.7.1.10.8"/>
                                        <hl7:participantRole classCode="PAYOR">
                                            <hl7:scopingEntity classCode="ORG">
                                                <hl7:id assigningAuthorityName="Sundhedsdatastyrelsen" root="1.2.208.176.2.4" extension="ALFB01"/>
                                            </hl7:scopingEntity>
                                        </hl7:participantRole>
                                    </hl7:participant>
                                    <hl7:entryRelationship typeCode="COMP">
                                        <hl7:act classCode="ACT" moodCode="EVN">
                                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                            <hl7:templateId root="1.2.208.176.7.1.10.10"/>
                                            <hl7:code codeSystem="1.2.208.176.2.4" code="ALFC4"/>
                                        </hl7:act>
                                    </hl7:entryRelationship>
                                </hl7:act>
                            </hl7:entryRelationship>
                            <hl7:entryRelationship typeCode="REFR">
                                <hl7:act classCode="PCPR" moodCode="EVN">
                                    <hl7:templateId root="1.2.208.176.7.1.10.72"/>
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:id root="65154A18-95A4-433C-8240-9CB7B3D6B051" extension="E593F3EF-80BF-5B2C-80AF-A36B8E62967C"/>
                                    <hl7:code nullFlavor="NA"/>
                                </hl7:act>
                            </hl7:entryRelationship>
                        </hl7:encounter>
                    </hl7:entry>
                </hl7:section>
            </hl7:component>
            <hl7:component contextConductionInd="true">
                <hl7:section>
                    <hl7:templateId root="2.16.840.1.113883.10.12.201"/>
                    <hl7:templateId root="1.2.208.176.7.1.10.113"/>
                    <hl7:entry typeCode="COMP">
                        <hl7:observation classCode="OBS" moodCode="EVN" negationInd="false">
                            <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.36"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.46"/>
                            <hl7:id root="65154A18-95A4-433C-8240-9CB7B3D6B051" extension="A2CAB2DB-2546-5A8B-83E4-8825049734D9"/>
                            <hl7:code codeSystem="1.2.208.176.2.4" code="DA000"/>
                            <hl7:entryRelationship typeCode="COMP">
                                <hl7:observation classCode="OBS" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.43"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALGA02"/>
                                </hl7:observation>
                            </hl7:entryRelationship>
                            <hl7:entryRelationship typeCode="REFR">
                                <hl7:encounter classCode="ENC" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.77"/>
                                    <hl7:id root="65154A18-95A4-433C-8240-9CB7B3D6B051" extension="9F164F8D-9069-5D8F-8C90-0217691DC3B3"/>
                                    <hl7:code nullFlavor="NA"/>
                                </hl7:encounter>
                            </hl7:entryRelationship>
                        </hl7:observation>
                    </hl7:entry>
                </hl7:section>
            </hl7:component>
        </hl7:structuredBody>
    </hl7:component>
</hl7:ClinicalDocument>
```
Replace it with the new data using the main condition template
```xml
<hl7:ClinicalDocument xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
    xmlns:hl7="urn:hl7-org:v3" xsi:schemaLocation="urn:hl7-org:v3 https://raw.githubusercontent.com/cdaapi/cdaapi_core/master/reference/CDA.xsd">
    <hl7:realmCode code="DK"/>
    <hl7:typeId root="2.16.840.1.113883.1.3" extension="POCD_HD000040"/>
    <hl7:templateId root="1.2.208.176.7.1.10.71"/>
    <hl7:templateId root="2.16.840.1.113883.10.12.2"/>
    <hl7:templateId root="2.16.840.1.113883.10.12.1"/>
    <hl7:id root="65154A18-95A4-433C-8240-9CB7B3D6B051" extension="46E10ECC-B94D-4FE5-8BBD-B2B2E761DDEB"/>
    <hl7:code codeSystem="2.16.840.1.113883.6.1" code="34133-9"/>
    <hl7:effectiveTime value="20180814085745+0200"/>
    <hl7:confidentialityCode codeSystem="2.16.840.1.113883.5.25" code="N"/>
    <hl7:setId assigningAuthorityName="DXC Technology" root="65154A18-95A4-433C-8240-9CB7B3D6B051"/>
    <hl7:versionNumber value="454981"/>
    <hl7:recordTarget>
        <hl7:templateId root="2.16.840.1.113883.10.12.101"/>
        <hl7:templateId root="1.2.208.176.7.1.10.101"/>
        <hl7:patientRole classCode="PAT">
            <hl7:templateId root="1.2.208.176.7.1.10.106"/>
            <hl7:id assigningAuthorityName="CPR" root="1.2.208.176.1.2" extension="1304621201"/>
        </hl7:patientRole>
    </hl7:recordTarget>
    <hl7:author typeCode="AUT">
        <hl7:templateId root="2.16.840.1.113883.10.12.102"/>
        <hl7:templateId root="1.2.208.176.7.1.10.102"/>
        <hl7:time value="20180814075745+0200"/>
        <hl7:assignedAuthor classCode="ASSIGNED">
            <hl7:id nullFlavor="NI"/>
            <hl7:representedOrganization classCode="ORG" determinerCode="INSTANCE">
                <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="6071000016008"/>
            </hl7:representedOrganization>
        </hl7:assignedAuthor>
    </hl7:author>
    <hl7:custodian typeCode="CST">
        <hl7:templateId root="2.16.840.1.113883.10.12.104"/>
        <hl7:templateId root="1.2.208.176.7.1.10.103"/>
        <hl7:assignedCustodian classCode="ASSIGNED">
            <hl7:representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <hl7:id root="2.16.840.1.113883.2.24.1.1" extension="25469364"/>
            </hl7:representedCustodianOrganization>
        </hl7:assignedCustodian>
    </hl7:custodian>
    <hl7:relatedDocument typeCode="APND">
        <hl7:parentDocument classCode="DOCCLIN" moodCode="EVN">
            <hl7:id root="65154A18-95A4-433C-8240-9CB7B3D6B051" extension="FA1CCB91-B40F-4E26-B2F3-DDAA0A8F366A"/>
            <hl7:setId root="65154A18-95A4-433C-8240-9CB7B3D6B051"/>
            <hl7:versionNumber value="-377002"/>
        </hl7:parentDocument>
    </hl7:relatedDocument>
    <hl7:component contextConductionInd="true">
        <hl7:structuredBody>
            <hl7:component contextConductionInd="true">
                <hl7:section>
                    <hl7:templateId root="2.16.840.1.113883.10.12.201"/>
                    <hl7:templateId root="1.2.208.176.7.1.10.113"/>
                    <hl7:entry typeCode="COMP">
                        <hl7:observation classCode="OBS" moodCode="EVN" negationInd="false">
                            <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.36"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.45"/>
                            <hl7:id root="65154A18-95A4-433C-8240-9CB7B3D6B051" extension="A2CAB2DB-2546-5A8B-83E4-8825049734D9"/>
                            <hl7:code codeSystem="1.2.208.176.2.4" code="DO000"/>
                            <hl7:entryRelationship typeCode="COMP">
                                <hl7:observation classCode="OBS" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.43"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALGA01"/>
                                </hl7:observation>
                            </hl7:entryRelationship>
                            <hl7:reference typeCode="RPLC">
                                <hl7:externalObservation classCode="OBS" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.326"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.100"/>
                                    <hl7:id root="65154A18-95A4-433C-8240-9CB7B3D6B051" extension="A2CAB2DB-2546-5A8B-83E4-8825049734D9"/>
                                </hl7:externalObservation>
                            </hl7:reference>
                            <hl7:reference typeCode="REFR">
                                <hl7:templateId root="2.16.840.1.113883.10.12.324"/>
                                <hl7:externalAct classCode="ACT" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.325"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.78"/>
                                    <hl7:id root="65154A18-95A4-433C-8240-9CB7B3D6B051" extension="9F164F8D-9069-5D8F-8C90-0217691DC3B3"/>
                                </hl7:externalAct>
                            </hl7:reference>
                        </hl7:observation>
                    </hl7:entry>
                </hl7:section>
            </hl7:component>
        </hl7:structuredBody>
    </hl7:component>
</hl7:ClinicalDocument>
```
### Main condition exists
Create an episode of care with an encounter and a minor and a main condition
```xml
<hl7:ClinicalDocument xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
    xmlns:hl7="urn:hl7-org:v3" xsi:schemaLocation="urn:hl7-org:v3 https://raw.githubusercontent.com/cdaapi/cdaapi_core/master/reference/CDA.xsd">
    <hl7:realmCode code="DK"/>
    <hl7:typeId root="2.16.840.1.113883.1.3" extension="POCD_HD000040"/>
    <hl7:templateId root="1.2.208.176.7.1.10.71"/>
    <hl7:templateId root="2.16.840.1.113883.10.12.2"/>
    <hl7:templateId root="2.16.840.1.113883.10.12.1"/>
    <hl7:id root="6A3B9FE3-DCA2-4E88-9973-AAA084DBD1EB" extension="6A3D9FF8-AEFF-4497-90A3-C2B3BC06F08B"/>
    <hl7:code codeSystem="2.16.840.1.113883.6.1" code="34133-9"/>
    <hl7:effectiveTime value="20180814085705+0200"/>
    <hl7:confidentialityCode codeSystem="2.16.840.1.113883.5.25" code="N"/>
    <hl7:setId assigningAuthorityName="DXC Technology" root="6A3B9FE3-DCA2-4E88-9973-AAA084DBD1EB"/>
    <hl7:versionNumber value="-525178"/>
    <hl7:recordTarget>
        <hl7:templateId root="2.16.840.1.113883.10.12.101"/>
        <hl7:templateId root="1.2.208.176.7.1.10.101"/>
        <hl7:patientRole classCode="PAT">
            <hl7:templateId root="1.2.208.176.7.1.10.106"/>
            <hl7:id assigningAuthorityName="CPR" root="1.2.208.176.1.2" extension="1304621201"/>
        </hl7:patientRole>
    </hl7:recordTarget>
    <hl7:author typeCode="AUT">
        <hl7:templateId root="2.16.840.1.113883.10.12.102"/>
        <hl7:templateId root="1.2.208.176.7.1.10.102"/>
        <hl7:time value="20180814075705+0200"/>
        <hl7:assignedAuthor classCode="ASSIGNED">
            <hl7:id nullFlavor="NI"/>
            <hl7:representedOrganization classCode="ORG" determinerCode="INSTANCE">
                <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="6071000016008"/>
            </hl7:representedOrganization>
        </hl7:assignedAuthor>
    </hl7:author>
    <hl7:custodian typeCode="CST">
        <hl7:templateId root="2.16.840.1.113883.10.12.104"/>
        <hl7:templateId root="1.2.208.176.7.1.10.103"/>
        <hl7:assignedCustodian classCode="ASSIGNED">
            <hl7:representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <hl7:id root="2.16.840.1.113883.2.24.1.1" extension="25469364"/>
            </hl7:representedCustodianOrganization>
        </hl7:assignedCustodian>
    </hl7:custodian>
    <hl7:component contextConductionInd="true">
        <hl7:structuredBody>
            <hl7:component contextConductionInd="true">
                <hl7:section>
                    <hl7:templateId root="2.16.840.1.113883.10.12.201"/>
                    <hl7:templateId root="1.2.208.176.7.1.10.95"/>
                    <hl7:entry typeCode="COMP">
                        <hl7:act classCode="PCPR" moodCode="EVN">
                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.80"/>
                            <hl7:id root="6A3B9FE3-DCA2-4E88-9973-AAA084DBD1EB" extension="869840DD-892E-512A-8E28-A55C110ED55A"/>
                            <hl7:code nullFlavor="NA"/>
                            <hl7:effectiveTime>
                                <hl7:low value="20180814085705+0200"/>
                            </hl7:effectiveTime>
                            <hl7:participant typeCode="RESP">
                                <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                <hl7:templateId root="1.2.208.176.7.1.10.49"/>
                                <hl7:participantRole classCode="ROL">
                                    <hl7:scopingEntity classCode="ORG">
                                        <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="276231000016004"/>
                                    </hl7:scopingEntity>
                                </hl7:participantRole>
                            </hl7:participant>
                            <hl7:entryRelationship typeCode="RSON">
                                <hl7:act classCode="PCPR" moodCode="RQO">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.51"/>
                                    <hl7:code nullFlavor="NA"/>
                                    <hl7:effectiveTime value="20180814085705+0200"/>
                                    <hl7:participant typeCode="REF">
                                        <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                        <hl7:templateId root="1.2.208.176.7.1.10.52"/>
                                        <hl7:participantRole classCode="ROL">
                                            <hl7:scopingEntity classCode="ORG">
                                                <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="486811000016002"/>
                                            </hl7:scopingEntity>
                                        </hl7:participantRole>
                                    </hl7:participant>
                                    <hl7:entryRelationship typeCode="COMP">
                                        <hl7:act classCode="REG" moodCode="EVN">
                                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                            <hl7:templateId root="1.2.208.176.7.1.10.54"/>
                                            <hl7:code codeSystem="1.2.208.176.2.4" code="ALDA11"/>
                                        </hl7:act>
                                    </hl7:entryRelationship>
                                    <hl7:entryRelationship typeCode="RSON">
                                        <hl7:act classCode="REG" moodCode="EVN">
                                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                            <hl7:templateId root="1.2.208.176.7.1.10.55"/>
                                            <hl7:code codeSystem="1.2.208.176.2.4" code="DD429"/>
                                            <hl7:entryRelationship typeCode="COMP">
                                                <hl7:act classCode="REG" moodCode="EVN">
                                                    <hl7:templateId root="1.2.208.176.7.1.10.5"/>
                                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ZDW10"/>
                                                </hl7:act>
                                            </hl7:entryRelationship>
                                        </hl7:act>
                                    </hl7:entryRelationship>
                                    <hl7:entryRelationship typeCode="COMP">
                                        <hl7:act classCode="REG" moodCode="EVN">
                                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                            <hl7:templateId root="1.2.208.176.7.1.10.53"/>
                                            <hl7:code codeSystem="1.2.208.176.2.4" code="ALDB00"/>
                                        </hl7:act>
                                    </hl7:entryRelationship>
                                </hl7:act>
                            </hl7:entryRelationship>
                            <hl7:entryRelationship typeCode="COMP">
                                <hl7:act classCode="REG" moodCode="EVN">
                                    <hl7:templateId root="1.2.208.176.7.1.10.81"/>
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALAL01"/>
                                </hl7:act>
                            </hl7:entryRelationship>
                        </hl7:act>
                    </hl7:entry>
                </hl7:section>
            </hl7:component>
            <hl7:component contextConductionInd="true">
                <hl7:section>
                    <hl7:templateId root="2.16.840.1.113883.10.12.201"/>
                    <hl7:templateId root="1.2.208.176.7.1.10.113"/>
                    <hl7:entry typeCode="COMP">
                        <hl7:observation classCode="OBS" moodCode="EVN" negationInd="false">
                            <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.36"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.46"/>
                            <hl7:id root="6A3B9FE3-DCA2-4E88-9973-AAA084DBD1EB" extension="6463C77D-FA42-5730-B443-F9343875302E"/>
                            <hl7:code codeSystem="1.2.208.176.2.4" code="DA000"/>
                            <hl7:entryRelationship typeCode="REFR">
                                <hl7:encounter classCode="ENC" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.77"/>
                                    <hl7:id root="6A3B9FE3-DCA2-4E88-9973-AAA084DBD1EB" extension="D26694B2-778E-5F07-8D8B-EA9F28473B93"/>
                                    <hl7:code nullFlavor="NA"/>
                                </hl7:encounter>
                            </hl7:entryRelationship>
                            <hl7:entryRelationship typeCode="COMP">
                                <hl7:observation classCode="OBS" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.43"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALGA02"/>
                                </hl7:observation>
                            </hl7:entryRelationship>
                        </hl7:observation>
                    </hl7:entry>
                    <hl7:entry typeCode="COMP">
                        <hl7:observation classCode="OBS" moodCode="EVN" negationInd="false">
                            <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.36"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.45"/>
                            <hl7:id root="6A3B9FE3-DCA2-4E88-9973-AAA084DBD1EB" extension="BE844372-DE32-527C-A23D-3E3E7377C865"/>
                            <hl7:code codeSystem="1.2.208.176.2.4" code="DO000"/>
                            <hl7:entryRelationship typeCode="REFR">
                                <hl7:encounter classCode="ENC" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.77"/>
                                    <hl7:id root="6A3B9FE3-DCA2-4E88-9973-AAA084DBD1EB" extension="D26694B2-778E-5F07-8D8B-EA9F28473B93"/>
                                    <hl7:code nullFlavor="NA"/>
                                </hl7:encounter>
                            </hl7:entryRelationship>
                            <hl7:entryRelationship typeCode="COMP">
                                <hl7:observation classCode="OBS" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.43"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALGA01"/>
                                </hl7:observation>
                            </hl7:entryRelationship>
                        </hl7:observation>
                    </hl7:entry>
                </hl7:section>
            </hl7:component>
            <hl7:component contextConductionInd="true">
                <hl7:section>
                    <hl7:templateId root="1.2.208.176.7.1.10.75"/>
                    <hl7:templateId root="2.16.840.1.113883.10.12.201"/>
                    <hl7:entry typeCode="COMP">
                        <hl7:encounter classCode="ENC" moodCode="EVN">
                            <hl7:templateId root="2.16.840.1.113883.10.12.302"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.74"/>
                            <hl7:id root="6A3B9FE3-DCA2-4E88-9973-AAA084DBD1EB" extension="D26694B2-778E-5F07-8D8B-EA9F28473B93"/>
                            <hl7:code codeSystem="1.2.208.176.2.4" code="ALCA00"/>
                            <hl7:effectiveTime>
                                <hl7:low value="20180814085705+0200"/>
                            </hl7:effectiveTime>
                            <hl7:priorityCode codeSystemName="Sundhedsvæsenets Klassifikations System" codeSystem="1.2.208.176.2.4" code="ATA1"/>
                            <hl7:participant typeCode="RESP">
                                <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                <hl7:templateId root="1.2.208.176.7.1.10.49"/>
                                <hl7:participantRole classCode="ROL">
                                    <hl7:scopingEntity classCode="ORG">
                                        <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="276231000016004"/>
                                    </hl7:scopingEntity>
                                </hl7:participantRole>
                            </hl7:participant>
                            <hl7:participant typeCode="LOC">
                                <hl7:templateId root="1.2.208.176.7.1.10.50"/>
                                <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                <hl7:time>
                                    <hl7:low value="20180814085705+0200"/>
                                </hl7:time>
                                <hl7:participantRole classCode="SDLOC">
                                    <hl7:templateId root="1.2.208.176.7.1.22.4"/>
                                    <hl7:scopingEntity classCode="ORG">
                                        <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="276231000016004"/>
                                    </hl7:scopingEntity>
                                </hl7:participantRole>
                            </hl7:participant>
                            <hl7:entryRelationship typeCode="RSON">
                                <hl7:act classCode="REG" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.48"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALCC01"/>
                                </hl7:act>
                            </hl7:entryRelationship>
                            <hl7:entryRelationship typeCode="REFR">
                                <hl7:act classCode="PCPR" moodCode="EVN">
                                    <hl7:templateId root="1.2.208.176.7.1.10.72"/>
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:id root="6A3B9FE3-DCA2-4E88-9973-AAA084DBD1EB" extension="869840DD-892E-512A-8E28-A55C110ED55A"/>
                                    <hl7:code nullFlavor="NA"/>
                                </hl7:act>
                            </hl7:entryRelationship>
                            <hl7:entryRelationship typeCode="REFR">
                                <hl7:act classCode="ACT" moodCode="EVN">
                                    <hl7:templateId root="1.2.208.176.7.1.10.7"/>
                                    <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALFA2"/>
                                    <hl7:effectiveTime>
                                        <hl7:low value="20180814085705+0200"/>
                                    </hl7:effectiveTime>
                                    <hl7:participant typeCode="IND">
                                        <hl7:templateId root="2.16.840.1.113883.10.12.321"/>
                                        <hl7:templateId root="1.2.208.176.7.1.10.8"/>
                                        <hl7:participantRole classCode="PAYOR">
                                            <hl7:scopingEntity classCode="ORG">
                                                <hl7:id assigningAuthorityName="Sundhedsdatastyrelsen" root="1.2.208.176.2.4" extension="ALFB01"/>
                                            </hl7:scopingEntity>
                                        </hl7:participantRole>
                                    </hl7:participant>
                                    <hl7:entryRelationship typeCode="COMP">
                                        <hl7:act classCode="ACT" moodCode="EVN">
                                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                                            <hl7:templateId root="1.2.208.176.7.1.10.10"/>
                                            <hl7:code codeSystem="1.2.208.176.2.4" code="ALFC4"/>
                                        </hl7:act>
                                    </hl7:entryRelationship>
                                </hl7:act>
                            </hl7:entryRelationship>
                        </hl7:encounter>
                    </hl7:entry>
                </hl7:section>
            </hl7:component>
        </hl7:structuredBody>
    </hl7:component>
</hl7:ClinicalDocument>
```
Nullify the main condition and replace the minor condition with the new data using the main condition template
```xml
<hl7:ClinicalDocument xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
    xmlns:hl7="urn:hl7-org:v3" xsi:schemaLocation="urn:hl7-org:v3 https://raw.githubusercontent.com/cdaapi/cdaapi_core/master/reference/CDA.xsd">
    <hl7:realmCode code="DK"/>
    <hl7:typeId root="2.16.840.1.113883.1.3" extension="POCD_HD000040"/>
    <hl7:templateId root="1.2.208.176.7.1.10.71"/>
    <hl7:templateId root="2.16.840.1.113883.10.12.2"/>
    <hl7:templateId root="2.16.840.1.113883.10.12.1"/>
    <hl7:id root="6A3B9FE3-DCA2-4E88-9973-AAA084DBD1EB" extension="96E4EE31-AA9A-4DC8-98AA-FCBD54C3D556"/>
    <hl7:code codeSystem="2.16.840.1.113883.6.1" code="34133-9"/>
    <hl7:effectiveTime value="20180814085705+0200"/>
    <hl7:confidentialityCode codeSystem="2.16.840.1.113883.5.25" code="N"/>
    <hl7:setId assigningAuthorityName="DXC Technology" root="6A3B9FE3-DCA2-4E88-9973-AAA084DBD1EB"/>
    <hl7:versionNumber value="291219"/>
    <hl7:recordTarget>
        <hl7:templateId root="2.16.840.1.113883.10.12.101"/>
        <hl7:templateId root="1.2.208.176.7.1.10.101"/>
        <hl7:patientRole classCode="PAT">
            <hl7:templateId root="1.2.208.176.7.1.10.106"/>
            <hl7:id assigningAuthorityName="CPR" root="1.2.208.176.1.2" extension="1304621201"/>
        </hl7:patientRole>
    </hl7:recordTarget>
    <hl7:author typeCode="AUT">
        <hl7:templateId root="2.16.840.1.113883.10.12.102"/>
        <hl7:templateId root="1.2.208.176.7.1.10.102"/>
        <hl7:time value="20180814075705+0200"/>
        <hl7:assignedAuthor classCode="ASSIGNED">
            <hl7:id nullFlavor="NI"/>
            <hl7:representedOrganization classCode="ORG" determinerCode="INSTANCE">
                <hl7:id assigningAuthorityName="SOR" root="1.2.208.176.1.1" extension="6071000016008"/>
            </hl7:representedOrganization>
        </hl7:assignedAuthor>
    </hl7:author>
    <hl7:custodian typeCode="CST">
        <hl7:templateId root="2.16.840.1.113883.10.12.104"/>
        <hl7:templateId root="1.2.208.176.7.1.10.103"/>
        <hl7:assignedCustodian classCode="ASSIGNED">
            <hl7:representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <hl7:id root="2.16.840.1.113883.2.24.1.1" extension="25469364"/>
            </hl7:representedCustodianOrganization>
        </hl7:assignedCustodian>
    </hl7:custodian>
    <hl7:relatedDocument typeCode="APND">
        <hl7:parentDocument classCode="DOCCLIN" moodCode="EVN">
            <hl7:id root="6A3B9FE3-DCA2-4E88-9973-AAA084DBD1EB" extension="6A3D9FF8-AEFF-4497-90A3-C2B3BC06F08B"/>
            <hl7:setId root="6A3B9FE3-DCA2-4E88-9973-AAA084DBD1EB"/>
            <hl7:versionNumber value="-525178"/>
        </hl7:parentDocument>
    </hl7:relatedDocument>
    <hl7:component contextConductionInd="true">
        <hl7:structuredBody>
            <hl7:component contextConductionInd="true">
                <hl7:section>
                    <hl7:templateId root="2.16.840.1.113883.10.12.201"/>
                    <hl7:templateId root="1.2.208.176.7.1.10.113"/>
                    <hl7:entry typeCode="COMP">
                        <hl7:observation classCode="OBS" moodCode="EVN" negationInd="false">
                            <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.36"/>
                            <hl7:templateId root="1.2.208.176.7.1.10.45"/>
                            <hl7:id root="6A3B9FE3-DCA2-4E88-9973-AAA084DBD1EB" extension="6463C77D-FA42-5730-B443-F9343875302E"/>
                            <hl7:code codeSystem="1.2.208.176.2.4" code="DO000"/>
                            <hl7:entryRelationship typeCode="COMP">
                                <hl7:observation classCode="OBS" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.303"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.43"/>
                                    <hl7:code codeSystem="1.2.208.176.2.4" code="ALGA01"/>
                                </hl7:observation>
                            </hl7:entryRelationship>
                            <hl7:reference typeCode="REFR">
                                <hl7:templateId root="2.16.840.1.113883.10.12.324"/>
                                <hl7:externalAct classCode="ACT" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.325"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.78"/>
                                    <hl7:id root="6A3B9FE3-DCA2-4E88-9973-AAA084DBD1EB" extension="D26694B2-778E-5F07-8D8B-EA9F28473B93"/>
                                </hl7:externalAct>
                            </hl7:reference>
                            <hl7:reference typeCode="RPLC">
                                <hl7:templateId root="2.16.840.1.113883.10.12.324"/>
                                <hl7:templateId root="1.2.208.176.7.1.10.125"/>
                                <hl7:templateId root="1.2.208.176.7.1.10.117"/>
                                <hl7:externalObservation classCode="OBS" moodCode="EVN">
                                    <hl7:id root="6A3B9FE3-DCA2-4E88-9973-AAA084DBD1EB" extension="6463C77D-FA42-5730-B443-F9343875302E"/>
                                </hl7:externalObservation>
                            </hl7:reference>
                        </hl7:observation>
                    </hl7:entry>
                </hl7:section>
            </hl7:component>
            <hl7:component contextConductionInd="true">
                <hl7:section>
                    <hl7:templateId root="2.16.840.1.113883.10.12.201"/>
                    <hl7:templateId root="1.2.208.176.7.1.10.116"/>
                    <hl7:entry typeCode="COMP">
                        <hl7:act classCode="ACT" moodCode="EVN">
                            <hl7:templateId root="1.2.208.176.7.1.10.118"/>
                            <hl7:templateId root="2.16.840.1.113883.10.12.301"/>
                            <hl7:code nullFlavor="NA"/>
                            <hl7:statusCode code="nullified"/>
                            <hl7:reference typeCode="RPLC">
                                <hl7:externalObservation classCode="OBS" moodCode="EVN">
                                    <hl7:templateId root="2.16.840.1.113883.10.12.326"/>
                                    <hl7:templateId root="1.2.208.176.7.1.10.100"/>
                                    <hl7:id root="6A3B9FE3-DCA2-4E88-9973-AAA084DBD1EB" extension="BE844372-DE32-527C-A23D-3E3E7377C865"/>
                                </hl7:externalObservation>
                            </hl7:reference>
                        </hl7:act>
                    </hl7:entry>
                </hl7:section>
            </hl7:component>
        </hl7:structuredBody>
    </hl7:component>
</hl7:ClinicalDocument>
```

If you do not nullify the main condition you will receice an integrity check error
```xml
<RegistryError
    codeContext="INTEGRITY_CHECK|||Existing MinorConditionObservation 6463C77D-FA42-5730-B443-F9343875302E cannot be elevated to a MainConditionObservation as its Encounter already has a MainConditonObservation|||CANNOT_REPLACE_MINOR_WITH_MAIN_CONDITION|||6463C77D-FA42-5730-B443-F9343875302E"
    errorCode="InvalidDocumentContent"
    location="6A3B9FE3-DCA2-4E88-9973-AAA084DBD1EB^96E4EE31-AA9A-4DC8-98AA-FCBD54C3D556|||//*[local-name()='observation' and @classCode='OBS' and @moodCode='EVN'][child::*[local-name()='id' and @extension='6463C77D-FA42-5730-B443-F9343875302E']][child::*[local-name()='templateId' and @root='1.2.208.176.7.1.10.36']][child::*[local-name()='templateId' and @root='2.16.840.1.113883.10.12.303']]"
    severity="urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error"/>
```
