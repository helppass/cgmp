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
	 * ��ȡ goodsId
	 * 
	 * @return goodsId
	 */
	@Column(name = "goods_id")
	public String getGoodsId() {
		return goodsId;
	}

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
	 * ��ȡ moContent
	 * 
	 * @return moContent
	 */
	@Column(name = "mo_content")
	public String getMoContent() {
		return moContent;
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
	 * ��ȡ spCode
	 * 
	 * @return spCode
	 */
	@Column(name = "sp_code")
	public String getSpCode() {
		return spCode;
	}

	/**
	 * ��ȡ status
	 * 
	 * @return status, 1
	 */
	@Column(name = "status")
	public int getStatus() {
		return status;
	}

	/**
	 * ���� goodsId
	 * 
	 * @param goodsId
	 *            goodsId
	 */
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
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
	 * ���� moContent
	 * 
	 * @param moContent
	 *            moContent
	 */
	public void setMoContent(String moContent) {
		this.moContent = moContent;
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

	/**
	 * ���� spCode
	 * 
	 * @param spCode
	 *            spCode
	 */
	public void setSpCode(String spCode) {
		this.spCode = spCode;
	}

	/**
	 * ���� status
	 * 
	 * @param status
	 *            status
	 */
	public void setStatus(int status) {
		this.status = status;
	}

}
