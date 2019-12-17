/**
 * @Title: IDicTableBAO.java
 * @Copyright (C) 2019 ǰ�����
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019��11��18��  owen
 */
 

package com.qian.fang.ho.dic.bao;

import java.util.List;

import com.qian.fang.ho.dic.dto.DicTableDTO;


/**
 * ��ע�����ݴ���ӿ�.
 * @ClassName: IDicTableBAO
 * @Description: Description of this class
 * @author owen �� 2019��11��18�� ����1:23:03
 */

public interface IDicTableBAO {

	List<DicTableDTO> findAllTable();
	boolean createTable(DicTableDTO tableDTO);
}
