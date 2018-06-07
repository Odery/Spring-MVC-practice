package demo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Arrays;

//POJO
public class Student {

    @NotNull(message = "Name is required")
    @Size(min = 3, message = "too short")
    private String firstName;

    @NotNull(message = "Last name is required")
    @Size(min = 3, message = "too short")
    private String lastName;

    @Min(value = 4, message = "too short")
    @Max(value = 9, message = "too long")
    private int num;

    private String country;
    private String gender;
    private String[] lang;

    public Student() {
        gender = "Male";
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
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
