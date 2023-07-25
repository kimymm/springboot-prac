package com.bitacademy.springboot_helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
/**
 * 1. 스프링 어플리케이션 부트스트랩핑역활: Bootstrap Class
 * 2. 설정 클래스 역활: Configuration Class
 */
@SpringBootApplication // ??, + 자동설정, 3가지 일..
public class HelloWorldApplication {

	public static void main(String[] args) {
		/**
		 * SpringApplication.run(...) 안에서 일어나는 일(Bootstrap)
		 * 
		 * 1. 애플리케이션 컨텍스트(ApplicationContext, Spring Container) 생성
		 * 2. 만일, 웹어플리케이션이라면 (library에 spring이 있는것) 웹애플리케이션의 타입결정(SpringMVC, Reactive)
		 * 3. 어노테이션 스캐닝(auto) + Configuration Class를 통한
		 * 		빈 생성/등록/와이어링 작업 (지금은 없으니까 안함)
		 * 4. 만약, Spring MVC 이라면 (지금도 없으니까 안)
		 * 	1. Auto Configuration
		 * 	2. 내장(embed) 서버(TomcatEmbededServiceServletContainer) 인스턴스 생성
		 *  3. 서버 인스턴스에 웹어플리케이션 배포
		 *  4. 서버 인스턴스 실행
		 *  5. 뭔소릴까 지금도 뭐소린지 몰라 ApplicationRunner 인터페이스를 구현한 빈을 ApplicationContext에서 찾아 실행
		 */
//		ConfigurableApplicationContext ac = null; 
//		
//		try {
//			ac = SpringApplication.run(HelloWorldApplication.class, args); // r
//		} catch(Throwable ex) {
//			ex.printStackTrace();
//		} finally {
//			if(ac != null) {
//				ac.close(); // err?
//			}
//		}
		
		// try ~ with ~resources 구문
		try(ConfigurableApplicationContext ac = SpringApplication.run(HelloWorldApplication.class, args)){}
	}

}
