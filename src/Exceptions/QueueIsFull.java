package Exceptions;

public class QueueIsFull extends Exception{

    public QueueIsFull(int element){
        super("The queue is full. " + element + " could not be enqueued");
    }
}
