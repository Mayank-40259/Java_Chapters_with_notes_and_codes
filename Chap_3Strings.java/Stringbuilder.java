public class Stringbuilder {

    // Lecture 11 : StringBuilder and StringBuffer in Java with examples.
    // 

    //String declared with variables = "value" it is stored in StackMemory insided(Stringpool string literals).

    public static void main(String [] args){

        String str1 = "Hello";
        String str2 = "World!";
       String m = str1 +" "+ str2.concat(" in Java "); //not creating temporary class and string to add up. we were made string + string(words to sentences) into new string or variable store after print the variable used of concatenation(concat():).
        System.out.println(m); //1000 temporary string created in it and memory occupies more by temporary string so use not create temporary string new classes are arrives StringBuilder And StringBuffer.
        System.out.println(str1 + " "+str2.concat(" in Java"));

        String str3 = "Hello"; //String literal or new keyword.
        str3.concat(" World! "); 
        System.out.println(str3);
        //2).StringBuilder :
         //it is not thread safe 
        //String Builder is modified or reassign new string value in it. is called mutabale.
        //when we wants thread safe to use StringBuffer.
        //mutable (changable hai or modified kar sakte ho).
        //method chaining(add string operations and many morelike. str.append(" ").toString().reverse().CharAt()...).
        //immutable (no change in string constant cheeze ho string me.) & Thread Safety hai --> String use,Mutability & thread Safety --> String Buffer use,Mutability & No thread Safety & performance best --> String Builder use.
        //example of thread with using StringBuilder(Mutability And Not Thread Safety) in Test2.java.
       //performance fast because of (no synchronization in it).
       //use for Storage Heap Memory.
       //use Case. Single-threaded apps.
       //execution time: as performance high and fast time.

        StringBuilder sb = new StringBuilder("Hello ");
           sb.append("World!").append(" in JAVA ");//append() also works as concat().
           String string = sb.toString();//use of temporary String.
           System.out.println(string); //also stores string into temporary String .
           System.out.println(sb);  //sb is an object of StringBuilder Class ka .
           sb.append("2").replace(1,2,"ok");//h0e1l2l3o4 hello. 1 and 2 position  caracter will replace to ok hoklo.
           System.out.println(sb);

           //3).StringBuffer :it has thread safety.
           //and it is mutablable also but with thread safety.
           //example of thread with StringBuffer (mutability and ThreadSafety).in Test1.java
           //it do thread safety so 
           //performance slower due to Synchronization.
           //use For Storage Heap Memory.
           //use Case. Multi-threaded apps.
           //execution time: as performance low and medium time.

    }

}
