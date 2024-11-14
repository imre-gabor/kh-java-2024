package com.khb.hu.javacourse.javafeatures;

import java.lang.reflect.Field;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //Java 12
//        java12StringDemo();
//        numberFormatDemo();

        //Java 14
//        System.out.println(isHoliday("MONDAY"));
//        System.out.println(isHoliday("SATURDAY"));
//        System.out.println(isHoliday("ASFDSA"));

        //Java 15
//        textBlockDemo();
//        npeDemo();

        //Java 16
//        recordDemo();
//        recordAnnotationDemo();
//        instanceofDemo(new Car("Honda"));
//        toListDemo();
//        dateTimeFormatB();

        //Java 17: sealed class

        //Java 21
        System.out.println(switchPatternDemo(1));
        System.out.println(switchPatternDemo(0));
        System.out.println(switchPatternDemo("Yes"));
        System.out.println(switchPatternDemo("No"));
        System.out.println(switchPatternDemo(null));
        System.out.println(switchPatternDemo(new A()));

        recordPatterMatchingDemo();
    }



    //Java 12
    private static void java12StringDemo() {
        String text = "Hello world\nThis is a Java 12 demo";
        String indent = text.indent(5);
        System.out.println(indent);
        System.out.println(indent.indent(-10));

        String letters= "abcdefghi";
        String transformed = letters.transform(Main::filterEvenChars);
        System.out.println(transformed);

    }

    private static String filterEvenChars(String s) {
        return s.chars()
                .filter(n -> n % 2 == 0)
                .mapToObj(n -> String.valueOf((char) n))
                .collect(Collectors.joining());
    }

    private static void numberFormatDemo() {
        NumberFormat snf = NumberFormat.getCompactNumberInstance(new Locale("hu", "HU"), NumberFormat.Style.SHORT);
        snf.setMaximumFractionDigits(2);
        System.out.println(snf.format(1234567.789));

        NumberFormat lnf = NumberFormat.getCompactNumberInstance(new Locale("hu", "HU"), NumberFormat.Style.LONG);
        lnf.setMaximumFractionDigits(2);
        System.out.println(lnf.format(1234567.789));
    }

    //Java 14
    public static boolean isHoliday(String day){
//        boolean isHoliday;
//        switch(day){
//            case "MONDAY":
//            case "TUESDAY":
//            case "WEDNESDAY":
//            case "THURSDAY":
//            case "FRIDAY":
//                isHoliday = false;
//                break;
//            case "SATURDAY":
//            case "SUNDAY":
//                isHoliday = true;
//                break;
//            default: throw new IllegalArgumentException();
//        }
//        return isHoliday;
        return switch(day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> {
                System.out.println(day);
                yield false;
            }
            case "SATURDAY", "SUNDAY" -> true;
            default -> throw new IllegalArgumentException();
        };
    }

    //Java 15

    private static void textBlockDemo() {
        String text = """
                     abc"d %d\
                   ef\\gh""   \s
                  ijkl\""" %s""".formatted(100, "xyz");
        System.out.println(text);
    }

    private static void npeDemo() {
        A a = new A();
        a.b = new B();
        System.out.println(a.b.c.d);
    }

    //Java 16
    public static void recordDemo() {
        Book book = new Book("abc", "my author", "12345ABC", null);
        Book book2 = new Book("abc", "my author", "12345ABC", null);

        System.out.println(book.title());
        System.out.println(book);
        System.out.println(book == book2);
        System.out.println(book.equals(book2));

        var map = new HashMap<Book, Integer>();
        map.put(book, 10);
        System.out.println(map.get(book2));
        System.out.println(book instanceof Record);

        Book book3 = new Book("abc", null, "12345ABC", null);
        System.out.println(book3);


        var book4 = new Book();
        var book5 = new Book("title");
        System.out.println(book4);
        System.out.println(book5);
    }

    public static void recordAnnotationDemo() {
        try {
            System.out.println((Book.class.getMethod("title").isAnnotationPresent(MyAnnotation.class)));
            System.out.println((Book.class.getMethod("title").getAnnotation(MyAnnotation.class)));


            Field titleField = Book.class.getDeclaredField("title");
            System.out.println((titleField.isAnnotationPresent(MyAnnotation.class)));
            System.out.println((titleField.getAnnotation(MyAnnotation.class)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void instanceofDemo(Vehicle v){
        if(v instanceof Car c){
            System.out.println(c.getModel());
        }

        System.out.println(isHonda(v));
    }

    private static boolean isHonda(Vehicle v) {
        return v instanceof Car c && "Honda".equalsIgnoreCase(c.getModel());
    }

    private static void toListDemo() {
        List<Integer> list1 = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toList());

        List<Integer> list2 = Stream.of(1, 2, 3, 4, 5)
                .toList();

        //list2.addAll(list1); --> biztosan kivétel, mert a toList immutable listát ad
        list1.addAll(list2); // --> most éppen még mutable, de nincs garancia
        System.out.println(list2);


    }

    public static void dateTimeFormatB(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(DateTimeFormatter.ofPattern("HH:mm B", new Locale("hu", "HU")).format(now));
    }

    //Java 21

    private static Boolean switchPatternDemo(Object input) {
        return switch(input) {
            case null -> null;
            case Integer i when i == 0 -> false;
            case Integer i when i != 0 -> true;
            case String s when "Yes".equalsIgnoreCase(s) -> true;
            case String s when "No".equalsIgnoreCase(s) -> false;
            default -> false;
        };
    }


    private static void recordPatterMatchingDemo() {
        Book book = new Book("ABC", null, "ABCD123", new Book.Chapter("sample", 100));
        Book book2 = new Book("ABC", null, "ABCD123", new Book.Chapter("sample", 50));
        Book book3 = new Book("ABC", null, "ABCD123", null);

        System.out.println(getChapterPages(book));
        System.out.println(getChapterPages(book2));
        System.out.println(getChapterPages(book3));
        System.out.println(getChapterPages(null));
    }

    private static Integer getChapterPages(Book book) {
        return switch (book) {
            case null -> null;
            case Book(String title, String author, String isbn, Book.Chapter(String chapterTitle, int pages)) -> pages;
            default -> null;
        };
    }
}
