package learning.MyBookGoal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.print("What book you want to read: ");
        var bookName = scan.nextLine();
        System.out.print("How many pages have this book: ");
        var pages = scan.nextInt();
        System.out.print("In minutes how many time you spent in one page: ");
        var minutesPerPage = scan.nextInt();
        System.out.print("You plan finish this book in how many days: ");
        var daysToFinish = scan.nextInt();
        scan.close();
        var book = new Book(bookName, pages, minutesPerPage, daysToFinish);
        System.out.println(book);
        System.out.println(book.pagesPerDayToFinishTheBook());
    }
}