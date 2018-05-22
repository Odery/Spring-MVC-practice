package demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/")
    public String showHomePage() {
        return "home-page";
    }

    @RequestMapping("/form")
    public String showMessageForm() {
        return "messageForm";
    }

    @RequestMapping("/message")
    public String showSubmit(@RequestParam("message") String msg, Model model) {
        model.addAttribute("message", msg.toUpperCase());
        return "messageSubmitForm";
    }
}
