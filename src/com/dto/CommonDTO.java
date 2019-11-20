/**
 * @Title: CommonDTO.java
 * @Copyright (C) 2019 ǰ�����
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019��11��15��  owen
 */
 

package com.dto;

import java.io.Serializable;

/**
 * ͨ��DTO��.
 * @ClassName: CommonDTO 
 * @Description: ͨ��DTO��
 * @author owen �� 2019��11��15�� ����12:18:08
 */

public class CommonDTO implements Serializable, Cloneable {

	/**
	 * @Fields serialVersionUID : Description
	 */
	
	private static final long serialVersionUID = -6854029664329202973L;
	
	//Ψһ��ʶ��
	private String guid;
	
	//�������
	private int govyear;
	
	//��������
	private int govid;
	
	//��ע
	private String remark;

	/**
	 * @return guid
	 */
	public String getGuid() {
		return guid;
	}

	/**
	 * @param guid Ҫ���õ� guid
	 */
	public void setGuid(String guid) {
		this.guid = guid;
	}

	/**
	 * @return govyear
	 */
	public int getGovyear() {
		return govyear;
	}

	/**
	 * @param govyear Ҫ���õ� govyear
	 */
	public void setGovyear(int govyear) {
		this.govyear = govyear;
	}

	/**
	 * @return govid
	 */
	public int getGovid() {
		return govid;
	}

	/**
	 * @param govid Ҫ���õ� govid
	 */
	public void setGovid(int govid) {
		this.govid = govid;
	}

	/**
	 * @return remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark Ҫ���õ� remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * ��¡.
	 * <p>Title: clone</p>
	 * <p>Description: </p>
	 * @return
	 * @throws CloneNotSupportedException
	 * @see java.lang.Object#clone()
	 */
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
