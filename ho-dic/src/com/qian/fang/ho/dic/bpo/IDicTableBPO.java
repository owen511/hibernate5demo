/**
 * @Title: IDicTableBPO.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月18日  owen
 */
 

package com.qian.fang.ho.dic.bpo;

import java.util.List;

import com.qian.fang.ho.dic.dto.DicTableDTO;


/**
 * 表注册数据处理接口.
 * @ClassName: IDicTableBPO
 * @Description: Description of this class
 * @author owen 于 2019年11月18日 下午1:22:06
 */

public interface IDicTableBPO {
	
	List<DicTableDTO> findAllTable();
	
	boolean createTable(DicTableDTO tableDTO);

}
