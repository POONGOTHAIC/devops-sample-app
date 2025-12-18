package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DressShopController {
	 private List<Dress> dresses;

	    public DressShopController() {
	        dresses = new ArrayList<>();
	        dresses.add(new Dress("Red Dress", "M", 49.99));
	        dresses.add(new Dress("Blue Dress", "L", 59.99));
	        dresses.add(new Dress("Green Dress", "S", 39.99));
	    }

	    @GetMapping("/view-dresses")
	    public String viewDresses(Model model) {
	        model.addAttribute("dresses", dresses);
	        return "view-dresses";
	    }

	    @GetMapping("/buy-dresses")
	    public String buyDresses(Model model) {
	        model.addAttribute("dresses", dresses);
	        return "buy-dresses";
	    }

	    @PostMapping("/buy-dresses")
	    public String purchaseDress(@RequestParam String dressName, Model model) {
	        model.addAttribute("message", "You have successfully purchased: " + dressName);
	        return "buy-dresses";
	    }
	}
