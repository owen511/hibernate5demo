/**
 * @Title: IDicTableDAO.java
 * @Copyright (C) 2019 ǰ�����
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019��11��15��  owen
 */
 

package com.dao;

import java.util.List;

/**
 * ��ע�����ݷ��ʽӿ�.
 * @ClassName: IDicTableDAO
 * @Description: Description of this class
 * @author owen �� 2019��11��15�� ����2:11:05
 */

public interface IDicTableDAO<DicTableDTO> {

	/**
	 * �������б�.
	 * @return ��ѯ�����List��ʽ����,List��װ���Ǳ�DTO
	 * @throws
	 */
    public List<DicTableDTO> findAllTable();

    /**
     * �ӻ����в�ѯ���б�.
     * @return List ��ѯ�����List��ʽ����,List��װ����TableDTO
     * @throws
     */
    public List<DicTableDTO> findAllCachedTable();

    /**
     * ������.
     * @param tables
     * @return
     * @throws
     */
    public List<DicTableDTO> createTable(List<DicTableDTO> tables);
    
    public boolean createTable(DicTableDTO tableDTO);

    /**
     * ���±�(����).
     * @param tables ��DTO�ļ���
     * @return List��DTO�ļ���
     * @throws
     */
    public List<DicTableDTO> updateTable(List<DicTableDTO> tables);

    /**
     * ���±�(����).
     * @param tableDTO
     * @return
     * @throws
     */
    public DicTableDTO updateTable(DicTableDTO tableDTO);

    /**
     * ɾ����(����).
     * @param tables
     * @return
     * @throws
     */
    public List<DicTableDTO> deleteTable(List<DicTableDTO> tables);

    /**
     * ���ݱ�����ѯ��.
     * @param tableCode �����.
     * @return
     * @throws
     */
    public DicTableDTO findTableByCode(String tableCode);


}
