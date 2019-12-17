/**
 * @Title: CommonDTO.java
 * @Copyright (C) 2019 ǰ�����
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019��11��15��  owen
 */
 

package com.qian.fang.ho.dic.dto;

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
	private short govyear;
	
	//��������
	private String govid;
	
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
	public short getGovyear() {
		return govyear;
	}

	/**
	 * @param govyear Ҫ���õ� govyear
	 */
	public void setGovyear(short govyear) {
		this.govyear = govyear;
	}

	/**
	 * @return govid
	 */
	public String getGovid() {
		return govid;
	}

	/**
	 * @param govid Ҫ���õ� govid
	 */
	public void setGovid(String govid) {
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
