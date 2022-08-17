package data;

public class Person {
    private String name;
    private String dob;
    private int age;
    private String address;
    private long aadhaarIDNumber;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getAadhaarIDNumber() {
        return aadhaarIDNumber;
    }

    public void setAadhaarIDNumber(long aadhaarIDNumber) {
        this.aadhaarIDNumber = aadhaarIDNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display()
    {
        System.out.println("name = " + name);
        System.out.println("dob = " + dob);
        System.out.println("age = " + age);
        System.out.println("address = " + address);
        System.out.println("aadhaarIDNumber = " + aadhaarIDNumber);
        System.out.println("email = " + email);

    }
}
