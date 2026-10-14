package mypackage5aw;
	class Buffer {
	    int item;
	    boolean available = false;

	    synchronized void produce(int x) throws InterruptedException {
	        while (available)
	            wait();

	        item = x;
	        System.out.println("Produced: " + item);
	        available = true;
	        notify();
	    }

	    synchronized void consume() throws InterruptedException {
	        while (!available)
	            wait();

	        System.out.println("Consumed: " + item);
	        available = false;
	        notify();
	    }
	}

	public class Program17{
	    public static void main(String[] args) {
	        Buffer b = new Buffer();

	        new Thread(() -> {
	            try {
	                b.produce(10);
	            } catch (Exception e) {}
	        }).start();

	        new Thread(() -> {
	            try {
	                b.consume();
	            } catch (Exception e) {}
	        }).start();
	    }
}
