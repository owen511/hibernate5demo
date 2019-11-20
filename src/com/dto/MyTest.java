/**
 * @Title: MyTest.java
 * @Copyright (C) 2019 ǰ�����
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019��11��20��  owen
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
 * @author owen �� 2019��11��20�� ����9:57:16
 */

public class MyTest {
	@Test
	public void test() {
		// 1. ����һ�� SessionFactory �����ࣺ ͨ��������һ�������ݿ����ӻػ� session
		SessionFactory sessionFactory = null;
		// �����ࣺ ��װ�����ǵ������ļ����������Ϣ, ���ص� configuration �����������ļ���ľ�����Ϣ
		Configuration configuration = new Configuration().configure();
//		// Hibernate5�涨�� �������û����Ҫ��Ч�� ���뽫��ע�ᵽһ������ע������
//		StandardServiceRegistry serviceRegistry = configuration.getStandardServiceRegistryBuilder().build();
		System.out.println(">>>>>>>1");
		sessionFactory = configuration.buildSessionFactory();	
//		sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
//		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
//        StandardServiceRegistry sr = ssrb.configure().build();
//        System.out.println(">>>>>>>11");
//        // 2.��config�õ�һ���Ự����//�õ�sessionFactory
//        sessionFactory = new MetadataSources(sr).buildMetadata().buildSessionFactory();
		System.out.println(">>>>>>>2");
		// 2. ͨ�������࿪�� Session ����
		Session session = sessionFactory.openSession();
		System.out.println(">>>>>>>3");
		// 3. ��������
		Transaction transaction = session.beginTransaction();
		System.out.println(">>>>>>>4");

		// 4. ִ�� CRUD ����
//		DicTableDTO dto = new DicTableDTO();
//		dto.setTablecode("AA");
//		session.save(dto);

		// 5. �ύ����
		transaction.commit();
		// 6. �ر� Session
		session.close();
		// 7. �رչ�����
		sessionFactory.close();
	}
}
