public class Test {

    // Lecture 03). :- superclass,inheritance (Hierrarchical),default constructor,method calling.
    // Method_calling,superclass,inheritance ... is understand in third lecture of OOPs.


    //in test class we can access anything from properties and behaviours access through default constructor call.
    //Animal is a super class and dog and cat are derived classes of animal class but call behaviours as method calling in below program
    //use of concepts.inheritance(hierranchical inheritence.),test class property,default constructor,method calling.
    //include class. Testclass-->Animalclass-->Catclass-->Dogclass.
    
    public static void main(String[] args){
          Cat cat = new Cat(); //default constructor.
          Dog dog = new Dog(); //default constructor.
          Animal animal = new Animal();//default constructor.

          //cat.name = "Bob";
         // Animal dog = new Dog();//Polymorphism.//dog Refrence variable of super class Animal ka. Animal dog = new Dog --> object hai vo dog type ka hai.
         animal.makeSound();//some sound
         animal.breed();//some food
         animal.name();//some name of animal

         dog.makeSound(); //Bhow-Bhow! //access in test class from dog.java //full method called by method makesound.// Bhow-Bhow!.
          dog.breed(); //Dog Biscuits
          dog.name(); //Tommy & Bruno

          cat.makeSound();//Meow! //access in test class from cat.java //full method called by method makeSound.// meow!
          cat.breed();//rat
          cat.name();//Bob

         // //System.out.println(cat.name);
          //System.out.println();
    }

}