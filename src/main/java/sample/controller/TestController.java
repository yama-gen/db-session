package sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping(value = "")
    public String index(HttpSession session, Model model) {
        model.addAttribute("value", session.getAttribute("value"));
        return "index";
    }

    @PostMapping(value = "")
    public String post(@RequestParam String value, HttpSession session) {
        session.setAttribute("value", value);
        return "redirect:/test";
    }
}
