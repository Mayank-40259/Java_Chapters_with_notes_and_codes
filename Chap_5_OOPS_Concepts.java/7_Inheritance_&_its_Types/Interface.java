public class Interface {


    // Lecture 7). Type hai ye and part hai.

    //yaha pata chalega implements(interface ke ander use hota hai 100 classes access property of an interface through implements kewword.) to yaha ho jata hai multiple inheritance. or extends(use karte hai ek class se dusri class ki prperties ko access karne ki yaha multiple inheritance use nahi hota hai(pr yh use hota hai in inheritance inherits the properties from one to another class) ) kaise alaag hai in java ke under.
    //class what? --> blueprint to making an object is called class.
    //interface what? --> blueprint to making a class is called interface.
    //in Abstract class having abstract methods.
    //Interface : me abstract methods(no declaration or defination ke hote hai.) hote hai. or Static constants hote hai(unlike abstract classes hai.)jisme concrete method(declaration or defination bhi ho sakte hai.) or regular method bhi ho sakte hai.
    //Interface ke do use hote hai 1).multiple inheritance achieve karna 2).abstaction achieve karna.
    //Interface --> Animal interface in intellij idea.
    //Interface --> object or constructor nahi bana sakte ho interface ka dono alag cheeze hai ye compare hota hai class se.
    //final--> constant hota hai,static --> koi matlab banta nahi hai. in animal package interface animal.
    //1).Abstract methods
    //2).static constants.
    //3).static methods.
    //4).default methods.

    //next is Multiple Inheritance in Java. devices package.
    //next is Main method in interface.(koi main method hota hai interface ke ander).ex. abc in interface package.

    //difference between abstract class and interface (me diffrence kya hota hai).
    /*                                              |                            
      1).inside instance variables hote hai         | 1). lekin interfaces me ye sab cheeze nahi hoti.                                                             
         instance variables hai toh initialize      | 2). yaha pr ek class multiple interfaces (classes) ko                                                                 
          karne ke liye ek constructor hota hai.    |       implements kr sakti hai.                                                          
      2). ek class extend karti hai sirf ek abstract|      example hai intellij idea pr                                                                           
         class ko. extends matlab inherit karna     |          Devices vale package me.                                                                
           properties ko dusri class ki.            |            smartphone class.
          example hai intellijidea pr               |                             
              animal package or abstraction package.|                                       
                or vehicle package bhi              |                      
                        */
    

    //Summary : abstract method,static method,interface,multiple inheritance,difference in abstract or interface classes me. 
    // interface blueprint hai --> class ka or class blueprint hai --> object ki or object defined in classes as an entity of any real life example.
    // Car car = new Car(); //class_name Obj_name = new constructor/class_name();


    //
    public static void main(String[] args) {
       // System.out.println(" Hello World ");
        int n = 6;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
