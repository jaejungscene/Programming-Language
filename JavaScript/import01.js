// export한 함수들 중 지정해서 불러옴
// 1이상의 함수가 정의되어 있기 때문에 가져오는 함수의 이름을 바꿀 수 없음
import {canadianToUs, usToCanadian} from "./export_functions.js";

console.log("50 Canadian dollars equals this amount of US dollars:");
console.log(canadianToUs(50));
console.log("---------------------------------");

console.log("40 Canadian dollars equals this amount of US dollars:");
console.log(usToCanadian(40));
console.log("---------------------------------");

// export한 함수들만 불러옴
import * as currency from "./export_functions.js";

console.log("30 US dollars equals this amount of Canadian dollars:");
console.log(currency.usToCanadian(30));
console.log("---------------------------------");

console.log("30 US dollars equals this amount of Canadian dollars:");
console.log(currency.canadianToUs(30));
console.log("---------------------------------");

// import out from "./export.js";
// 어차피 export.js에 하나의 함수만이 정의되어 있기 때문에 이름을 바꾸어도 상관없음
import outer from "./export_single.js"; 
outer();
console.log("---------------------------------");