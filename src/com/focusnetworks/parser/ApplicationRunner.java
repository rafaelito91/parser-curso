package com.focusnetworks.parser;

public class ApplicationRunner {

    private static final String FILE_PATH = "input.txt";

    public static void main(String[] args) {
        final ApplicationFileReader applicationFileReader = new ApplicationFileReader();
        applicationFileReader.read(FILE_PATH);
    }
}
