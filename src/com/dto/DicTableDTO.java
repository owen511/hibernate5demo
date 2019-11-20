/**
 * @Title: DicTableDTO.java
 * @Copyright (C) 2019 ǰ�����
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019��11��15��  owen
 */
 

package com.dto;

import java.io.Serializable;

/**
 * ����ͨ��DTO��.
 * @ClassName: DicTableDTO
 * @Description: Description of this class
 * @author owen �� 2019��11��15�� ����1:59:27
 */

public class DicTableDTO implements Serializable, Cloneable{

	/**
	 * @Fields serialVersionUID : Description
	 */
	
	private static final long serialVersionUID = 3407608674908440805L;
	
	/**
	 * �����.
	 */
	private String tablecode;

	/**
	 * ������.
	 */
	private String name;
	
	/**
	 * ������.
	 */
	private int tabletype;
	
	/**
	 * �ؼ��ֶ���.
	 */
	private String keycolumn;
	
	/**
	 * �����ֶ���.
	 */
	private String codecolumn;
	
	/**
	 * �����ֶ���.
	 */
	private String namecolumn;
	
	/**
	 * �ϼ��ֶ���.
	 */
	private String supercolumn;
	
	/**
	 * �����ֶ���.
	 */
	private String levelnocolumn;
	
	/**
	 * Ҷ���ֶ���.
	 */
	private String isleafcolumn;
	
	/**
	 * ״̬�ֶ���.
	 */
	private String statuscolumn;
	
	/**
	 * ����ʱ���ֶ���.
	 */
	private String startdatecolumn;
	
	/**
	 * ͣ��ʱ���ֶ���.
	 */
	private String enddatecolumn;
	
	/**
	 * guid�ֶ���.
	 */
	private String guidcolumn;
	
	/**
	 * ��汾��.
	 */
	private int version;

	/**
	 * @return tablecode
	 */
	public String getTablecode() {
		return tablecode;
	}

	/**
	 * @param tablecode Ҫ���õ� tablecode
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
	 * @param name Ҫ���õ� name
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
	 * @param tabletype Ҫ���õ� tabletype
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
	 * @param keycolumn Ҫ���õ� keycolumn
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
	 * @param codecolumn Ҫ���õ� codecolumn
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
	 * @param namecolumn Ҫ���õ� namecolumn
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
	 * @param supercolumn Ҫ���õ� supercolumn
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
	 * @param levelnocolumn Ҫ���õ� levelnocolumn
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
	 * @param isleafcolumn Ҫ���õ� isleafcolumn
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
	 * @param statuscolumn Ҫ���õ� statuscolumn
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
	 * @param startdatecolumn Ҫ���õ� startdatecolumn
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
	 * @param enddatecolumn Ҫ���õ� enddatecolumn
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
	 * @param guidcolumn Ҫ���õ� guidcolumn
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
	 * @param version Ҫ���õ� version
	 */
	public void setVersion(int version) {
		this.version = version;
	}

}