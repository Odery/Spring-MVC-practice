package demo.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    private DataBean data;

    @Autowired
    public HomeController(DataBean data) {
        this.data = data;
    }

    @RequestMapping("/")
    public String showHomePage() {
        return "home-page";
    }

    @RequestMapping("/form")
    public String showMessageForm(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("data", data);
        return "newStudentForm";
    }

    @RequestMapping("/submit")
    public String showSubmit(@ModelAttribute("student") Student student) {
        return "studentConfirm";
    }
}
