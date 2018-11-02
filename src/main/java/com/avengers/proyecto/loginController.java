package com.avengers.proyecto;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import modelo.mongodb.Empleado;
import modelo.mongodb.Fichaje;

@Controller
public class loginController {
	Empleado empleado = new Empleado();
	Calendar calendario = new GregorianCalendar();
	Fichaje fichaje = new Fichaje();

	@RequestMapping("login.htm")
	public ModelAndView redireccion() {
		ModelAndView MV= new ModelAndView();
		MV.setViewName("login");
		return MV;
	}

	@RequestMapping(value = "home.htm", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, ModelMap model)throws Exception{
		String email, contrasena;
		email = request.getParameter("inputEmail");
		contrasena = request.getParameter("inputPassword");		
		if(empleado.credencialesCorrectas(email, contrasena)) {
			empleado = new Empleado(email, contrasena);
			model.addAttribute("email", empleado.getEmail());
			if (empleado.getRol().equals("usuario"))
				return new ModelAndView("home");
			else return new ModelAndView("admin");

		}else {

			return new ModelAndView("login","error","usuario o contraseña incorrectos");
		} 	
	}

	@RequestMapping(method = RequestMethod.POST, value = "abrirFichaje.htm")
	public ModelAndView abrirFichaje(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws Exception {
		String hora, mensaje, fecha;
		hora = Integer.toString(calendario.get(Calendar.HOUR_OF_DAY)) + ":" + Integer.toString(calendario.get(Calendar.MINUTE));
		fecha = Integer.toString(calendario.get(Calendar.DATE)) + "/" + Integer.toString(calendario.get(Calendar.MONTH))
		+ "/" + Integer.toString(calendario.get(Calendar.YEAR));
		model.addAttribute("email", empleado.getEmail());
		if(!fichaje.comprobarFichaje(empleado.getDni(), fecha) == true)
			mensaje = "Ya tienes un fichaje abierto hoy";
		else {
			mensaje = "Fichaje Abierto";
			fichaje = new Fichaje(empleado.getDni(), fecha, hora);
		}
		return new ModelAndView("home", "mensaje", mensaje);
	} 

	@RequestMapping(method = RequestMethod.POST, value = "cerrarFichaje.htm")
	public ModelAndView cerrarFichaje(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws Exception {
		String hora, mensaje, fecha;
		hora = Integer.toString(calendario.get(Calendar.HOUR_OF_DAY)) + ":" + Integer.toString(calendario.get(Calendar.MINUTE));
		fecha = Integer.toString(calendario.get(Calendar.DATE)) + "/" + Integer.toString(calendario.get(Calendar.MONTH))
		+ "/" + Integer.toString(calendario.get(Calendar.YEAR));
		model.addAttribute("email", empleado.getEmail());
		if(!fichaje.comprobarCierre(empleado.getDni(), fecha, "Abierto"))
			mensaje = "No puedes cerrar ningún fichaje";
		else {
			mensaje = "Fichaje Cerrado";
			fichaje.cerrarFichaje(hora, empleado);
		}
		return new ModelAndView("home", "mensaje", mensaje);
	} 
}
