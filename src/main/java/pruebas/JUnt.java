package pruebas;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import modelo.mongodb.Empleado;
import modelo.mongodb.Fichaje;

public class JUnt {

	/*probar metodo credenciales correctas, con criterio de cobertura: n-wise
	 * 
	 * Combinación de elementos:
	 * CorreoExiste-ContraseñaExiste
	 * CorreoExiste-ContraseñaNoExiste
	 * CorreoExiste-ContraseñaMayor255Carac
	 * CorreoNoExiste-ContraseñaExiste
	 * CorreoNoExiste-ContraseñaNoExiste
	 * CorreoNoExiste-ContraseñaMayor255Carac
	 * CorreoMayor255Carac-ContraseñaExiste
	 * CorreoMayor255Carac-ContraseñaNoExiste
	 * CorreoMayor255Carac-ContraseñaMayor255Carac
	 * 
	 * */
	
	@Test 
	public void testCreedencialesCorrectasUsuarioRegistrado() {
		Empleado empl =new Empleado();
		boolean resultado=empl.credencialesCorrectas("ruben.perez7@alu.uclm.es","Ruben123");
		assertTrue(resultado);
		
	}
	/**
	 * método que comprueba si existe un usuario que previamente ha sido registrado 
	 * en nuestras colecciones de MongoDB 
	 * 
	 */
	
	@Test 
	public void testCreedencialesCorrectasUsuarioNoRegistrado() {
		Empleado empl =new Empleado();
		boolean resultado=empl.credencialesCorrectas("Carlos.rodriguez24@alu.uclm.es","5678");
		assertTrue(!resultado);
		
	}
	/**
	 * método que comprueba si existe un usuario con correo correcto pero con 
	 * contraseña falsa.
	 */
	@Test 
	public void testCreedencialesContraGrande()
	{
		Empleado empl =new Empleado();
		boolean resultado=empl.credencialesCorrectas("Carlos.rodriguez24@alu.uclm.es","56781111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		assertTrue(!resultado);
		
	}
	/**
	 *método que comprueba si existe un usuario con correo correcto pero con 
	 *contraseña mayor de 255 caracteres
	 */
	
	@Test 
	public void testCreedencialsCorrectasCorreoNoRegistrado() {
		Empleado empl =new Empleado();
		boolean resultado=empl.credencialesCorrectas("12345678","Ruben123");
		assertTrue(!resultado);
		
	}
	/**
	 * método que comprueba si existe un usuario con correo falso pero con contraseña 
	 * verdadera.
	 */
	@Test 
	public void testCreedencialesCorreoNoExisteContraseñaGrande() {
		Empleado empl =new Empleado();
		boolean resultado=empl.credencialesCorrectas("12345678","1234");
		assertTrue(!resultado);
		
	}
	/**
	 * método que comprueba si existe un usuario con correo falso y contraseña falsa 
	 * 
	 */
	@Test 
	public void testCreedencialesCorrectasCorreoYContraNoRegistrados() {
		Empleado empl =new Empleado();
		boolean resultado=empl.credencialesCorrectas("12345678","123499999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
		assertTrue(!resultado);
		
	}
	/**
	 * método que comprueba si existe un usuario que no tienen correo registrado
	 * en nuestras colecciones de MongoDB y ademas tiene una contraseña de mas de 255 caracteres
	 * 
	 */
	
	@Test 
	public void testCreedencialesCorrectasCorreoGrandeContraExiste() {
		Empleado empl =new Empleado();
		boolean resultado=empl.credencialesCorrectas("1234kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk","Ruben123");
		assertTrue(!resultado);
		
	}
	/**
	 * método que comprueba si existe un usuario que tiene un correo de mas de 255 caracteres
	 * en nuestras colecciones de MongoDB y ademas tiene una contraseña verdadera
	 * 
	 */
	

	@Test 
	public void testCreedencialesCorrectasCorreoGrandeContraNoExiste() {
		Empleado empl =new Empleado();
		boolean resultado=empl.credencialesCorrectas("1234kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk","1234");
		assertTrue(!resultado);
		
	}
	/**
	 * método que comprueba si existe un correo con mas de 255 caracteres
	 * en nuestras colecciones de MongoDB y ademas tiene una contraseña falsa
	 * 
	 */
	
	@Test 
	public void testCreedencialesCorrectasCadenasGrande() {
		Empleado empl =new Empleado();
		boolean resultado=empl.credencialesCorrectas("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111","ee1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		assertTrue(!resultado);
		
	}
	/**
	 * método que comprueba si existe un usuario que tiene un correo y contraseña de
	 * mas de 255 caracteres 
	 */
	
	/*
	 *Métodos que comprueban el método CerrarFichaje
	 *  
	 *Valores elegidos :
	 *23:59:59
	 *00:00:00
	 *00:00:00 
	 */
	
	@Test
	public void CerrarFichajeFecha23_59_99() {
		
		Fichaje fichaje =new Fichaje("05980509C","5/11/2018","23:51:00");
		Empleado empl =new Empleado("ruben.perez7@alu.uclm.es","Ruben123");
		fichaje.cerrarFichaje("23:59:99", empl);
		assertTrue(fichaje.getHoraCierre().equals("23:59:99")&&fichaje.getEstado().equals("cerrado")&&
				fichaje.getHoraEntrada().equals("23:51:00")&&fichaje.getIdEmpleado().equals("05980509C"));
	}
	/**
	 * 
	 */

	@Test
	public void CerrarFichajeFecha00_00_00() {
		
		Fichaje fichaje =new Fichaje("05980509C","5/11/2018","00:51:00");
		Empleado empl =new Empleado("ruben.perez7@alu.uclm.es","Ruben123");
		fichaje.cerrarFichaje("00:00:00", empl);
		assertTrue(fichaje.getHoraCierre().equals("00:00:00")&&fichaje.getEstado().equals("cerrado")&&
				fichaje.getHoraEntrada().equals("00:51:00")&&fichaje.getIdEmpleado().equals("05980509C"));
	}
    /**
    * 
    */
	@Test
	public void CerrarFichajeFecha00_00_01() {
		
		Fichaje fichaje =new Fichaje("05980509C","5/11/2018","00:51:00");
		Empleado empl =new Empleado("ruben.perez7@alu.uclm.es","Ruben123");
		fichaje.cerrarFichaje("00:00:01", empl);
		assertTrue(fichaje.getHoraCierre().equals("00:00:01")&&fichaje.getEstado().equals("cerrado")&&
				fichaje.getHoraEntrada().equals("00:51:00")&&fichaje.getIdEmpleado().equals("05980509C"));
	}
	
	
  /**
   * comprobamos los valores limite y sus adyacentes del cambio de dia y comprobamos 
   * el resultado para las tres pruebas anteriores
   */
	
	
	/*
	 *Métodos que comprueban el método cambiarContrasena
	 *  email-contraseña
	 *Combinacion de elementos :
	 *
	 *Valores para email:{EmailExiste,EmailNoExiste,cadenaMayor255,""}
	 *Valores para contrasena:{cadenaMayor255,"","cadenaNormal"}  
	 *
	 * CorreoExiste-CadenaMayor255
	 * CorreoExiste-""
	 * CorreoExiste-CadenaNormal
	 * CorreoExiste-CadenaExigida
	 * CorreoNoExiste-CadenaMayor255
	 * CorreoNoExiste-""
	 * CorreoNoExiste-CadenaNormal
	 * CorreoNoExiste-CadenaExigida
	 * CorreoMayor255Carac-CadenaMayor255
	 * CorreoMayor255Carac-""
	 * CorreoMayor255Carac-CadenaNormal
	 * ""-CadenaMayor255
	 * ""-""
	 * ""-CadenaNormal
	 * ""-CadenaExigida
	 */
	@Test
	public void ComprobarCambiarContrasenaCorrExistCadMayor255() {
		Empleado empl=new Empleado();
		empl.cambiarContrasena("","carlos.rodriguez24@alu.uclm.es","9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
		assertTrue(empl.getContrasena().equals("Contrasena1"));	
	}
	 /**
	   * comprobamos si se puede registrar un fichaje con espacios en blanco
	   */
	@Test
	public void ComprobarCambiarContrasenaCorrExist_CadenaBlanco() {
		Empleado empl=new Empleado();
		empl.cambiarContrasena("","carlos.rodriguez24@alu.uclm.es","");
		assertTrue(empl.getContrasena().equals("Contrasena1"));	
	}
	
	/**
	 * Comprobamos si se puede registrar un fichaje con un solo espacio en blanco
	 */
	
	@Test
	public void ComprobarCambiarContrasenaCorrExist_CadenaNormal() {
		Empleado empl=new Empleado();
		empl.cambiarContrasena("","carlos.rodriguez24@alu.uclm.es","contrasena");
		assertTrue(empl.getContrasena().equals("Contrasena1"));	
	}
	
	/**
	 * Comprobamos si se puede registrar un fichaje con un solo espacio en blanco
	 */
	
	@Test
	public void ComprobarCambiarContrasenaCorrExistCadenaExigida() {
		Empleado empl=new Empleado();
		empl.cambiarContrasena("","carlos.rodriguez24@alu.uclm.es","Contrasena1");
		assertTrue(empl.getContrasena().equals("Contrasena1"));	
	}
	@Test
	public void ComprobarCambiarContrasenaCorrNoExistCadMayor255() {
		Empleado empl=new Empleado();
		empl.cambiarContrasena("","carlos.rodriguez24","11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		assertTrue(empl.getContrasena().equals("Contrasena1"));	
	}
	 /**
	   * comprobamos si se puede registrar un fichaje con espacios en blanco
	   */
	@Test
	public void ComprobarCambiarContrasenaCorrNoExist_CadenaBlanco() {
		Empleado empl=new Empleado();
		empl.cambiarContrasena("","carlos.rodriguez24@alu.uclm","");
		assertTrue(empl.getContrasena().equals("Contrasena1"));	
	}
	
	/**
	 * Comprobamos si se puede registrar un fichaje con un solo espacio en blanco
	 */
	
	@Test
	public void ComprobarCambiarContrasenaCorrNoExist_CadenaNormal() {
		Empleado empl=new Empleado();
		empl.cambiarContrasena("","carlos.rodriguez24@alu.uclm","contrasena");
		assertTrue(empl.getContrasena().equals("Contrasena1"));	
	}
	/**
	 * Comprobamos si se puede registrar un fichaje con un solo espacio en blanco
	 */
	@Test
	public void ComprobarCambiarContrasenaCorrNoExistCadenaExigida() {
		Empleado empl=new Empleado();
		empl.cambiarContrasena("","carlos.rodriguez24@alu.uclm","Contrasena1");
		assertTrue(empl.getContrasena().equals("Contrasena1"));	
	}
	
	@Test
	public void ComprobarCambiarContrasenaCorrMayor255_CadMayor255() {
		
		Empleado empl=new Empleado();
		empl.cambiarContrasena("","111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111","111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		assertTrue(empl.getContrasena().equals("Contrasena1"));	
		
	}
	 /**
	   * comprobamos si se puede registrar un fichaje con espacios en blanco
	   */
	@Test
	public void ComprobarCambiarContrasenaCorrMayor255_CadenaBlanco() {
		Empleado empl=new Empleado();
		empl.cambiarContrasena("","111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111","");
		assertTrue(empl.getContrasena().equals("Contrasena1"));	
	}
	
	/**
	 * Comprobamos si se puede registrar un fichaje con un solo espacio en blanco
	 */
	
	@Test
	public void ComprobarCambiarContrasenaCorrMayor255_CadenaNormal() {
		Empleado empl=new Empleado();
		empl.cambiarContrasena("","111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111","contrasena");
		assertTrue(empl.getContrasena().equals("Contrasena1"));		
	}
	@Test
	public void ComprobarCambiarContrasenaCorrMayor255_CadenaExigida() {
		Empleado empl=new Empleado();
		empl.cambiarContrasena("","111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111","Contrasena1");
		assertTrue(empl.getContrasena().equals("Contrasena1"));		
	}
	
	@Test
	
	public void ComprobarCambiarContrasenaCadMayor255_() {
		Fichaje fichaje =new Fichaje();
		boolean valor= fichaje.comprobarFichaje("","");
		assertTrue(!valor);	
	}
	 /**
	   * comprobamos si se puede registrar un fichaje con espacios en blanco
	   */
	@Test
	public void ComprobarCambiarContrasenaCadenaBlanco_CadenaBlanco() {
		Fichaje fichaje =new Fichaje();
		boolean valor= fichaje.comprobarFichaje("","23:50:10");
		assertTrue(!valor);	
	}
	
	/**
	 * Comprobamos si se puede registrar un fichaje con un solo espacio en blanco
	 */
	
	@Test
	public void ComprobarCambiarContrasenaCadenaBlanco_CadenaNormal() {
		Fichaje fichaje =new Fichaje();
		boolean valor= fichaje.comprobarFichaje("12","");
		assertTrue(!valor);	
	}

@Test
public void ComprobarCambiarContrasenaCadenaBlanco_CadenaExigida() {
	Empleado empl=new Empleado();
	empl.cambiarContrasena("","","Contrasena1");
	assertTrue(empl.getContrasena().equals("Contrasena1"));		
}
	
	
}

