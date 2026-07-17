public class Dataconvert{
    public static void main(String[] args){
        //conversion between datatypes. 1.Widening COnversion is to convert data according to datatypes.  
        byte byteValue = 10;  // 1 byte
        short shortValue = byteValue;  // 2 bytes
        int  intValue = shortValue;    // 4 bytes  //automatic conversion = widening conversion = implicit conversion.
        long longValue = intValue;     // 8 bytes //Widening conversion from int to long
        float floatValue = longValue;  // 4 bytes //Widening conversion from long to float
        double doubleValue = floatValue;  // 8 bytes //Widening conversion from float to double
        char charValue = 'A';
        int intValueChar = charValue; //Widening conversion from char to int.
        float floatValueChar= charValue;  //Winding conversion from char to float

        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("int: " + intValueChar);
        System.out.println("float: " + floatValueChar);


    }

}
