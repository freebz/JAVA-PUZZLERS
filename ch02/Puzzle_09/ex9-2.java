short x = 0;
int i = 123456;


x += i;  // 자동 자료형 변환이 일어납니다. (-7616)


x = x + i;  // 'possible loss of precision' 오류가 발생하고 컴파일되지 않습니다.
