package ru.job4j.pojo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class College {
    public static void main(String[] args) {
        Student ivan = new Student();
        ivan.setFio("Ivan Ivanovich Ivanov");
        ivan.setGroup((short) 302);
        ivan.setReceipt((new GregorianCalendar(2017, Calendar.AUGUST, 10)).getTime());
        SimpleDateFormat format = new SimpleDateFormat("dd:MM:yyyy");
        System.out.println(
                "fio : " + ivan.getFio()
                + "\ngroup : " + ivan.getGroup()
                + "\nreceipt date : " + format.format(ivan.getReceipt())
        );
    }
}
