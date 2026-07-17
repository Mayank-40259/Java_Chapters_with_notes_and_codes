public class WrapperClasses {


    //Wrapper class :- in intellij idea --> wrapperclass package.
    //what java is pure object programming language ?
    //--> Java is object orientted programming language but not pure OOPS.
    //ex. string class hain pr int class nahi hai.
    // int a = 1; --> a.no method/properties found as classes <-- String str = "Aman";
    // str.trim(); , str.concat("Mayank"); int same as float.<-- primitive datatypes.
    // List<int> a = new Arraylist<>(); --> error //type argument can not be primitive type. // not supports primitive type but Supports Wrapper classes.
    //bahut saari aisi cheeze hain jisme primitive datatype kaam nahi karega.
    //what works ?? --> Wrapper classes. works--> primitive data type --wrap kr degi--> Wrapper classes mein.
    // List<Integer> list = new Arraylist<>(); --> works no error shown Wrapper class.
    //--> Integer class wraps a value of primitive type int in an object.
    // (primitive datatype) ----> (Wrapper class -> object banyega).
    //    a is a primitive variable of int datatype (a is stored in Stack memory)  -----> Integer --> ek class hai --> a is a reference variable (a is stored in Heap memory).
    //       int a        -------->  Integer a (a is an object).
    //       float f      --------->  Float  f (f is an object).
        //float f = 1.2f;
        //Float f = 1.2f;
    //       long l       --------->  Long l (l is an object).
         // Long l = 123l;
    //       double d     ----------> Double d (d is an object).
         //Double d = 1.2;
    //       char ch      ---------->  Char ch (ch is an  object).
         // Character c = 'c';
    //       boolean b    ---------->  Boolean (b is an object).
          // boolean hasGraphicCard = true;  // hasGraphicCard stored in Stack memory as primitive variable.
        //  Boolean isAdult = true;   // isAdult is an object (reference variable) stored in Heap Memory.

    //       byte bb      ---------->  Byte bb (bb is an object).
        //Byte bb = 1;
    //       short ss     ---------->  Short ss (ss is an object).
        //Short ss = 2;
        
    //toh jb kabhi aapko primitive integer ko object me create karna ho toh Wrapper classes ka use kijiye.
    //boxing --> java automatically karta hai so known as autoboxing.

    //jb me Integer a = 12; --> a.method lo access karunga toh aayenge show honge.
    //
    //
    

    public static void main(String[] args){
        int num = 5;
        int fact = 1 ;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
            System.out.println(" factorial of " + num + " is " + fact);
        }
    }

}
