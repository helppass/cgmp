package icity.cgmp.test;

import javax.annotation.PostConstruct;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestProc {

	@Autowired
	private TestUserDao testUserDao;

	@PostConstruct
	public void test01() throws Exception {
		System.out.println("============");
		System.out.println("============");
		System.out.println("============");
		System.out.println("============");
		for (int i = 0; i < 10; i++) {
			TestUserInfo info = new TestUserInfo();
			info.setUsername(RandomStringUtils.randomAlphabetic(5));
			System.out.println(info);
			info.setId(10);
			testUserDao.save(info);
			System.out.println(info.getId());
			System.out.println("============");
		}
		System.out.println("============");
		System.out.println("============");
		System.out.println("============");
		System.out.println("============");
		System.out.println("============");
	}
}
