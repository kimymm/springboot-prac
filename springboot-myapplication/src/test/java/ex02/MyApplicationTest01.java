package ex02;

import org.junit
/**
 * Spring Test Integration
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes= {MyApplication.class})
public class MyApplicationTest01 {
	@Autowired
	MyComponent myComponent;
	@Test
	public void testMyComponentNoNull() {
		assertNotNull(myComponent);
	}

}
