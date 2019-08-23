static <E> List<E> withoutDuplicates(List<E> original) {
    return new ArrayList<E>(new LinkedHashSet<E>(original));
}
