package threads;

public class mineThreads extends Thread {

	public void run() {

		System.out.println("this thread is running");
		System.out.println(getId());

	}

	public static void main(String[] args) {

		Thread t3 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getId() + " Value " + i);
			}
		});

		mineThreads thread1 = new mineThreads();
		t3.start();

		try {
			thread1.join();

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		mineThreads thread2 = new mineThreads();

		thread2.start();
		System.out.println("reach here");

	}

}
