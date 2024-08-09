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

A **Dynamic Array** is a data structure that allows for resizing, unlike a traditional array with a fixed size. Dynamic arrays grow and shrink as needed, making them more flexible and efficient for use cases where the number of elements can change dynamically.

#### How Dynamic Arrays Work

In a dynamic array, the underlying data structure is typically an array with a predefined initial capacity. When the array becomes full (i.e., when the number of elements equals the capacity), a new array with larger capacity is created, and the elements are copied over to this new array. This process is often referred to as "growing" the array.

When elements are removed and the number of elements falls below a certain threshold, the array may "shrink" to save memory by creating a smaller array and copying the elements over.

#### Core Operations

1. **Add (or Append)**: Adds a new element to the end of the dynamic array. If the array is full, it triggers a grow operation to increase its capacity before adding the new element.

    ```java
    dynamicArray.add("A");
    ```

2. **Insert**: Adds a new element at a specific index, shifting the subsequent elements to the right. This operation may also trigger a grow operation if the array is full.

    ```java
    dynamicArray.insert(1, "B");
    ```

3. **Delete**: Removes a specific element from the array, shifting the subsequent elements to the left to fill the gap. If the size of the array drops below a certain threshold, it may trigger a shrink operation.

    ```java
    dynamicArray.delete("A");
    ```

4. **Search**: Searches for a specific element in the array and returns its index if found, or `-1` if the element is not present.

    ```java
    int index = dynamicArray.search("B");
    ```

5. **Grow**: Increases the capacity of the array, typically by doubling its size, and copies all the elements to the new array.

6. **Shrink**: Decreases the capacity of the array when a significant portion of the array is empty, usually by halving the size.

#### Dynamic Arrays in Java: `ArrayList`

In Java, the most common implementation of a dynamic array is through the `ArrayList` class. `ArrayList` automatically handles the growing and shrinking of the array behind the scenes, making it easier to use compared to manually managing a dynamic array.

#### Advantages of Dynamic Arrays

- **Resizing Flexibility**: Dynamic arrays can grow and shrink as needed, making them suitable for use cases where the number of elements is unknown or fluctuates frequently.
- **Random Access**: Similar to traditional arrays, dynamic arrays provide O(1) time complexity for random access to elements.
- **Efficient Memory Use**: Dynamic arrays only use memory proportional to the number of elements they contain, unlike fixed-size arrays that reserve memory for the maximum capacity.

#### Disadvantages of Dynamic Arrays

- **Resizing Overhead**: Growing and shrinking the array requires copying elements, which can be time-consuming and lead to performance overhead.
- **Memory Fragmentation**: As the array grows and shrinks, it may lead to memory fragmentation, where memory is allocated in small chunks that are not contiguous.

#### Applications of Dynamic Arrays

- **Dynamic Lists**: Used in scenarios where the number of elements is not known in advance, such as dynamic collections of data.
- **Buffering Data**: Dynamic arrays are commonly used to store data buffers that grow and shrink dynamically based on input/output operations.
- **Implementation of Higher-Level Data Structures**: Dynamic arrays serve as the underlying data structure for more complex data structures like stacks, queues, and hash tables.

### LinkedLists vs ArrayLists

#### Overview

In Java, both `LinkedList` and `ArrayList` are part of the Java Collections Framework and implement the `List` interface. However, they have different underlying data structures and thus perform differently in various scenarios.

- **`ArrayList`**: Uses a dynamic array to store elements. It provides O(1) time complexity for accessing elements by index, but can be slower for insertions and deletions, especially in the middle of the list, as elements need to be shifted.

- **`LinkedList`**: Uses a doubly linked list to store elements. It provides O(1) time complexity for insertions and deletions at both ends, but O(n) for accessing elements by index, since it requires traversing the list.

#### Performance Comparison

1. **Access by Index**:
    - **ArrayList**: Accessing elements by index is very fast (O(1)) because it uses an underlying array.
    - **LinkedList**: Accessing elements by index is slower (O(n)) because it requires traversing the list from the beginning or the end.

2. **Insertion and Deletion**:
    - **ArrayList**: Inserting or deleting elements at the end of the list is fast (O(1)), but at the beginning or middle of the list, it can be slow (O(n)) because elements need to be shifted.
    - **LinkedList**: Insertion and deletion are faster (O(1)) at the beginning or end of the list, and generally more efficient than `ArrayList` for these operations. However, inserting or deleting in the middle requires traversal (O(n)).

#### Situational Recommendations

- **When to use `ArrayList`**:
    - If your application requires frequent access to elements by index, such as in cases where you're performing a lot of random access operations.
    - When the size of the list changes infrequently, and most operations are appending to the end of the list.
    - Ideal for use cases involving data storage where reads outnumber writes.

- **When to use `LinkedList`**:
    - If your application requires frequent insertions and deletions, especially at the beginning or end of the list.
    - When working with large lists where memory reallocation during resizing could be costly.
    - Suitable for scenarios where you need a queue or stack-like behavior, as it efficiently supports operations like adding/removing from both ends.