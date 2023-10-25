package com.maideneasydesign.wastemgmntmed.blugauge.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class SimpleCORSFilter implements Filter {


    private final Logger log= LoggerFactory.getLogger(SimpleCORSFilter.class);

    public SimpleCORSFilter(){
        log.info("SimpleCORSFilter init");
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain) throws IOException, ServletException {
     //typecasting to http servlet request
        HttpServletRequest request=(HttpServletRequest) req;
        HttpServletResponse response=(HttpServletResponse) res;


    }

    @Override
    public void destroy() {

    }
}
