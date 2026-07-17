public class Bitwiseoperators {
    public static void main(String args[]){
        // Computers data saved in binay language 0 and 1 --> 0 1
        int a = -5;
        int b =7;
        /*System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));*/
        // 00000000 00000000 00000000 00000101 --> 5
        // 00000000 00000000 00000000 00000111 --> 7
        //all leters are stored in 32 bits (binary bits (4 bytes)).
        //when you are playing with binary use bitwise operators. and it is directly applying for no. ki bits pr(&, |, ^, ~, <<, >>).
        //operands should be in binary form.integral value --> byte short int long char.
        //and operator & 
        // or operator |
        // xor operator ^
        // not oprator ~
        // left shift operator <<
        //right shift operator >>
        //unsigned right shift operator >>>
        

        //1). AND OPERATOR (&) [Multiplication].
        int c = 5 & 4;//7 --> 4.
        System.out.println("AND OPERATOR");
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(4));
        System.out.println(c);


        //2). OR OPERATOR (|) [Addition].
        int d = 5 | 4; //7 --> 4.
        System.out.println("OR OPERATOR");
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(4));
        System.out.println(d);


        //3). XOR OPERATOR (^) [same is zero and different is 1].
        int e = 5 ^ 4; //7 --> 4.
        System.out.println("XOR OPERATOR");
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(4));
        System.out.println(e);

        
        //4). NOT OPERATOR (~) [0 to 1 and 1 to 0 and vice-versa].
        int m = ~a; //a = 5.
        System.out.println("NOT OPERATOR");
        System.out.println(Integer.toBinaryString(5));
        System.out.println(m);//-6
        System.out.println(Integer.toBinaryString(m));


        //5). LEFT SHIFT OPERATOR (<<) [Shift the binary to left side].
        int l = a << 2;//a = 5;<<1
        System.out.println("LEFT SHIFT OPERATOR");
        System.out.println(Integer.toBinaryString(5));//a-->5-->101.
        System.out.println(l);//jo shift hoga fir jo binary banega vo kiska binary hoga. 00001010-->10.
        System.out.println(Integer.toBinaryString(l));


        //6). RIGHT SHIFT OPERATOR (>>) [Shift binary to right side].
        int r = a >> 2;//a = 5;//>>1
        System.out.println("RIGHT SHIFT OPERATOR");
        System.out.println(Integer.toBinaryString(5));//a-->5-->101.
        System.out.println(r);//jo shift hoga fir jo binary banega vo kiska binary hoga. 0010-->2.
        System.out.println(Integer.toBinaryString(r));
        

        //7). UNSIGNED RIGHT SHIFT OPERATOR (>>>) [].
        int u = a >>> 2;//>>>1//a = 5.when a is +ve so the 31 zero before bit of u = 1.00000000000000000000000000000101.
        //when it is -ve so the 31 one before bit of u = 1. 11111111111111111111111111111101.
        System.out.println("UNSIGNED RIGHT SHIFT OPERATOR");
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(5));
        System.out.println(u);
        System.out.println(Integer.toBinaryString(u));//31 bits 00000... me se 2 hat jayegi -ve form of a 30 bit dekhengi 1111...//in case of -ve no. it will always give +ve no. because 31 one will be replaced by 0.
        


    } 

}

