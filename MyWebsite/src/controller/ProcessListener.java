package controller;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import dao.MemberDAO;

/**
 * Application Lifecycle Listener implementation class ProcessListener
 *
 */
public class ProcessListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ProcessListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
    	arg0.getServletContext().setAttribute("start", new MemberDAO());
    }
	
}
