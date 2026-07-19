public class Test2{

    // Lecture 13). StringBuilder example to check mutability and Thread Safety in Java with examples.

       public static void main(String[] args) throws InterruptedException {

           StringBuilder sb1 = new StringBuilder();

           Task t1 = new Task(sb1); //thread passes same same
           Task t2 = new Task(sb1); //thread passes same same

           t1.start();
           t2.start();

           t1.join();
           t2.join();

           System.out.println("Final length: " +sb1.length());//length(): length of string in number like index of an array n-1.where n is length in array but in string length(): to check the length of a String.

    }          //uski double length aayegi a ki 2000 nahi ayegi 1885,1964,.... = sb1.in case of StringBuilder kuch ka kuch length of thread aayegi.(No Safety of Thread).


}

class Task extends Thread{
    private StringBuilder sb1;

    public Task(StringBuilder sb1){
        this.sb1 = sb1;

    }

    @Override
    public void run(){
        for(int i = 0;i < 1000; i++){

        sb1.append("a"); //1000 times repets a append hoga.
      //dono thread ne ek baar append chala diya ek hi baar me toh ek hi thread count hoga naki do.
        }

    }

}

