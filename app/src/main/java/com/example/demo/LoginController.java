package com.example.demo;

import org.springframework.stereotype.Controller;  // <-- import this
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // <-- THIS IS REQUIRED
public class LoginController {
	
	@GetMapping("/login")
	public String showLoginPage() {
	    return "login";  // points to login.html
	}

    // Handle login form submit
    @PostMapping("/login")
    public String loginUser(@RequestParam String username,
                            @RequestParam String password,
                            Model model) {

        String sampleUsername = "Poongothai";
        String samplePassword = "Poongothai2025";

        if(username.equals(sampleUsername) && password.equals(samplePassword)) {
            model.addAttribute("name", username);   // pass username to dashboard
            return "dashboard";                      // points to dashboard.html
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";                          // stays on login page
        }
    }
}
