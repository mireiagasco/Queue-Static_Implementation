# Static implementation of a queue using Java

This implementation of a static queue has been built using a circular array.  This means that once the elements get to the end of the array, if the first positions are empty, new elements will be stored at the begining.  This solution solves possible space managing problems, as an implementation with a normal array would cause problems once the elements of the queue got to the last positions of the array, leaving the firts positions of the vector empty once the elements there were dequeued.

To implement it, three auxiliar values have been used:
* Start: an integer indicating the position of the array where the next element to be dequeued is stored.
* Finish: an integer indicating the position of the array where the last element was added.
* Length: an integer indicating the total number of elements waiting in the queue.

This three variables are used to avoid the queue going out of the array bounds unexpectedly and to be able to control easily the `enqueue()` and `dequeue()` functionality.

## Implemented Methods
The implementation includes the following methods:
* `enqueue()`: adds the integer indicated as an argument to the end of the queue.  Throws the exception `QueueIsFull` if the element cannot be added due to the queue being full.
* `dequeue()`: removes and returns the firts element waiting in the queue.  Throws the exception `QueueIsEmpty` if there are no elements to be removed.
* `getLenght()`: returns the number of elements that are waiting in the queue.
* `isEmpty()`: returns true if the queue is empty, false if it has one element or more in it.
