# Learn Data Structures and Algorithms
## Table of Contents
- [Introduction](#introduction)
  - [Whats is a Data Structure?](#whats-is-a-data-structure)
  - [What is an Algorithm?](#what-is-an-algorithm)
  - [Why learn Data Structures and Algorithms?](#why-learn-data-structures-and-algorithms)
- [Basic Data Structures](#basic-data-structures)
  - [Stacks](#stacks)
  - [Queues](#queues)
  - [Priority Queues](#priority-queues)
  - [Linked Lists](#linked-lists)
  - [Dynamic Arrays](#dynamic-arrays)
  - [LinkedLists vs ArrayLists](#linkedlists-vs-arraylists)
- [Big O Notation](#big-o-notation)
- [Searching Algorithms](#searching-algorithms)
  - [Linear Search](#linear-search)
  - [Binary Search](#binary-search)
  - [Interpolation Search](#interpolation-search)
  - [Bubble Sort](#bubble-sort)
  - [Selection Sort](#selection-sort)
  - [Insertion Sort](#insertion-sort)
  - [Recursion](#recursion)
  - [Merge Sort](#merge-sort)
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

## Big O Notation

**Big O Notation** is a mathematical notation used to describe the upper bound of an algorithm's runtime or space complexity in terms of the input size. It provides a way to express how the runtime or space requirements of an algorithm grow as the input size increases. Big O focuses on the worst-case scenario, ensuring that an algorithm will perform within a specific time or space limit, regardless of the input.

#### Common Big O Notations

The following are some of the most common Big O notations, listed from the most efficient to the least efficient:

![Graph showing different Big O complexities](https://miro.medium.com/v2/resize:fit:4800/format:webp/1*dWet_YU-5072Kcko7LzsuQ.jpeg)

- **O(1) - Constant Time**: The runtime does not change regardless of the input size. This is the most efficient complexity as the algorithm takes a constant amount of time, no matter how large the input is.
    - **Examples**:
        - Accessing an element in an array by index: `array[index]`.
        - Inserting an element at the beginning of a `LinkedList`.

- **O(log n) - Logarithmic Time**: The runtime grows logarithmically as the input size increases. Algorithms with logarithmic time complexity are very efficient for large datasets.
    - **Examples**:
        - Binary search in a sorted array.
        - Finding an element in a balanced binary search tree (BST).

- **O(n) - Linear Time**: The runtime grows linearly with the input size. If the input size doubles, the runtime also doubles. This is typical of algorithms that need to examine each element in the input.
    - **Examples**:
        - Looping through elements in an array.
        - Searching through a `LinkedList`.

- **O(n log n) - Log-Linear Time**: The runtime grows faster than linear time but slower than quadratic time. This complexity is common in efficient sorting algorithms.
    - **Examples**:
        - Quick sort.
        - Merge sort.
        - Heap sort.

- **O(n^2) - Quadratic Time**: The runtime grows quadratically as the input size increases. If the input size doubles, the runtime quadruples. This is common in algorithms with nested loops.
    - **Examples**:
        - Insertion sort.
        - Selection sort.
        - Bubble sort.

- **O(2^n) - Exponential Time**: The runtime doubles with each additional input element. This is very inefficient for large inputs and is often seen in algorithms that solve problems by brute force.
    - **Examples**:
        - Solving the Towers of Hanoi.
        - Certain recursive algorithms that explore all possibilities.

- **O(n!) - Factorial Time**: The runtime grows factorially with the input size. This is the least efficient time complexity and is typically found in algorithms that generate all possible permutations of an input.
    - **Examples**:
        - Solving the Traveling Salesman Problem (TSP) with brute force.
        - Generating all permutations of a set.

## Searching Algorithms

### Linear Search

Iterate through a collection one element at a time.

- **Runtime Complexity**: O(n)

#### Disadvantages:
- Slow for large data sets

#### Advantages:
- Fast for searches of small to medium data sets
- Does not need to be sorted
- Useful for data structures that do not have random access (Linked List)

### Binary Search

**Binary Search** is an efficient algorithm used to find the position of a target value within a sorted array or list. The key idea behind Binary Search is to repeatedly divide the search interval in half, reducing the problem size exponentially with each step.

#### How It Works

1. **Start with the Middle Element**: The algorithm begins by comparing the target value with the middle element of the array.
2. **Adjust the Search Interval**:
    - If the target value is equal to the middle element, the search is complete.
    - If the target value is less than the middle element, the search continues on the left half of the array.
    - If the target value is greater than the middle element, the search continues on the right half of the array.
3. **Repeat**: This process is repeated, halving the search interval each time, until the target value is found or the interval is empty.

#### Time Complexity

- **O(log n)** — With each step, the search space is halved, leading to a logarithmic time complexity, which is much faster than linear search for large datasets.

#### Advantages

- **Efficiency**: Binary Search is significantly faster than Linear Search, especially for large, sorted datasets, because it reduces the number of comparisons needed to find the target.
- **Logarithmic Time**: The algorithm's time complexity of O(log n) makes it highly efficient for searching through large volumes of data.

#### Disadvantages

- **Requires Sorted Data**: Binary Search can only be applied to data that is already sorted. If the data is unsorted, it must first be sorted, which can add to the overall time complexity.
- **Not Ideal for Dynamic Data**: If the data is frequently updated with insertions and deletions, maintaining a sorted order can be inefficient, making Binary Search less practical in such scenarios.
- **Less Effective for Small Data Sets**: For very small data sets, the overhead of dividing the search space might not be worth the performance gain over simpler algorithms like Linear Search.

#### Use Cases

Binary Search is ideal for scenarios where:

- The dataset is large and sorted.
- Fast retrieval of elements is critical.
- The dataset remains relatively static (few insertions/deletions).

Binary Search is widely used in applications such as searching in databases, looking up records in a sorted array, or even in various algorithms that require efficient search capabilities.

### Interpolation Search

**Interpolation Search** is an improved variant of Binary Search, designed for searching in a uniformly distributed, sorted array. Unlike Binary Search, which always checks the middle element, Interpolation Search estimates the position of the target value based on the distribution of the data, making it potentially faster in certain scenarios.

#### How It Works

1. **Estimate Position**: The algorithm estimates the position of the target value using the formula:

```java
int probe = low + (high - low) * (target - array[low]) /
        (array[high] - array[low]);
```


   Here, `low` and `high` represent the indices of the current search interval, and `target` is the value being searched.

2. **Compare and Adjust**:
    - If the target value matches the element at the estimated position, the search is complete.
    - If the target is less than the estimated element, the search continues in the lower subarray.
    - If the target is greater, the search continues in the upper subarray.

3. **Repeat**: This process is repeated, narrowing down the search interval based on the estimated position, until the target is found or the search interval is empty.

#### Time Complexity

- **O(log log n)** — Interpolation Search can be very fast, with a time complexity of O(log log n) in the best case for uniformly distributed data.
- However, in the worst case, particularly with non-uniform distributions, the time complexity can degrade to **O(n)**.

#### Advantages

- **Potentially Faster Than Binary Search**: For large, uniformly distributed datasets, Interpolation Search can be more efficient than Binary Search, as it uses a more refined estimate to locate the target.
- **Effective for Specific Data Types**: It excels in scenarios where the data is uniformly distributed, such as indexes in a database or sorted numerical data.

#### Disadvantages

- **Requires Uniformly Distributed Data**: The algorithm's efficiency depends on the data being uniformly distributed. If the data is not well-distributed, the performance can degrade significantly.
- **Complexity in Implementation**: Interpolation Search is more complex to implement than Binary Search, requiring a deeper understanding of the data distribution.

#### Use Cases

Interpolation Search is most effective in the following scenarios:

- **Large, Uniformly Distributed Datasets**: Ideal for searching in large datasets where the values are evenly spread out, such as indexes in databases or numerical ranges.
- **Specific Applications**: Used in situations where the distribution of the data is known and can be leveraged to improve search performance.

While Interpolation Search can offer significant performance improvements over Binary Search in the right context, it is essential to consider the nature of the data before opting for this method.

## Sorting Algorithms

### Bubble Sort

**Bubble Sort** is a simple comparison-based sorting algorithm. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process is repeated until the list is sorted.

#### How It Works

1. **Compare Adjacent Elements**: Start with the first element of the array and compare it to the next element.
2. **Swap If Necessary**: If the first element is greater than the second, swap them. Otherwise, move to the next pair of elements.
3. **Repeat**: Continue this process for each pair of adjacent elements in the array. After one full pass through the array, the largest element will have "bubbled up" to its correct position at the end.
4. **Iterate Until Sorted**: Repeat the process for the remaining unsorted elements. With each pass, the next largest element is placed in its correct position, reducing the number of elements to check in subsequent passes.

#### Time Complexity

- **Worst-Case and Average Case**: O(n^2) — This occurs when the array is in reverse order or unordered, requiring the maximum number of comparisons and swaps.
- **Best Case**: O(n) — This occurs when the array is already sorted, and no swaps are needed. The algorithm can terminate early after one pass.

#### Advantages

- **Simplicity**: Bubble Sort is easy to understand and implement.
- **No Additional Space Required**: It sorts the array in place, so no additional memory is required beyond the input data.
- **Early Termination**: In the best-case scenario (an already sorted array), the algorithm can terminate early, making it more efficient than other O(n^2) algorithms in such cases.

#### Disadvantages

- **Inefficiency**: Bubble Sort is not suitable for large datasets because of its O(n^2) time complexity in the average and worst cases.
- **Slowness**: Even for relatively small lists, other sorting algorithms like Quick Sort, Merge Sort, or Insertion Sort are generally faster.

### Use Cases

Bubble Sort is generally used for educational purposes to demonstrate how sorting algorithms work. It's rarely used in practical applications due to its inefficiency. However, it can be useful in situations where the dataset is nearly sorted, and its simplicity is a significant advantage.

### Selection Sort

**Selection Sort** is a simple comparison-based sorting algorithm. It sorts an array by repeatedly finding the smallest (or largest) element in the array and swapping it with the element at the current position.

#### How It Works

1. **Start with the First Element**: Begin with the first element in the array.
2. **Find the Minimum Element**: Search through the array to find the smallest element.
3. **Swap**: Swap this smallest element with the element at the current position.
4. **Move to the Next Position**: Move to the next element in the array and repeat the process until the entire array is sorted.

#### Time Complexity

- **O(n^2)**

#### Advantages

- **Simplicity**: Easy to implement and understand.
- **In-Place Sorting**: No additional storage space is required.

#### Disadvantages

- **Inefficiency**: Not suitable for large datasets due to O(n^2) time complexity.
- **Unstable**: May not preserve the relative order of equal elements.

#### Use Cases

Selection Sort is best used for small datasets or in educational contexts to demonstrate basic sorting concepts.

### Insertion Sort

**Insertion Sort** is a simple and intuitive comparison-based sorting algorithm. It builds the final sorted array one element at a time, by repeatedly taking the next unsorted element and inserting it into its correct position relative to the already checked elements in the array.

#### How It Works

1. **Start with the Second Element**: Begin with the second element in the array because it needs to be compared with the first element to determine its correct position.
2. **Compare and Shift**: Compare the current element with the elements before it in the array. Shift the larger elements to the right until the correct position for the current element is found.
3. **Insert the Element**: Insert the current element into its correct position within the array.
4. **Repeat**: Move to the next element and repeat the process until the entire array is sorted.

#### Time Complexity

- **O(n^2)** — In the worst and average cases, Insertion Sort requires comparing and shifting elements, leading to a quadratic time complexity.
- **O(n)** — In the best case, when the array is already sorted, Insertion Sort performs at linear time.

#### Advantages

- **Simplicity**: Easy to understand and implement.
- **Efficient for Small or Nearly Sorted Data**: Performs well on small datasets or datasets that are already partially sorted.
- **Stable**: Preserves the relative order of equal elements.
- **In-Place Sorting**: Requires no additional memory for sorting, as it rearranges the elements within the original array.

#### Disadvantages

- **Inefficiency on Large Data Sets**: Due to its O(n^2) time complexity, it is not suitable for large datasets.

#### Use Cases

Insertion Sort is particularly useful for:

- **Small Data Sets**: Where its simplicity and efficiency outweigh its quadratic time complexity.
- **Nearly Sorted Data**: Ideal for situations where the data is already partially sorted, making the algorithm very efficient.
- **Real-Time Applications**: Because it can sort elements as they arrive, Insertion Sort is sometimes used in real-time systems.

Insertion Sort is often used in practice for small arrays or as a final step in more complex algorithms, such as Quick Sort or Merge Sort, where the overhead of more sophisticated methods is unnecessary.

### Recursion

**Recursion** is a programming technique where a function calls itself in order to solve a problem. This method involves breaking down a problem into smaller, more manageable sub-problems that are easier to solve. Recursion is often used for tasks that can be defined in terms of similar subtasks, such as computing factorials, traversing data structures, or solving puzzles like the Tower of Hanoi.

#### How It Works

Recursion typically involves two main components:

1. **Base Case**: The condition under which the recursion stops. Without a base case, the function would call itself indefinitely, leading to a stack overflow. The base case defines the simplest instance of the problem, which can be solved directly without further recursion.

2. **Recursive Case**: The part of the function where it calls itself with a modified argument, gradually working towards the base case. Each recursive call reduces the problem's complexity, inching closer to the base case until the recursion can terminate.

#### Types of Recursion

Recursion can be classified into several types, including **Tail Recursion** (final recursion), **Non-Tail Recursion** (non-final recursion), **Direct Recursion**, and **Indirect Recursion**.

##### 1. Tail Recursion (Final Recursion)

**Tail Recursion** occurs when the recursive call is the last operation in the function. In other words, there is nothing left to do after the recursive call returns. This type of recursion is more memory-efficient because many compilers and interpreters can optimize tail-recursive functions to avoid adding a new frame to the call stack for each recursive call. This optimization is known as *tail call optimization (TCO)*.

```java
private static void tailRecursionWalk(int steps) {
    if (steps == 0) return;  // Base case
    System.out.println("You take a step");
    tailRecursionWalk(steps - 1);  // Recursive call
}
```
##### 2. Non-Tail Recursion (Non-Final Recursion)

**Non-Tail Recursion** occurs when there are still operations left to perform after the recursive call returns. This means that each recursive call must wait for the subsequent recursive calls to complete before it can finish its execution, which can lead to higher memory usage as each call is kept on the stack until all calls are resolved.

```java
private static int nonTailRecursionFactorial(int num) {
    if (num < 1) return 1;  // Base case
    return num * nonTailRecursionFactorial(num - 1);  // Recursive call followed by multiplication
}
```

##### 3. Direct Recursion

Direct Recursion occurs when a function calls itself directly. This is the most common form of recursion and is what most people think of when they hear the term "recursion."

```java
private static void directRecursion(int n) {
    if (n <= 0) return;  // Base case
    directRecursion(n - 1);  // Recursive call
}
```

##### 4. Indirect Recursion

Indirect Recursion occurs when a function calls another function, which eventually leads to the original function being called again. This can involve two or more functions calling each other in a cycle.

```java
private static void functionA(int n) {
    if (n <= 0) return;  // Base case
    functionB(n - 1);  // Call to another function
}

private static void functionB(int n) {
    if (n <= 0) return;  // Base case
    functionA(n - 1);  // Call back to the original function
}
```

#### Advantages of Recursion

- Simplifies Complex Problems: Recursion can simplify the solution to complex problems by breaking them down into smaller, more manageable pieces.
- Natural Fit for Certain Problems: Some problems, particularly those involving hierarchical data structures (like trees or graphs), are naturally suited to recursive solutions.

#### Disadvantages of Recursion

- Performance Overhead: Each recursive call adds a new layer to the call stack, which can lead to high memory usage and slower performance compared to iterative solutions.
- Risk of Stack Overflow: If the base case is not properly defined or if the recursion is too deep (i.e., too many recursive calls), the program can run out of stack memory, resulting in a stack overflow error.
- Complexity: Recursive solutions can be more difficult to understand and debug, especially for those new to the concept.

#### Use Cases

Recursion is particularly useful in scenarios where a problem can be naturally divided into similar subproblems, such as:

- Mathematical Calculations: Functions like factorials, Fibonacci sequences, or powers.
- Data Structure Traversal: Navigating trees, graphs, or other nested data structures.
- Algorithms: Recursive algorithms like quicksort, merge sort, and binary search.

Recursion is a powerful tool in a programmer's arsenal, but it should be used judiciously, especially when performance and memory usage are critical considerations.

### Merge Sort

**Merge Sort** is a divide-and-conquer algorithm that efficiently sorts an array by dividing it into smaller subarrays, sorting those subarrays, and then merging them back together. This approach ensures that the entire array is sorted in a methodical and efficient manner.

#### How It Works

1. **Divide**: The algorithm starts by dividing the array into two roughly equal halves. This process is repeated recursively until each subarray contains only one element. At this point, each element is considered sorted by definition.

2. **Conquer**: Once the array has been divided into individual elements, the algorithm begins to merge these elements back together. During the merging process, the elements are compared and sorted, ensuring that the resulting merged array is in order.

3. **Combine**: Finally, the sorted subarrays are combined back together to form a fully sorted array.

#### Visualization of the Process

Here is a visual representation of how Merge Sort works:

![Merge Sort Process](https://cdn.educba.com/academy/wp-content/uploads/2021/06/7.png)

This image illustrates the process of dividing the array into smaller subarrays, sorting them, and then merging them back together.

#### Time Complexity

- **O(n log n)** — Merge Sort consistently operates with a time complexity of O(n log n), making it efficient for large datasets. This efficiency comes from the fact that the array is divided in half at each step (log n divisions) and each level requires a linear amount of work to merge the subarrays (n operations).

#### Space Complexity

- **O(n)** — Merge Sort requires additional memory proportional to the size of the array being sorted. This space is used to hold the left and right subarrays during the merge process. The need for extra storage makes Merge Sort less space-efficient compared to in-place sorting algorithms like Quick Sort.

#### Advantages

- **Stable Sorting**: Merge Sort is stable, meaning that it preserves the relative order of equal elements in the array.
- **Predictable Performance**: It has a consistent O(n log n) time complexity, regardless of the initial order of elements.
- **Efficient for Large Datasets**: Particularly useful for sorting large datasets due to its efficient handling of data.

#### Disadvantages

- **Additional Memory Usage**: Merge Sort requires additional memory proportional to the size of the array being sorted, as it needs space to hold the left and right subarrays during the merge process.
- **Not In-Place**: Unlike some other sorting algorithms, Merge Sort does not sort the array in place; it requires extra storage, which can be a disadvantage in memory-constrained environments.

#### Use Cases

Merge Sort is particularly useful in scenarios where:

- **Stable Sort is Required**: Situations where maintaining the relative order of records with equal keys is important.
- **Large Data Volumes**: Handling large datasets that need to be sorted efficiently, especially when the data is stored on external storage or needs to be processed in chunks.
- **External Sorting**: Commonly used in external sorting algorithms where the data is too large to fit into memory and needs to be sorted using external storage.

Merge Sort is a powerful sorting algorithm, especially when working with large datasets or when stability is a concern. It is widely used in various applications, from simple data sorting to more complex algorithms in computer science.

### QuickSort

**QuickSort** is a highly efficient sorting algorithm that follows the divide-and-conquer paradigm. It works by selecting a "pivot" element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. The sub-arrays are then recursively sorted. This process results in a sorted array.

#### How It Works

1. **Choose a Pivot**: Select an element from the array to serve as the pivot. Common choices include picking the first element, the last element, or a random element.

2. **Partitioning**: Rearrange the array so that all elements less than the pivot are on the left side of the pivot and all elements greater than the pivot are on the right side. The pivot element is then placed in its correct sorted position.

3. **Recursively Sort Sub-arrays**: Recursively apply the above steps to the sub-arrays on the left and right of the pivot.

4. **Base Case**: The recursion terminates when the sub-array has fewer than two elements, meaning it is already sorted.

#### Visualization of the Process

Here is a visual representation of how QuickSort works:

![QuickSort Process](https://cdn-images-1.medium.com/max/1080/1*zI6AMtMYGWqOQUo80r3v8A.jpeg)

This image illustrates the process of choosing a pivot, partitioning the array around the pivot, and recursively sorting the sub-arrays.

#### Time Complexity

- **Best and Average Case**: O(n log n) — QuickSort is efficient when the pivot divides the array into two nearly equal sub-arrays.
- **Worst Case**: O(n^2) — This occurs when the pivot is consistently the smallest or largest element, leading to unbalanced partitions.

#### Space Complexity

- **O(log n)** — QuickSort is an in-place sorting algorithm, meaning it requires only a small, constant amount of extra space for the recursion stack. However, in the worst case, the space complexity can degrade to O(n) due to deep recursion.

#### Advantages

- **Efficiency**: QuickSort is generally faster in practice than other O(n log n) algorithms like Merge Sort, especially for large datasets.
- **In-Place Sorting**: It sorts the array in place, requiring only a small amount of extra memory.
- **Flexibility**: It can be implemented with different strategies for choosing the pivot, which can be tailored to the specific characteristics of the data.

#### Disadvantages

- **Worst-Case Performance**: In its basic form, QuickSort has a worst-case time complexity of O(n^2), which can occur if the pivot selection is poor.
- **Not Stable**: QuickSort is not a stable sort, meaning that the relative order of equal elements may not be preserved.

#### Use Cases

QuickSort is particularly useful in scenarios where:

- **Large Datasets**: It is often the fastest algorithm for large datasets, especially when the dataset can be partitioned effectively.
- **In-Place Sorting**: When memory usage is a concern, QuickSort's in-place sorting is an advantage.
- **General Purpose**: QuickSort is a good default choice for a general-purpose sorting algorithm, with a good balance of efficiency and ease of implementation.

QuickSort is one of the most widely used sorting algorithms due to its efficiency and performance in average cases, making it a popular choice in many real-world applications.

### Hash Tables

