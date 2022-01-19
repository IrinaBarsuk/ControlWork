package org.itstep.ControlWork1901;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tourist {
    private String name;
    private String surname;
    private Date holidayDate;
    private String sHolidayDate;


    public Tourist(String name, String surname, String sHolidayDate) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.sHolidayDate = sHolidayDate;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        this.holidayDate = dateFormat.parse(sHolidayDate);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getHolidayDate() {
        return holidayDate;
    }

    public String getsHolidayDate() {
        return sHolidayDate;
    }
}
