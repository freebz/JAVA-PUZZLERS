public enum CoinSide {
    HEADS, TAILS;

    public String toString() {
	return name().toLowerCase();
    }

    // 생략: flip() 메서드와 main() 메서드는 위 1.4 버전의 코드와 같습니다.
}
