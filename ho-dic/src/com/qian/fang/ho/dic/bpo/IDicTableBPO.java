/**
 * @Title: IDicTableBPO.java
 * @Copyright (C) 2019 ǰ�����
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019��11��18��  owen
 */
 

package com.qian.fang.ho.dic.bpo;

import java.util.List;

import com.qian.fang.ho.dic.dto.DicTableDTO;


/**
 * ��ע�����ݴ���ӿ�.
 * @ClassName: IDicTableBPO
 * @Description: Description of this class
 * @author owen �� 2019��11��18�� ����1:22:06
 */

public interface IDicTableBPO {
	
	List<DicTableDTO> findAllTable();
	
	boolean createTable(DicTableDTO tableDTO);

}
