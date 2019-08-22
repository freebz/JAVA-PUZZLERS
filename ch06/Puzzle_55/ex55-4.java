// 스레드를 여러 개 사용해도 문제없이 인스턴스 개수를 세는 코드
class Creature {
    private static long numCreated;

    public Creature() {
	synchronized (Creature.class) {
	    numCreated++;
	}
    }

    public static synchronized long numCreated() {
	return numCreated;
    }
}
