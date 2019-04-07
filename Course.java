public class Course {
    private String name;
    private int day;
    private int beginHour;

    public Course(String name, int day, int beginHour) {
        int firstDay = 1;
        int lestDay = 5;
        int firstHour = 8;
        int lestHour = 20;
        this.name = name;
        if (day >= firstDay && day <= lestDay)
            this.day = day;
        if (beginHour >= firstHour && beginHour <= lestHour)
            this.beginHour = beginHour;
    }

    public Course(Course other){
        this.name = other.name;
        this.day = other.day;
        this.beginHour = other.beginHour;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getBeginHour() {
        return beginHour;
    }

    public String toString (){
        return "Name Course: "+this.name+"\n"+
                "Day of the Course: "+this.day+"\n"+
                "Hour Begin Course: "+this.beginHour;
    }
}
