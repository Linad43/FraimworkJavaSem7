package linad.FraimworkLes7.controller;

import linad.FraimworkLes7.service.AdminService;
import linad.FraimworkLes7.service.HomeService;
import linad.FraimworkLes7.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	private final HomeService homeService;
	private final UserService userService;
	private final AdminService adminService;

	public MainController(HomeService homeService, UserService userService, AdminService adminService) {
		this.homeService = homeService;
		this.userService = userService;
		this.adminService = adminService;
	}

	@GetMapping("/")
	public String home(Model model) {
		//model.addAttribute("text", homeService.getText());
		return "login";
	}
	
	@GetMapping("/private_data")
	public String user(Model model) {
		//model.addAttribute("text", userService.getText());
		return "private_data";
	}
	
	@GetMapping("/public_data")
	public String admin(Model model) {
		//model.addAttribute("text", adminService.getText());
		return "public_data";
	}
}
