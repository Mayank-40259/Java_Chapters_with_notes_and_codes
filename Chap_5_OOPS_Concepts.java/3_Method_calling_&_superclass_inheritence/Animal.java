public class Animal {

    //Lecture 03). a).Animal.java class
    // understand animal class example. 

    String name;
    String breed;

    public Animal(){ //default constructor.
        this.name = name;
        System.out.println(name);
    }
    public void makeSound(){ //it is overrides by cat ke makeSound() and Dog ke makeSound classes ka methods se.
        System.out.println("Some Sound");
          
    }
    public void breed(){
        System.out.println("Some food");
    }
    public void name(){
        System.out.println("Some name of Animal");
    }

}
