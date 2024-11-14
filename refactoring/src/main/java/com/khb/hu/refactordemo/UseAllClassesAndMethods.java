package com.khb.hu.refactordemo;

import java.awt.*;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseAllClassesAndMethods {
    public static void main(String[] args) throws Exception {

        Map<Integer, List<String>> mappedValues = new HashMap<>();
        mappedValues.put(1, List.of("1"));
        Map<Integer, List<String>> mappedValues2 = new HashMap<>();
        mappedValues.put(1, List.of("223455"));


        CodeMigration codeMigration = new CodeMigration();
        System.out.println(codeMigration.getDamageToPlanet(CodeMigration.SingleUsePlastic.CUP));
        System.out.println(codeMigration.getDamageToPlanet(CodeMigration.SingleUsePlastic.FORK));
        codeMigration.isLetterTrueFont('c', null, 10);
        codeMigration.process(new Font("Sans", 12, 20), 1, new Tree());
        codeMigration.process(new Font("Sans", 12, 20), 11, new Tree());
        codeMigration.usingTryWithResources();
        codeMigration.processMap(1, "k", mappedValues);
        codeMigration.processMap(1111, "simehhtk", mappedValues2);
        System.out.println(codeMigration.replaceWithCollect(new String[]{"1", "2"}));
        System.out.println(codeMigration.findTopTen(List.of(new Counter(), new Counter())));

        ControlFlowIssues controlFlowIssues = new ControlFlowIssues();
        controlFlowIssues.addValues("Sunday");
        controlFlowIssues.addValues("Monday");
        controlFlowIssues.addValuesAgain("Monday");
        controlFlowIssues.addValuesAgain("Moddfnday");
        System.out.println(controlFlowIssues.binaryStrings("hujg"));
        System.out.println(controlFlowIssues.binaryStrings("hujgsw"));
        System.out.println(controlFlowIssues.getResult(23));
        System.out.println(controlFlowIssues.getResult(2553));

        Bug nn = new Bug(1, "jlk", BugLevel.NEW);

        Bug b = new Bug(12, "kkkk");
        System.out.println(b.equals(new Bug(12, "0")));
        System.out.println(b.getBugLevel());
        System.out.println(b.getDescription());
        System.out.println(b.getId());

        BugReport bugReport = new BugReport(null);
        System.out.println(new BugReport(null).binaryStrings("10", true, 10));

        ViewImpl view = new ViewImpl();
        System.out.println(view.getItems(List.of(1, 2, 3, 4, 5)));

        new A().drawEdge(null, new Edge(0.5f, 1, 100, 1, 200));
    }

    public List<String> replaceWithCollect(String[] stringArray) {
        List<String> result = new ArrayList<>();
        for (String line : stringArray) {
            if (line != null) {
                for (String word : line.split("\\s")) {
                    if (word.startsWith("Mi"))
                        result.add(word);
                }
            }
        }
        return result;
    }

    final Stream<String> stream = Stream.of("a", "b", "c");
    final List<String> strings = stream.collect(Collectors.toList());
}
