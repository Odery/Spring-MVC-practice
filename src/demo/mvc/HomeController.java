package demo.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/home")
public class HomeController {
    private DataBean data;

    @Autowired
    public HomeController(DataBean data) {
        this.data = data;
    }

    //Trimming white spaces in String
    @InitBinder
    public void stringTrim(WebDataBinder binder) {
        StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class, trimmer);
    }

    @ModelAttribute("data")
    public DataBean addData() {
        return data;
    }

    @RequestMapping("/")
    public String showHomePage() {
        return "home-page";
    }

    @RequestMapping("/form")
    public String showMessageForm(Model model) {
        model.addAttribute("student", new Student());
        return "newStudentForm";
    }

    @RequestMapping("/submit")
    public String showSubmit(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
        System.out.println("Last name: |" + student.getLastName() + "|");
        if (bindingResult.hasErrors()) {
            return "newStudentForm";
        } else {
            return "studentConfirm";
        }
    }
}
