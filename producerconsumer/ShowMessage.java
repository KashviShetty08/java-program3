package producerconsumer;
//ShowMessage.java

class ShowMessage {
 private String message;
 private boolean hasMessage = false;

 public synchronized void put(String msg) {
     while (hasMessage) {
         try {
             wait(); // Wait until the old message is consumed
         } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
         }
     }
     message = msg;
     hasMessage = true;
     System.out.println("Producer sends: " + msg);
     notify(); // Notify the waiting consumer
 }

 public synchronized String get() {
     while (!hasMessage) {
         try {
             wait(); // Wait until a new message is produced
         } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
         }
     }
     String msg = message;
     hasMessage = false;
     System.out.println("Consumer reads: " + msg);
     notify(); // Notify the producer
     return msg;
 }
}

