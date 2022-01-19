package org.itstep.ControlWork1901;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ListOfTourist {
    List<Tourist> tourists = new LinkedList<>();

    public void addTourist(Tourist tourist) {
        tourists.add(tourist);
    }

   /* LinkedList<Tourist> getTouristOnHoliday(Date min, Date max) {
        List<Tourist> result = new LinkedList<>();
        for (Tourist tourist : tourists) {
            if (tourist.getHolidayDate() >= min && tourist.getHolidayDate() <= max)
                result.add(tourist);
        }
        return (LinkedList<Tourist>) result;
    }*/

}
