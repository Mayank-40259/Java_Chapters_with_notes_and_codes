public class Startriangle {

    //Lecture 8 : Pattern Printing in Java with examples.
    
    // Nested-loop s are used to print patterns in Java. 
    // A nested loop is a loop inside another loop. The outer loop is 
    // responsible for the number of rows, while the inner loop is responsible 
    // for the number of columns.


     public static void main(String[] args){
    for(int i = 1; i <= 6; i++){
        for(int j = 1; j <= i; j++){
            System.out.print("* ");
        }
        System.out.println();
      }

    }

}
