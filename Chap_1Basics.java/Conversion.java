public class Conversion {
    public static void main(String[] args){

        int a = 10;  // 4 bytes 
        long b = a;  // 8 bytes
        float c = a; // 4 bytes //int to float

        float f = 1.7f;
        int g = (int) f;   // float to int //not automatically done by java because of loss 0.7 is round off.

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(g);
        
    }

}
