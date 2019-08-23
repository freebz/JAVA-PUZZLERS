private static int mod(int i, int modulus) {
    int result = i % modulus;
    return result < 0 ? result + modulus : result;
}
