/**
 * Created by Elev1 on 2016-05-31.
 */
public class WashDishDay {
    Weekdays day;

    public WashDishDay(Weekdays day) {
        this.day = day;
    }

    public void WhoDoesIt() {
        switch (day) {
            case MONDAY:
                System.out.println("Yukie is doing the dishes");
                break;
            case TUESDAY:
                System.out.println("Yukie is doing the dishes");
                break;
            case WEDNESDAY:
                System.out.println("Yukie is doing the dishes");
                break;
            case THURSDAY:
                System.out.println("Yukie is doing the dishes");
                break;
            case FRIDAY:
                System.out.println("Yukie is doing the dishes");
                break;
            case SATURDAY:
                System.out.println("Yukie is doing the dishes");
                break;
            case SUNDAY:
                System.out.println("Yukie is doing the dishes");
                break;
            default:
                System.out.println("Yukie is doing the dishes");
        }
    }

    public static void main(String[] args) {
        WashDishDay dayOfWeek = new WashDishDay(args[0].toUpperCase());
    }
}
