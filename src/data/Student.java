package data;

public class Student extends Person
{
    private String reportCard;
    private int rollNumber;
    private int registrationNumber;
    private String nameOfSchool;

    public String getReportCard() {
        return reportCard;
    }

    public void setReportCard(String reportCard) {
        this.reportCard = reportCard;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public void setNameOfSchool(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;
    }
    public void show()
    {
        System.out.println("nameOfSchool = " + nameOfSchool);
        System.out.println("registrationNumber = " + registrationNumber);
        System.out.println("rollNumber = " + rollNumber);
        System.out.println("reportCard = " + reportCard);
        display();
    }
}
