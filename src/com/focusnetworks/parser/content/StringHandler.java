package com.focusnetworks.parser.content;

public class StringHandler implements ContentHandler {

    @Override
    public void handle(final String content) {
        System.out.print(content + " ");
    }
}
