//Single Level inheritence i.e here Animal and Giraffe is part of Animal is Extended ; Animal is Parent Node(base class) and Giraffee is Child Node(Derived class/node)
//this method in java is known as CONSTRUCTOR CHAINING

// class Animal {
//     int a = 10;
//     Animal() {//these all are Data functions
//         System.out.println("First Animal");
//     }
//     void print(){
//         System.out.println("this is animal 1");
//     }
// }

// class Girrafe extends Animal {
//     String name, color;//these all are data Members

//     Girrafe() {
//         System.out.println("this is Girrafe");
//     }
//     super.print();
//     //Super keyword is used to access Data function and data member of Parent class
//     void print() {
//         System.out.println(super.a);
//         System.out.println("this is animal 2");
//     }
// }

//** Multilevel Inheritence i.e here Animal is Extened to GIraffe and is Extended to one more category Walk

// class Animal {
//     Animal() {
//         System.out.println("First Animal");
//     }
// }


// class Girrafe extends Animal {// alll properties of Animal are in Giraffe now
//     String name = "Cheeno", color;
//     Girrafe() {
//         System.out.println("this is Girrafe");
//     }
// }

// class Walk extends Girrafe {//all properties of Animal and Giraffe is in Walk now
//     int leg = 4;
//     Walk(int legs) {
//         System.out.println("Girrafe walks on 4 legs i.e" + legs);
//     }
//     void print(){
//         System.out.println(name+" Belongs to Class Animal walking on "+leg+" legs");//taking name from Parent(Giraffe)
//     }
// }

// //#** Hierarchial Inheritence i.e here Animal class has 2 Hierchey as Girrafe and Frog and we can extend individual Frog/girrafee to their multilevel inheritance by adding one more class and extending it

// interface Animal {//interface is automatically abstract
//     // Animal() {
//     //     System.out.println("First Animal");
//     // }

//     void walk();// this is by default -> default and Public access modified 

// }
// interface Human {
//     // Human(){
//     //     System.out.println("true");
//     // }
//     void walk();
// }

// class Girrafe implements Animal,Human {
//     Girrafe() {
//         System.out.println("this is Girrafe");
//     }

//     public void walk(){//here we have to specify access modifier as method doesnt have auto generated access user has to specify 

//     }
// }

// class Frog implements Animal{
//     public void walk(){
//         System.out.println("This is frog");
//     }
// }


// public class inheritence {
//     public static void main(String[] args) {
//         // Walk a1 = new Walk();
//         // // Animal a1 = new Animal();// this error is cause Animal is some thought khayal hai its a blueprint of thr giraffe or frog or any animal but not actual animal 
//         // Girrafe g1 = new Girrafe();
//         // g1.print();//only can acess method of giraffe and not Animal
//         // Frog f1 = new Frog();


//         // static example calling school string from school class
//         School.school ="St francis";//no error
//         //but to call name of student in school class we have to amke a new object
//         School sch1 = new School();
//         sch1.name ="ritesh";
        
//         // Top t = new Top();//now Here t can only acess public functions and members in Test class from which it is extended and id any extension is private it cannot acess that private members

// }
// }


//Multiple Inheritence are not supported bt Classes BUt supported by Interfaces

// STATIC in Java
//ham static tab use karte hai jab kisi b chez ka value change nai hota ho jese ki school ka name jisme koi baccha padh rha ho scholl name har jagah sam ehe rahega so usko ham static bana lenmge
// Ststic keyword can be directly called into main function coz static are part of class object ka part nai hai 
//objects are private things in a class but static is directly part of class so we dont write like this :
// class School{
//     String name;
//     static String school;
// }


//Acess Modifiers in Inheritance

// class Test{

//     //This is Multilevel Inheritencve
//     //Name of Data members and Functions that are directly accessible by  member  function Give

// private class Ground {
//     int room;
//     protected void put(){};
//     public void get(){};//can acess put(),room;
// }

// public class Middle extends Ground{//middle has all private access of data mem and func' which are in ground class
//     int Labs;
//     public void Take(){};//can acess give()Labs,put(),get(),room;
//     public void Give(){};//can acess take(),Labs,put(),get(),room;
// }

// public class Top extends Middle{
//     int roof;
//     public void In(){};//can acess out(),labs,take(),give(),roof //Cannot Acess Ground cause its private
//     public void Out(){};// can acess take(),labs,take(),give(),roof //Cannot Acess Ground cause its private
// }

// }
