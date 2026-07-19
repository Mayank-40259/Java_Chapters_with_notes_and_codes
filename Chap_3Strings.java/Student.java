public class Student {

    //Lecture 9 : String Defination,declaration,initialization. 
    // 

    String name;
    String address;
    String nationality;
    String course;
    int rollNumber;

    public Student() {
        // Default constructor
        
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Mayank Kumar";
        student.address = "India";
        student.nationality = "Indian";
        student.course = "BCA";
        student.rollNumber = 2402969;

        System.out.println("Name of the Student: " + student.name);
        System.out.println("Address of the student: " + student.address);
        
    }

}
