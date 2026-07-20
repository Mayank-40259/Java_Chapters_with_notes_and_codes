public class Arrays {


  // Lecture 14). :- Arrays in Java with For-each loop and some important questions.


	//Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
   //Arrays : it is collection of same type of element and similar kind of data is called Arrays.
  //Syntax : datatypename[] variableName;-->int[] integerArray; //int a = 1; 1 is stored in container a as variable name.int as datatype.
  //[size of array] property of array is length holds size of the Array. 

  /* Heap Memory:
   * size of Array = Length of Array.
   * +---+---+---+---+---+
   * | 0 | 0 | 0 | 0 | 0 |   <--  Array object (of 5 integers) in heap memory.
   * +---+---+---+---+---+
   * ^
   * |
   * Stack Memory: starting array address and reference store karega.
   * arr(reference of integer datatype).
   */

   /* Stack Memory:
    *  +------------------+
    * |  arr (ref)        |  --> 0x1A2B3C
    * +------------------+
    * 
    * Heap Memory:
    * Address: 0x1A2B3C
    *    0   1   2   3   4  = index values = (max.length of Array - 1).
    *  +---+---+---+---+---+
    * | 0  | 0 | 0 | 0 | 0 |  <-- Array of 5 integers
    * +---+---+---+---+---+
    *
    */


  public static void main(String [] args){
    //#1).One-Dimensional Array.
     //defination = declaration of array.
     //type[] variableName.
    int[] arr = new int[20];//arr = reference variable same as String S.array of integers ko refers kr raha hai.//10,20

    //int[size of array] arr = to int arr[size of array]
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 4;
    arr[4] = 5;
    arr[5] = 6; //at index 5 pr value store hai 45 of same integer datatype ki.
    arr[6] = 7;
    arr[7] = 8;
    arr[8] = 9; //at index 5 pr value store hai 55 of same integer datatype ki.
    arr[9] = 10; //at index 5 pr value store hai 65 of same integer datatype ki.
    arr[17] = 16;
    arr[18] = 17;
    arr[19] = 18; //index value is 20-1 = 19 it is correct.
    //arr[20] = 19;// length of array arr = 20  //out of bounds for length 20 not in index because of length - 1 = index of Array.

    System.out.println("index value at 0 :" +arr[0]);//arr[0] pr kya value store hai array ki.//print array through arr variable array using index as length.
    System.out.println("index value at 1 :"  +arr[1]);
    System.out.println("index value at 2 :"  +arr[2]);
    System.out.println("index value at 3 :"  +arr[3]);
    System.out.println("index value at 4 :"  +arr[4]);
    System.out.println("index value at 5 :"  +arr[5]);
    System.out.println("index value at 6 :"  +arr[6]);
    System.out.println("index value at 7 :"  +arr[7]);
    System.out.println("index value at 8 :"  +arr[8]);
    System.out.println("index value at 9 :"  +arr[9]);
    //variable.length ==> example int[] arr10 ==> arr10.length.
    System.out.println(arr.length); //property of array (obj.&reference),arr.length not method it is property. as String Methods.
    String str = "Mayank and Vipul Tyagi";
    System.out.println(str);
  
    for(int i = 0;i < 20; i++){  //index toh 19 tak hi hoga arr[i==index==0 to 19].
        
        System.out.println(arr[i]); //traversing an Array.

    }
    System.out.println();

    //1).Address and hashcode. //using for loop to print array.
    int[] arr3 = {1, 2, 3, 4};
    int[] arr4 = {1, 2, 3, 4};

    System.out.println(arr3); //I@251a69d7 --> Before @ any datatype Capital letter
    System.out.println(arr4); //I@7344699f --> datatype --> (Int-->I,Char-->C,float-->F,Boolean-->B,short-->s,byte-->b,Long-->L,double-->d).


    System.out.println();

    //2).method to declare Array.
    int[] arr1 = new int[5]; //by default zero hoga index 0 to 4-->5 tk hai unki value store vali zero hogi.
    int[] arr2 = {1, 12, 3, 4};

    for(int j = 0; j < arr1.length; j++){

        System.out.println(arr1[j]);

    }
    System.out.println();

    for(int m = 0; m < arr2.length; m++){ // i = index i-->0 to i-->3.

        System.out.println(arr2[m]);

    }
    System.out.println();
    //3).For each loop:used for Arrays works in group of data or collection it is only in Arrays.
    //Syntax: for(initialization int 1: aar1(loop kish pr lagana hai)){ System.out.println(i);
    //  }
    for(int i: arr2){

      System.out.println(i); //directly print numbers in an Array. //i = store karta hai value aar2 ko

    }
    System.out.println();

    //Q1).Search an element in an Array.
    int arr5[] = {1, 4, 2, 55, 7, -2};
      for(int m: arr5){
        if(m == 55){

          System.out.println("Found");//55 hoga tb print hoga found.

        }

      }
        System.out.println();

      //Q2).Find max. Element.
      int[] arr6 = new int[6]; 
      arr6[0] = -23;
      arr6[1] = -25;
      arr6[2] = -27;
      arr6[3] = -29;
      arr6[4] = 31;
      arr6[5] = -33;
      int res = Integer.MIN_VALUE; //Integer.MIN_VALUE is negative infinity.//0  res is 0 ans is zero.

      for(int n = 0;n < arr6.length; n++){

        if(arr6[n] > res){

        res = arr6[n];

        }

      }
      System.out.println(res);
      
      System.out.println();

      //Q3).reverse print array.
      int[] arr7 = {1 ,23 ,32 ,42 ,545 }; //index = length - 1.--> index = o(initialization) and arr7.length - 1.
      for(int o = arr7.length - 1; o >= 0; o--){
        System.out.println("Reverse of array with index "+ o +" is: " +arr7[o]);

      }
      System.out.println();

      //Q4).Sum of Array.
      int[] arr8 = {12 , 24 ,36 , 48 , 60};
      int sum = 0;
      for(int t = 0; t < arr7.length; t++){

        sum = sum + arr8[t];
         
      }
      System.out.println(sum);
      //Q5).Sum of Array using for each loop.
      int sum1 = 0;
      for(int p : arr8){
        sum1 += p;
        
      }
      System.out.println(sum1);
      System.out.println();
      
    //#2).Two-dimentional array.using 2 components i  and j as matrix.
    //Syntax --> int[][] arr = new int[3][3]; 2-D Matrix Created.
    /*arr : [i=3][j=3] ==> 
     +---+---+---+
     | 0 | 0 | 0 |  -->  arr[0].
     +---+---+---+
     | 0 | 0 | 0 |  -->  arr[1].
     +---+---+---+ 
     | 0 | 0 | 0 |  -->  arr[2].
     +---+---+---+
     */
    int[][] arr9 = new int[3][3];
    int[][] nums = { //directly write the values of arrays.
      {1, 2, 3}, //nums 0 = index.
      {4, 5, 6}, //nums 1 = index.
      {7, 8, 9}  //nums 2 = index.

    };

    //when we access the 6 in 2nd rows as index=1 and in 3rd column as index 2.
    System.out.println(nums[1][2]); //6
    System.out.println(arr9.length); //3
    System.out.println(nums.length); //3
    System.out.println();

    //Traversing of two dimensional Array.
    // for(int k = 0;k < 3; k++){
    //     for(int l = 0;l < 3;l++){

    //      // System.out.println(nums[k][l]);
    //      System.out.print(nums[k][l] + " ");

    //     }
    //       System.out.println();  //println incude next line feature also.

    //   // System.out.println(nums[k]); //directly not print using nested loop for two dimensions using two components.
    //   // //print wrong things hascode.
      
      //working of 2d array as:
      int[][] arr10 = new int[3][3]; //all are zeroes  when we not assigning the value of Arrays.
      //indivisually write the Array.

      arr10[0][0] = 123;
      arr10[1][1] = 456;
      arr10[2][2] = 789;

      System.out.println(arr10[0][0]); //123
      //System.out.println(arr10[0][1]);       //0  
      //System.out.println(arr10[0][2]);       //0
      //System.out.println(arr10[1][0]);       //0
      System.out.println(arr10[1][1]); //456
     // System.out.println(arr10[1][2]);       //0
      //System.out.println(arr10[2][0]);       //0
      //System.out.println(arr10[2][1]);       //0
      System.out.println(arr10[2][2]); //789

      //Using Char Datatype arr[i=Rows][j=Columns]. 
      //Character Array ==> using of char datatype in Array.
      char arr11[][] = new char[3][2]; //no. of elements is m x n = 3 x 2 = 6.
      arr11[0][0] =  'A';
      arr11[0][1] =   'a';
      arr11[1][0] =   'z';
      arr11[1][1] =   'Z';
      arr11[2][0] =   '?';
      arr11[2][1] =   '@';

      for(int d = 0;d < arr11.length;d++){
        for(int c = 0;c < arr11[d].length; c++){  //c < arr11.length ----> c < arr11[d].length index 0 to 2 length is 3 but the second component has length 2 index is 0 to 1. 

          System.out.print(arr11[d][c] + "  "); //column me c ko kitni baar loop karna hai  2 baar.

        }    /* output is :
              Jagged Arrays : Arrays of different length Array hogi usko Jagged Array kahte hai.
               A a
               z Z e //hosakta hai condition aisi bhi ho jaye ishe kahte hai jagged Array. 
               ? @  
                */
          System.out.println();

      }

       System.out.println();

       //Example of Jagged Array.
       char[][] arr12 = new char[4][];
      arr12[0]/* index of arr12 */ = new char[2]; //size of array of j components.     
      arr12[1]= new char[3];
      arr12[2] = new char[2]/*kitne elements define karoge in arr12[2] under*/;
      arr12[3] = new char[4]; //index of c1 is 4-1= 3 

      arr12[0][0] = 'T';
      arr12[0][1] = 't';
      arr12[1][0] = 'M';
      arr12[1][1] = 'm';
      arr12[1][2] = 'N';
      arr12[2][0] = 'P';
      arr12[2][1] = 'p';
      arr12[3][0] = 'n';
      arr12[3][1] = 'Q';
      arr12[3][2] = 'q';
      arr12[3][3] = 'W';

      for(int m = 0; m < arr12.length; m++){
         for(int n = 0; n < arr12[m].length; n++){

          System.out.print(arr12[m][n] + " "); //Jagged Arrays.

         }

        System.out.println();
        
      }

      System.out.println();

  }

}