## About
The accumulated error list is a list of all episode of care elements with outstanding dynamic rule issues as definited by the [issue transitive closure](/definitions.md#Issue transitive closure).  
The list is represented as a set of files, one for every episode of care element.

## Access

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
The structure of an issue file is definied by a JSON Schema