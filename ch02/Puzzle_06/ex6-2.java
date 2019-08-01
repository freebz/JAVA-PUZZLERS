int i = c & 0xffff;

int i = c;  // 부호 확장이 일어나지 않습니다.

int i = (short) c;  // 부호 확장이 일어납니다.

char c = (char) (b & 0xff);

char c = (char) b;  // 부호 확장이 일어납니다.
