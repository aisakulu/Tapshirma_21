package tapshirma_21;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Days day = Days.MONDAY;
        System.out.println(day.getToDoList());
        Days day2 = Days.TUESDAY;
        System.out.println(day2.getToDoList());
        Days day3 = Days.WEDNESDAY;
        System.out.println(day3.getToDoList());
        Days day4 = Days.TURSDAY;
        System.out.println(day4.getToDoList());
        Days day5 = Days.FRIDAY;
        System.out.println(day5.getToDoList());
        Days day6 = Days.SATURDAY;
        System.out.println(day6.getToDoList());
        Days day7 = Days.SUNDAY;
        System.out.println(day7.getToDoList());

        System.out.println("*************************");

        Days[] days = Days.values();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day: ");
        String dayName = scanner.nextLine();

        for(Days kun : days) {
            if (kun.name().equalsIgnoreCase(dayName))
            System.out.println(kun);
        }

    }
}
