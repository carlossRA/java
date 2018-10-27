package com.avengers.proyecto;



import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import modelo.mongodb.Empleado;


public class FormController {
    
    @RequestMapping(value="formulario.htm",method=RequestMethod.GET)
    public ModelAndView form()
    {
       return new ModelAndView("formulario","command",new Empleado("1234","1234")); 
     
    }
    
    @RequestMapping(value="formulario.htm",method=RequestMethod.POST)
    public String form(Empleado empl,ModelMap model)
    {
       // model.addAttribute("email","Prueba");
        //model.addAttribute("correo","Prueba2");
        //model.addAttribute("edad","1234");
        return "formulario";
    }
}
