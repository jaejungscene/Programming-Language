const exchangeRate = 0.91;

// 안 내보냄
function roundTwoDecimals(amount) {
  return Math.round(amount * 100) / 100;
}

// 내보내기 1
export function canadianToUs(canadian) {
  return roundTwoDecimals(canadian * exchangeRate);
}

// 내보내기 2
const usToCanadian = function (us) {
  return roundTwoDecimals(us / exchangeRate);
};
export { usToCanadian };



export function getNumberClass(){
  const c = {
    id: 12,
    name: "jaejung"
  };
  return c;
}

export function getFunction(){
  return ()=>{
    console.log("hello!!!");
  };
}

export function getClass(){
  class Rectangle {
    constructor(height, width) {
      this.height = height;
      this.width = width;
    }
    // Getter
    get area() {
      return this.calcArea();
    }
    // Setter
    set setHeight(height){
      this.height = height;
    }
    set setWidth(width){
      this.width = width;
    }
    // Method
    calcArea() {
      return this.height * this.width;
    }
  }
  return new Rectangle(10,10);
}