public class Println{
    public static void main(String args[]){

        //difference between println(),printf() and print().
        System.out.println("Hello World!");
        System.out.println(1);
        System.out.println(2);
        System.out.print(5);
        System.out.print("x");
        System.out.print("Hello World");
        System.out.println();
        int a = 1;
        int b = 2;
        String c = "Sum";
        System.out.println(a + b + c);
        System.out.println(c + a + b); // use brackets to pritrize oprators().
        System.out.println("Hello" + " " + "World!");
        System.out.println(c + " of " + a + " & " + b + ": " + (a + b));
        System.out.print(c + " of " + a + " & " + b + ": " + (a + b) + "\n");
        System.out.printf(c + " of " + a + " & " + b + ": " + (a + b) + "\n");
        System.out.println("Hello");
        System.out.printf("%s of %d & %d is: %d", c, a, b, a+b);
        char d = 'a';
        float e = 12.24f;
        System.out.println();
        System.out.printf("%c %.2f ", d, e); //%.2f two digit after decimal --> 0.12.
        /* %d --> integer int datatype (4 Byte).
        * %f --> decimal float datatype (4 Byte).
        * %c --> character char datatype (2 Byte).
        * %s --> namingwithcombinedcharacters string datatype ()
        * %b --> true and false  boolean (1 bit).
        * %e --> exponential format
        */
        System.out.println();

         double number = 1234567.89;

         //default locale
         System.out.printf("Default locale: %,.2f%n", number); // 
         
         //US locale
         System.out.printf("US locale: %,.2f%n", number); // 1,234,567.89

         //German locale
         System.out.printf("German locale %,.2f%n", number); // 1.234.567,89

         //French locale
         System.out.printf("French locale: %,.2f%n", number); // 1 234 567,89
         
         
    }
    

}
