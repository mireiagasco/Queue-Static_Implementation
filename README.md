# Static implementation of a queue using Java

This implementation of a static queue has been built using a circular array.  This means that once the elements get to the end of the array, if the first positions are empty, new elements will be stored at the begining.  This solution solves possible space managing problems, as an implementation with a normal array would cause problems once the elements of the queue got to the last positions of the array, leaving the firts positions of the vector empty once the elements there were dequeued.\
To implement it, three auxiliar values have been used:
\tStart: an integer indicating the position of the array where the next element to be dequeued is stored.\
\tFinish: an integer indicating the position of the array where the last element was added.\
\tLength: an integer indicating the total number of elements waiting in the queue.\
