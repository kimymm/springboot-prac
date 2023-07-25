package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import 
/**
 * Spring Test Integration
 * 
 * Error:
 * SpringBoot Test Integration(@SpringBootTest)에서는
 * @Configuration을 달고 있는 설정 클래스를 스캔하지 못한다.
 * 
 */
@SpringBootTest
public class MyApplicationTest02 {
	@Autowired
	MyComponent myComponent;
	@Test
	public void testMyComponentNoNull() {
		assertNotNull(myComponent);
	}
}
