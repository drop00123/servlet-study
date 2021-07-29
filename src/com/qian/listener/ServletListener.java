package com.qian.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent e) {
        System.out.println("服务器启动了");
        ServletContext servletContext = e.getServletContext();
        servletContext.setAttribute("onlineMan",0);
    }

    @Override
    public void contextDestroyed(ServletContextEvent e) {

    }
}
