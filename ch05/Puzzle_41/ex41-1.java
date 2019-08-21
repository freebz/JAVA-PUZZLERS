static void copy(String src, String dest) throws IOException {
    InputStream in = null;
    OutputStream out = null;
    try {
	in = new FileInputStream(src);
	out = new OutputStream(dest);
	byte[] buf = new Byte[1024];
	int n;
	while ((n = in.read(buf)) >= 0)
	    out.write(buf, 0, n);
    } finally {
	if (in != null) in.close();
	if (out != null) out.close();
    }
}
