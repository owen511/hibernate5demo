/**
 * @Title: DicTableDTO.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月15日  owen
 */
 

package com.dto;

import java.io.Serializable;

/**
 * 表定义通用DTO类.
 * @ClassName: DicTableDTO
 * @Description: Description of this class
 * @author owen 于 2019年11月15日 下午1:59:27
 */

public class DicTableDTO implements Serializable, Cloneable{

	/**
	 * @Fields serialVersionUID : Description
	 */
	
	private static final long serialVersionUID = 3407608674908440805L;
	
	/**
	 * 表编码.
	 */
	private String tablecode;

	/**
	 * 表名称.
	 */
	private String name;
	
	/**
	 * 表类型.
	 */
	private int tabletype;
	
	/**
	 * 关键字段名.
	 */
	private String keycolumn;
	
	/**
	 * 编码字段名.
	 */
	private String codecolumn;
	
	/**
	 * 名称字段名.
	 */
	private String namecolumn;
	
	/**
	 * 上级字段名.
	 */
	private String supercolumn;
	
	/**
	 * 级次字段名.
	 */
	private String levelnocolumn;
	
	/**
	 * 叶子字段名.
	 */
	private String isleafcolumn;
	
	/**
	 * 状态字段名.
	 */
	private String statuscolumn;
	
	/**
	 * 启用时间字段名.
	 */
	private String startdatecolumn;
	
	/**
	 * 停用时间字段名.
	 */
	private String enddatecolumn;
	
	/**
	 * guid字段名.
	 */
	private String guidcolumn;
	
	/**
	 * 表版本号.
	 */
	private int version;

	/**
	 * @return tablecode
	 */
	public String getTablecode() {
		return tablecode;
	}

	/**
	 * @param tablecode 要设置的 tablecode
	 */
	public void setTablecode(String tablecode) {
		this.tablecode = tablecode;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return tabletype
	 */
	public int getTabletype() {
		return tabletype;
	}

	/**
	 * @param tabletype 要设置的 tabletype
	 */
	public void setTabletype(int tabletype) {
		this.tabletype = tabletype;
	}

	/**
	 * @return keycolumn
	 */
	public String getKeycolumn() {
		return keycolumn;
	}

	/**
	 * @param keycolumn 要设置的 keycolumn
	 */
	public void setKeycolumn(String keycolumn) {
		this.keycolumn = keycolumn;
	}

	/**
	 * @return codecolumn
	 */
	public String getCodecolumn() {
		return codecolumn;
	}

	/**
	 * @param codecolumn 要设置的 codecolumn
	 */
	public void setCodecolumn(String codecolumn) {
		this.codecolumn = codecolumn;
	}

	/**
	 * @return namecolumn
	 */
	public String getNamecolumn() {
		return namecolumn;
	}

	/**
	 * @param namecolumn 要设置的 namecolumn
	 */
	public void setNamecolumn(String namecolumn) {
		this.namecolumn = namecolumn;
	}

	/**
	 * @return supercolumn
	 */
	public String getSupercolumn() {
		return supercolumn;
	}

	/**
	 * @param supercolumn 要设置的 supercolumn
	 */
	public void setSupercolumn(String supercolumn) {
		this.supercolumn = supercolumn;
	}

	/**
	 * @return levelnocolumn
	 */
	public String getLevelnocolumn() {
		return levelnocolumn;
	}

	/**
	 * @param levelnocolumn 要设置的 levelnocolumn
	 */
	public void setLevelnocolumn(String levelnocolumn) {
		this.levelnocolumn = levelnocolumn;
	}

	/**
	 * @return isleafcolumn
	 */
	public String getIsleafcolumn() {
		return isleafcolumn;
	}

	/**
	 * @param isleafcolumn 要设置的 isleafcolumn
	 */
	public void setIsleafcolumn(String isleafcolumn) {
		this.isleafcolumn = isleafcolumn;
	}

	/**
	 * @return statuscolumn
	 */
	public String getStatuscolumn() {
		return statuscolumn;
	}

	/**
	 * @param statuscolumn 要设置的 statuscolumn
	 */
	public void setStatuscolumn(String statuscolumn) {
		this.statuscolumn = statuscolumn;
	}

	/**
	 * @return startdatecolumn
	 */
	public String getStartdatecolumn() {
		return startdatecolumn;
	}

	/**
	 * @param startdatecolumn 要设置的 startdatecolumn
	 */
	public void setStartdatecolumn(String startdatecolumn) {
		this.startdatecolumn = startdatecolumn;
	}

	/**
	 * @return enddatecolumn
	 */
	public String getEnddatecolumn() {
		return enddatecolumn;
	}

	/**
	 * @param enddatecolumn 要设置的 enddatecolumn
	 */
	public void setEnddatecolumn(String enddatecolumn) {
		this.enddatecolumn = enddatecolumn;
	}

	/**
	 * @return guidcolumn
	 */
	public String getGuidcolumn() {
		return guidcolumn;
	}

	/**
	 * @param guidcolumn 要设置的 guidcolumn
	 */
	public void setGuidcolumn(String guidcolumn) {
		this.guidcolumn = guidcolumn;
	}

	/**
	 * @return version
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * @param version 要设置的 version
	 */
	public void setVersion(int version) {
		this.version = version;
	}

}