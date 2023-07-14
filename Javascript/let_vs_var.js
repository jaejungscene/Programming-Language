
var x=5;
console.log("x is "+x); // 5
//오류 안뜸

let k=5;
console.log("k is "+k);
//오류 뜸

{
  var w = 321;
  let p = 110;
  const q = 111;
}

console.log(w); // 321

try{
  console.log(p); // Uncaught ReferenceError: p is not defined
}
catch(err){
  console.log(`${err} From let p`);
}

try{
  console.log(q); // Uncaught ReferenceError: p is not defined
}
catch(err){
  console.log(`${err} From const q`);
}