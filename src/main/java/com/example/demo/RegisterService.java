package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class RegisterService {

    public ModelAndView processForm(RegisterBean rb, ModelAndView m) {
        m.addObject("rb", rb);
        m.addObject("message", rb.getAdultMessage());
        m.addObject("evennumber", rb.getSpecialMessage());
        m.setViewName("result.html");
        return m;
    }
}