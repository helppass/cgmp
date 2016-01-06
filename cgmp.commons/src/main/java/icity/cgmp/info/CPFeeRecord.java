package icity.cgmp.info;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_cp_fee_record")
public class CPFeeRecord extends AbsInfo {

	/** serialVersionUID */
	private static final long serialVersionUID = 3507852573944857393L;

	private long id;

	private String name;

	/**
	 * ��ȡ id
	 * 
	 * @return id
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	/**
	 * ��ȡ name
	 * 
	 * @return name
	 */
	@Column(name = "name")
	public String getName() {
		return name;
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
	 * ���� name
	 * 
	 * @param name
	 *            name
	 */
	public void setName(String name) {
		this.name = name;
	}

}
