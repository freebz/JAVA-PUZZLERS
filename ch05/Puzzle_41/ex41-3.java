} finally {
    closeIgnoreingException(in);
    closeIgnoreingException(out);
}

private static void closeIgnoreingException(Closeable c) {
    if (c != null) {
	try {
	    c.close();
	} catch (IOException ex) {
	    // close() 메서드가 실패해도 딱히 할 일이 없습니다.
	}
    }
}
