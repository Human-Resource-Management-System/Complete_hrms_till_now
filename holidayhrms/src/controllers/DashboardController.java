package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {

	@RequestMapping("/employeedashboard")
	public String showHolidays() {
		return "index2";
	}

	@RequestMapping("/admindashboard")
	public String showAdmin() {
		return "Index_admin";
	}
}
