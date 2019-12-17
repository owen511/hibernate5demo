/**
 * @Title: CommonHibernateDAOSupport.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月15日  owen
 */
 

package com;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * @ClassName: CommonHibernateDAOSupport
 * @Description: Description of this class
 * @author owen 于 2019年11月15日 下午3:24:49
 */

public class CommonHibernateDAOSupport extends HibernateDaoSupport {

	public void clear() {
		this.getHibernateTemplate().clear();
	}
	
	public void flush() {
		this.getHibernateTemplate().flush();
	}
}
