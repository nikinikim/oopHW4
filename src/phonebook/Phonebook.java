package phonebook;

import java.util.Objects;

public class Phonebook {

    private String firstAndLastName;
    private String number;

    public Phonebook(String firstAndLastName, String number) {
        this.firstAndLastName = firstAndLastName;
        this.number = number;
    }

    public String getFirstAndLastName() {
        return firstAndLastName;
    }

    public void setFirstAndLastName(String firstAndLastName) {
        this.firstAndLastName = firstAndLastName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phonebook phonebook = (Phonebook) o;
        return Objects.equals(firstAndLastName, phonebook.firstAndLastName) && Objects.equals(number, phonebook.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstAndLastName, number);
    }
}
