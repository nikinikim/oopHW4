package passport;

import java.util.Objects;

public class Passport {
    private final String passportNumber;
    private String lastName;
    private String firstName;
    private String surName;
    private String birthDay;

    public Passport(String passportNumber, String lastName, String firstName, String surName, String birthDay) {
        this.passportNumber = CheckingObjects.checkString(passportNumber);
        this.lastName = CheckingObjects.checkString(lastName);
        this.firstName = CheckingObjects.checkString(firstName);
        this.surName = surName;
        this.birthDay = CheckingObjects.checkString(birthDay);
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return passportNumber + " " + lastName + " " + firstName + " " + surName + " " + birthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(passportNumber, passport.passportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber);
    }
}
