package com.thzm.eye025.listener;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class GlobalInitListener implements ServletContextListener {


    public void contextInitialized(ServletContextEvent sce)  { 
    	 ServletContext add = sce.getServletContext();
         add.setAttribute("adminList", new ArrayList());
         add.setAttribute("count", 0);
     	
    }
    
    public void contextDestroyed(ServletContextEvent sce)  { 
       
    	
    }

	
	
}
