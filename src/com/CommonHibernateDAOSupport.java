/**
 * @Title: CommonHibernateDAOSupport.java
 * @Copyright (C) 2019 ǰ�����
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019��11��15��  owen
 */
 

package com;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * @ClassName: CommonHibernateDAOSupport
 * @Description: Description of this class
 * @author owen �� 2019��11��15�� ����3:24:49
 */

public class CommonHibernateDAOSupport extends HibernateDaoSupport {

	public void clear() {
		this.getHibernateTemplate().clear();
	}
	
	public void flush() {
		this.getHibernateTemplate().flush();
	}
}
