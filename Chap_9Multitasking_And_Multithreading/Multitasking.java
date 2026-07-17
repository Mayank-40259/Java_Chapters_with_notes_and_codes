import java.lang.*;


public class Multitasking{
 
    
    // from starting this lecture you completed ->|| 1).Basics || --> || 2).Arrays-1D-&-2D && String || --> || 3).OOPS-classes and objects.
    //      || 4).Some methods and keywords || --> || 5).Exceptional Handling. || --> || 6).Wrapper-Classes & Math-Class.|| -->  || 7).Enumeration,Generics,template,Atomic-vs-Volatile. ||
    //             || 8).Then Multithreading & Multitasking. || --> || 9).Java-8+ features. || --> || 10).Collection-Frame-work ||
    //                 || 11).Java-Database-Connectivity && MySQL-Database. || --> || 12).Springboot-framework && Spring-AI ||


    // Multithreading-Lec-starts :  
    // Topics to be covered :- 


    // 1).CPU : - it is a brain of Computer. & it is responsible for executing instruction from programs.
    //            it performs basic arithmetic, logic, control, and input/output operations specified by the instructions.
    // example : -> a modern CPU like the Intel Core -i5 and -i7 or AMD-Ryzen 5 and 7.


    // 2).Core : -  A core is an individual processing unit within a CPU.
    //              Modern CPU`s can have multiple cores, allowing them to perform multiple tasks simultaniously.
    //         --> A Quad-core processor has four cores, allowing it to perform four tasks simultaniously.
    //         --> For instance, one core could handle your web browser,another your musicplayer, another a download manager, and another a background system update.
    //         -->  |()|()|->one core  all four cores --> |()|()|--|()|()|--|()|()|--|()|()| .


    // 3).Program : -  A program is a set of instructions written in a programming language 
    //                 that tells the computer how to perform a specific task.
    // 
    //       --> Microsoft Word is a program that allows users to create and edit documents.


    // 4).Process : -  A process is an instance of a program that is being executed.
    //                 When a program runs, the operating system creates a process to 
    //                 manage its execution.
    // 
    //          --> When we open Microsoft Word,it becomes a process in the operating system.


    // 5).Thread : -  A thread is the smallest unit of execution within a process.
    //                A process can have multiple threads, which share the 
    //                same resources but can run independently.
    //          --> 1 bhara (true) ---> 0 khali (false).
    // --> ek process hai uske ander chote chote kaamo ko bolte hain hm threads.
    // example -> a web browser like Google-chrome might use multiple threads for different tabs,
    //            with each tab running as a separate thread. --> independent chal raha hai. 
    //


    //  6).Multitasking : - Multitasking allows an operating system to run multiple processes simultaneously.
    //                     On single-core CPUs, this is done through time-sharing, rapidly switching between tasks. 
    //                     On multi-core CPUs, true parallel execution occurs, with tasks distributed across cores.
    //                     The OS scheduler balances the load,ensuring efficient and responsive system performance. 
    //                   --> Operating System --> OS --> Windows,Linux,Mac-Os.
    //                  -->Example :- We are browsing the internet while listening to music and downloading a file.
    //                  --> Music || Internet/Wifi || Downloading || .
    // 
    //              --> Multitasking utilizes the capabilities of a CPU and its cores.
    //                When an Operating System performs multitasking,it can assign different tasks
    //                to different cores. This is more efficient than assigning all tasks to a single core.
    //
    // 
    // 
    //                         ||||||||||||
    //                      -||------------||-
    //                      -||            ||-
    //                      -||   C P U    ||-
    //                      -||            ||-
    //                      -||------------||-
    //                         |||||||||||| 
    //
    // 
    // 



    // 
    // 7).Multithreading : -  
    // Multithreading refers to the ability to execute multiple threads within a single process concurrently.
    // 
    // Ex.  --> A web browser can use multithreading by having separate threads for rendering the page,
    //          running JavaScript, and managing user inputs. This makes the browser more responsive and efficient. 
    //
    // --> Multithreading enhances the efficiency of multitasking by breaking down individual tasks into smaller 
    //     sub-tasks or threads. These threads can be processed simultaneously,making better use of the CPU's capabilities.
    // 1). In a Single-core system : - Both  threads and processes are managed by the OS schedular through time slicing and context switching to
    //                                 create the illusion of simultaneous execution.
    // 2). In a Multi-core System : - Both threads and processes can run in true parallel on different cores,with the OS schedular
    //                                 distribution across the cores to optimize performance
    // 
    // #Time Slicing : -
    // 
    // Defination : -  Time slicing divides CPU time into small intervals called time slices or quanta.
    // Function : -    The OS schedular allocates these time slices to different processes and threads,
    //                 ensuring each gets a fair share of CPU time.
    // Purpose : -     This prevents any single process or thread from monopolizing the CPU,
    //                  improving responsiveness and enabling concurrent execution.
    // 
    // #Context Switching : -
    // 
    // Defination :- Context switching is the process of saving the state of a currently 
    //                running process or thread and loading the state of the next one to be executed.
    // 
    // Function :- When a process or thread's time slice expires, the OS scheduler performs a context
    //                 switch to move the CPU's focus to another process or thread.
    // 
    // Purpose :- This allows multiple processes and threads to share the CPU, 
    //             giving the appearance of simultaneous execution on a single-core
    //               CPU or improving parallelism on multi-core CPUs.
    // 


    // 
    // #before start IDE coding: -
    // 
    // a).Java provides robust support for multithreading, allowing developers to create 
    // applications that can perform multiple tasks simultaneously, improving 
    // performance and responsiveness.
    // 
    // b).In Java, multithreading is the concurrent execution of two or more threads
    //  to maximize the utilization of the CPU. Java's multithreading capabilities 
    // are part of the java.lang package, making it easy to implement concurrent execution.
    // 
    // c).In a single-core environment,Java's multithreading is managed 
    // by the JVM and the OS, which switch between threads to give the 
    // illusion of concurrency.
    // 
    // d).The threads share the single core, and time-slicing is used to 
    // manage thread execution.
    // 
    // e).In a multi-core environment, Java's multithreading can 
    // take full advantage of the available cores.
    // 
    // f).The JVM can distribute threads accross multiple cores, 
    // allowing true parallel execution of thread.
    // 
    // g)..A thread is a lightweight process, the smallest unit of processing.
    //  Java supports multithreading through its java.lang.Thread class and the 
    // java.lang.Runnable interface.
    // 
    // h).When a Java program starts, one thread begins running immediately,
    //  which is called the main thread. This thread is responsible for executing
    // the main method of a program.
    // 
    // 




    // Lecture. 01 in Intellij idea in Multithreading.
    // --> all files read as test.java --> world.java && vice-versa ==> test.java --> World.java --> MyThread.java.
    // Lecture. 02 in Intellij idea in Multithreading.
    // --> 
    // 

 

    public static void main(String[] args) {
        int n = 6;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" " + " ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }


}