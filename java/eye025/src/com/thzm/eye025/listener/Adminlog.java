package com.thzm.eye025.listener;

import java.util.List;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


@WebListener
public class Adminlog implements HttpSessionAttributeListener {

   
    public void attributeAdded(HttpSessionBindingEvent se)  { 
       String u = se.getName();//返回发生绑定和取消绑定的session的名字
       
       if("userInfo".equals(u)) {
    	   Object s = se.getValue();
    	   List list =  (List) se.getSession().getServletContext().getAttribute("adminList");
    	   list.add(s);
       }
    	
    	
    }

    public void attributeRemoved(HttpSessionBindingEvent se)  { 
    	  String u = se.getName();
          
          if("userInfo".equals(u)) {
       	   Object o = se.getValue();
       	   List list =  (List) se.getSession().getServletContext().getAttribute("adminList");
       	   list.remove(o);
          }
    }


    public void attributeReplaced(HttpSessionBindingEvent se)  { 
         // TODO Auto-generated method stub
    }
	
}
