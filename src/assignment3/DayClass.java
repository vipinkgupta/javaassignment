package assignment3;
enum Day
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
public class DayClass {
    Day day;
    public DayClass(Day day)
    {
        this.day=day;
    }
    public void dayIsLike()
    {
        switch(day)
        {
            case MONDAY:
                System.out.print("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.print("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    public static void main(String args[])
    {
        String str="MONDAY";
        DayClass dc=new DayClass(Day.valueOf(str));
        dc.dayIsLike();
    }
}
