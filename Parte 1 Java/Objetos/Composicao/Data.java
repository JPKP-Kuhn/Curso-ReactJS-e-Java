public class Data {
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year
    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public Data(int month, int day, int year) {
        /*
        if (1 <= day && day <= daysPerMonth(month)){
            this.month = month;
            this.day = day;
            this.year = year;
            Fazendo a verificação
        }
        */
     this.month = month;
     this.day = day;
     this.year = year;
     System.out.printf("Date object constructor for date %s%n", this);
    }

    // return a String of the form month/day/year

    public String toString() {
    return String.format("%d/%d/%d", month, day, year);
    }
}