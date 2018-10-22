package dominio.mongodb;

public class DAOempleado {

	DBBroker db;

	public DAOempleado() {
		db = new DBBroker();
	}

	public boolean crearEmpleado(Empleado p) {
		return db.crearEmpleado(p);
	}

	public boolean existeEmail(String email) {
		return db.existeEmail(email);
	}

	public boolean existeContraseña(String contraseña) {
		return db.existeContraseña(contraseña);
	}

	public boolean login(Empleado e) throws Exception {
		return db.login(e);
	}

	public boolean borrarEmpleado(Empleado e) {
		return db.borrarEmpleado(e);
	}

	public boolean actualizarEmpleado(Empleado e) {
		return db.actualizarEmpleado(e);
	}

	public Empleado getEmpleado(String nombre) {
		return db.getEmpleado(nombre);
	}

}
