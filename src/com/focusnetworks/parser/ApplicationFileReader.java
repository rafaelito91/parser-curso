package com.focusnetworks.parser;

import com.focusnetworks.parser.content.ContentHandler;
import com.focusnetworks.parser.content.DateHandler;
import com.focusnetworks.parser.content.IntegerHandler;
import com.focusnetworks.parser.content.StringHandler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ApplicationFileReader {

    public void read(final String filePath) {
         try {
             final BufferedReader br = new BufferedReader(new FileReader(filePath));
             final String fileIndex = br.readLine();
             final String fileDate = br.readLine();
             final String username = br.readLine();

             final Map<Integer, ContentHandler> handlers = getHandlers();
             String currentLine;
             while ((currentLine = br.readLine()) != null) {
                 final String[] lineContents = currentLine.split(" ");
                 for (int i = 0; i < lineContents.length; i++) {
                     handlers.get(i).handle(lineContents[i].trim());
                 }
                 System.out.println();
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
    }

    private Map<Integer, ContentHandler> getHandlers() {
        final ContentHandler dateHandler = new DateHandler();
        final ContentHandler integerHandler = new IntegerHandler();
        final ContentHandler stringHandler = new StringHandler();

        final Map<Integer, ContentHandler> handlers = new HashMap<>();
        handlers.put(0, integerHandler);
        handlers.put(1, dateHandler);
        handlers.put(2, stringHandler);
        handlers.put(3, integerHandler);

        return handlers;
    }
}
