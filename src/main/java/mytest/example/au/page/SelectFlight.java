package mytest.example.au.page;

import mytest.example.au.base.ExtendedPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by pc on 10/12/17.
 */
public class SelectFlight extends ExtendedPage{

    private Integer departNumber = 1;
    private Integer returnNumber = 1;
    private String submit = "reserveFlights";

    public String getSubmit() {
        return submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }

    public SelectFlight(Integer departNumber, Integer returnNumber) {
        this.departNumber = departNumber;
        this.returnNumber = returnNumber;
    }

    public String departTable(int number){
        int result = number+(number+1);
        return "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr["+result+"]/td[1]/input";
    }

    public String returnTable(int number){
        int result = number+(number+1);
        return "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr["+result+"]/td[1]/input";
    }
    @Override
    public void init() {
        selectWithXpath(departTable(departNumber));
        selectWithXpath(returnTable(returnNumber));
    }
}
