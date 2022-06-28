
console.log(x); // undefined
var x=5;
console.log(x); // 5
//오류 안뜸

console.log(k);
let k=5;
console.log(k);
//오류 뜸

{
  var w = 321;
  let p = 110;
  const q = 111;
}
console.log(w); // 321
console.log(p); // Uncaught ReferenceError: p is not defined
console.log(q); // Uncaught ReferenceError: p is not defined