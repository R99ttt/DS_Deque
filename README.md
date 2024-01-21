# Data Structure Assignment - Deque Operations and Circular List Analysis

This Java repository, collaboratively developed by Yarin Ackerman and Rami AboRabia, encompasses the implementation of various operations on a custom Double-Ended Queue (Deque) and the analysis of circular lists.

## Table of Contents
- [Part 1 (Deque Operations)](#part-1-deque-operations)
  - [Overview](#overview)
  - [Functions](#functions)
  - [Usage](#usage)
- [Part 2 (Circular List Analysis)](#part-2-circular-list-analysis)
  - [Overview](#overview-1)
  - [Functions](#functions-1)
  - [Usage](#usage-1)
  - [License](#license)
  - [Authors](#authors)

## Part 1 - Deque Operations

### Overview
This section focuses on the implementation of a custom Double-Ended Queue (Deque) in Java, featuring operations such as inserting at the front/back and removing from the front/back.

### Functions
1. `insertAtFront(T value)`: Inserts an element at the front of the Deque.
2. `insertAtBack(T value)`: Inserts an element at the back of the Deque.
3. `removeFromFront()`: Removes an element from the front of the Deque.
4. `removeFromBack()`: Removes an element from the back of the Deque.
5. `getFrontValue()`: Retrieves the value at the front of the Deque.
6. `getRearValue()`: Retrieves the value at the rear of the Deque.
7. `print()`: Prints the elements of the Deque.

### Usage
Initialize a `MyDeque` object and perform various operations using the provided functions. See the `Main` class for an example.

## Part 2 - Circular List Analysis

### Overview
This section involves the analysis of circular lists, checking for circularity and identifying nodes within the circular part of the list.

### Functions
1. `checkCircular(Node<T> node)`: Checks if a given list is circular and returns a node within the circular part.
2. `reverse(MyDeque<Integer> deque)`: Reverses the elements of a Deque.
3. `replaceHalves(MyDeque<Integer> deque)`: Replaces the elements of the first half with the elements of the second half in a Deque.
4. `removeIdentical(MyDeque<Integer> deque)`: Removes identical consecutive elements from a Deque.
5. `nodeToList(Node<Integer> head)`: Converts a linked list to a list representation.
6. `isCyclic(Node<Integer> head)`: Checks if a linked list is cyclic.

### Usage
Explore each function in the `Main` class by running the `main` method with appropriate inputs. See the comments within the code for more details.

## License
This code is released under the MIT License. Refer to the [LICENSE](LICENSE) file for details.

## Authors
- Yarin Ackerman
- Rami AboRabia

Feel free to explore, adapt, or extend the implementations for different scenarios or reach out to the authors for any inquiries or improvements.
