package day40_CustomClassPractice;

public class Offer {
/*
    Offer
    Attribute:
    salary, Location, hasPTO, isFullTime, WFH, jobTitle, benifit
    Actions:
    setOfferInfo
            getOfferInfo
    MUST use this keyword

 */


    double salary;
    String location;
    boolean haPTO;
    boolean isFullTime;
    boolean WFH;
    String jobTitle;
    boolean benefits;

    public void setOfferInfo(double salary, String location, boolean haPTO, boolean isFullTime, boolean WFH, String jobTitle, boolean benefits ){
        this.salary= salary;
        this.location = location;
        this.haPTO = haPTO;
       this.isFullTime = isFullTime;
        this.WFH = WFH;
        this.jobTitle = jobTitle;
        this.benefits = benefits;
    }
    public void getOfferInfo(){ //display offer info
        System.out.println("===================");
        System.out.println("Salary $"+salary);
        System.out.println("JobTitle: " +jobTitle);
        System.out.println("Location: "+ location);


    }

}
