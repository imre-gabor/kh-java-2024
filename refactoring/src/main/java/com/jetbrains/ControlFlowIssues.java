package com.jetbrains;
import java.util.ArrayList;
import java.util.Stack;

public class ControlFlowIssues {
    public static boolean binaryStrings(String b) {
        new ControlFlowIssues().addValues("k");
        Stack<Character> s = new Stack<>();
        for (char c : b.toCharArray())
            if (s.empty() || !s.peek().equals(c)) s.push(c);
            else s.pop();
        return s.empty();
    }

    public void addValues(String day) {
        ArrayList<Integer> numbers = new ArrayList<>();
        addValuesToList(numbers);
        String myFavDay = "Sunday";
        if (myFavDay.equals(day)) {
            numbers.add(1, 100);
        }
        System.out.println(numbers.get(0));
    }

    private void addValuesToList(ArrayList<Integer> numbers) {
        numbers.add(0, 10);
        numbers.add(1, 765);
        numbers.add(2, 876);
    }

    public void addValuesAgain(String day) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0, 10);
        String myFavDay = "Sunday";
        if (myFavDay.equals(day)) {
            numbers.add(1, 100);
            System.out.println(numbers.get(0));
        }
    }

    boolean getResult(int number) {
        return number % 2 == 0;
    }
}
