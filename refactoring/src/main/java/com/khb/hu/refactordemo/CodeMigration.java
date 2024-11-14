package com.khb.hu.refactordemo;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class CodeMigration {
    // migrating code to Java 8 and above
    void processMap(int key, String value, Map<Integer, List<String>> mappedValues) {
        List<String> list = mappedValues.computeIfAbsent(key, k -> List.of(value, "Sun"));
    }

    public List<String> replaceWithCollect(String[] stringArray) {
        return Arrays.stream(stringArray)
                .filter(Objects::nonNull)
                .flatMap(line -> Arrays.stream(line.split("\\s")))
                .toList();
    }

    // Lambda can be replaced with method reference
    public List<Counter> findTopTen(List<Counter> counters) {
        return counters.stream()
                       .sorted(Comparator.naturalOrder())
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
        return switch (plastic) {
            case CUP -> 12;
            case FORK, SPOON -> 15;
        };
    }

    // Modify pre-Java 14 code to use PatternMatching for instanceof added in Java 14
    void process(Font font, int size, Tree modules) {
        final ArrayList<Node> list = modules.getChildren();
        for (Iterator<Node> i = list.iterator(); i.hasNext(); ) {
            final Object o = i.next();
            if (o instanceof LetterNode letterNode) {
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
