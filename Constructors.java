//by convention : Class name starts with CAPITAL letter
//method name starts with SMALL letter

class Pen {
    private String color;

    // to access these private data members we use getter and setter
    public String getcolor(String color){
        return color;
    }
    
    public void setcolor(String color) {
        this.color = color;
    }


    // this is a method i.e function is a method which is defined inside a
    // class(here class is pen)
    public void write() {
        System.out.println("Write something");
    }

    public void printcolor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.age);
        System.out.println(this.name);
    }

    Student(){// this is Non-Paramaterized Constructor
    this("dummy",18);//This will call default Constructor properties into this Parametrized constructor;
    //Constructor Call must be First statement in Constructor *********
    System.out.println("Constructor called");
    }

    Student(String name, int age){
    // this();//This will call default Constructor properties into this Parametrized constructor
    this.name = name;
    this.age = age;
    System.out.println("my name is "+this.name+" age is "+this.age);
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

// this is Main function
public class Constructors {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();//new creates a seperate space for allocatin of memory
        // in heap stack
        // pen1.color ="blue";
        // pen1.type ="gel";

        // Pen pen2 = new Pen();
        // pen2.color = "blue";
        // pen2.type = "gel";

        // pen1.printcolor();
        // pen2.printcolor();

        //Non-Parametized Constructor
        // Student s1 = new Student();//here "Student()" this whole word is also a
        // function but special type of function called CONSTRUCTOR(java ko construct
        // karna)
        // CONSTRUCTOR for a object or a class would be named by same name of class #**
        // Constructors are methods but doesnt return anything;

        // //Parametrized constructor
        Student s1 = new Student("Test",21);
        s1.name ="Testing";//for this objects constructor can be called only one time
        s1.age=21;

        // Student s1 = new Student();
        // s1.name = "ritesh";
        // s1.age = 23;
        // Student s2 = new Student(s1);//this is Copy Constructor

        s1.printInfo();
        // s2.printInfo();
    }
}
