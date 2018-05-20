package demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
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
    public String showSubmit(HttpServletRequest request) {
        String msg = request.getParameter("message").toLowerCase();
        request.setAttribute("message", msg);
        return "messageSubmitForm";
    }
}
