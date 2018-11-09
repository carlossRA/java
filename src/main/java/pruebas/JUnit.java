package pruebas;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import modelo.mongodb.Empleado;
import modelo.mongodb.Fichaje;

public class JUnit {

	/*pruebas clase empleado*/
	
	@Test 
	public void testEliminarEmpleado() {
		Empleado empl =new Empleado();
	//	empl.eliminarEmpleado("05980925M");
	//	assertTrue(!empl.existir("05980925M"));
	}
	/**
	método que prueba a eliminar un usuario.
	*/
	
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
	@Test 
	public void testCreedencialesCorreoFalsoContraGrande() {
		Empleado empl =new Empleado();
		boolean resultado=empl.credencialesCorrectas("Carlos.rodriguez24@alu.uclm.es","56781111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		assertTrue(!resultado);
		
	}
	/**
	 * método que comprueba si existe un usuario que no esta  registrado 
	 * en nuestras colecciones de MongoDB 
	 * 
	 */
	
	@Test 
	public void testCreedencialesCorrectasContraseñaNoRegistrada() {
		Empleado empl =new Empleado();
		boolean resultado=empl.credencialesCorrectas("ruben.perez7@alu.uclm.es","1234");
		assertTrue(!resultado);
		
	}
	@Test 
	public void testCreedencialesCorrectasContraseñaGrande() {
		Empleado empl =new Empleado();
		boolean resultado=empl.credencialesCorrectas("ruben.perez7@alu.uclm.es","123499999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
		assertTrue(!resultado);
		
	}
	/**
	 * método que comprueba si existe un usuario que no tiene contraseña registrada 
	 * en nuestras colecciones de MongoDB 
	 * 
	 */
	@Test 
	public void testCreedencialesCorrectasCorreoNoRegistrado() {
		Empleado empl =new Empleado();
		boolean resultado=empl.credencialesCorrectas("1234","Ruben123");
		assertTrue(!resultado);
		
	}
	/**
	 * método que comprueba si existe un usuario que no tienen correo registrado
	 * en nuestras colecciones de MongoDB 
	 * 
	 */
	
	@Test 
	public void testCreedencialesCorrectasCorreoGrandeContraExiste() {
		Empleado empl =new Empleado();
		boolean resultado=empl.credencialesCorrectas("1234kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk","Ruben123");
		assertTrue(!resultado);
		
	}

	@Test 
	public void testCreedencialesCorrectasCorreoGrandeContraNoExiste() {
		Empleado empl =new Empleado();
		boolean resultado=empl.credencialesCorrectas("1234kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk","1234");
		assertTrue(!resultado);
		
	}
	@Test 
	public void testCreedencialesCorrectasCadenasGrande() {
		Empleado empl =new Empleado();
		boolean resultado=empl.credencialesCorrectas("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111","ee1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		assertTrue(!resultado);
		
	}
	/**
	 * método que comprueba si existe un usuario que no esta  registrado 
	 * en nuestras colecciones de MongoDB 
	 * 
	 */
	@Test 
	public void testObtenerEmpleadoRegistrado() {
		Empleado empl =new Empleado("ruben.perez7@alu.uclm.es","Ruben123");
		
		assertTrue(empl.getDni().equals("05980925M")&&empl.getEmail().equals("ruben.perez7@alu.uclm.es")&&
				empl.getContrasena().equals("Ruben123")&&empl.getNombre().equals("Ruben Perez Rubio")
				&&empl.getRol().equals("administrador"));
		
	}
	
	/**
	 * probamos a cargar un empleado que existe en la base de datos.
	 * */
	
	@Test
	public void CerrarFichajeFecha23_59_99() {
		
		Fichaje fichaje =new Fichaje("05980509C","5/11/2018","23:51:00");
		Empleado empl =new Empleado("ruben.perez7@alu.uclm.es","Ruben123");
		fichaje.cerrarFichaje("23:59:99", empl);
		assertTrue(fichaje.getHoraCierre().equals("23:59:99")&&fichaje.getEstado().equals("cerrado")&&
				fichaje.getHoraEntrada().equals("23:51:00")&&fichaje.getIdEmpleado().equals("05980509C"));
	}
	

	@Test
	public void CerrarFichajeFecha00_00_00() {
		
		Fichaje fichaje =new Fichaje("05980509C","5/11/2018","00:51:00");
		Empleado empl =new Empleado("ruben.perez7@alu.uclm.es","Ruben123");
		fichaje.cerrarFichaje("00:00:00", empl);
		assertTrue(fichaje.getHoraCierre().equals("00:00:00")&&fichaje.getEstado().equals("cerrado")&&
				fichaje.getHoraEntrada().equals("00:51:00")&&fichaje.getIdEmpleado().equals("05980509C"));
	}

	@Test
	public void CerrarFichajeFecha00_00_01() {
		
		Fichaje fichaje =new Fichaje("05980509C","5/11/2018","00:51:00");
		Empleado empl =new Empleado("ruben.perez7@alu.uclm.es","Ruben123");
		fichaje.cerrarFichaje("00:00:01", empl);
		assertTrue(fichaje.getHoraCierre().equals("00:00:01")&&fichaje.getEstado().equals("cerrado")&&
				fichaje.getHoraEntrada().equals("00:51:00")&&fichaje.getIdEmpleado().equals("05980509C"));
	}
	
  /**
   * comprobamos los valores limite del cambio de dia y comprobamos el resultado
   */
	@Test
	public void ComprobarFichajeEspaciosEnBlanco() {
		Fichaje fichaje =new Fichaje();
		boolean valor= fichaje.comprobarFichaje("","");
		assertTrue(!valor);	
	}
	 /**
	   * comprobamos si se puede registrar un fichaje con espacios en blanco
	   */
	@Test
	public void ComprobarFichajeUnEspacioEnBlancoIzq() {
		Fichaje fichaje =new Fichaje();
		boolean valor= fichaje.comprobarFichaje("","23:50:10");
		assertTrue(!valor);	
	}
	
	/**
	 * Comprobamos si se puede registrar un fichaje con un solo espacio en blanco
	 */
	
	@Test
	public void ComprobarFichajeUnEspacioEnBlancoDer() {
		Fichaje fichaje =new Fichaje();
		boolean valor= fichaje.comprobarFichaje("12","");
		assertTrue(!valor);	
	}
	
	/**
	 * Comprobamos si se puede registrar un fichaje con un solo espacio en blanco
	 */
	
	@Test
	public void ComprobarFichaje_12_235040() {
		Fichaje fichaje =new Fichaje();
		boolean valor= fichaje.comprobarFichaje("12","23:50:40");
		assertTrue(valor);	
	}
	
	/**
	 * Comprobamos si se puede registrar un fichaje con todos los datos
	 */
	
}