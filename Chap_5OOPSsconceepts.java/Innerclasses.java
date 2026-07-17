public class Innerclasses {


    //Exploring Inner Classes in java : Static,Member,Local and Anonymous Types.
    //Inner class --> 1).nested class 2).Static class 3).Anonymous inner class.


    //there are four types of inner classes.
    //example hai intellij idea me Innerclass Package karke.


    //1).Member Inner Class.
    //--> inner member associated class hoti hai outer class se jaise example. Car(outer class) --->|member inner class|---> Engine(inner class).
    // -->class ke insided class hogi ek or pr vo class outer class ki member hogi that is called member inner class.
    //-->example inner class package or inner another class package intellij idea.



    //2).Static Nested(Inner) Class.
    //-->memory mangement faltu ki memory km use hoti hai.
    //--> static classes jaise cd,dvd,usb computer se jod sakte hai hm. dusri class se access kr sakte hai hm.
    //-->example staticnestedclass intellijidea.



    //3).Local Inner Class:
    //-->jo method (reserveRoom) mein hm ne local inner class di hai vo uske under validate() method use kiya hai for extra fields and properties(reservedRooms,totalRooms) from hotel class.
    //-->faayda hai ki hme validate() method ki jarurat padi hai can access enclosing class(Hotel-->class) ke jo fields hai vo directly access ho rahe hai through validate method.nahi kare aisa toh bahar logic dalna padega ya sab setup karna padega. 
    //-->khud se example loge ek baar toh bhi samajh mein aayega tumhare sab chze in chat gpt.
    //-->example. Local inner class package in intellij idea.



    //4).Anonymous Inner Class.
    //-->toh jb aapko on the fly object create karna ho kisi implementation class(CreditCard) ka without creating implementation class(no use case of CreditCard class). //--> toh aap test class me dekh sakte hai ye
    //example : intellij idea anonymous innerclass.
    //-->kab hame sochna hai anonymous class ke baare me.-->jb hame koi interface(Payment) class implement karana ho without creating its seperate implementation class.
    //-->fir koi class extend(inherit) karwani ho without creating its seperate sub class tb hame sochna hai anonymous inner class ke baare mein.
    //why we called anonymous class ???? --> anonymous kyu bol rahe hai sir koi naam nahi hai --> kyu nahi hai --> simple si baat hai create kr rahe ho (anonymous class ko)or turant ki turant use bhi kr le rahe ho koi naam toh rakkha hai nahi aap ne. ishi liye bol rahe hai anonymous class.
    //inner class obvious hai.
    //syntax : jis bhi parent class ka object or fir jis bhi interface ko aap ko implement karane ho jaise example me hm payment ko implement karana chahte hai.
    //lekin hm aalsi hai new class nahi bana rahe (or uska use nahi kr rahe hai) --> hm yahi pr uska use kr de rahe hai as sout chipka dete hai ush class me jo likhte usko test class mein likh dete hai.
    //jaha bhi use karna hai vaha pr new_keyword or ush interface(class --> Payment) ka naam de dijiye. ex --> 
    // ShoppingCart shoppingcart = new ShoppingCart("total amount :" - 25000);
    // shoppingCart.processPayment(new Payment(){
    //   @Override
    //    public void pay(double amount){
    //       sout("Paid " + amount + " using Credit Card."); //yahi hai aalas wala kaam ush class ko create naa krke yahi pr override kara diya ush class ke method ko or sout(statement jo vaha likhte ushe yaha likh diya hm ne).
    //   }
    //    })
    //interface ka toh object bhi create nahi kr sakta me or kr bhi kaha raha hu me bhai.
    // aapne interface kaa naam likh kr curly brackets laga diye hai or un curly brackets ke ander override kr diye || methods of interface ke methods (class --> Payment). ke || --> implement krawa diye methods override kr ke insided curly bracket.
    //toh ye hai syntax.
    //isko use karenge future me anonymous class ko || nahi samajh aaya koi baat nahi future me dekhenge ishko.


    //-->try more example from chatgpt. toh khud se clear ho jaayega kish time pe hame konsi classes ke hisaab se business logic use karna hai pata lag jaayega.
    //jaise 1). Member Inner Class use kr sakte hai.--> computer class (ek system hai) ---> Operating System (toh use karenge member inner class).
    //--> 2).Static (Inner/Nested) Class --> ek jaisi cheeze ek sath likhni hai toh static inner/nested class ka use karenge.isse fayda ye hoga ki jab outer class ka object banega tab static nested/inner class ka object nahi banega.
    //--> 3).Local Inner Class --> method ke under ek class banani hai chote se kaam ke liye or uska scope vahi destroy ho jaayega bahar access nahi ho paayegi vo.
    //--> 4).Anonymous Inner Class --> use tab karte hai jab on the fly interface ki implementation class banani ho or object banna ho.



    public static void main(String[] args) {
        
        System.out.println("Hello World");

    }

}
