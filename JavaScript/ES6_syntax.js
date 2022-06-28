//Template Literal
const a = "안녕"
const b = 123
const text = `${a}, 내 나이는 ${b}이야!`
console.log(text)
//result : 안녕, 내 나이는 123이야!


//Destructuring
const grab = {
  name : "그랩",
  age : 27
};
const people = ["민수", "철수"]
  //기존
  var name = grab.name;
  var age = grab.age;
  var minsoo = people[0];
  var chulsoo = people[1];

  //ES6
  var{name, age} = grab;
  console.log(name, age);
  var [minsoo, chulsoo] = people;
  console.log(minsoo, chulsoo);


//map forEach
var products = [
  {
    name : '농구공',
    price : 50000
  },{
    name : '축구공',
    price : 50000
  }
]

  //기존
  console.log("---------기존---------");
  for(var i=0; i < products.length;i++){
    var name = products[i].name;
    console.log(i + ") " + "제품 이름 : " + name);
  }

  //forEach
  console.log("\n---------forEach---------");
  products.forEach((product, index)=>{
    console.log(`${index}) 제품 이름 : ${product.name}`);
  })

  //map(forEach와 는 다르게 새로운 배열을 반화한다.)
  console.log("\n---------map01---------");
  products.map((product, index)=>{
    console.log(`${index}) 제품 이름 : ${product.name}`);
  })

  console.log("\n---------map02---------");
  var productNames = products.map((product, index)=>{
    console.log(`${index}) 제품 이름 : ${product.name}`);
    return product;
  })
  console.log(productNames);

console.log("\n---------function 안에서 array 동적할당 후 반환---------");
function print(argu){
  var x = new Array();
  for(var i=0; i<argu.length; i++){
    x.push(argu[i].name);
  }
  return x;
}
var arr = print(products);
console.log(arr);

