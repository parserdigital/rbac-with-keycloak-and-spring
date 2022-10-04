package com.parserdigital.fernando.marchuet.rbackeycloak.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Controller
public class DevelopersController {

    @GetMapping("/contact-us")
    public ModelAndView contacUs(){
        return new ModelAndView("contact-us");
    }

    @GetMapping("/home")
    @PreAuthorize("hasAuthority('USER')")
    public ModelAndView home(){
        return new ModelAndView("home");
    }

    @GetMapping("/access-denied")
    public ModelAndView accessDenied(){
        return new ModelAndView("access-denied");
    }

    @GetMapping("/admin-console")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ModelAndView adminConsole(){
        return new ModelAndView("admin-console");
    }

    @GetMapping("/developer-environment")
    @PreAuthorize("hasAuthority('DEVELOPER')")
    public ModelAndView developerEnvironment(){
        return new ModelAndView("developer-environment");
    }

    @GetMapping("/logout")
    public void logout(HttpServletRequest request) throws ServletException {
        request.logout();
    }
}
