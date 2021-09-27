# Accumulated error list

## About
The accumulated error list is a list of all episode of care elements with outstanding dynamic rule issues as definited by the [issue transitive closure](definitions.md#Issue transitive closure).  
The list is represented as a set of files, one for every episode of care element.

## Access
The issue files are accessible through sFTP.
The files are grouped by reporting authority, i.e. every reporting authority has their own private folder on the FTP server. In each folder the files are packaged in zip files with a default count of 10.000 individual json files per zip file. 

### URL for ftp servers
Find the URL for accessing accumulated error list here:

- [Test environment](../testenvironment.md)
- [Produktion environment](../productionenvironment.md)

## Schedule
The set of files are generated at 1:55 and transfer of files to FTP site begins at 04:00 in the Europe/Copenhagen timezone. The transfer may take a long time depending of the size of the list. Current estimate is that the full transfer takes 1 hour 30 minutes.

The files are loaded for one reporting authority at a time and to indicate that the load is finnished an empty file named "lpr3_acl_uploadafsluttet_[YYYYMMDD]-[HHmm].succes" is placed in the folder.

## File format
The files are represented in JSON as definited by [RFC 8259](https://tools.ietf.org/html/rfc8259).  
Any consumer of the accumulated error list is considered a [JSON parser](https://tools.ietf.org/html/rfc8259#section-9) with the following additional requirements.

> An implementation **MUST NOT** set limits lower than 20,000,000 on the size of texts that it accepts.  
> An implementation **MUST NOT** set limits lower than 20 on the maximum depth of nesting.  
> An implementation **MUST NOT** set limits lower than decimal64 as definied by [IEEE Std 754-2008](https://ieeexplore.ieee.org/document/4610935/) on the range and precision of numbers.  
> An implementation **MUST NOT** set limits lower than 32,767 on the length of strings.  
> An implementation **MUST NOT** set limits on the character contents of strings that are subsets of [ISO/IEC 8859-10:1998](https://www.iso.org/standard/28254.html).  
> An implementation **SHOULD NOT** set limits on the character contents of strings.
   
The LPR system is considered a [JSON generator](https://tools.ietf.org/html/rfc8259#section-10).

## File structure
The structure of an issue file is definied by [this JSON Schema](../resources/acl.schema.json)

## Example
Below is an example of an issue file
```json
{
  "encounters": [
    {
      "conditions": [
        {
          "observationOrganizers": [
            {
              "identifier": {
                "root": "9ac099d7-dcb3-4bf4-916a-1967ff03147b",
                "extension": "44ceb94b-0832-5590-b9d4-3b91f9cb1d99"
              },
              "errors": [
                {
                  "ruleId": "RAA01.RDA01-3",
                  "ruleVersion": "sds:lpr:3.0.5",
                  "code": "90013",
                  "message": "Anmeldelsesstatus (resultat RDA01) skal være i en af kodelisterne res.statuscar.subb og res.statuscar.subc ved komplet indberetning"
                },
                {
                  "ruleId": "RAA01.6",
                  "ruleVersion": "sds:lpr:3.0.5",
                  "code": "9100",
                  "message": "Resultatindberetning RAA01 (canceranmeldelse) må kun trigges af en diagnose i kodelisten diag.car"
                },
                {
                  "ruleId": "RAA01.RDA03-1",
                  "ruleVersion": "sds:lpr:3.0.5",
                  "code": "90031",
                  "message": "Mikroskopisk diagnosegrundlag (resultat RDA03) skal være i kodelisten res.mikrogr"
                },
                {
                  "ruleId": "RAA01.RDA02",
                  "ruleVersion": "sds:lpr:3.0.5",
                  "code": "9002",
                  "message": "For resultatindberetning RAA01 (canceranmeldelse) skal der være et resultat af type RDA02 (makroskopisk diagnosegrundlag), når anmeldelsesstatus (resultat RDA01) er i kodelisten res.statuscar.suba"
                }
              ]
            }
          ],
          "identifier": {
            "root": "9ac099d7-dcb3-4bf4-916a-1967ff03147b",
            "extension": "19d79492-28ed-5b04-b27d-c11d4228187d"
          }
        }
      ],
      "identifier": {
        "root": "9ac099d7-dcb3-4bf4-916a-1967ff03147b",
        "extension": "ac39b667-f04a-5cab-a29e-01200b1edc15"
      }
    }
  ],
  "identifier": {
    "root": "9ac099d7-dcb3-4bf4-916a-1967ff03147b",
    "extension": "0000328d-5517-5e33-b5d8-931f39a83d7f"
  },
  "errors": [
    {
      "ruleId": "00.01",
      "ruleVersion": "sds:lpr:3.0.5",
      "code": "1",
      "message": "Ethvert tidspunkt indeholdt i et givet objekt, der indberettes, skal ligge før eller samtidig med indberetningens tidsstempel, som igen skal ligge før aktuelle tidspunkt"
    }
  ]
}
```