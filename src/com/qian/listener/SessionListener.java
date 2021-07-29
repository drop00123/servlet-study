package com.qian.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener
public class SessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("会话建立");
        HttpSession session = httpSessionEvent.getSession();
        int onlineMan =Integer.valueOf(session.getServletContext().getAttribute("onlineMan").toString());
        ServletContext servletContext = httpSessionEvent.getSession().getServletContext();
        servletContext.setAttribute("onlineMan",++onlineMan);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("会话离开");
        HttpSession session = httpSessionEvent.getSession();
        int onlineMan =Integer.valueOf(session.getServletContext().getAttribute("onlineMan").toString());
        ServletContext servletContext = httpSessionEvent.getSession().getServletContext();
        servletContext.setAttribute("onlineMan",--onlineMan);
    }
}
