public class Loop {
    public static void main(String [] args){
        //1).while loop:
        System.out.println("WHILE LOOP");

        int i = 0; //initialization
        while(i < 10){ //condition check 
            System.out.println(i+ " Hello World! "); //statement 
            i++;  //increment and decrement.(updation)

        }
        System.out.println();

        //example of counting 
        int a = 1;
        while(a <= 50){
            System.out.println(a);
            a++;
        }
        System.out.println();

        //2).do-while loop:
        System.out.println("DO-WHILE LOOP");
        int b = 1; //initialization 
        do { 
            
            System.out.println(b +" Hello World!"); //statement
            b++; //increment and decrement (updation).

        }while(b <= 50);  //condition checks.

        //example of counting.
        int c = 100;

        do { 

            System.out.println(c); //one time execute because of condition is false.
            c++; 

        } while (c < 50); //100 < 50 --> false.
        System.out.println();

        //3).for loop:
        System.out.println("FOR LOOP");
        for(int j = 1; j<= 10; j++){ //(initialization; condition checks; updation);
              int m = j*12;
            System.out.println(m);  //statement.

        }
        //example of 
        // 1
        // 10
        // 100
        // 1000
        // 10000
        // 100000
        for(int k = 1,l = 1; l <= 6; k=k*10, l++){

            System.out.println(k);

        }
        //table of 7;
        for(int x = 1; x <= 10; x++){

            System.out.println(x +" x 7 = " +x * 7);
        }

        //sum of first 10th natural numbers.
        int sum = 0;
        int y = 1; 
        while(y <= 10){
            sum = sum + y;
            System.out.println(sum);
            y++;
        }
            System.out.println(sum);
        // count digits of a number.
        int n = 46734633;
        int res = 0;
        while(n > 0 ){
            n = n / 10;
            res++;

        }
        System.out.println(res);

        // factorial of a number.
        //5! = 5.4.3.2.1 = 120.

        int o = 5;
        int res1 = 1; //loop chalane ke liye always initialize 1.
        while (o > 0) { 
            res1 = res1 * o;
            o--;

        }

        System.out.println("Your result is : " +res1);

        //4). Nested for loop.
        int res2 = 0;
        for (int q = 0; q < 10; q++) { //10 bar 1 set ko chalane me maddad karega
            for(int j = 0;j < 10 ; j++){  // 10 ka ek set hai.

                System.out.println("Hello World");
                 res2++;
            }

             System.out.println(res2);

        }

        //used in pattern printing.
        for(int s = 1;s <= 6 ; s++){
            for(int d = 1; d <= s; d++){
                System.out.print("* "); //star print in triangle no use of println use print.
            }
                System.out.println();

        }
        System.out.println();

        //2nd example ulta star print.
        for(int x = 1; x <= 6; x++){
            for(int z = 1; z <= 6 + 1 - x; z++){ //n is no of stars you print n + 1 - i;

                System.out.print("* ");

            }

              System.out.println();

        }
        //Break and Continue.
        int w= 0;
        while(w < 1000){

             if(w == 500){
                break; //break or terminate the loop when if condition is true.

            }

            System.out.println(w);

             w++;

        }

        System.out.println("Hello World!");
        System.out.println();


        //continue use.
        int e = 1;

        while(e <= 11){

         if(e == 5){
            e++; //for continuous loop is working.
           continue; //5 is missing in output because of to continue the loop.

              
             }
            // if(e != 5){
            //       e++; //for continuous loop is working.
            //     continue; //all numbers are missing and 5 is in output because of 

            // }

            System.out.println(e);
            e++;

        }

        System.out.println("Hello World!");
      // in for loop continue or break .
      for(int t = 1; t <= 10; t++){

        // if(t == 5){
        //     break;
        // }
        if(t == 6){
            continue; //6 is missing because of last iteration to continue a loop.
        }
        System.out.println(t);

      }

    }

}
