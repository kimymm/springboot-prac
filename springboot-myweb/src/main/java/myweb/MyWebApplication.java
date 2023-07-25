package myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class MyWebApplication {
	@Controller
	public class HelloController{
		@ResponseBody
		@RequestMapping("/hello")
		public String hello() {
			return "hello world";
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringApplication.class, args);
		
	}
}
