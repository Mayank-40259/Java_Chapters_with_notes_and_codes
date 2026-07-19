public class Test1{

    //Lecture 12). StringBuffer example to check mutability and Thread Safety in Java with examples.

       public static void main(String[] args) throws InterruptedException {

           //3).StringBuffer: Thread safety and Mutability.

           StringBuffer sb1 = new StringBuffer();

           Task t1 = new Task(sb1); //thread passes same same
           Task t2 = new Task(sb1); //thread passes same same

           t1.start();
           t2.start();

           t1.join();
           t2.join();

           System.out.println("Final length: " +sb1.length());//length(): length of string in number like index of an array n-1.where n is length in array but in string length(): to check the length of a String.

    }          //uski double length aayegi a ki 2000 = sb1. in case of StringBuffer Safety of Thread.

}

class Task extends Thread{
    private StringBuffer sb1;

    public Task(StringBuffer sb1){
        this.sb1 = sb1;

    }

    @Override
    public void run(){
        for(int i = 0;i < 1000; i++){

        sb1.append("a"); //1000 times repets a append hoga.

        }

    }

}


