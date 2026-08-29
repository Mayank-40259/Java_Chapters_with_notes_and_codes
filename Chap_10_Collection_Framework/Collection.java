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
    // Queue: A collection designed for holding elements prior to processing (e.g. PriorityQueue,LinkedList when used as a queue). first in first out --> FIFO use hota hai .
    // Deque: A double-ended queue that allows insertion and  removal from both ends (e.g. ArrayDeque).
    // Map: An interface that represents a collection of key-value pairs (e.g. Hashmap,TreeMap).
    // 
    // 
    // --> bahut saari classes hongi isme and hierrarchy hogi isme collection ki.
    // ## Collection Hierarchy :- The Collection Framework is organized into a hierrarchy 
    //  where the core interfaces are at the top, and the specific implementations extend these interfaces.
    // 
    // 


    //                             Iterable
    //                                |
    //                            Collection
    //                                |
    //          --------------------------------------------------------
    //          | (List)              | (Sets)                         | (Queue)
    //          |                     |                                |
    //          ^                     ^                                ^  
    //      ArrayList               HashSet                      LinkedList          ---> ArrayDeque
    //      LinkedList            LinkedHashSet                 PriorityQueue       /
    //        Vector                TreeSet                        Deque -------------->LinkedList
    //         Stack                EnumSet                    BlockingQueue        \
    //   CopyOnWriteArrayList     ConncurrentSkipListSet       ArrayBlockingQueue    ---> ConncurrentLinked Deque
    //                               SortedSet                LinkedBlockingQueue
    //                           CopyOnWriteArraySet         PriorityBlockingQueue
    //                                                         SynchronousQueue
    //                                                           DelayQueue
    //                                                       ConncurrentLinkedQueue                        
    // #Collection Interface :-
    // #Overview :- 
    // 1).  The Collection interface is the root interface of the Java Collection Framework.
    // 2).  it is the most basic interface that defines a group of objects known as elements.
    // 3).  The Collection interface is a part of the java.util package, and
    // 4).  It is a parent interface that is extended by other collection interfaces like. List,Set, and Queue.
    // 
    // 


    // ##Collection Interfaces :-  
    // --> 1st part).List :- the List is an interface in Java is a part of the java.util package 
    //         and is a sub-interface of the Collection Interface. It provides a way to 
    //        "store an ordered collection of elements"(known as a sequence). Lists allow for 
    //        precise control over where elements inserted and "can contain duplicate elements." 
    // 
    // ->List extend karta hai Collection class ko.
    // -> The List interface is implemented by several classes in the Java Collection Framework,
    //    such as ArrayList, LinkedList, Vector, and Stack.
    // 
    // #Key Features of the List Interface :-
    //      Order Preservation
    //      Index-Based Access
    //      Allows Duplicates
    //  
    // 
    // --> 1).ArrayList :- An ArrayList is a resizeable array implementation of 
    //           the List interface. Unlike arrays in Java, which have a fixed size, 
    //         an "ArrayList can change its size dynamically" as elements are added or removed. 
    //        This flexibility makes it a popular choice when the number of elements in a list isn't known in advance.
    // ex:- code of ArrayList in intellijIdea --> Lecture-01 --> main.java --> ArrayList code.
    // 
    // -> #Internal Working of Arraylist :- 
    //        Unlike a regular array, which has a fixed size, 
    //        an ArrayList can grow and shrink as elements are added or removed. This dynamic 
    //       resizing is achieved by creating a new array when the current array is full and copying 
    //       the elements to the new array.
    // 
    // -> When you create an Arraylist, it has an initial capacity(default is 10). 
    //    The capacity refers to the size of the internal array
    //     that can hold elements before needing to resize.
    // 
    //    #Method-01 
    //   #Adding Elements :-
    //  When we add an element to an ArrayList, the following steps occurs :-
    //  #1).Check Capacity :- 
    //              Before adding the new element, Arraylist checks if there is 
    //              enough space in the internal array(elementData).if the array is full, 
    //              it needs to be resized.
    // #2).Resize if Necessary :- 
    //            if the internal array is full, the ArrayList will create
    //            a new array with a larger capacity (usually 1.5 times the current capacity)
    //            and copy the elements from the old array to the new array.
    // #3).Add the Element :-
    //         The new element is then added to the internal array at 
    //         the appropriate index, and the size is incremented.
    // 
    //    #Method-02
    //   #Resizing the Array :-
    //  1).Initial Capacity :- By default, the initial capacity is 10. This means 
    //                       the internal array can hold 10 elements before it needs to grow.
    // 
    //  2).Growth Factor :- When the internal array is full, a new array is created 
    //                     with a size 1.5 times the old array. This growth factor 
    //                   balances memory efficiency and resizing cost.
    // 
    //  3).Copying Elements :- When resizing occurs, all elements from the old
    //                        array are copied to the new array, which is an O(n) operation,
    //                   where n is the number of elements in the ArrayList.
    //   #Method-03
    //  #Removing Elements :- 
    //   1).Check Bounds :- The ArrayList first checks if the index is within the valid range.
    //   2).Removing the Element :- The element is removed, and all elements to the 
    //           right of the removed element are shifted one position to the left to fill the gap.
    //   3).Reduce Size :- The size is decremented by 1.
    // 
    // 
    // --> 
    // --> 



    public static void main(String[] args) {
        System.out.println("Hello World!...");
        //Collection Introduction Lecture.01.
        // Introduction and defination of COllection Framework
        // interface types and data structure library.
        // Collection Hierrarchyin Collection Framework.

    }
}