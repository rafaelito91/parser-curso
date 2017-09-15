package com.focusnetworks.parser.content;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateHandler implements ContentHandler {
    @Override
    public void handle(final String content) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(content, formatter);
        System.out.print(localDate + " ");
    }
}
