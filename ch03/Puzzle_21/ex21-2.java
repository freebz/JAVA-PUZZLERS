System.out.println(MeToo.class.getName().replaceAll(
    "\\.", Matcher.quoteReplacement(File.separator)) + ".class");
