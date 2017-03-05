package pl.wat.pz.application.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;


@Controller
public class MainController {

    //na prosbe o "/" wlacza tiles o zdefiniowanej nazwie homePage
    //pozostale robic albo jako kolejne tiles albo jako jsp podpiete przez router angulara
    @RequestMapping("/")
    public String homePage(){
        return "homePage";
    }

    @RequestMapping("favicon.ico")
    public String favicon(){
        return "forward:/resources/image/icon/favicon.ico";
    }

}