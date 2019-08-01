// 자바에서 x ^= y ^= x의 실행 순서
int tmp1 = x;       // x 획득
int tmp2 = y;	    // y 획득
int tmp3 = x ^ y;   // x ^ y 계산
x = tmp3;	    // x ^ y를 x에 넣음
y = tmp2 ^ tmp3;    // 원래 x를 y에 저장
x = tmp1 ^ y;	    // x에 0을 저장
