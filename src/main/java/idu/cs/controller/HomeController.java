package idu.cs.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import idu.cs.domain.User;
import idu.cs.repository.UserRepository;

public class HomeController {
   @Autowired UserRepository userRepo; // Dependency 
   
   @GetMapping("/")
   public String home(Model model) {
      model.addAttribute("test", "인덕   ");
      model.addAttribute("egy", "유응구");
      return "index";
   }
   @GetMapping("/users")
   public String getAllUser(Model model) {
      model.addAttribute("users", "userRepo");
      return "userlist";
   }
   @PostMapping("/users")
   public String createUser(@Valid @RequestBody User user, Model model) {
      model.addAttribute("test", "인덕컴소");
      model.addAttribute("egy", "유응구");
      return "redirect:/users";
   }
}