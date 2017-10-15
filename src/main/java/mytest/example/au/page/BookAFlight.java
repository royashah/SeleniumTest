package mytest.example.au.page;

import mytest.example.au.base.ExtendedPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by pc on 10/12/17.
 */
public class BookAFlight extends ExtendedPage {

    private String passFirst = "Roye";
    private String lastname = "Shah";
    private String number = "123456789";
    private String submit = "buyFlights";

    public String getSubmit() {
        return submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }

    public String getPassFirst() {
        return passFirst;
    }

    public void setPassFirst(String passFirst) {
        this.passFirst = passFirst;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    @Override
    public void init() {
        setTextBoxWithName("passFirst0",getPassFirst());
        setTextBoxWithName("passLast0",getLastname());
        setTextBoxWithName("creditnumber",getNumber());

    }
}
