public class Students{

    // Lecture 5). Encapsulation example

    //generally every variable is private.
    //encapsulation.it binding and provide security as protection your data for data member(property,instance variable),method function(behaviours). 
    
    private String name;
    private int age;
    private int rollNumber;

    public void setAge(int age){ //setter method or function
        if(age < 0){      //properties or instance variable ko set kar raha hai.
        age = 0;
        }
        this.age = age;
    }

    public int getAge(){  //getter method and function
        return this.age; //age at this.age-->this as student.
    }

    public static void main(String[] args){
        Students student = new Students();
        //we create boundries outside for protecting datamember,method(getter and setter function) & properties.
        //we use of get and set function.
        student.setAge(15);
        System.out.println(student.getAge());

    }

}
