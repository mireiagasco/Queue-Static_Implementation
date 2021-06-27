import Exceptions.QueueIsEmpty;
import Exceptions.QueueIsFull;

/**
 * Static implementation of a queue using a circular array
 * @author Mireia Gasco Agorreta
 * @version 1.0
 */
public class Queue {

    //Attributes
    private int[] queue;
    private int start;      //index of the first element in the queue
    private int finish;     //index of the last element in the queue
    private int lenght;     //number of elements in the queue

    //Constructor
    public Queue(int maxElem){
        this.queue = new int[maxElem];
        this.start = -1;
        this.finish = -1;
        this.lenght = 0;
    }

    //Methods

    /**
     * Enqueue method.  It adds a new integer to the queue.
     * @param newInt integer to be added.
     * @throws QueueIsFull in case the queue is full.
     */
    public void enqueue(int newInt) throws QueueIsFull {
        if (++finish == this.queue.length) finish = 0;  //if we are in the end of the array, we go back to the start
        if (finish == start){   //if the finish indexs equals the start index, the queue is full
            if (--finish < 0) finish = this.queue.length - 1;
            throw new QueueIsFull(newInt);
        }

        //now we have the new index and we know we can add a new element to its position
        this.queue[this.finish] = newInt;

        if (lenght == 0){   //if we are adding the first element, we set the start index to its position
            this.start = this.finish;
        }

        this.lenght++;  //we increase the queue length indicator
    }

    /**
     * Dequeue method.  Removes and returns the firts element in the queue.
     * @return the first element in the queue.
     * @throws QueueIsEmpty in case the queue is empty.
     */
    public int dequeue() throws QueueIsEmpty{

        if (isEmpty()){
            throw new QueueIsEmpty();
        }

        int element = this.queue[this.start];
        lenght--;

        if (++this.start == this.queue.length) this.start = 0;
        if (lenght == 0){
            this.finish = this.start;
        }

        return element;
    }

    /**
     * Size method.  Indicates the number of elements in the queue.
     * @return returns the length of the queue.
     */
    public int getLenght(){
        return this.lenght;
    }

    /**
     * Empty method.  Indicates if the queue is empty.
     * @return true if the queue is empty, false if it is not.
     */
    public boolean isEmpty(){
        return lenght == 0;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nStart --> ");

        int index = this.start;

        for (int i = 0; i < this.lenght; i++){
            sb.append(this.queue[index] + " ");
            if (++index == this.queue.length) index = 0;
        }

        sb.append("<-- Finish\n");

        return sb.toString();
    }
}
