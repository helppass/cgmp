package icity.cgmp.info;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_cp_fee_point")
public class CPFeePoint {

	public final static int STATUS_ENABLED = 1;

	private String goodsId;

	private long id;

	private String moContent;

	private String name;

	private String spCode;

	private int status;

	/**
	 * 获取 goodsId
	 * 
	 * @return goodsId
	 */
	@Column(name = "goods_id")
	public String getGoodsId() {
		return goodsId;
	}

	/**
	 * 获取 id
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
	 * 获取 moContent
	 * 
	 * @return moContent
	 */
	@Column(name = "mo_content")
	public String getMoContent() {
		return moContent;
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
	 * 获取 spCode
	 * 
	 * @return spCode
	 */
	@Column(name = "sp_code")
	public String getSpCode() {
		return spCode;
	}

	/**
	 * 获取 status
	 * 
	 * @return status, 1
	 */
	@Column(name = "status")
	public int getStatus() {
		return status;
	}

	/**
	 * 设置 goodsId
	 * 
	 * @param goodsId
	 *            goodsId
	 */
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
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
	 * 设置 moContent
	 * 
	 * @param moContent
	 *            moContent
	 */
	public void setMoContent(String moContent) {
		this.moContent = moContent;
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

	/**
	 * 设置 spCode
	 * 
	 * @param spCode
	 *            spCode
	 */
	public void setSpCode(String spCode) {
		this.spCode = spCode;
	}

	/**
	 * 设置 status
	 * 
	 * @param status
	 *            status
	 */
	public void setStatus(int status) {
		this.status = status;
	}

}
