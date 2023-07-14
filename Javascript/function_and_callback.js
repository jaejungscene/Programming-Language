function add(a, b, c){
  if(c===undefined) return a+b;
  else return a+b+c;
}
var result = add(12,3);
console.log(result);

function callBackAdd(callback){
  var array = [
    {
      name : '농구공',
      price : 50000
    },{
      name : '축구공',
      price : 50000
    }
  ]
  for(var i=0; i<array.length; i++){
    callback(array[i], i);
  }
}
callBackAdd((array,index)=>{
  console.log(`${index}) ${array.name}`);
});


function variableArguments(...a){
  console.log('the number of arguments :',a.length);
  for(var i=0; i<a.length; i++){
    console.log(a[i]);
  }
}
variableArguments(1,2,3,4);
variableArguments(123);
