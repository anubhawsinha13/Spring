package com.a3.spring.spring_jdbc_template;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.a3.spring.dao.OrganizationDao;
import com.a3.spring.daoImpl.OrganizationDaoImpl;
import com.a3.spring.domain.Organization;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
        
        OrganizationDao dao = (OrganizationDaoImpl)ctx.getBean("orgDao");
        List<Organization> orgs = dao.getAllOrganizations();
        for(Organization org: orgs) {
        	
        	System.out.println(org.getId());
        }
        
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
