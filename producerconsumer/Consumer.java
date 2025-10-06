package producerconsumer;



public class Consumer extends Thread {
    private ShowMessage board;

    public Consumer(ShowMessage b) {
        this.board = b;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            board.get();
        }
    }
}
