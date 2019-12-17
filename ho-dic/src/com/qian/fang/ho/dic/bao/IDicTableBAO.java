/**
 * @Title: IDicTableBAO.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月18日  owen
 */
 

package com.qian.fang.ho.dic.bao;

import java.util.List;

import com.qian.fang.ho.dic.dto.DicTableDTO;


/**
 * 表注册数据代理接口.
 * @ClassName: IDicTableBAO
 * @Description: Description of this class
 * @author owen 于 2019年11月18日 下午1:23:03
 */

public interface IDicTableBAO {

	List<DicTableDTO> findAllTable();
	boolean createTable(DicTableDTO tableDTO);
}
