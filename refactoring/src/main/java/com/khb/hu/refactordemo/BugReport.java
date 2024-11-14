package com.khb.hu.refactordemo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Stack;

public class BugReport {
    public static final String AA_BB = "AA|BB";
    List<Bug> BugList;

    public static boolean beautifulBinaryStrings(String s) {
        while (!s.equals(s = s.replaceAll(AA_BB, ""))) {
            System.out.println(s);
        }
        return s.isEmpty();
    }

    public BugReport(List<Bug> BugList) {
        this.BugList = BugList;
    }

    public void generateReport(List<Bug> bugList) {
        int a = 10; a += 10;
        System.out.println(a);
        int aa = 20; aa += 20;
        System.out.println(aa);
        System.out.println(bugList);
    }

    public boolean binaryStrings(String b, Boolean state, int counter) {
        return binaryStrings(b, counter, state);
    }

    public boolean binaryStrings(String b, int counter, Boolean state) {
        return binaryStrings(b, counter, state, 1.0);
    }

    public boolean binaryStrings(String b, int counter, Boolean state, double x) {
        Stack<Character> s = new Stack<>();
        for (char c : b.toCharArray())
            if (s.empty() || !s.peek().equals(c))
                s.push(c);
            else
                s.pop();

        return s.empty();
    }


    public static void main(String[] args) {
        BugReport bugReport = new BugReport(List.of(new Bug(10, "A")));
        System.out.println(bugReport.binaryStrings("Java", true, 10));
    }

    String getFormattedDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(date);
    }

    private boolean isBreakRequiredBetweenSession(String day, int duration) {
        if (isWeekend(day))
            return isDurationGreaterThan50min(duration);
        else
            return false;
    }

    private boolean isDurationGreaterThan50min(int duration) {
        return duration > 50;
    }

    private boolean isWeekend(String day) {
        return day.equals("Sunday");
    }
}
