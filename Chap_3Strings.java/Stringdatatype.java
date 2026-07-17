public class Stringdatatype {
    public static void main(String args[]){

        //1)String :
        //when we write the characters in a collection of sequentional characters is called String.
        // String is immutable(not change able).it has to memory to store data 1st is heap memory 2nd is insided in it  String pool memory.
        // String is a class and user defined datatype,String declaration and defination,
        //String is represented by directly use of literal and new() keyword.
        //char baar memory allocate nahi hogi in java 1st time string passed 
        //Strings having many methods to applied on String.
        //String pool optimization of memory to store string in string pool many variables with same data to store in String pool.
        //when we write 10 times amar panchal.... so the new memory is not created same memory me save ho in StringPool.
        //it is denoded as %s.
        //String is thread safe.
        //use for Storage String Pool(For Literals).
        //use Case: Small,Fixed texts.
        //execution time as performance medium or slow time.

        String x = "Mayank Kumar"; //stored in String pool
        String a = new String(x); //in new keywords wale hamesha heap memory me stored honge.// a is variable to store data of String datatype into heap memory allocate new memory String Pool.
        System.out.println(a);

        String b = new String(x); //stored in heap memory.
        System.out.println(b); 
        System.out.println(a == b); //a and b are different different locations // it will check the reference of both the string.

        String c = "Mayank Kumar"; //Stored in String pool.//same memory point locate karega String pool.
        String d = "Mayank Kumar";//Stored in String pool.
        System.out.println(c);  // same memory pointed for store in String Pool inside heap memory.
        System.out.println(d);  //same memory pointed for store in String Pool inside heap memory.
        System.out.println(c == d); 

    }

}
