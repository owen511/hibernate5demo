/**
 * @Title: DicTableBAOImpl.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月18日  owen
 */

package com.qian.fang.ho.dic.bao.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.qian.fang.ho.dic.bao.IDicTableBAO;
import com.qian.fang.ho.dic.bpo.IDicTableBPO;
import com.qian.fang.ho.dic.dto.DicTableDTO;



/**
 * 表注册数据代理实现类.
 * 
 * @ClassName: DicTableBAOImpl
 * @Description: Description of this class
 * @author owen 于 2019年11月18日 下午1:23:30
 */
@Transactional
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
	 * @param dicTableBPO 要设置的 dicTableBPO
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
