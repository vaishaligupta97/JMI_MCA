import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask {
	public void run() {
		System.out.println("Time is up"); // Display message
	}
}
class SchedulerTest {
	public static void main(String args[]) throws InterruptedException {

		Timer time = new Timer(); 
		Task st = new Task(); 
		time.schedule(st, 0, 1000); // Create Repetitively task for every 1 secs

		for (int i = 0; i <= 5; i++) {
			System.out.println("Execution in Main Thread...." + i);
			Thread.sleep(2000);
			if (i == 5) {
				System.out.println("Application Terminates");
				System.exit(0);
			}
		}
	}
}