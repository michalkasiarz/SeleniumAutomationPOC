package com.automationpractice.utils;

import com.github.javafaker.Faker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FakeDate {

    private final String dayOfBirth;
    private final String monthOfBirth;
    private final String yearOfBirth;

    Faker faker = new Faker();
    String dateOfBirth = faker.date().birthday().toString();

    SimpleDateFormat parser = new SimpleDateFormat("EEE MMM d HH:mm:ss zzz yyyy");
    Date date = parser.parse(dateOfBirth);

    SimpleDateFormat day = new SimpleDateFormat("d");
    SimpleDateFormat month = new SimpleDateFormat("MMMMMMM");
    SimpleDateFormat year = new SimpleDateFormat("yyyy");

    public FakeDate() throws ParseException {
        this.dayOfBirth = day.format(date);
        this.monthOfBirth = month.format(date);
        this.yearOfBirth = year.format(date);
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }
}
