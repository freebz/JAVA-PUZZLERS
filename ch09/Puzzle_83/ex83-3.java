private Object readResolve() {
    // 새로운 인스턴스를 만드는 것을 막습니다!
    return INSTANCE;
}
