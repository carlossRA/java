package com.avengers.proyecto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {

	@RequestMapping("IrHome")
public ModelAndView redireccion() {
	ModelAndView MV= new ModelAndView();
	MV.setViewName("home");
	MV.addObject("mensaje", "estoy llamando a este jsp desde un controller");
	
	return MV;
}
}
