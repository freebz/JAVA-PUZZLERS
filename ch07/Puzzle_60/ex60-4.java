static boolean hasMoreBitsSet(int i, int j) {
    return (Integer.bitCount(i) > Integer.bitCount(j));
}
