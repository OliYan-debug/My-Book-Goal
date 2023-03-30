package learning.MyBookGoal;

public class Book{
    private String book;
    private int pages;
    private int timePerPage;
    private int daysToFinish;

    public Book(String book, int pages, int timePerPage, int daysToFinish) {
        this.book = book;
        this.pages = pages;
        this.timePerPage = timePerPage;
        this.daysToFinish = daysToFinish;
    }

    public Book(String book, int pages, int timePerPage) {
        this.book = book;
        this.pages = pages;
        this.timePerPage = timePerPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Name='" + book + '\'' +
                ", Pages=" + pages +
                ", Time Per Page=" + timePerPage +
                ", Days To Finish=" + daysToFinish +
                '}';
    }
}