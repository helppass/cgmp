package icity.cgmp.info;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_sp_sync_rule")
public class SPSyncRule {

	@Column(name = "cp_fee_point_id")
	private long cpFeePointId;

	@Column(name = "cp_id")
	private long cpId;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;

	@Column(name = "sp_id")
	private long spId;

	@Column(name = "sync_address")
	private String syncAddress;

	/**
	 * 获取 cpFeePointId
	 * 
	 * @return cpFeePointId
	 */
	public long getCpFeePointId() {
		return cpFeePointId;
	}

	/**
	 * 获取 cpId
	 * 
	 * @return cpId
	 */
	public long getCpId() {
		return cpId;
	}

	/**
	 * 获取 id
	 * 
	 * @return id
	 */
	public long getId() {
		return id;
	}

	/**
	 * 获取 spId
	 * 
	 * @return spId
	 */
	public long getSpId() {
		return spId;
	}

	/**
	 * 获取 syncAddress
	 * 
	 * @return syncAddress
	 */
	public String getSyncAddress() {
		return syncAddress;
	}

	/**
	 * 设置 cpFeePointId
	 * 
	 * @param cpFeePointId
	 *            cpFeePointId
	 */
	public void setCpFeePointId(long cpFeePointId) {
		this.cpFeePointId = cpFeePointId;
	}

	/**
	 * 设置 cpId
	 * 
	 * @param cpId
	 *            cpId
	 */
	public void setCpId(long cpId) {
		this.cpId = cpId;
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
	 * 设置 spId
	 * 
	 * @param spId
	 *            spId
	 */
	public void setSpId(long spId) {
		this.spId = spId;
	}

	/**
	 * 设置 syncAddress
	 * 
	 * @param syncAddress
	 *            syncAddress
	 */
	public void setSyncAddress(String syncAddress) {
		this.syncAddress = syncAddress;
	}

}
