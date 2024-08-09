# Learn Data Structures and Algorithms
## Table of Contents
- [Introduction](#introduction)
  - [Whats is a Data Structure?](#whats-is-a-data-structure)
  - [What is an Algorithm?](#what-is-an-algorithm)
  - [Why learn Data Structures and Algorithms?](#why-learn-data-structures-and-algorithms)
- [Basic Data Structures](#basic-data-structures)
- [Big O Notation](#big-o-notation)
- [Searching Algorithms](#searching-algorithms)
- [Sorting Algorithms](#sorting-algorithms)
- [Graphs](#graphs)
- [Trees](#trees)

## Introduction

### Whats is a Data Structure?

Data structure:. a named location that can be used to store and organize data.

Example:
+ array:  a collection of elements stored at contiguous memory locations.
  ```java
  char[] array = new char[10];
  ```
### What is an Algorithm?

Algorithm: a step-by-step procedure to solve a problem.

Example: Baking a pizza.
1. Heat the oven to 210°C.
2. Place the pizza in the oven.
3. Bake for 15 minutes.

Example: Linear Search Algorithm.
+ One by one, examine the elements of an array to find a value.
  ```java
  int[] array = {1, 2, 3, 4, 5};
  int value = 3;
  for (int i = 0; i < array.length; i++) {
      if (array[i] == value) {
          return i;
      }
  }
  return -1;
  ```
  
### Why learn Data Structures and Algorithms?
1. You will write code that is both time and memory efficient.
2. Commonly asked in technical interviews.

## Basic Data Structures

### Stacks

A **Stack** is a linear data structure that follows the Last In, First Out (LIFO) principle. This means that the last element added to the stack will be the first one to be removed. Stacks are often compared to a stack of plates where you can only add or remove the top plate.

#### Core Operations

1. **Push**: Adds an element to the top of the stack.
2. **Pop**: Removes the element from the top of the stack and returns it.
3. **Peek (or Top)**: Returns the element at the top of the stack without removing it.
4. **isEmpty**: Checks whether the stack is empty.
5. **Size**: Returns the number of elements in the stack.

#### Characteristics of Stacks

- **LIFO (Last In, First Out)**: The last element added to the stack is the first one to be removed.
- **No Random Access**: Unlike arrays, you cannot access elements in the middle of a stack directly. You must remove elements from the top one by one until you reach the desired element.
- **Dynamic or Static Size**: Stacks can be implemented using arrays (fixed size) or linked lists (dynamic size).

#### Applications of Stacks

- **Expression Evaluation**: Stacks are widely used in evaluating arithmetic expressions and parsing expressions in compilers (e.g., converting infix to postfix notation).
- **Undo Mechanism**: Most applications with an undo feature, like text editors, use stacks to keep track of changes.
- **Function Call Management**: Stacks manage function calls in programming languages. The function call stack helps in keeping track of return addresses and local variables.
- **Balanced Parentheses Checking**: Stacks are used to check whether an expression has balanced parentheses, brackets, or braces.

#### Advantages of Stacks

- **Simple to Use**: The push and pop operations are easy to understand and implement.
- **Efficient Memory Use**: If implemented using a linked list, the memory is utilized efficiently since it grows as needed.

#### Disadvantages of Stacks

- **Limited Access**: Only the top element is accessible, so accessing other elements can be cumbersome and inefficient.
- **Overflow and Underflow**: In array-based implementations, there's a risk of overflow if too many elements are pushed onto the stack. Similarly, attempting to pop from an empty stack will result in an underflow condition.

#### Real-World Examples of Stacks

- **Backtracking Algorithms**: Used in algorithms that explore all possible paths, such as maze solving and puzzle solving.
- **Web Browser Navigation**: The back button in a web browser is implemented using a stack to keep track of the history of visited web pages.
- **Programming Language Parsing**: Compilers and interpreters use stacks to parse nested structures such as parentheses or function calls.



### Queues

A queue is a linear data structure that follows the First In First Out (FIFO) principle. The first element added to the queue is the first element to be removed.

In Java, the Queue interface is implemented by the LinkedLists class.

```java
Queue<Integer> queue = new LinkedLists<>();
```

Methods:
1. Insert:
   2. enqueue(): adds an element to the rear of the queue.
   3. add(): adds an element to the rear of the queue.
   4. offer(): adds an element to the rear of the queue.
2. Remove:
   3. dequeue(): removes the front element from the queue.
   4. remove(): removes the front element from the queue.
   5. poll(): removes the front element from the queue.

Where are queues used?
1. Keyboard buffers (letters should appear in the order they are typed).
2. Printer queues (documents should be printed in the order they are sent).
3. Used in LinkedLists, Priority Queues, Breadth First Search.

### Priority Queues

A priority queue is a data structure that stores elements based on their priority. The element with the highest priority is removed first.

In Java, the PriorityQueue class is used to implement a priority queue.

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
```

### Linked Lists

A **Linked List** is a linear data structure where elements are stored in nodes, and each node points to the next node in the sequence. Unlike arrays, linked lists do not require contiguous memory allocation, which allows them to dynamically grow and shrink in size.

#### Types of Linked Lists

1. **Singly Linked List**: Each node contains a data element and a reference (or pointer) to the next node in the list. The last node has a reference to `null`, indicating the end of the list.

    ```java
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    ```

2. **Doubly Linked List**: Each node contains a data element, a reference to the next node, and a reference to the previous node. This allows traversal in both directions (forward and backward).

    ```java
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    ```

3. **Circular Linked List**: In this variation, the last node points back to the first node, forming a circle. This can be implemented as either a singly or doubly linked list.

    ```java
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = this; // Points to itself initially
        }
    }
    ```

#### Basic Operations

- **Insertion**: Adding a new node to the list. Depending on where the new node is added, the operation can be classified as:
    - **At the beginning**
    - **At the end**
    - **In the middle**

- **Deletion**: Removing a node from the list. This can involve:
    - **Removing the first node**
    - **Removing the last node**
    - **Removing a node from the middle**

- **Traversal**: Visiting each node in the list from the head node to the last node (or first node again in a circular list).

    ```java
    void traverse(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    ```

- **Search**: Finding a node with a specific value. This involves traversing the list and comparing each node's data with the target value.

    ```java
    boolean search(Node head, int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    ```

#### Advantages of Linked Lists

- **Dynamic Size**: Unlike arrays, linked lists can easily grow and shrink as needed, making them ideal for scenarios where the number of elements is unknown or fluctuates frequently.

- **Efficient Insertions/Deletions**: Insertion and deletion of nodes are generally more efficient (O(1)) in linked lists compared to arrays, where shifting elements is necessary.

#### Disadvantages of Linked Lists

- **Memory Overhead**: Each node in a linked list requires extra memory for storing the reference to the next (and possibly previous) node.

- **Sequential Access**: Unlike arrays, linked lists do not provide direct access to elements, making search operations O(n) in the worst case.

#### Applications

- **Dynamic Memory Allocation**: Linked lists are often used in scenarios where memory allocation is dynamic and unpredictable.
- **Implementing Stacks and Queues**: Linked lists provide a flexible way to implement stack and queue data structures.
- **Graph Adjacency Representation**: In graph theory, linked lists are used to represent adjacency lists, which is a space-efficient way to represent sparse graphs.

### Dynamic Arrays