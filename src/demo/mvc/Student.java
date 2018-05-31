package demo.mvc;

import java.util.Arrays;

//POJO
public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String gender;
    private String[] lang;

    public Student() {
        gender = "Male";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getLang() {
        return lang;
    }

    public void setLang(String[] lang) {
        this.lang = lang;
    }

    public String showLang() {
        return Arrays.toString(lang);
    }

}
