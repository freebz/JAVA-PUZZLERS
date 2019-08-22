// AtomicLong 클래스를 사용한 인스턴스 개수 세는 코드
import java.util.concurrent.atomic.AtomicLong;

class Creature {
    private static AtomicLong newCreated = new AtomicLong();

    public Creature() {
	numCreated.incrementAndGet();
    }

    public static long numCreated() {
	return numCreated.get();
    }
}
