public static void shuffle(Object[] a) {
    for (int i = 0; i < a.length; i++)
	swap(a, i, i + rnd.nextInt(a.length - i));
}
