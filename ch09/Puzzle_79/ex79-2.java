public void live() {
    new Thread(new Runnable() {
	public void run() {
	    while (true) {
		eat();
		play();
		sleep();
	    }
	}
    }).start();
}
