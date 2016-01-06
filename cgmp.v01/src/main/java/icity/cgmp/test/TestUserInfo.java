package icity.cgmp.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_test_user")
public class TestUserInfo {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "username")
	private String username;

	/**
	 * ��ȡ id
	 * 
	 * @return id
	 */
	public long getId() {
		return id;
	}

	/**
	 * ��ȡ username
	 * 
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * ���� id
	 * 
	 * @param id
	 *            id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * ���� username
	 * 
	 * @param username
	 *            username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
}
