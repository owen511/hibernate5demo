/**
 * @Title: DicTableDAOImpl.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月15日  owen
 */

package com.dao.impl;

import java.io.Serializable;
import java.util.List;

import com.CommonHibernateDAOSupport;
import com.dao.IDicTableDAO;
import com.dto.DicTableDTO;

/**
 * 表注册数据访问实现类.
 * @ClassName: DicTableDAOImpl
 * @Description: Description of this class
 * @author owen 于 2019年11月15日 下午3:26:25
 */

public class DicTableDAOImpl extends CommonHibernateDAOSupport implements IDicTableDAO<DicTableDTO> {

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<DicTableDTO> findAllTable() {
		clear();
		String hql = "from DicTableDTO t order by t.tablecode ";
 		return (List<DicTableDTO>) this.getHibernateTemplate().find(hql, new Object[] {});
	}

	@Override
	public List<DicTableDTO> findAllCachedTable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DicTableDTO> createTable(List<DicTableDTO> tables) {
		return null;
	}

	@Override
	public List<DicTableDTO> updateTable(List<DicTableDTO> tables) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DicTableDTO updateTable(DicTableDTO tableDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DicTableDTO> deleteTable(List<DicTableDTO> tables) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DicTableDTO findTableByCode(String tableCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createTable(DicTableDTO tableDTO) {
		System.out.println("-------------3");
		Serializable s=this.getHibernateTemplate().save(tableDTO);
		System.out.println("s======"+s);
		return false;
	}

}
