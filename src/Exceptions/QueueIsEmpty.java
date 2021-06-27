package Exceptions;

public class QueueIsEmpty extends Exception{

    public QueueIsEmpty(){
        super("The queue is empty");
    }
}
