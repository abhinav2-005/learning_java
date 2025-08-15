// class Pen{
//     String type;
//     String color;

//     public void out(){
//         System.out.println(this.type+" "+this.color);
//     }

// }


// class Student{
//     String name;
//     int roll_no;
//     public void print_info(){
//         System.out.println(this.name+this.roll_no);
//     }
//     Student(String name , int roll_no){
//         this.name = name;
//         this.roll_no = roll_no;
//     }
// }

// we don't want to use @override keyword while implementing method overriding
// method overloading
// class Car{
//     String name;
//     double price;

//     public void print_info(double price){
//         System.out.println(this.price);
//     }
//     public void print_info(String name){
//         System.out.println(this.name);
//     }
//     public void print_info(String name , double price){
//         System.out.println(this.name+" "+this.price);
//     }
 
// }

//Inherentence
//Single level inherientence

// class Shape{
//     int l;
//     int b;
//     public void print(int l ,int b){
//         System.out.println(l+b);
//    }
// }
// class Rectangle extends Shape{
//     public void rect_area(){
//         System.out.println(this.l*this.b);
//     }
// }

// multilevel inherientence
// class Shape{
//     int l = 5;
//     int b = 2;
//     public void area(){
//         System.out.println("Area");
//     }
// }

// class Rect extends Shape{
//     public void rect_area(){
//         System.out.println(l*b);
//     }
// }
// class Tri extends Shape{
//     public void tri_area(){
//         System.out.println(0.5*this.l*this.b);
//     }
// }

// hierarchical
// class Shape{
//     int l = 5;
//     int b = 10;
// }
// class Rect extends Shape{
//     public void print_area(){
//         System.out.println(this.l*this.b);
//     }
// }

// class Tri extends Shape{
//     public void print_area(){
//         System.out.println((int)(0.5*this.l*this.b));
//     }

// }

// hybrid inherientence
// class Shape{
//     int l = 5;
//     int b = 6;
// }

// class Rect extends Shape{
//     public void rect_area(){
//         System.out.println(this.l*this.b);
//     }
// }

// class Tri extends Shape{
//     public void tri_area(){
//         System.out.println(0.5*this.l*this.b);
//     }
// }

// class Oct extends Rect{
//     public void oct_area(){
//         System.out.println(this.l+this.b);
//     }
// }

// class oops {
//     public static void main(String [] args){

        // Pen red_pen = new Pen();
        // red_pen.type = "Ball";
        // red_pen.color = "Red";
        

        // Pen blue_pen = new Pen();
        // blue_pen.type = "ball";
        // blue_pen.color = "blue";

        // red_pen.out();
        // System.out.println(red_pen.type + red_pen.color);
        // blue_pen.out();

        // Student new_student = new Student("Abhinav",1177);
        // new_student.print_info();t

        // Car new_car = new Car();
        // new_car.name = "Maruthi";
        // new_car.price = 2000.0;
        // new_car.print_info(new_car.name,new_car.price);
        // Shape new_shape = new Shape();
        // new_shape.l = 2;
        // new_shape.b = 3;

        // Rectangle new_rect = new Rectangle();
        // new_rect.l = new_shape.l;
        // new_rect.b = new_shape.b;
        // new_rect.rect_area();

        // Tri new_tri = new Tri();
        // new_tri.tri_area();

        // Rect new_rect = new Rect();
        // new_rect.rect_area();

        // Shape new_shape = new Shape();
        // new_shape.l = 10;
        // new_shape.b = 20;

        // new_shape.print(1,2);

        // Tri new_tri = new Tri();
        // new_tri.print_area();

        // Oct new_oct = new Oct();
        // new_oct.oct_area();

//     }

// }

// class Account{
//     String name;
//     protected int id;
//     private int password;

//     public void print(){ 
//         System.out.println(this.name+this.password);
//     }

//     public int getpassword(){  //getter method for private variables in a class
//         return this.password;
//     }
//     public void setpassword(int password){
//         this.password = password;       //setter method to set variables in a class
//     }
// }

// class Account{
//     String name;
    // protected int id; //this is useful while dealing with pacakages we can't directly access this variable
//     private int password;

//     public void print(){ 
//         System.out.println(this.name+this.password);
//     }

//     public int getpassword(){
//         setpassword((int)(Math.random()*1000));//getter method for private methods in a class
//         return this.password;
//     }
//     private void setpassword(int password){
//         this.password = password;       //private setter method to set variables in a class
//     }
// }

// class oops{
//     public static void main(String[] args){
//         Account new_a = new Account();
//         new_a.name = "Abhi";
//         new_a.id = 1234;
        
//         System.out.println(new_a.getpassword());
//     }
// }

// Abstraction

// abstract class Animal{
//     abstract void walk();
// }

// class Dog extends Animal{
//     @override
//     public void walk(){
//         System.out.println("dog walks");
//     }
// }

// class Cat extends Animal{
//     public void walk(){
//         System.out.println("cat walks");
//     }
// }

// class oops{
//     public static void main(String[] args){
//         Dog new_dog = new Dog();
//         new_dog.walk();
//         // we cannot directly create objects for abstract class,this will show a run time error
//     }
// }

//interfaces
// mutiple inherientecne is not directly implemented in java ,these are done by interfaces

// interface Animal{
//     // methods that are defined in interface are public and abstract and final
//     int n = 10;
//     void walk();
// }

// class Dog implements Animal{
//     public void walk(){
//         // n++;//we can't increment this because this is a final value ,all the values that are initlized in interfaces are final and function are public 
//         System.out.println(n);
//         System.out.println("dog walks");
//     }
// }
// class oops{
//     public static void main(String[] args){
//         Dog new_dog = new Dog();
//         new_dog.walk();

//         // Animal new_ani = new Animal();
//         // new_ani.walk();
//     }
// }


// class Animal{
//     String name;
//     Animal(String name){
//         this.name = name;
//     }
// }

// class Dog extends Animal{
//     int id;
//     Dog(String name , int id){
//         super(name);// implementing of super in java
//         this.id =id;
//     }
//     public void print(){
//         System.out.println(this.name +" "+this.id);        
//     }
// }
// class oops{
//     public static void main(String[] args){
//         Dog new_d = new Dog("ceaser" ,1);
//         new_d.print();
//     }
// }

// implemting multiple inherientence
// Define an interface similar to `sub` in Python


// interface Sub {
//     void printShit();
// }

// // Main class with name and roll
// class Main {
//     String name;
//     int roll;

//     Main(String name, int roll) {
//         this.name = name;
//         this.roll = roll;
//     }
// }

// // Class that extends Main and implements Sub (Multiple Inheritance style)
// class SuperSub extends Main implements Sub {

//     SuperSub(String name, int roll) {
//         super(name, roll);
//     }

//     // Implementing method from Sub interface
//     public void printShit() {
//         System.out.println(name);
//     }

//     public void printMoreShit() {
//         System.out.println(name + " " + roll);
//     }
// }

// // Test the class
// public class oop {
//     public static void main(String[] args) {
//         SuperSub s = new SuperSub("Abhinav", 177);
//         s.printMoreShit(); // Output: Abhinav 177
//         s.printShit();     // Output: Abhinav
//     }
// }


// class Animal{
//     public void print(){
//         System.out.println("one");
//     }
// }

// class Dog extends Animal{
//        @Override
//        public void print(){
//         System.out.println("two");
//     }
// }

// class oop{
//     public static void main(String[] args){
//         Dog new_d = new Dog();
//         new_d.print();        
//     }
// }

// use of static keyword
// class Student{
//     public String name;
//     static String clg;

//     public void print(){
//         System.out.println(this.name+clg);
//     }
// }

// class oop{
//     public static void main(String[] args){
//         Student.clg = "sr";  //this stays same for every object
//         Student new_stu = new Student();
//         new_stu.name = "Abhinav";
//         // new_stu.clg = "kits";
//         new_stu.print();
//         new_stu.name = "shiva";
//         new_stu.print();

//     }
// }

class A{
    static{
        System.out.print("a");
    }
}

class oop{
    public static void main(String args[]){
        System.out.println("s");
    }
}