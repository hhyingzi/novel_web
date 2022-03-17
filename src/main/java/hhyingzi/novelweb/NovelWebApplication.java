package hhyingzi.novelweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class NovelWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(NovelWebApplication.class, args);
	}

	@GetMapping(value = "/")
	public String index(){
		return "redirect:/overview";
	}
}
