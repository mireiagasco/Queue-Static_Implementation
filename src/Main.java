import Exceptions.QueueIsEmpty;
import Exceptions.QueueIsFull;

public class Main {

    public static void main(String[] args){
        Queue queue = new Queue(5);

        try {

            System.out.println("\n>>>Enqueuing numbers from 0 to 4...");
            for (int i = 0; i < 5; i++){
                queue.enqueue(i);
            }
        }
        catch (QueueIsFull e){
            System.out.println(e);
        }
        finally {
            System.out.println("Done. Queue generated:");
        }

        System.out.println(queue);
        System.out.println("Length: " + queue.getLenght());

        try {
            System.out.println("\n>>>Dequeuing some elements...");
            System.out.println("First element: " + queue.dequeue());
            System.out.println("Second element: " + queue.dequeue());
            System.out.println("Third element: " + queue.dequeue());
        }
        catch (QueueIsEmpty e){
            System.out.println(e);
        }

        System.out.println(queue);
        System.out.println("Length: " + queue.getLenght());

        try {

            System.out.println("\n>>>Enqueuing numbers from 5 to 7...");
            for (int i = 5; i < 8; i++){
                queue.enqueue(i);
            }
        }
        catch (QueueIsFull e){
            System.out.println(e);
        }
        finally {
            System.out.println("Done. Queue generated:");
        }

        System.out.println(queue);
        System.out.println("Length: " + queue.getLenght());

    }
}
