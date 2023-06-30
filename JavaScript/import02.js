import { getNumberClass, getFunction, getClass } from "./export_functions.js";

let id, name;

let temp = getNumberClass();
console.log(temp);
console.log("---------------------------------");

({id} = getNumberClass());
console.log(id);
console.log("---------------------------------");

({name} = getNumberClass());
console.log(name);
console.log("---------------------------------");

({id, name} = getNumberClass());
console.log(`${name} is ${id}`);
console.log("---------------------------------");

let getFunc = getFunction();
getFunc();
console.log("---------------------------------");

let Rect = getClass();
console.log(Rect.width);
console.log("---------------------------------");
