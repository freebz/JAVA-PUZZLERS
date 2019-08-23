import java.util.*;
public class Worker extends Thread {
    private volatile boolean quittingTime = false;
    public void run() {
	while (!quittingTime)
	    pretendToWork();
	System.out.println("Beer is good");
    }
    private void pretendToWork() {
	try {
	    Thread.sleep(300); // 휴식?
	} catch (InterruptedException ex) { }
    }
    // 모든 직원이 기다리는 퇴근 시간 - 좋은 상사가 호출합니다.
    synchronized void quit() throws InterruptedException {
	quittingTime = true;
	join();
    }
    // 퇴근을 막는 것 - 나쁜 상사가 호출합니다.
    synchronized void keepWorking() {
	quittingTime = false;
    }

    public static void main(String[] args) throws InterruptedException {
	final Worker worker = new Worker();
	worker.start();

	Timer t = new Timer(true); // 데몬 스레드
	t.schedule(new TimerTask() {
	    public void run() { worker.keepWorking(); }
	}, 500);
    
	Thread.sleep(400);
	worker.quit();
    }
}
