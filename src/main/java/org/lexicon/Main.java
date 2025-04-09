package org.lexicon;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Ex7();
    }

    public static void ex1() {
        ArrayList<String> bookNames = new ArrayList<>();
        bookNames.add("Java");
        bookNames.add("Coffe");
        bookNames.add("Apple");
        bookNames.add("Lemon");
        System.out.println(bookNames);
        System.out.println(bookNames.get(1));

        Iterator<String> iterator = bookNames.iterator();
        while ( iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
    public static void ex2() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(500);
        numbers.add(600);
        numbers.remove(2);
        boolean isRemoved = numbers.remove(Integer.valueOf(500));
        System.out.println("was the element removed ? " + isRemoved);

        System.out.println(numbers.size());
        System.out.println(numbers);

    }
        // 1. Create a new list and populate it with the days of the week. Lastly, print the out the list.
    public static void ex3() {

        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        System.out.println(weekDays);
    }

    // 2. Create a new list and populate it with the days of the week. Lastly, iterate through the list
    //and print out each element separately.

    public static void ex4() {
        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        Iterator<String> iterator = weekDays.iterator();
        while ( iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    // 3. Create a new list and populate it with the days of the week excluding THURSDAY. Lastly,
    //insert the weekday THURSDAY into the right position in the list.
    public static void ex5(){

        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");

        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        weekDays.add(3 ,"Thursday");

        Iterator<String> iterator = weekDays.iterator();
        while ( iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    // 4. Create a new list and populate it with the days of the week. Then create a new list out of the
    //first three elements of the first list using a subList
    public static void ex6() {
        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        ArrayList<String> subList = new ArrayList<>(weekDays.subList(0,3));
        System.out.println(subList);

    }
        // 5. Create a new hashset and populate it with the days of the week. Lastly, print the set out and
        //pay attention to the order of the elements.
    public static void Ex7() {
        HashSet<String> weekDays = new HashSet<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        System.out.println(weekDays);



    }




}