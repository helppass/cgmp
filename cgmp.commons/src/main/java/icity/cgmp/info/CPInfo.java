package icity.cgmp.info;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_cp_info")
public class CPInfo extends AbsInfo {

	/** serialVersionUID */
	private static final long serialVersionUID = -7773312902561254597L;

	private String contractStartTime;

	private int contractStatus;

	private String contractStopTime;

	private long id;

	private String name;

	/**
	 * 获取 contractStartTime
	 * 
	 * @return contractStartTime
	 */
	@Column(name = "contract_start_time")
	public String getContractStartTime() {
		return contractStartTime;
	}

	/**
	 * 获取 contractStatus
	 * 
	 * @return contractStatus
	 */
	@Column(name = "contract_status")
	public int getContractStatus() {
		return contractStatus;
	}

	/**
	 * 获取 contractStopTime
	 * 
	 * @return contractStopTime
	 */
	@Column(name = "contract_stop_time")
	public String getContractStopTime() {
		return contractStopTime;
	}

	/**
	 * 获取 id
	 * 
	 * @return id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public long getId() {
		return id;
	}

	/**
	 * 获取 name
	 * 
	 * @return name
	 */
	@Column(name = "name")
	public String getName() {
		return name;
	}

	/**
	 * 设置 contractStartTime
	 * 
	 * @param contractStartTime
	 *            contractStartTime
	 */
	public void setContractStartTime(String contractStartTime) {
		this.contractStartTime = contractStartTime;
	}

	/**
	 * 设置 contractStatus
	 * 
	 * @param contractStatus
	 *            contractStatus
	 */
	public void setContractStatus(int contractStatus) {
		this.contractStatus = contractStatus;
	}

	/**
	 * 设置 contractStopTime
	 * 
	 * @param contractStopTime
	 *            contractStopTime
	 */
	public void setContractStopTime(String contractStopTime) {
		this.contractStopTime = contractStopTime;
	}

	/**
	 * 设置 id
	 * 
	 * @param id
	 *            id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * 设置 name
	 * 
	 * @param name
	 *            name
	 */
	public void setName(String name) {
		this.name = name;
	}

}
