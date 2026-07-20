public class Car{

  // Lecture 01 of OOPS : - Introduction to OOPS concepts and principles of OOPS.

      //OOPS : we play from classes and objects.it stands for Object Oriented Programming.
      //Class: it is defined as the blueprint of an object that is called class.
      // it is the fundamental unit of OOPS(Object Oriented Programming).
      // properties(ex.car --> colour,brand,model,year,speed) and behaviours(accelarate karegi,break se rukegi,) of an object.
      //object is created on the basis of blueprint.
      //Parent class --> super class and base class and Child class --> sub class or derieved class.
      String colour;  //properties
      String brand;  //properties
      String model; //properties
      private int year;    //properties
      int speed; //break , accelarate --> behaviour


      public void accelerate(int increment){  //methods(behaviour).as functions in java.
        speed += increment;

      }

      public void brake(int decrement){
        speed -= decrement;
        if(speed < 0){
            speed = 0;
        }

      }

      public static void main(String [] args){    //main method or function in java.
           Car car = new Car();
           car.colour = "Blue";
           car.speed = 40;
           car.brand = "B.M.W";
           car.year = 2024;
           car.model = "Safari";

           car.year = 2030;
           car.accelerate(1);
           System.out.println(car.speed);
           System.out.println(car.year);

      }

}
   //There are four pilers and principles of OOPs(object-oriented programming).
   //1).Abstraction.   : Hiding implementation details. unnecessary data is hidden or necessary data is shown.
   //2).Encapsulation. : it is defined as the Bundling of data(objects properties) and methods(objects behaviours) into a single unit. to made class.it also private or hiding the data through private keyword.
   //                      when all are private so how we can set this.???? ----> using getter() and setter() methods. ex.in Encapsulation.java
   //3).Polymorphism. :  
   //4).Inheritance.  : it is defined as the child class inherits the properties parent class through extends keyword.example. public class Dog/Cat extends Animal. or test class also.
   //lec.01 of oops include Animal.java-->dog.java-->cat.java-->Test.java-->car.java-->
