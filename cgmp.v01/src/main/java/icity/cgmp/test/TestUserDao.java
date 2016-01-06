package icity.cgmp.test;

import org.springframework.data.repository.CrudRepository;

public interface TestUserDao extends CrudRepository<TestUserInfo, Long> {

	@Override
	public <S extends TestUserInfo> S save(S entity);
}
