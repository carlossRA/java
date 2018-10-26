package com.avengers.proyecto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dominio.mongodb.Empleado;







public class loginController {

	@RequestMapping("login.htm")
public ModelAndView redireccion() {
	ModelAndView MV= new ModelAndView();
	MV.setViewName("login");
	
	
	return MV;
}


@RequestMapping(value = "login.htm", method = RequestMethod.POST)
public String login(HttpServletRequest request,ModelMap model)throws Exception{
	/* con este metodo solo obtengo los datos de un formulario*/
	String email, contrasena;
	email = request.getParameter("inputEmail");
	contrasena = request.getParameter("inputPassword");
	//DAOempleado dao = new DAOempleado();
	Empleado e1;
	e1 = new Empleado(email, contrasena);
	System.out.println(email+" "+contrasena);
	 model.addAttribute("correo",e1.getEmail());
     model.addAttribute("contrasena",e1.getContrasena());
    
	
	return "home";
/* Código a añadir para trabajar con  la base de datos
if(dao.login(e1)) {
	e2 = dao.getEmpleado(email);
	return new ModelAndView("exito", "empleado", e1);
}else {
	return new ModelAndView("home", "aviso", "El usuario y/o clave son incorrectos.");
} 
*/
}

}
