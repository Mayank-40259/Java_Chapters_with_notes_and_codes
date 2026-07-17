public class Inheritance {

    //Lec.05 Inheritance.
    //Inheritance : it is a process of acquiring and inherits the property of one class to another class.
    //it is the pilar of OOPs(object oriented and programming).



    //it is of five types : 1).Single Inheritance : when one class inherits the property of another class.
    //eg. class A --> class B extends A.
    //example : in Animal package --> Animal --> Dog.


    //Note : ||-->extends : keyword used for inherits the property of class A and class B.


    //2).Multilevel Inheritance : when one class inherits the property of another class and that class again inherited by another class.
    //eg. class A --> class B extends A --> class C extends B
    //example : in humans package.-->Grandparent-->Parent-->child.
    

    //3).Hierarchical Inheritance : when multiple classes inherits the property of one class.
    //eg. class A --> class B extends A , class C extends A
    //example.Hierrarchical Inheritance : in hierrarchicalinheritance package --> Animal <-- Dog , Animal <-- Cat.
    

    //4).Hybrid Inheritance : it is a combination of two or more types of inheritance.
    //eg. class A --> class B extends A --> class C extends B , class D extends A
    //example : 


    //Note : Java does not support multiple inheritance directly to avoid ambiguity.
    //eg. class A --> class B extends A , class C extends A
   

    //class D extends B , class D extends C --> ambiguity occurs here because class D is
    //inheriting from both class B and class C which have same property from class A.


    }