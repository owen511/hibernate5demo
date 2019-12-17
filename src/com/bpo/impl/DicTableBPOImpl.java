/**
 * @Title: DicTableBPOImpl.java
 * @Copyright (C) 2019 ǰ�����
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019��11��18��  owen
 */
 

package com.bpo.impl;

import java.util.List;

import com.bpo.IDicTableBPO;
import com.dao.IDicTableDAO;
import com.dto.DicTableDTO;

/**
 * ��ע�����ݴ���ʵ����.
 * @ClassName: DicTableBPOImpl
 * @Description: Description of this class
 * @author owen �� 2019��11��18�� ����1:22:41
 */

public class DicTableBPOImpl implements IDicTableBPO {
	
	private IDicTableDAO<DicTableDTO> dicTableDAO;

	/**
	 * @return dicTableDAO
	 */
	public IDicTableDAO<DicTableDTO> getDicTableDAO() {
		return dicTableDAO;
	}

	/**
	 * @param dicTableDAO Ҫ���õ� dicTableDAO
	 */
	public void setDicTableDAO(IDicTableDAO<DicTableDTO> dicTableDAO) {
		this.dicTableDAO = dicTableDAO;
	}

	@Override
	public List<DicTableDTO> findAllTable() {
		return dicTableDAO.findAllTable();
	}

	@Override
	public boolean createTable(DicTableDTO tableDTO) {
		System.out.println("-------------2");
		return dicTableDAO.createTable(tableDTO);
	}
	
}
