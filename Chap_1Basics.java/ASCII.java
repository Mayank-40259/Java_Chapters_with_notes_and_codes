public class ASCII {

    // Lecture 5). : - ASCII table in Java with examples Revice.

    public static void main(String[] args){


        // ASCII table is a character encoding standard for electronic communication. 
        // ASCII codes represent text in computers, telecommunications equipment, 
        // and other devices. Most modern character-encoding schemes are based on ASCII, 
        // although they support many additional characters.


        // ascii values printing.
        for(int i=0;i <= 128;i++){
            if(i >= 0 && i <= 32){ // 0 to 32 are control characters and space character.
                System.out.println(i + " : Space and control characters are not printable.");
                continue;
            }
            System.out.print(i + " : ");
            System.out.println((char)i);

        }
    }

}
