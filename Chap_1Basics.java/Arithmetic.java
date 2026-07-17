public class Arithmetic {

    // Lecture 3). : - Arithmetic operators in Java with examples Revice.

    public static void main(String args[]){

        //Remainder.
        int a = 5;
        int b = 2;
        int c = a % b;

       //int to double or double to int.
        int d = 5;
        double e = 11.4;      //literal direct number value 16.4.  //double of 8byte convert into int of 4byte.No because of int has 4byte only.
        int f = d + (int)e;   //by typecasting //int of 4byte convert into double 0f 8byte. yes by typecasting and variable storage.
        double m = d + e;     //by variable datatype declaration 
        
        //long to float.
        float x = 12.2f;     // jb dohighest value number ko add karte hai tb use int with size see hold kr sakta hai.or to use long.
        long  y = 23723;    //when we put long y is high values so precision loss by v float datatpe.convert into notation 1.2 * 10^somthing.
        float v =  x + y;  //float can hold larger values by scientifiic notation no matters with bytes 4 of float. //all same are in substraction case.

        //multiplication of integer out of extend limit of integer. 
        int z = 434567845;
        int i = z * 23223;

        //multiplication of long.
        long n = 434567845;
        long p = n * 23223;

        //int quotient.
        int o = 10;
        int q = 3;
        int quotient = o / q;

        //double/int gives float or decimal and double value of quotient1.
        double l = 10;
        int r = 3;
        double quotient1 = l / r;

        //float/int gives float or decimal value of quotient2.
        float t = 10.0f;
        int g = 3;
        float quotient2 = t / g;

        //divide by zero in programming languages is not possible.
        // int h = 2;
        // int j = h - 2;
        // int s = h / j;
        
        //expression simplification or BODMAS by precedence.
        //in case of division and multiplication use precedence from left to Right.

        int result = (5 + 3) * 2;  //A -> M
        int a1 = 10, b1= 5;
        int result1 = a1 / b1 + 3;  //D -> A
        int result2 = a1 / b1 * 3;  //D -> M  
        int result3 = a1 / b1 + 3 * 2 - 1;  //D -> M -> A ->S.
        
        //shortcut of Compound assignment operator.
        int a2 = 10,a3 = 20,a4 = 30,a5 = 40,a6 = 50;
        a2 = a2 + 1; // we write this a2 += 1;
        a3 -= 1;   //19 
        a3 += 3;  //22
        a4 *= 4;
        a5 /= 5;
        a6 %= 2;
        byte a7 = 10;
        a7 += 5;
       // a7 = a7 + 5;//->a7 = (byte) (a + 5);  //not possible conversion from int to byte except typecasting.
        

       //Shortcut for increment decrement operators.
       //increment and decrement precedence is high from divi.,multi.,add.,subst.  ......etc.
       int a8 = 99;
       //int a9 = a8++ + a8;   //a9 = 99(post increment pehle use karo) + 100(print ke sath increment karo) => 199.
       //int a10 = ++a8 + a8;  //a10 = 100(pre pehle increment karo) + 100(already wala) => 200.
       int b2 = a8 + (++a8); // by presedence use brackets b2 = 99 + 100 => 199.
    

        System.out.println(c); 
        System.out.println(f);
        System.out.println(m);
        System.out.println(v);
        System.out.println(i); //integer ki range se bahar hai -1204081165.
        System.out.println(p);  //same answer matched with calculator.
        System.out.println(quotient); //int/int == int.
        System.out.println(quotient1); //double / int = priority more of double because of size == double.
        System.out.println(quotient2); //float(decimal number) / int == float (decimal number).//pressesser kam ho gaye 3.3333333333335 to 3.3333333.
        //System.out.println(s);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);
        System.out.println(a8);  //a8 = 100.
       // System.out.println(a9);  //a9 = 99.
        //System.out.println(a10);   // --a8 => a8 = 99 -> 100 = --a8 -> 100-1 = 99 = --a8.
        System.out.println(b2);      //a8++ => a8 = 99 -> 100 = a8++ ->100 use kiya 100 + 1 = 101 = ++a8.
        System.out.println(a8++ + --a8); // 101 + 99 =>200.

        
    }


}
