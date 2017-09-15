package com.focusnetworks.parser.content;

public class IntegerHandler implements ContentHandler {

    @Override
    public void handle(final String content) {
        final Integer value = Integer.valueOf(content);
        System.out.print(value + " ");
    }
}
