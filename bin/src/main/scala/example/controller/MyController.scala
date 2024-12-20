package example.controller;

import java.util.Arrays;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class MyController {
	val title = "example";
	val names = Arrays.asList("Hi", "Bye");

	@GetMapping(Array("/"))
	def goHome(model: Model): String =
	{
		model.addAttribute("title", title);
		model.addAttribute("list", names);

		return "index";
	}
}