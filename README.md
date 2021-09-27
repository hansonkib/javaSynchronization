[![Generic badge](https://img.shields.io/badge/java_synchronization-Hanson_Kibet-<COLOR>.svg)](https://shields.io/)
# Introduction
 Synchronization in java is the capability to control the access of multiple threads to any shared resource. In the Multithreading concept,
multiple threads try to access the shared resources at a time to produce inconsistent results. The synchronization is necessary for reliable 
communication between threads.

##Why we use Synchronization
1. Synchronization helps in preventing thread interference
2. Synchronization helps to prevent concurrency problems.
##Types of Synchronization
1. Process Synchronization
2. Thread Synchronization
## Process Synchronization:
The process is nothing but a program under execution. It runs independently isolated from another process. The resThe process is nothing but a 
program under execution. It runs independently isolated from another process. The resources like memory and CPU time, etc. are allocated to the 
process by the operation Systemources like memory and CPU time, etc. are allocated to the process by the operation System

## Thread Synchronization:
Thread synchronization is two types, they are:
1. Mutual Exclusive:
A Mutex or Mutual Exclusive helps only one thread to access the shared resources. It won’t allow the accessing of shared resources at a time. 
It can be achieved in the following ways.

    1. Synchronized Method
    2. Synchronized block
    3. Static Synchronization
2. Cooperation (Inter Thread Communication in java)
### Lock Concept in Java
Synchronization Mechanism developed by using the synchronized keyword in java language. It is built on top of the locking mechanism, this locking 
mechanism is taken care of by Java Virtual Machine (JVM). The synchronized keyword is only applicable for methods and blocks, it can’t apply to 
classes and variables. Synchronized keyword in java creates a block of code is known as a critical section. To enter into the critical section
thread needs to obtain the corresponding object’s lock.

##Java Synchronized Method

If we use the Synchronized keywords in any method then that method is Synchronized Method.
It is used to lock an object for any shared resources.
The object gets the lock when the synchronized method is called.
The lock won’t be released until the thread completes its function.
##The Drawback of Synchronization Mechanism
Synchronization Mechanism shows less performance.
Let’s consider an example, if there are five process P1, P2, P3, P4, P5 that are waiting to get the shared resources to access only one thread at a time so, all other processes are in waiting condition, the last process has to wait until all other processes to be complete. So, we have to use the synchronization concept where we will get inconsistent results.