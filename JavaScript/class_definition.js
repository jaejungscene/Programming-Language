export default class Rectangle {
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

const square = new Rectangle(10, 10);
console.log(square.area); // 100
square.setHeight = 5;
square.setWidth = 3;
console.log(square.area);