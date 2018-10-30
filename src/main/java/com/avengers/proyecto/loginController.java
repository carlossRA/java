package com.avengers.proyecto;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import modelo.mongodb.DAOEmpleado;
import modelo.mongodb.Empleado;
import modelo.mongodb.Fichaje;

@Controller
public class loginController {
	Empleado empleado = new Empleado();
	Calendar calendario = new GregorianCalendar();
	Fichaje fichaje;

	@RequestMapping("login.htm")
	public ModelAndView redireccion() {
		ModelAndView MV= new ModelAndView();
		MV.setViewName("login");
		return MV;
	}

	@RequestMapping(value = "login/home.htm", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, ModelMap model)throws Exception{
		String email, contrasena;
		email = request.getParameter("inputEmail");
		contrasena = request.getParameter("inputPassword");		
		if(empleado.credencialesCorrectas(email, contrasena)) {
			empleado = new Empleado(email, contrasena);
			model.addAttribute("email", empleado.getEmail());
			if (empleado.getRol().equals("usuario"))
				return new ModelAndView("home");
			else return new ModelAndView("login","error","Eres administrador");

		}else {

			return new ModelAndView("login","error","usuario o contraseña incorrectos");
		} 	
	}
}
