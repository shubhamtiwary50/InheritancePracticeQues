package Main;

import data.Student;

public class Impl {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(" Shubham Tiwary");
        student.setNameOfSchool(" St Pauls School ");
        student.setRegistrationNumber(23456789);
        student.setAddress("Delhi");
        student.setRollNumber(50);
        student.setDob("29th February");
        student.setAadhaarIDNumber(1234567890);
        student.setAge(60);
        student.setEmail("dhgajkgsn@gmail.com");
        student.setReportCard(" Not Generated ");

//        System.out.println(student.getNameOfSchool());
//        System.out.println(student.getName());
        System.out.println("student = " + student.getName());
        System.out.println("student.getNameOfSchool() = " + student.getNameOfSchool());
        System.out.println("student.getAddress() = " + student.getAddress());
        System.out.println("student.getDob() = " + student.getDob());
        System.out.println("student.getReportCard() = " + student.getReportCard());
        System.out.println("student.getRegistrationNumber() = " + student.getRegistrationNumber());
        System.out.println("student.getEmail() = " + student.getEmail());
        System.out.println("student.getRollNumber() = " + student.getRollNumber());
        System.out.println("student.getAge() = " + student.getAge());
        System.out.println("student.getAadhaarIDNumber() = " + student.getAadhaarIDNumber());


    }
}
