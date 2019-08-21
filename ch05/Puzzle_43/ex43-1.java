// 이렇게 하지 마세요!
public static void sneakyThrow(Throwable t) {
    Thread.currentThread().stop(t); // 지원 중단되었습니다!
}
