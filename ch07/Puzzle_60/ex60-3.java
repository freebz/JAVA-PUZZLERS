Object[] array = {1, 2, 3, new int[] {1, 2, 3}, new int[] {1, 2, 3}};
System.out.println(Arrays.deepToString(array));
// [1, 2, 3, [1, 2, 3], [1, 2, 3]]


Object[] array = {1, 2, 3, new int[] {1, 2, 3}, new int[] {1, 2, 3}};
array[0] = array;
System.out.println(Arrays.deepToString(array));
// [[...], 2, 3, [1, 2, 3], [1, 2, 3]]
