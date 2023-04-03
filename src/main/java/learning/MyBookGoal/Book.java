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

    public String pagesPerDayToFinishTheBook(){
        int dailyPages = (int) Math.ceil((double) pages/daysToFinish);
        return "Reading aprox. " + dailyPages
                + " pages per day you will finish "+ this.book + " in "
                + daysToFinish + " days";
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