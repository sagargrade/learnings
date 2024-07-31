//---------------------------------------------------------
// Variables
//---------------------------------------------------------
let personName = "Ram"; // Variable (Mutable)
let personAge = 23; // Variable (Mutable)
const TOTAL_COUNT = 100; // Constant (Immutable)
var avoidVarUsage = "Test" // Variable (Mutable) but global scope

//---------------------------------------------------------
// Data Types
//---------------------------------------------------------
/* Primitives - 7 
    number (decimal, integer), 
    string (sequence of characters), 
    boolean, 
    undefined (empty value), 
    null (empty value), 
    Symbol, 
    BigInt (Large Integer)
*/
let numberDataType = 10;
console.log(typeof numberDataType); // number

let stringDateType = 'Test';
console.log(typeof stringDateType); // string

let booleanDataType = true;
console.log(typeof booleanDataType); // boolean

let undefinedDataType;
console.log(typeof undefinedDataType); // undefined

let nullDataType = null;
console.log(typeof nullDataType); // object //bug in JS not corrected due to legacy reason
