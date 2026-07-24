public class Calculator {

    // calculator.java --> polymorphism example.
    // Lecture 08). :- Polymorphism example --> calculator.

    //Example of (1).Compile time polymorphishm : it is also known as method overloading.
    //we achieve compile time polymorphishm in which we create same functions as add but 
    //different parameters ke hisab se method or function me pass hoga as below :
    //poly --> many and morphism --> forms.
    //method overloading --> known compile time polymorphism.
    //method overriding --> run time polymorphism.


    //add methods ke many forms jaise ki naam same hai method ka lekin prakar bahut sare hote hai kyoki hm method overload kr rahe hai.
    //all three methods are overloaded methods.
    //Method to add two integers.
    public int add(int a , int b){

        return a + b;

    }

    //Method to add three integers.
    public int add(int a,int b, int c){

        return a + b + c;

    }

    //Method to add two double values.
    public double add(double a, double b){

        return a + b;

    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10,20));//call the function or method to add. //Output : 30
        System.out.println(calculator.add(10,20,30));//call the function or method to add. //Output : 60
        System.out.println(calculator.add(10.00 , 40.00)); //call the function or method to add.//Output : 50.00


    }


}
