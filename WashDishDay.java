/**
 * Created by Elev1 on 2016-05-31.
 */
public class WashDishDay {
    Weekdays day;

    public WashDishDay(Weekdays day) {
        this.day = day;
    }

    public void whoDoesIt() {
        switch (day) {
            case MONDAY:
                System.out.println("Ashfaq is doing the dishes");
                break;
            case TUESDAY:
                System.out.println("Yukie is doing the dishes");
                break;
            case WEDNESDAY:
                System.out.println("Stefan is doing the dishes");
                break;
            case THURSDAY:
                System.out.println("Jonas is doing the dishes");
                break;
            case FRIDAY:
                System.out.println("Johan is doing the dishes");
                break;
            case SATURDAY:
                System.out.println("Mikael is doing the dishes");
                break;
            case SUNDAY:
                System.out.println("Dan is doing the dishes");
                break;
            default:
                System.out.println("Andreas is doing the dishes");
        }
    }

    public static void main(String[] args) {
        try {
            WashDishDay dayOfWeek = new WashDishDay(Weekdays.valueOf(args[0].toUpperCase()));
            dayOfWeek.whoDoesIt();
        } catch (IllegalArgumentException|ArrayIndexOutOfBoundsException e) {
            System.out.println("Andreas is doing the dishes");


        }
    }
}
