package producerconsumer;

public class ProducerConsumerMain {
    public static void main(String[] args) throws InterruptedException {
        ShowMessage board = new ShowMessage();
        Producer p = new Producer(board);
        Consumer c = new Consumer(board);

        p.start();
        c.start();

        p.join();
        c.join();
    }
}
