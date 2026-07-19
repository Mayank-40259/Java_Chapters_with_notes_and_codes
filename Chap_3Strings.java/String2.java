public class String2 {

    //Lecture 10 : String Methods in Java with examples. 

    public static void main(String args[]){

        //jin methods ko hm class se access karte hai ve static methods.
        String name = "MayaNk KuMar";

        //1).length(): it tells the length of the String in integer number.

        System.out.println("1).length():");
        int length = name.length(); //denoted as.
        System.out.println(length); 
        System.out.println();


        //2). charAt(): it points the character in a string whose index value is point in charAt(_?)--> In String index Start from zero to (length-1).

        System.out.println("2). charAt():");
        char c = name.charAt(length-1);//denoted as.//5-->k.length-1-->last char of String is r.
        System.out.println(c);
        System.out.println();


        //3). equals() :it checks the equality between two String. and in integer value use compairing == to check equality.

        System.out.println("3). equals():");
        String name2 = "Mayank Kumar";
        System.out.println(name.equals(name2));//true when it is same //when it is different //checks between both name and name2.
        System.out.println(name.equalsIgnoreCase(name2));//name = MayaNk KuMar and name2 = Mayank Kumar true when gap is no b/w name2 so this is false when we check equality by ignore to get no error true or false.
        System.out.println();


        //4).compareto(): it compare the both String through ASCII value to int no. by substracting to find average.
        
        System.out.println("4).compareto():");
        String str1 = "remote";
        String str2 = "ramote";
        System.out.println('e' + 0); //asscii value of r is 114.
        System.out.println('a' + 0); //ascii value of c is 99.
        int i = str1.compareTo(str2); //difference Between any characters to charters of both the strings.//compare with str1 to str2 is 15.r-c//str2 to str2 is 0 c-c.str1 to str1 is 0 r-r.//str2 to str1 is -15 c-r.
        System.out.println(i);


        String m = "referf";
        String n = "REFERF";
        System.out.println(m.compareToIgnoreCase(n));
        System.out.println();


        //5).substring() : it exclude the last character from my choice to start character of sub string and acco.to length also.

        System.out.println("5).substring():");
        String name1 = "Amar Panchal";
        String substring = name1.substring(5, name1.length());   //(begining index ,end index last number or name.length() ).
        System.out.println(substring);
        System.out.println();


        //6).toUpperCase() : convert small letter into capital letter.

        System.out.println("6).toUpperCase():");
        String name3 = "mayank kushwah";
        System.out.println(name3.toUpperCase());
        System.out.println();


        //7).toLowerCase() : convert capital letter into small letter.

        System.out.println("7).toLowerCase():");
        String name4 = "SUSHIL KUSHWAH";
        System.out.println(name4.toLowerCase());
        System.out.println();


        //8).trim() : to delete the extra spaces present sided of String name.

        System.out.println("8).trim():");
        String name5 = "  Ashwani Kushwah  ";
        System.out.println(name5.trim());
        System.out.println();


        //9). replace() : when we replace the name or change of character in between String.

        System.out.println("9). replace():");
        String name6 = "Panchal Amar Panchal Panchal Panchal Panchal";
        String newName = name6.replace("Panchal","Kushwah").toUpperCase(); // (target:old char or old string,replacement: new char or new String);
        System.out.println(newName);
        System.out.println();


        //10). contains() : check String and Character is exists in your main string.

        System.out.println("10).contains():");
        String name7 = "Mayank Das";
        System.out.println(name7.contains("Das"));  //exists in main string. so it is True.
        System.out.println(name7.contains("ank"));  //exists in main string. so it is True
        System.out.println(name7.contains("pan"));  //not exists.
        System.out.println(name7.contains("chor"));  //not exists.
        System.out.println();


        //11). startsWith() && endsWith() : string starting character check && string last characters check.

        System.out.println("11). startsWith() && endsWith():");
        String name8 = "Aman Jadaun";
        System.out.println(name8.startsWith("Am")); //true
        System.out.println(name8.endsWith("un"));   //true
        System.out.println(name8.startsWith("Km")); //false
        System.out.println(name8.endsWith("au"));   //false
        System.out.println();


        //12). isEmpty() && isBlank() : string is empty no  && string is blank space or not.

        System.out.println("12). isEmpty() && isBlank():");
        String str = "   ";
        System.out.println(str.isEmpty()); //it checks before it is full --> true or not --> false.
        System.out.println(str.isBlank()); //it checks bunches of spaces or blanks between them.
        System.out.println();

        //13).indexOf() : index or length of string.
        /* length : it is basically size of array is defiend as arr[5] -->  total characters is 5 in string or array.
         * index : it is defined as the one less from size of String or Array n-1.*/

         System.out.println("13).indexOf():");
        int x = name8.indexOf("J");
        int y = name8.lastIndexOf("a");
        System.out.println(x);
        System.out.println(y);
        System.out.println();


        //14).valueof() :

        System.out.println("14).valueof():");
        int s = 10;
        String t = String.valueOf(s);
        System.out.println(t);
        System.out.println();


        //15). String.format() : it arranged the given data into agiven format.

        System.out.println("15).String.format():");
        String formattedStr = String.format("My name is %s,I am %d years old and I am enrolled in %s course.", "Mayank Kumar", 20, "BCA");
        System.out.println(formattedStr);
        System.out.println();


        //16).concat(): concatisation or + use also to add both the Strings.

        System.out.println("16).concat():");
        String name9 = "Rajan and Pankaj ";
        String name10 = "Mayank Kushwah";
        String name11 = "DRONE INDUSTRIES";
        String s1 = name9.concat(name10) +" "+ name11;
        System.out.println(s1);
        System.out.println();


        //17).split(): it splits the string into multiple parts based on a specified delimiter and returns an array of substrings.

        System.out.println("17).split():");
        String name12 = "My Name is Mayank Kumar";
        String parts[] = name12.split(" "); //spliting with space.
        System.out.print(parts[0]);
        System.out.print(parts[1]);
        System.out.print(parts[2]);
        System.out.print(parts[3]);
        System.out.print(parts[4]);
        System.out.println();
       
        //18).subSequence(): it is short not continuous string.
        System.out.println("18).subSequence():");
        String name13 = "Amar Panchal";
        System.out.println(name13.substring(2,8));
        System.out.println(name13.subSequence(2,8));
        //Arp is a subsequence of Amar Panchal.


        
    }


}
