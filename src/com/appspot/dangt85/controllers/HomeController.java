package com.appspot.dangt85.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

//	@Autowired
//	Comparator<String> comparator;

	@RequestMapping(value = "/")
	public String home() {
		//System.out.println("HomeController: Passing through...");
		return "index";
	}

//	@RequestMapping(value = "/compare", method = RequestMethod.GET)
//	public String compare(@RequestParam("input1") String input1,
//			@RequestParam("input2") String input2, Model model) {
//
//		int result = comparator.compare(input1, input2);
//		String inEnglish = (result < 0) ? "less than"
//				: (result > 0 ? "greater than" : "equal to");
//
//		String output = "According to our Comparator, '" + input1 + "' is "
//				+ inEnglish + "'" + input2 + "'";
//
//		model.addAttribute("output", output);
//		return "compareResults";
//	}
}