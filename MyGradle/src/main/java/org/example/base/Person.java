package org.example.base;

public class Person {

    private String fullName;
    private int year;  // age
    private String address;
    private String email;
    private String phone;
    private String gender;
    private String nationality;
    private String education;

    public Person() {
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getFullName() {
        return fullName;
    }

    public int getYear() {
        return year;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    public String getEducation() {
        return education;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", year=" + year +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}


