package project.exit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("member")
    public String hello(Model model){
        model.addAttribute("data","hello!!");
        return "hello";//화면이름
    }

}
