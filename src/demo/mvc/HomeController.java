package demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/")
    public String showHomePage() {
        return "home-page";
    }

    @RequestMapping("/form")
    public String showMessageForm(Model model) {
        model.addAttribute("student", new Student());
        return "messageForm";
    }

    @RequestMapping("/submit")
    public String showSubmit(@ModelAttribute("student") Student student) {
        return "messageSubmitForm";
    }
}
