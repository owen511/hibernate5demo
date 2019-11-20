/**
 * @Title: MyTest.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月20日  owen
 */

package com.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;


/**
 * @ClassName: MyTest
 * @Description: Description of this class
 * @author owen 于 2019年11月20日 上午9:57:16
 */

public class MyTest {
	@Test
	public void test() {
		// 1. 创建一个 SessionFactory 工厂类： 通过它建立一个与数据库连接回话 session
		SessionFactory sessionFactory = null;
		// 配置类： 封装有我们的配置文件里的配置信息, 返回的 configuration 包含有配置文件里的具体信息
		Configuration configuration = new Configuration().configure();
//		// Hibernate5规定： 所有配置或服务要生效， 必须将其注册到一个服务注册类中
//		StandardServiceRegistry serviceRegistry = configuration.getStandardServiceRegistryBuilder().build();
		System.out.println(">>>>>>>1");
		sessionFactory = configuration.buildSessionFactory();	
//		sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
//		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
//        StandardServiceRegistry sr = ssrb.configure().build();
//        System.out.println(">>>>>>>11");
//        // 2.由config得到一个会话工厂//得到sessionFactory
//        sessionFactory = new MetadataSources(sr).buildMetadata().buildSessionFactory();
		System.out.println(">>>>>>>2");
		// 2. 通过工厂类开启 Session 对象
		Session session = sessionFactory.openSession();
		System.out.println(">>>>>>>3");
		// 3. 开启事务
		Transaction transaction = session.beginTransaction();
		System.out.println(">>>>>>>4");

		// 4. 执行 CRUD 操作
//		DicTableDTO dto = new DicTableDTO();
//		dto.setTablecode("AA");
//		session.save(dto);

		// 5. 提交事务
		transaction.commit();
		// 6. 关闭 Session
		session.close();
		// 7. 关闭工厂类
		sessionFactory.close();
	}
}
