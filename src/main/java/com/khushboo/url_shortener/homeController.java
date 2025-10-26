package com.khushboo.url_shortener;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController{

  //req handler method for handling routes
  @GetMapping("/")
  public String home(Model model){
    model.addAttribute("title", "URL Shortener- Thymeleaf");
    return "index";
  }

  @GetMapping("/about")
  public String about(){
    return "about";
  }
}