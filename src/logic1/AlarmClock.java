package logic1;

public class AlarmClock {
    /*

Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring.
Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".


alarmClock(1, false) → "7:00"
alarmClock(5, false) → "7:00"
alarmClock(0, false) → "10:00"
     */


    public static void main(String[] args) {
        System.out.println(alarmClock(1, false));
        System.out.println(alarmClock(5, false));
        System.out.println(alarmClock(0, false));


    }


    public static String alarmClock(int day, boolean vacation) {

        //<VARIANT 1>

        /*if (vacation) {
            switch (day) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return "10:00";
                case 6:
                case 0:
                    return "off";
                default:
                    return "no such day found";
            }
        } else {
            switch (day) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return "7:00";
                case 6:
                case 0:
                    return "10:00";
                default:
                    return "no such day found";
            }

        }*/

        //</VARIANT 1>

        //<VARIANT 2>
       /* if (day < 0 || day > 6) throw new IllegalArgumentException("Wrong day number");
        if (vacation){
            switch (day){
                case 0:
                case 6: return "off";
                default: return "10:00";
            }
        }else{
            switch (day){
                case 0:
                case 6: return "10:00";
                default: return "7:00";
            }
        }*/
        //</VARIANT 2>

        //<VARIANT 3>
        if (vacation){
            return ((day==0||day==6)?"off":"10:00");
        }else{
            return ((day==0||day==6)?"10:00":"7:00");
        }

        //</VARIANT 3>

        //<VARIANT 4>
        //return (vacation?((day==0||day==6)?"off":"10:00"):((day==0||day==6)?"10:00":"7:00"));

        //</VARIANT 4>





    }


}
