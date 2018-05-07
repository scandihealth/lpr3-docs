## About
The accumulated error list is a list of all episode of care elements with outstanding dynamic rule issues as definited by the [issue transitive closure](/definitions.md#Issue transitive closure).  
The list is represented as a set of files, one for every episode of care element.

## Access
The issue files are accessible through FTP.
The files are grouped by reporting authority, i.e. every reporting authority has their own private folder on the FTP server.

## Schedule
The list is updated at midnight. 

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
    "procedures": [
        {
            "identifier": {
                "root": "E602E07C-7F05-431D-B187-1199974F4C5B",
                "extension": "58B1ACBC-A2C0-55C4-9803-462933618208"
            },
            "errors": [
                {
                    "ruleId": "11.31",
                    "ruleVersion": "sds:lpr:3.0.5",
                    "code": "1131",
                    "message": "Hvis en procedure er tilknyttet direkte til et forløbselement, skal der være tilknyttet en betalingsoplysning til proceduren, og starttidspunkt for betalingsoplysningen skal være lig med starttidspunkt for proceduren"
                },
                {
                    "ruleId": "11.101",
                    "ruleVersion": "sds:lpr:3.0.5",
                    "code": "11101",
                    "message": "Procedurekoden skal være i en af kodelisterne proc.act, proc.opr og proc.und"
                }
            ]
        }
    ],
    "identifier": {
        "root": "E602E07C-7F05-431D-B187-1199974F4C5B",
        "extension": "1E1CC9CC-A675-5B0E-A458-90D778272ACC"
    },
    "errors": [
        {
            "ruleId": "06.a",
            "ruleVersion": "sds:lpr:3.0.5",
            "code": "6001",
            "message": "Henvisningsårsagen skal findes i en af kodelisterne diag, proc.act, proc.opr, proc.und"
        },
        {
            "ruleId": "02.02",
            "ruleVersion": "sds:lpr:3.0.5",
            "code": "202",
            "message": "Et afsluttet forløbselement skal have en afslutningsmåde"
        }
    ]
}
```