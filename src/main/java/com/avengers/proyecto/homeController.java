package com.avengers.proyecto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dominio.mongodb.DAOempleado;
import dominio.mongodb.Empleado;

@Controller
public class homeController {

	@RequestMapping("IrHome")
public ModelAndView redireccion() {
	ModelAndView MV= new ModelAndView();
	MV.setViewName("home");
	MV.addObject("mensaje", "estoy llamando a este jsp desde un controller");
	
	return MV;
}


@RequestMapping(value = "loginUsuario", method = RequestMethod.POST)
public ModelAndView login(HttpServletRequest request)throws Exception{
	String email, contrasena;
	email = request.getParameter("inputEmail");
	contrasena = request.getParameter("inputPassword");
	DAOempleado dao = new DAOempleado();
	Empleado e1,e2;
	e1 = new Empleado(email, contrasena);
	
	if(dao.login(e1)) {
		e2 = dao.getEmpleado(email);
		return new ModelAndView("exito", "persona", e1);
	}else {
		return new ModelAndView("home", "aviso", "El usuario y/o clave son incorrectos.");
	}
	}

}
