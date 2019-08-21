} finally {
    if (in != null) {
	try {
	    in.close();
	} catch (IOException ex) {
	    // close() 메서드가 실패해도 딱히 할 일이 없습니다.
	}
    }

    if (out != null) {
	try {
	    out.close();
	} catch (IOException ex) {
	    // close() 메서드가 실패해도 딱히 할 일이 없습니다.
	}
    }
}
