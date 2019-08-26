static void drainInBackground(final InputStream is) {
    new Thread(new Runnable() {
	public void run() {
	    try {
		while(is.read() >= 0) ;
	    } catch (IOException e) {
		// IOException이 발생하는 경우에 리턴
	    }
	}
    }).start();
}
