class Point {
    protected final int x, y;
    private String name; // 게으른 초기화

    Point(int x, int y) {
	this.x = x;
	this.y = y;
	// name 초기화 제거
    }

    protected String makeName() {
	return "[" + x + "," + y + "]";
    }

    // 처음 사용하는 시점에 초기화합니다.
    public final synchronized String toString() {
	if (name == null)
	    name = makeName();
	return name;
    }
}
