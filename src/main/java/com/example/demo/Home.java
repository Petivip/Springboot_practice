package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller

public class Home {
   @RequestMapping ("/form")
    public String formPage(){
        return "form";
    }

    @RequestMapping("/loadform")
    public String loadFormPage(@RequestParam("login") String login, Model model){
        model.addAttribute("loginval",login);
        return "result";
    }

   @GetMapping("/formentry")
    public String formEntry(Model model){
       model.addAttribute("song",new Song());
       return "entryform";
   }
   @PostMapping("/formentry")
    public String formPost(@ModelAttribute Song song,Model model){
       model.addAttribute("song",song);
       return "postform";
   }

}
