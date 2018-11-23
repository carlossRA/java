package modelo.mongodb;

import org.apache.commons.codec.digest.DigestUtils;

public class Empleado {

	private String dni, email, contrasena, nombre, rol;
	private DAOEmpleado dao = new DAOEmpleado();

	public Empleado(){

	}

	public Empleado(String email, String contrasena) {
		this.dni = dao.dniEmpleado(email);
		this.email = email;
		this.contrasena = contrasena;
		this.nombre = dao.nombreEmpleado(email);
		this.rol = dao.rolEmpleado(email);
	}
	
	//Constructor para dar de alta un usuario
	public Empleado(String dni, String email, String nombre, String rol) {
		this.dni = dni;
		this.email = email;
		this.contrasena = GeneradorContrasena.getContrasenaAleatoria(20);
		this.nombre = nombre;
		this.rol = rol;
		darAltaUsuario();
	}

	public boolean credencialesCorrectas(String emailEmpleado, String contrasenaIntroducida) {
		String contrasenaReal = dao.contrasenaDeEmpleado(emailEmpleado);
		if(contrasenaReal.equals(contrasenaIntroducida))
			return true;    	

		return false;
	}
	public String rolEmpleado(String emailEmpleado) {
		return dao.rolEmpleado(emailEmpleado);
	}

	public boolean contrasenaCoincide(String contrasena1, String contrasena2) {
		if(contrasena1.equals(contrasena2))
			return true;

		return false;
	}
	public void cambiarContrasena(String tipo, String email, String contrasena) {
		enviarEmail(tipo, email, contrasena);
		dao.cambiarContrasena(email, DigestUtils.md5Hex(contrasena));
	}

	public boolean requisitosContrasena(String contrasenaNueva) {
		boolean size = false, numeros = false, minuscula = false, mayuscula = false;
		if(contrasenaNueva.length() >= 8) {
			size = true;
		}
		for(int j = 0; j < contrasenaNueva.length(); j++) {
			if(esNumero(contrasenaNueva.charAt(j)))
				numeros = true;
		}
		for(int j = 0; j < contrasenaNueva.length(); j++) {
			if(esMayuscula(contrasenaNueva.charAt(j)))
				mayuscula = true;
		}
		for(int j = 0; j < contrasenaNueva.length(); j++) {
			if(esMinuscula(contrasenaNueva.charAt(j)))
				minuscula = true;
		}
		return size && numeros && mayuscula && minuscula;
	}

	private boolean esNumero(char n) {
		return (n >= '0' && n <= '9');
	}

	private boolean esMayuscula(char n) {
		boolean check = false;
		if(n >= 'A' && n <= 'Z')
			check = true;

		return check;
	}

	private boolean esMinuscula(char n) {
		if(n >= 'a' && n <= 'z')
			return true;

		return false;
	}

	public boolean recuperarContrasena(String emailDni) {
		String contrasena, emailDestino, destinatario;
		if(!dao.empleadoExiste(emailDni))
			return false;
		emailDestino = dao.emailEmpleado(emailDni);
		if(!emailDestino.equals(null))
			destinatario = emailDestino;
		else
			destinatario = emailDni;
		contrasena = GeneradorContrasena.getContrasenaAleatoria(20);
		cambiarContrasena("recuperar credenciales", destinatario, contrasena);
		return true;
	}

	private void enviarEmail(String tipo, String emailEmpleado, String contrasena) {
		@SuppressWarnings("unused")
		EmailSender enviarEmail = new EmailSender(tipo, emailEmpleado, contrasena);
	}
	
	public void eliminarEmpleado(String emailEmpleado) {
		dao.eliminarEmpleado(emailEmpleado);
	}
	
	public void darAltaUsuario() {
		dao.darAltaUsuario(this);
		enviarEmail("alta de empleado", email, contrasena);
	}
	
	public void cambiarRol(String emailEmpleado, String nuevoRol) {
		dao.cambiarRol(emailEmpleado, nuevoRol);
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}





}
