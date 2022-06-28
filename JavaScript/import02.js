import { getNumberClass, getFunction, getClass } from "./export_functions.js";

var {id} = getNumberClass();
console.log(id);

var {name} = getNumberClass();
console.log(name);

var{id, name} = getNumberClass();
console.log(`${name} is ${id}`);

var getFunc = getFunction();
getFunc();

var Rect = getClass();
console.log(Rect.width);
