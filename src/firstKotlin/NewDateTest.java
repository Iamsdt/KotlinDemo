package firstKotlin;

import java.time.LocalDate;

/**
 * Created by Shudipto on 5/31/2017.
 */
public class NewDateTest {

    public static void main(String[] arg){

        LocalDate currentDate = LocalDate.now();

        int month = currentDate.getMonthValue();
        int day = currentDate.getDayOfMonth();
        int year = currentDate.getYear();

        System.out.println(day+"-"+month+"-"+year);
        System.out.println(currentDate);


        //now set a specific date

        LocalDate date = LocalDate.of(2012,5,21);

        System.out.println(date.getDayOfMonth()+"-"+date.getMonthValue()+"-"+date.getYear());


    }

}
