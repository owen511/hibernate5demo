/**
 * @Title: TestSpringHibernate.java
 * @Copyright (C) 2019 ǰ�����
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019��11��21��  owen
 */
 

package com;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qian.fang.ho.dic.bao.IDicTableBAO;
import com.qian.fang.ho.dic.bao.impl.DicTableBAOImpl;
import com.qian.fang.ho.dic.dto.DicTableDTO;



/**
 * @ClassName: TestSpringHibernate
 * @Description: Description of this class
 * @author owen �� 2019��11��21�� ����10:05:39
 */

public class TestSpringHibernate {

	private static  String conf = "applicationContext.xml";
    private static ApplicationContext context = null;
    private static IDicTableBAO dicTableBAO = null;
    
    static {
        context = new ClassPathXmlApplicationContext(conf);
        dicTableBAO = context.getBean(DicTableBAOImpl.class);
    }
    //@Test
    public void testSpringHibernateDemo() {
    	//fail("Not yet implemented");
        dicTableBAO.findAllTable();  
   }
    
    @Test
    public void testAdd() {
        dicTableBAO.findAllTable();
        DicTableDTO tableDTO= new DicTableDTO();
        tableDTO.setTablecode("ff");
        tableDTO.setName("���Ա�6");
        tableDTO.setGovyear((short) 2019);
        tableDTO.setGovid("0");
        tableDTO.setTabletype(1);
        dicTableBAO.createTable(tableDTO);   
   }
}
