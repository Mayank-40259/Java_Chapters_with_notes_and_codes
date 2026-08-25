public class Collection{


    // Collection:- A COllection is simply an object that represents 
    //       a group of objects, known as its elements.
    // eg:- collection of coins and books 
    // 
    // 
    // Collection Framework :- it provides a set of interfaces and 
    //      classes that help in managing groups of objects.
    // 
    // --> Before the introduction of the Collection Framework in JDK 1.2, 
    //      Java used to rely on a variety of classes like Vector,Stack,Hashtable & 
    //         arrays to store and manipulate groups of objects.
    // 
    // --> However, these classes had several drawbacks.
    // 


    // 
    // ##Problems created hui --> to solve these problems, the Collection Framework was introduced.
    //  
    //1).Inconsistency:- Each class had a different way of managing collections, 
    //        leading to confusion  and a steep learning curve.
    // 


    //2).Lack of inter-operability: These classes were not designed to work
    //            together seamlessly.
    // 


    //3).No common interface:- There was no common interface for all these classes,
    //    which meant you couldn't write generic algorithms that could operate 
    //   an different types of collections.
    // 


    // 
    // Unified architecture:- A consistent set of interfaces for all collections.
    // Inter-operability:- Collections can be easily interchanged and manipulated in a uniform way.
    // Reusability:- Generic algorithms can be written that work with any collection.
    // Efficiency:- The fromework provides efficient algorithms for basic operations like searching,
    //       sorting, and manipulation.
    // 

    // #Key Interfaces in Collection Framework
    //  --> The Collection Framework is primarily built around a set of "interfaces".Important ones are:-
    // Collection: The root interface for all the other collection types.
    // 
    // List: An ordered collection that can contain duplicate elements(e.g. ArrayList,LinkedList).
    // Set: A collection that cannot contain duplicate  elements (e.g. HashSet TreeSet).
    // Queue: A collection designed for holding elements prior to processing (e.g. PriorityQueue,LinkedList when used as a queue).
    // Deque: A double-ended  queue that allows insertion and  removal from both ends (e.g. ArrayDeque).
    // Map: An interface that represents a collection of key-value pairs (e.g. Hashmap,TreeMap).
    // 
    // 




    public static void main(String[] args) {
        System.out.println("Hello World!...");
        //Collection Introduction Lecture.01.
        // Introduction and defination of COllection Framework

    }
}