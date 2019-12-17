/**
 * @Title: IDicTableDAO.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月15日  owen
 */
 

package com.dao;

import java.util.List;

/**
 * 表注册数据访问接口.
 * @ClassName: IDicTableDAO
 * @Description: Description of this class
 * @author owen 于 2019年11月15日 下午2:11:05
 */

public interface IDicTableDAO<DicTableDTO> {

	/**
	 * 查找所有表.
	 * @return 查询结果以List形式返回,List中装的是表DTO
	 * @throws
	 */
    public List<DicTableDTO> findAllTable();

    /**
     * 从缓存中查询所有表.
     * @return List 查询结果以List形式返回,List中装的是TableDTO
     * @throws
     */
    public List<DicTableDTO> findAllCachedTable();

    /**
     * 新增表.
     * @param tables
     * @return
     * @throws
     */
    public List<DicTableDTO> createTable(List<DicTableDTO> tables);
    
    public boolean createTable(DicTableDTO tableDTO);

    /**
     * 更新表(批量).
     * @param tables 表DTO的集合
     * @return List表DTO的集合
     * @throws
     */
    public List<DicTableDTO> updateTable(List<DicTableDTO> tables);

    /**
     * 更新表(单个).
     * @param tableDTO
     * @return
     * @throws
     */
    public DicTableDTO updateTable(DicTableDTO tableDTO);

    /**
     * 删除表(批量).
     * @param tables
     * @return
     * @throws
     */
    public List<DicTableDTO> deleteTable(List<DicTableDTO> tables);

    /**
     * 根据表编码查询表.
     * @param tableCode 表编码.
     * @return
     * @throws
     */
    public DicTableDTO findTableByCode(String tableCode);


}
