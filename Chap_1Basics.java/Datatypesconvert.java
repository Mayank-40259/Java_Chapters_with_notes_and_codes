public class Datatypesconvert {
    public static void main(String[] args) {
        //Conversion between datatypes 2.Narrowing Conversion means forcefully convert karna is called Narrowing Conversion.
        double doubleValue = 123.456; 
        float floatValue = (float) doubleValue;  //Narrowing conversion from double to float
        long longValue = (long) floatValue;  //Narrowing conversion from float to long
        int intValue = (int) longValue;  // Narrowing conversion from long to int  

        System.out.println("double: " + doubleValue);
        System.out.println("float: " + floatValue);//float holds larger value in scientific notation. ex . float a = 1234.56789123. -> 1234.3456E30.
        System.out.println("long: " + longValue);
        System.out.println("int: " + intValue);
        System.out.println(Integer.toBinaryString(-1));
        

    }

}
