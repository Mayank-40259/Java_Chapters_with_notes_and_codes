public class RelationalOperators {

    public static void main(String[] args){
     //relational operators : Relational operators compare two values and return a boolean result.
      System.out.println("Relational Operators");
     //1). int datatype.
     System.out.println("INT Datatype");
     int a = 10;
     int b = 20;
     boolean c = a <= b; //true
     boolean d = a >= b; //false
     boolean e = a == b; //false
     boolean f = a > b;  //false
     boolean g = a < b; //true
     boolean h = a != b; //true

     System.out.println(c);
     System.out.println(d);
     System.out.println(e);
     System.out.println(f);
     System.out.println(g);
     System.out.println(h);

     //2).char datatype.
     System.out.println("CHAR Datatype");
     char m = 'z';
     char n = 'a';
     System.out.println('z' + 0);
     System.out.println('a' + 0);
     boolean p = m < n;  //122 < 97.
     System.out.println(p);
     String str1 = "Pool";
     String str2 = "Pool"; 
     String str3 = new String("Pool");
     System.out.println(str3 == str2); //str2 points to string pool //str3 points to string heap memory stores.
     System.out.println(str1 == str2);
     System.out.println();

     //logical operators : when we joins or combines two or more conditions or booleans expressions,boolies by use of logical operators.
     //logical AND (&&) : 3 case of false and 1 case of true.
     //Logical OR (||) : 1 case of false and 3 cases of true.
     //logical NOT (!) : both true or not depends upon situations.

     // exam - 100 marks --> 33 above passed, age --> 18(mini.)  to 24(maxi.).
     System.out.println("Logical Operators");
     //1).Logical AND (&&):
     int ramMarks = 35;
     int ramAge = 50;
     System.out.println(ramMarks >= 33 && ramAge <= 18); //AND --> true && false --> false.

     //2).Logical OR (||):
     String name = "Ram";
     int exp = 2;
     boolean tier1 = true;
     System.out.println(exp >= 5 || tier1); //OR --> false || true.--> true

     //3).Logical NOT (!):
     System.out.println( !(2 < 3)); //false //2<3 --> true !(2<3)--> not(2<3) nahi he matlab uska ye hai 3<2 hai --> false hogi.
     System.out.println();

     //conditionl Statements:
     System.out.println("Conditional Statements");

     //1).if and if else conditions.
     //age example.
     int age = 20;

     if(age >= 18){

        System.out.println("You Are An ADULT");

     }
     else{

        System.out.println("You are both Youngs or UnderAged");

     }
    //marks example.
    int age1 = 50;
    int marks = 35;
    //  33/100 age 20.
    if(age1 <= 20 && marks >= 33){  // false && true --> false.

        System.out.println("Congratulations you are passed.");

    }
    else{

        System.out.println("Sorry to say You are Failed in your exam Better luck next time");

    }
    //true in condition for sout. message ko hamesha chalane ke liye.
    if(true){

        System.out.println("Hello World !");

    }
    //marks ke hisab se grade wala program example.
      int marks1 = 75;
      //marks 90 A
      //marks 75 B
      //marks 60 C
      //D
    if(marks1 <= 100 && marks1 >= 90){
        System.out.println("Grade A Excellent Student");
    }
    else if(marks1 >= 70 && marks1 <=90){
        System.out.println("Grade B Topper Student");
    }
    else if(marks1 >=55 && marks1 <= 70){
        System.out.println("Grade C Average Student");
    }
    else if(marks1 >= 45 && marks1 <= 55){
        System.out.println("Grade D Normal Student");
    }
    else if(marks1 >= 33 && marks1 <= 45){
        System.out.println("Grade E Backbencher Students");
    }
    else if(marks1 >= 00 && marks1 < 33){
        System.out.println("Grade F for FAIL");
    }
    else{
        System.out.println("Invalid Marks");
    }
    //if else if ladder statements.
    int day = 4;
    if(day == 1){
        System.out.println("Monday");
    } else if(day == 2){
        System.out.println("Tuesday");
    } else if(day == 3){
        System.out.println("Wednesday");
    } else if(day == 4){
        System.out.println("Thursday");
    } else if(day == 5){
        System.out.println("Friday");
    } else if(day == 6){
        System.out.println("Saturday");
    } else if(day == 7){
        System.out.println("Sunday");
    } else {
        System.out.println("Invalid Day");
    }

    //same if else-if ladder use switch case to made simple calculator and much more.....
    int month = 10;
    switch (month){
        case 1:{
            System.out.println("January");
            break; //it work to terminate or break the loop or block of code.
        }
        case 2:{
            System.out.println("February");
            break;
        }
        case 3:{
            System.out.println("March");
            break;
        }
        case 4:{
            System.out.println("April");
            break;
        }
        case 5:{
            System.out.println("May");
            break;
        }
        case 6:{
            System.out.println("June");
            break;
        }
        case 7:{
            System.out.println("July");
            break;
        }
        case 8:{
            System.out.println("August");
            break;
        }
        case 9:{
            System.out.println("September");
            break;
        }
        case 10:{
            System.out.println("October");
            break;
        }
        case 11:{
            System.out.println("November");
            break;
        }
        case 12:{
            System.out.println("December");
            break;
        }
        default :{
            System.out.println("Invalid Months");
        }

    }
    //ternary operator : it is a one line if-else statement.
    int number =  10,number2 = 30;
    int res4 = (number > number2) ? number - number2 : number + number2;
    System.out.println("Your result is :" + res4);

 }


}
