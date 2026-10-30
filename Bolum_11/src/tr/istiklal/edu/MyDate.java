package tr.istiklal.edu;

public class MyDate {
    private int  year, month, day;

    public MyDate() {
        java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();
        year = calendar.get(java.util.Calendar.YEAR);
        month = calendar.get(java.util.Calendar.MONTH);
        day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
    }

    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public MyDate(int year, int month, int day) {
        this.year = year ; this.month = month ; this.day = day;
    }

    public int getYear() {
    	return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime) {
        java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(java.util.Calendar.YEAR);
        month = calendar.get(java.util.Calendar.MONTH);
        day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
    }
}