package day4;

public class ThreaTest {
	public static void main(String[] args) throws InterruptedException {
		
		Job1 job1 = new Job1();
		job1.start();
		
		Thread thread = new Thread(new Job2());
		thread.start();
		
		Runnable run = () -> {
				for(int i=201; i<210; i++) {
					System.out.println(i);
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			Thread thread2 = new Thread(run);
			thread2.start();
		
		
	
	}
}
