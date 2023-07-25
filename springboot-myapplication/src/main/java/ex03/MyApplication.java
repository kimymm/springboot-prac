package ex03;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bitacademy.springboot_helloworld.HelloWorldApplication;

@SpringBootContfiguration
@ComponentScan
public class MyApplication {
	@Bean
	public MyComponent myComponent() {
		return new MyComponent();
	}
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac = SpringApplication.run(HelloWorldApplication.class, args)){}
	} 

}
