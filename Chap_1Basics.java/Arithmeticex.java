public class Arithmeticex {

    //Lecture 3). : - Arithmetic operators in Java with real life example Revice. 

    public static void main(String[] args){

        int yourSalary = 10000; 
        int bonus = 500;

        int total = yourSalary + bonus;  // Addition
        System.out.println("total sum of your Salary is: " + total);

        int deduction = 1000; //convience, tax, etc.
        int monthlyTotal = yourSalary - deduction;  //Substraction
        System.out.println("your monthly total is: " + monthlyTotal);

        int yearlyTotal = monthlyTotal * 12;     //Multiplication
        System.out.println("Your yearlytotal is: " + yearlyTotal);

        int perChild = yearlyTotal / 3;  //for education and other expenses //Division
        System.out.println("perChild distribution of salary is: " + perChild);
        
        int a = 5,b = 2,remainder;
        remainder = a % b;   //Remainder or modulo.
        System.out.println("Your modulo or remainder is: " + remainder);
        
    }

}
