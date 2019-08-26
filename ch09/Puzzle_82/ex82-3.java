} else {
    // 마스터
    Process process = Runtime.getRuntime().exec(COMMAND);
    drainInBackground(process.getInputStream());
    int exitValue = process.waitFor();
    System.out.println(exitValue);
}
