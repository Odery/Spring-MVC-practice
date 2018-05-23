package demo.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component("data")
public class DataBean {
    @Value("#{props['gender'].split(',')}")  //Injecting values from property file
    private List<String> gender;

    @Value("#{props['language'].split(',')}")  //Injecting values from property file
    private List<String> language;

    @Value("#{countries}")  //Injecting values from property file
    private Map<String, String> countries;

    public List<String> getGender() {
        return gender;
    }

    public List<String> getLanguage() {
        return language;
    }

    public Map<String, String> getCountries() {
        return countries;
    }
}
