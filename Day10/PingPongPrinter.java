import java.util.Random;

public class PingPongPrinter {
    public static void main(String[] args) {
        Random random = new Random();

        Thread pingThread = new Thread(() ->  {
            while (true) {
                System.out.println("ping");
                try {
                    Thread.sleep(random.nextInt(1000)); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
	}
            
        });

        Thread pongThread = new Thread(() -> {
            while (true) {
                System.out.println("PONG");
                try {
                    Thread.sleep(random.nextInt(1000)); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        pingThread.start();
        pongThread.start();
    }
}