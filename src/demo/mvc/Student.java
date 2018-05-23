package demo.mvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String gender;
    private String[] lang;
    private List<String> languages;
    private List<String> genders;
    private LinkedHashMap<String, String> countries;

    public Student() {
        languages = new ArrayList<>();
        languages.add("Java");
        languages.add("PHP");
        languages.add("Ruby");
        languages.add("C#");

        countries = new LinkedHashMap<>();
        countries.put("UA", "Ukraine");
        countries.put("CA", "Canada");
        countries.put("USA", "United States");
        countries.put("FR", "France");

        genders = new ArrayList<>();
        genders.add("Male");
        genders.add("Female");

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

    public LinkedHashMap<String, String> getCountries() {
        return countries;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getGenders() {
        return genders;
    }

    public String[] getLang() {
        return lang;
    }

    public void setLang(String[] lang) {
        this.lang = lang;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public String showLang() {
        return Arrays.toString(lang);
    }

}
