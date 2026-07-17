public class Characters {
    public static void main(String[] args){

        //Characters datatype
        //char
        char initial = 'z';

        System.out.println(initial);
        System.out.println((int) initial);

        String name = "Ajay";
        System.out.println(name);

        // System.out.println(Character.MIN_VALUE);
        // System.out.println(Character.MAX_VALUE);
        System.out.println((int) Character.MIN_VALUE);
        System.out.println((int) Character.MAX_VALUE);
        char heartSymbol = (char) 10084;
        char hindChar = 2309;
        char heart = '\u2764';  //unique code representation.
        System.out.println(heart);
        System.out.println(hindChar);
        System.out.println(heartSymbol);

    }

}
