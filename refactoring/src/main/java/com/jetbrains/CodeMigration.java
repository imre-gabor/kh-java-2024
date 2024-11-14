package com.jetbrains;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;

public class CodeMigration {
    // migrating code to Java 8 and above
    void processMap(int key, String value, Map<Integer, List<String>> mappedValues) {
        List<String> list = mappedValues.get(key);
        if (list == null) {
            list = List.of(value, "Sun");
            mappedValues.put(key, list);
        }
    }

    public List<String> replaceWithCollect(String[] stringArray) {
        List<String> result = new ArrayList<>();
        for (String line : stringArray) {
            if (line != null) {
                for (String word : line.split("\\s")) {
                    result.add(word);
                }
            }
        }
        return result;
    }

    // Lambda can be replaced with method reference
    public List<Counter> findTopTen(List<Counter> counters) {
        return counters.stream()
                       .sorted((o1, o2) -> o1.compareTo(o2))
                       .limit(10)
                       .collect(toList());
    }

    void usingTryWithResources() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {
            String data = reader.readLine();
            System.out.println(data);
        }
    }

    enum SingleUsePlastic {CUP, FORK, SPOON}

    int getDamageToPlanet(SingleUsePlastic plastic) {
        int result;
        switch (plastic) {
            case CUP:
                result = 12;
                break;
            case FORK:
                result = 15;
                break;
            case SPOON:
                result = 15;
                break;
            default:
                result = 200;
                break;
        }
        return result;
    }

    // Modify pre-Java 14 code to use PatternMatching for instanceof added in Java 14
    void process(Font font, int size, Tree modules) {
        final ArrayList<Node> list = modules.getChildren();
        for (Iterator<Node> i = list.iterator(); i.hasNext(); ) {
            final Object o = i.next();
            if (o instanceof LetterNode) {
                LetterNode letterNode = (LetterNode) o;
                if (letterNode.isLatin() && !isLetterTrueFont(letterNode.getNodeValue(), font, size)) {
                    i.remove();
                }
            }
        }
    }

    boolean isLetterTrueFont(char letter, Font font, int size) {
        System.out.println(letter);
        System.out.println(font);
        System.out.println(size);
        boolean result;
        // TO DO: add code here
        result = true;
        return result;
    }
}
