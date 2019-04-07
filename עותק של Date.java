public class Date {
    private int day;
    private int month;
    private int year;
    private final int DAY_FIRST = 1, DAY_LAST = 30, MONTH_FIRST = 1, MONTH_LAST = 12, YEAR_FIRST = 1000;

    /**
     * @return Which returns the string day/month/year. in number.
     */
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }

    /**
     * @param d present at the day.
     * @param m present at the month.
     * @param y present at the year.
     * creates a new Date object if the date is valid otherwise creates the date 1/1/2000.
     */
    public Date(int d, int m, int y) {
        setDay(d);
        setMonth(m);
        setYear(y);
    }

    /**
     * copy constructor.
     * @param other Parameter as the date object obtained from who is running the method
     */
    public Date(Date other) {
        this.day = other.day;
        this.month = other.month;
        this.year = other.year;
    }

    /**
     * @return  the Day
     */
    public int getDay() {
        return day;
    }

    /**
     * sets the day only if date remains valid.
     * @param d Parameter as the int obtained from who is running the method
     */
    public void setDay(int d) {
        if (d >= DAY_FIRST && day <= DAY_LAST) {
            this.day = d;
        } else {
            this.day = 1;
        }
    }

    /**
     *
     * @return  the Month.
     */

    public int getMonth() {
        return month;
    }

    /**
     * sets the month only if date remains valid.
     * @param m Parameter as the int obtained from who is running the method
     */
    public void setMonth(int m) {
        if (m >= MONTH_FIRST && month <= MONTH_LAST) {
            this.month = m;
        } else {
            this.month = 1;
        }
    }

    /**
     * gets the Year
     * @return the Year
     */

    public int getYear() {
        return year;
    }

    /**
     * sets the year only if date remains valid.
     * @param y Parameter as the int obtained from who is running the method
     */
    public void setYear(int y) {
        if (y >= YEAR_FIRST) {
            this.year = y;
        } else {
            this.year = 2000;
        }
    }

    /**
     *
     * @param other Parameter as the date object obtained from who is running the method
     * @return true or false if 2 date are the same.
     */
    public boolean equals(Date other) {
        if (other.getDay() == this.day && other.getMonth() == this.month && other.getYear() == this.year) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param other Parameter as the date object obtained from who is running the method
     * @return true or false if this date is before other date.
     */
    public boolean before(Date other) {
        if (this.year > other.year)
            return true;
        if (this.year< other.year)
            return false;
// this.year = other.year
        if (this.month > other.month)
            return true;
        if (this.month < other.month)
            return false;
// this.month = other.month
        if (this.day > other.day)
            return true;
        {
            return false;

        }
    }

    /**
     *
     * @param other Parameter as the date object obtained from who is running the method
     * @return true or false if this date is after other date.
     */
    public boolean after(Date other) {
        return other.before(this);
    }
}





