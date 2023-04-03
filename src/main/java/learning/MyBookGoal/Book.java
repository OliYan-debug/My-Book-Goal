package learning.MyBookGoal;

public class Book{
    private String book;
    private int pages;
    private int timePerPage;
    private int daysToFinish;
    private int dailyPages;
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
        this.dailyPages = (int) Math.ceil((double) pages/daysToFinish);
        return "Reading aprox. " + dailyPages
                + " pages per day you will finish "+ this.book + " in "
                + daysToFinish + " days";
    }
    public String timeSpentDaily(){
        return "Daily you will spent " + (dailyPages * timePerPage) + " minutes to read this book";
    }
    public String timeSpentInTheBook(){
        int totalMinutesSpent = (dailyPages * timePerPage) * daysToFinish;
        int hoursSpent = totalMinutesSpent / 60;
        int minutes = totalMinutesSpent % 60;
        if(totalMinutesSpent < 60) return "Reading this book in "+ daysToFinish +" days you will need "+ totalMinutesSpent +" minutes in total";
        if(minutes == 0) return "Reading this book in "+ daysToFinish +" days you will need "+ hoursSpent + " hours in total";
        return "Reading this book in "+ daysToFinish +" days you will need "+ hoursSpent + " hours and " + minutes + " minutes in total";
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