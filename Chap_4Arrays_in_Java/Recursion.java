public class Recursion{
                  
    //function call by itself that is called recursive function.
    //Recursion : when any method call itself that is called Recursion.
    public static int factorial(int n){

    //   int res = 1;

    //   for(int i = 1; i <= n; i++){
    //     res *= i;
    //   }
    //     return res;
    if(n == 1){

        return 1;

    }
      //5! --> 5 * 4!.
        return n * factorial(n-1);
 /*factorial(5) calls factorial(4)
 factorial(4) calls factorial(3)
 factorial(3) calls factorial(2)
 factorial(2) calls factorial(1)
 factorial(1) calls factorial(0)
 factorial(0) returns 1 (base case reached)
 factorial(1) returns 1 * 1 = 1
 factorial(2) returns 2 * 1 = 2
 factorial(3) returns 3 * 2 = 6
 factorial(4) returns 4 * 6 = 24
 factorial(5) returns 5 * 24 = 120 */
//Call Stack --> part of memory to tracks the method calls using stack (lifo principle ---> last in first out) based.
//recursion stores in stack.

    }
    public static int sum(int x){
    //     // 5 + 4 + 3 + 2 + 1 = 15.
    //     //5! = 5 * 4!.
    //    int sum = 0;
    //    for(int j = 1; j <= x; j++){
    //        sum += j; //sum = sum + j;
    //        System.out.println("Factorial : " +sum);
    //    }
    //     return  sum; //return sum  + sumOfNaturalNumber(n-1); 5 + sumof4naturalnumber.
      if(x == 1){
        return 1;
      }
      return x + sum(x-1);
      
    }
    public static int multiple(int y){
        
        for(int k = 1;k <= 10; k++){
            y = y * k; //a = a * k;
            System.out.println("Multiple : " +y);
        }

        return y;
    }


    public static void main(String args[]){

       System.out.println(" Your factorial is = "  + factorial(5));
      //5! = 5*4*3*2*1 = 120. or 5*4!.---> n*factorial(n-1).
       System.out.println(" Your sum of 5 natural numbers is = " +sum(5));

       System.out.println("your multiple of 5 is : " +multiple(5));

    }

}
