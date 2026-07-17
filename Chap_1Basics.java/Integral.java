class Integral {
    public static void main(String[] args){
         //integral number
         //byte
         //short
         //int
         //long
         byte age1 = 127;
         short age2 = 32767;
         int age3 = -2147483648;
         long age4 = 2147483649l;

        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println(Byte.MAX_VALUE);//-127

        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.MAX_VALUE);//32767

        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Integer.MAX_VALUE);//2147483647

        System.out.println(Long.MIN_VALUE);//-9223372036854775808
        System.out.println(Long.MAX_VALUE);//9223372036854775807

    }

}
