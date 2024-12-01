package time;

import java.time.Period;

public class PeriodMain {

    public static void main(String[] args) {
        //생성
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);
    }
}
