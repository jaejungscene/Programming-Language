class Rectangle {
    // constructor(height){
    //     this.height = height;
    // }

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

let rect = new Rectangle(123);
console.log(rect);
console.log(Rectangle.prototype);
console.log("-----------------------------");

rect.setHeight = 423;
rect.setWidth = 32;
console.log(rect);
console.log(rect.area);
console.log("-----------------------------");

Rectangle.prototype.printHeight = function(){
    console.log(this.height);
}
Rectangle.prototype.printWidth = (x)=>{
    console.log(x);
}
rect = new Rectangle(12., 2.1);
console.log(Rectangle.prototype);
rect.printHeight();
rect.printWidth('hello world');
console.log("-----------------------------");



//////////////////////////////////////////////////////////////



function User(name){
    this.name = name;
    this.age;

    // never create function inside constructor function
    this.printName = function(){
        console.log(this.name);
    }

    this.printAge = function(){
        console.log(this.age);
    }
    
    console.log("-- initialize --");
    console.log(this);
    console.log("----------------");
}

let kedar = new User("kedar")
kedar.printName();
kedar.printAge();