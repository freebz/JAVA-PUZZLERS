// f() 함수에 40억 개의 int 자료형을 매개변수로 넣어 실행합니다.
int i = Integer.MIN_VALUE;
do {
    f(i);
} while (i++ != Integer.MAX_VALUE);
