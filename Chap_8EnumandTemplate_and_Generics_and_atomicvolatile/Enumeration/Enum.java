 // enum --> Enumeration.enum means enumeration maltab listing of things like year --> Months, Weeks --> days, directions --> how many and names...etc.
 // college me kitne departments --> names.
 //enum is inheritly static hi honge.
 //enum jo hain class se attached hote hai --> Day as enum in Enum code --> intellij idea enum package.
 //examle --> intellij idea --> Main.java, day.java & dayclass.java and Maining.java 


public class Enum {

    
    public static void main(String[] args){

        int n = 5;
        int fact = 1; //fact ==> 1 not initialized 0.

        for (int i = 1; i <= n; i++) {
            fact = fact * i; 
        }
        System.out.println(fact + " is your factorial of " + n + "." );
    }
}
