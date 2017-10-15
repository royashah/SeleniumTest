package mytest.example.au.test;

import mytest.example.au.base.Communication;
import mytest.example.au.page.BookAFlight;
import mytest.example.au.page.FlightFinder;
import mytest.example.au.page.LoginPage;
import mytest.example.au.page.SelectFlight;
import org.junit.Assert;
import org.junit.Test;


public class WebSiteTest {
    @Test

    public static void main(String[] args) {
        Communication communication = new Communication();
        LoginPage loginPage = new LoginPage("mercury","mercury");
        loginPage.init();
        loginPage.continueAction(loginPage.getSubmit());
        communication.implicitWait("findFlights");
        Assert.assertTrue("Check Title",communication.getDriver().getTitle().startsWith("Find a Flight:"));
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.init();
        flightFinder.continueAction(flightFinder.getSubmit());
        communication.implicitWait("reserveFlights");
        Assert.assertTrue("Check Title",communication.getDriver().getTitle().startsWith("Select a Flight:"));
        SelectFlight selectFlight = new SelectFlight(1,2);
        selectFlight.init();
        selectFlight.continueAction(selectFlight.getSubmit());
        communication.implicitWait("buyFlights");
        Assert.assertTrue("Check Title",communication.getDriver().getTitle().startsWith("Book a Flight:"));
        BookAFlight bookAFlight = new BookAFlight();
        bookAFlight.init();
        bookAFlight.continueAction(bookAFlight.getSubmit());
        Assert.assertTrue("Check Title",communication.getDriver().getTitle().startsWith("Flight Confirmation:"));

        communication.getDriver().close();
    }
}
