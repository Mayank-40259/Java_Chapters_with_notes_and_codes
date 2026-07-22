public class Encapsulation {
    //mysql root password : mayank@123bca;


    // Lecture 5). :- Encapsulation.java , example --> Students.java.


    //1).Encapsulation : it is the pilar of Object oriented programming.
    // in class properties/fields/instance variable & behaviours.
    //example is students.java file in oops.
    //eg : on intellij BankAccount.java and Student.java.and in vs code Student.java.
    //lec. 03 --> Encapsulation.java-->Student.java in vs code --> in intellij Student.java ---> BankAccount.


    String name; //instance variable.
    int rollnumber;
    int age;


    private String colour;
    private String brand;
    private String model;
    private int year;
    private int speed;

    public String getColour(){

        return colour;
    }
    public void setColour(String colour){

        this.colour = colour;
    }
    public String getBrand(){

        return brand;
    }
    public void setBrand(String brand){

        this.brand = brand;
    }
    public String getModel(){

        return model;
    }

    public static void main(String[] args){
        String name; //local variable

    }
    
}
