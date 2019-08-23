private final Object lock = new Object();

// 모든 직원이 기다리는 퇴근 시간 - 좋은 상사가 호출합니다.
void quit() throws InterruptedException {
    synchronized (lock) {
	quittingTime = true;
	join();
    }
}

// 퇴근을 막는 것 - 나쁜 상사가 호출합니다.
void keepWorking() {
    synchronized (lock) {
	quittingTime = false;
    }
}
