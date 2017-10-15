package mytest.example.au.page;


import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;
import mytest.example.au.base.ExtendedPage;

import java.util.Set;

/**
 * Created by pc on 10/12/17.
 */
public class FlightFinder extends ExtendedPage{
    public enum typeList{roundtrip,oneway}
    private String type = "oneway";
    private String passengers = "1";
    private String[] airLineList = {"No Preference", "Blue Skies Airlines", "Unified Airlines", "Pangea Airlines"};
    private String airLine = "Blue Skies Airlines";
    private String[] departingFromList = {"Acapulco", "Frankfurt", "London", "New York", "Paris", "Portland","Seattle","Sydney","Zurich"};
    private String departingFrom = "Frankfurt";
    public enum monthList{January,February,March,April,May,June,July,August,September,October,November,December}
    private String monthFrom = "January";
    private String monthTo = "January";
    private Set<Integer> daySet = ContiguousSet.create(Range.closed(1, 31), DiscreteDomain.integers());
    private String dayFrom = "1";
    private String dayTo = "10";
    public enum serviceClassList{Coach,Business,First}
    private String serviceClass = "Business";
    private String submit ="findFlights";

    public String getSubmit() {
        return submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }

    /*
    Setter and getter
     */

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public String[] getAirLineList() {
        return airLineList;
    }

    public void setAirLineList(String[] airLineList) {
        this.airLineList = airLineList;
    }

    public String getAirLine() {
        return airLine;
    }

    public void setAirLine(String airLine) {
        this.airLine = airLine;
    }

    public String[] getDepartingFromList() {
        return departingFromList;
    }

    public void setDepartingFromList(String[] departingFromList) {
        this.departingFromList = departingFromList;
    }

    public String getDepartingFrom() {
        return departingFrom;
    }

    public void setDepartingFrom(String departingFrom) {
        this.departingFrom = departingFrom;
    }


    public Set<Integer> getDaySet() {
        return daySet;
    }

    public void setDaySet(Set<Integer> daySet) {
        this.daySet = daySet;
    }


    public String getServiceClass() {
        return serviceClass;
    }

    public void setServiceClass(String serviceClass) {
        this.serviceClass = serviceClass;
    }

    public String getMonthFrom() {
        return monthFrom;
    }

    public void setMonthFrom(String monthFrom) {
        this.monthFrom = monthFrom;
    }

    public String getMonthTo() {
        return monthTo;
    }

    public void setMonthTo(String monthTo) {
        this.monthTo = monthTo;
    }

    public String getDayFrom() {
        return dayFrom;
    }

    public void setDayFrom(String dayFrom) {
        this.dayFrom = dayFrom;
    }

    public String getDayTo() {
        return dayTo;
    }

    public void setDayTo(String dayTo) {
        this.dayTo = dayTo;
    }

/*
    End of Setter and getter
     */

    @Override
    public void init(){
        selectNameWithSpecificValue("tripType",getType());
        selectDropDownList("passCount",getPassengers());
        selectDropDownList("fromPort",getDepartingFrom());
        selectDropDownList("fromMonth",getMonthFrom());
        selectDropDownList("fromDay",getDayFrom());
        selectDropDownList("toPort",getDepartingFrom());
        selectDropDownList("toMonth",getMonthTo());
        selectDropDownList("toDay",getDayTo());
        selectNameWithSpecificValue("servClass",getServiceClass());
        selectDropDownList("airline",getAirLine());
    }
}