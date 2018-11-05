package modelo.mongodb;

import org.bson.Document;

import com.mongodb.client.MongoCollection;

public class DAOEmpleado {

	private DBBroker db;
	private MongoCollection<Document> coleccion;

	public DAOEmpleado() {
		
		db = new DBBroker();
		coleccion = db.devolverColeccion("Empleados");
	}

	public String contrasenaDeEmpleado(String emailEmpleado) {
		Document documentoEmail = null;
		String contrasenaEmpleado = "";
		documentoEmail = documentoEmpleado(emailEmpleado);
		if(documentoEmail != null)
			contrasenaEmpleado = documentoEmail.get("contrasena").toString();
		return contrasenaEmpleado;
	}
	
	public String dniEmpleado(String emailEmpleado) {
		Document documentoEmail = null;
		documentoEmail = documentoEmpleado(emailEmpleado);	
		return documentoEmail.get("_id").toString();
	}
	
	public String rolEmpleado(String emailEmpleado) {
		Document documentoEmail = null;
		documentoEmail = documentoEmpleado(emailEmpleado);	
		return documentoEmail.get("rol").toString();
	}	
	
	public String nombreEmpleado(String emailEmpleado) {
		Document documentoEmail = documentoEmpleado(emailEmpleado);
		return documentoEmail.get("nombre").toString();
	}
	
	public void cambiarContrasena(Empleado empleado, String nuevaContrasena) {
		Document documento = new Document();
		Document filtro = new Document();
		Document cambio = new Document();
		filtro.put("email", empleado.getEmail());
		cambio.put("contrasena", nuevaContrasena);
		documento.put("$set", cambio);
		db.actualizarDocumento(coleccion, filtro, documento);
		empleado.setContrasena(nuevaContrasena);		
		
	}
	
	public Document documentoEmpleado(String emailEmpleado) {
		return db.devolverDocumento(coleccion, "email", emailEmpleado);
	}


}
