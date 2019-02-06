package com.work.listeners;

import com.work.exception.DaoException;
import com.work.dao.CountryDaoImpl;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.io.IOException;

public class SessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent sessionEvent) {
        System.out.println("Session Created:: ID="+sessionEvent.getSession().getId());
        sessionEvent.getSession().setAttribute("name", "Session");
        try {
            CountryDaoImpl countryDao = new CountryDaoImpl();
            sessionEvent.getSession().setAttribute("countryDao", countryDao);
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }

    public void sessionDestroyed(HttpSessionEvent sessionEvent) {
        System.out.println("Session Destroyed:: ID="+sessionEvent.getSession().getId());
        try {
            CountryDaoImpl countryDao = (CountryDaoImpl) sessionEvent.getSession().getAttribute("countryDao");
            countryDao.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
