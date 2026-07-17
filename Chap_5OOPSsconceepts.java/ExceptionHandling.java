public class ExceptionHandling {


    //Exceptional Handling : topics to be covered. ---> error.java in intellij idea.
    //try-catch block ---> Exception.java wali file in intellij idea.
    //Exceptions all types --> hierrarchy & catch block exception to handle it. --> same.
    //Exception handling. --> same.
    //Tostringmethod --> same.
    //Stack Trace  ---> Classic.java in intellij idea.
    //Checked or Unchecked Exception --> same + Test.java + Throws in intellij idea.
    //throws and throw keyword usecase. -->Test.java + Throws.java in intellij idea.
    //finally keyword. --> finally.java + reader.java
    //try-with-resources --> resources.java + reader.java 
    //Custom exceptions. --> custom.java --> InsufficientFundsException.

    

    //-->The Exceptional Handling is a way to handle the runtime errors so that the normal.
    //flow of the application can be maintained. or 
    //-->Exception is an event that distrupts the normal flow of the program. it is an object which is thrown at runtime.
    //--> coding me compiler ek ek line ko step by step compile karta hai toh hr line ki statements ko check karta hai l1,l2,l3,l4,l5(error or 40/0  --> yahi code fat jayega or ruk jayega ishi error ko exception khte hai or ishi ko handle karne ko exceptional handling kahte hai.),l6,l7;
    //example : intellijidea.
    //-->There are three types of error :-


    //-->1).Syntax error( ye error jb aati hai jb hm koi symbol or syntax of programming language me error kr de tb aati hai jaise --> comments,semicolon,parenthesis,equal operator .... etc. ).
    //-->ye or iska code compile nahi hoga. --> compile hone se phle hi error dikha dega.
    //-->
    //-->


    //-->2).Logical error(apko kuch diya gaya hai karne aapne kuch or hi kar diya hai. jaise multiply na kara ke --> divide kara diya hai hm ne. in  a method --> intellij idea example exception error.java)
    //-->ye toh compile bhi ho jayega pr kuch or hi kaam kr raha hoga jaise operator me galti multiple karne ki jagah divide na ho jai jaisa kuch.
    //-->
    //-->
   //dono hi error hote hai (Syntax error) and (Logical error) programmer ki galti se hote hai.


    //-->3).Runtime error(compile hone ke baad me koi error nahi aayi pr jb run karte time pr error aaye toh usko khte hai runtime error.)
    //-->code chalne or run hone ke doraan error aa sakti hai.
    //-->
    //-->

    //ex. hai ye run time error ka.
    //can i say this program will run perfectly. --> no <--answer hai.
    //program will run except some cases. So we will handle those exceptions.
    //--> Program will crash during run time error.

    /*public class Test{
    /* public static void main(String[] args){
    int[] numerators = {10, 200, 30, 40};
    int[] denominator = {1, 2, 0, 4};
    for(int i = 0; i < numerators.length; i++){
            System.out.println(divide(numerators[i], denominator[i]));
          }
            System.out.println("Good job :");
       }
            //ye code chal toh jaa yega intellij idea mein pr dikkat hogi ek kya--> 10 /n 100 /n zero not divide any of digit --> infinity.

    } */

        public static int divide(int a, int b){
        return a / b; // 20/40 --> 1/2 --> 0.5 --> 0 (expected ==> approx 0).
        }

    public static void main(String[] args) {

        int a = 20, b = 40;

        System.out.println(divide(20,40));
        System.out.println(" Hello World ");
    
    }

    
}
