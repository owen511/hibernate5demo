/**
 * @Title: DicTableBPOImpl.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月18日  owen
 */
 

package com.bpo.impl;

import java.util.List;

import com.bpo.IDicTableBPO;
import com.dao.IDicTableDAO;
import com.dto.DicTableDTO;

/**
 * 表注册数据处理实现类.
 * @ClassName: DicTableBPOImpl
 * @Description: Description of this class
 * @author owen 于 2019年11月18日 下午1:22:41
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
	 * @param dicTableDAO 要设置的 dicTableDAO
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
