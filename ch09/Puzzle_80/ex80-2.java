private void greetWorld() throws Exception {
    Constructor c = Inner.class.getConstructor(Outer.class);
    System.out.println(c.newInstance(Outer.this));
}
