package com.avengerslive.myapp;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.avengerslive.model.persona;
@Controller
public class FormularioController {
	ModelAndView MV;
	/*
	@RequestMapping("/irFormulario")
	public ModelAndView redireccion() {
		
	
		return new ModelAndView("formulario","command",new persona());
	}
	@RequestMapping(value="registrar",method= {RequestMethod.GET,RequestMethod.POST})
	public String registrar(persona per,ModelMap model) {
		model.addAttribute("nombre",per.getNombre());
		model.addAttribute("apellido",per.getApellido());
		
		return "saludo";
	}
	
	*/
	
	@RequestMapping("/irFormulario")
	public ModelAndView irFormulario() {
		
		
	 MV=new ModelAndView("formulario","cmdForm",new persona());
	
		return MV;
	}
	
	@RequestMapping(value="/agregar",method= {RequestMethod.GET,RequestMethod.POST})
	public String agregar(persona per, ModelMap model) {
        
		model.addAttribute("nombreModel",per.getNombre());
		model.addAttribute("apellidoModel",per.getApellido());
		
		return "/exito";
	}
	
}
