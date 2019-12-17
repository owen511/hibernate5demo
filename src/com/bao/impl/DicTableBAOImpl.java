/**
 * @Title: DicTableBAOImpl.java
 * @Copyright (C) 2019 ǰ�����
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019��11��18��  owen
 */

package com.bao.impl;

import java.util.List;

import com.bao.IDicTableBAO;
import com.bpo.IDicTableBPO;
import com.dto.DicTableDTO;

/**
 * ��ע�����ݴ���ʵ����.
 * 
 * @ClassName: DicTableBAOImpl
 * @Description: Description of this class
 * @author owen �� 2019��11��18�� ����1:23:30
 */

public class DicTableBAOImpl implements IDicTableBAO {
	//private static final Logger logger = LoggerFactory.getLogger(DicTableBAOImpl.class);
	private IDicTableBPO dicTableBPO;

	/**
	 * @return dicTableBPO
	 */
	public IDicTableBPO getDicTableBPO() {
		return dicTableBPO;
	}

	/**
	 * @param dicTableBPO Ҫ���õ� dicTableBPO
	 */
	public void setDicTableBPO(IDicTableBPO dicTableBPO) {
		this.dicTableBPO = dicTableBPO;
	}

	@Override
	public List<DicTableDTO> findAllTable() {
		return dicTableBPO.findAllTable();
	}

	@Override
	public boolean createTable(DicTableDTO tableDTO) {
		System.out.println("-------------1");
		return dicTableBPO.createTable(tableDTO);
	}

}
