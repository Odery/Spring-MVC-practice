package demo.mvc;

import javax.validation.constraints.*;
import java.util.Arrays;

//POJO
public class Student {

    @NotNull(message = "Name is required")
    @Size(min = 3, message = "too short")
    private String firstName;

    @NotNull(message = "Last name is required")
    @Size(min = 3, message = "too short")
    private String lastName;

    @Min(value = 0, message = "too short")
    @Max(value = 255, message = "too long")
    private Integer num;

    @NotNull(message = "email is required")
    @Pattern(regexp = "\\w+@\\w+[.][a-z]{2,3}$", message = "wrong email!")
    private String email;

    private String country;
    private String gender;
    private String[] lang;

    public Student() {
        gender = "Male";
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
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
