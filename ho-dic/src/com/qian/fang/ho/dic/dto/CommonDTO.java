/**
 * @Title: CommonDTO.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月15日  owen
 */
 

package com.qian.fang.ho.dic.dto;

import java.io.Serializable;

/**
 * 通用DTO类.
 * @ClassName: CommonDTO 
 * @Description: 通用DTO类
 * @author owen 于 2019年11月15日 下午12:18:08
 */

public class CommonDTO implements Serializable, Cloneable {

	/**
	 * @Fields serialVersionUID : Description
	 */
	
	private static final long serialVersionUID = -6854029664329202973L;
	
	//唯一标识符
	private String guid;
	
	//财政年度
	private short govyear;
	
	//财政区划
	private String govid;
	
	//备注
	private String remark;

	/**
	 * @return guid
	 */
	public String getGuid() {
		return guid;
	}

	/**
	 * @param guid 要设置的 guid
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
	 * @param govyear 要设置的 govyear
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
	 * @param govid 要设置的 govid
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
	 * @param remark 要设置的 remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 克隆.
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
