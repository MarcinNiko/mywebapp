package com.pracc.mywebapp.controllers;

import com.pracc.mywebapp.services.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddController {
    @RequestMapping("add")
    public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j, HttpServletRequest request, HttpServletResponse response)
    {
        ModelAndView m = new ModelAndView();
//        int i = Integer.parseInt(request.getParameter("t1"));
//        int j = Integer.parseInt(request.getParameter("t2"));

        AddService as = new AddService();
        int k = as.add(i, j);

        m.setViewName("home");
        m.addObject("result", k);

        return m;
    }
}
