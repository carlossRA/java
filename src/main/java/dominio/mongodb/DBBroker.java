package dominio.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class DBBroker {

	MongoClient cliente = null;
	MongoDatabase bd = null;

	public DBBroker() {

		if(cliente == null) {
			String acceso = "mongodb://usuarioGeneral:usuarioGeneral2018@ds233763.mlab.com:33763/avengerslive";
			MongoClientURI uri = new MongoClientURI(acceso);
			cliente = new MongoClient(uri);
		}	
		bd = cliente.getDatabase("avengerslive");
	}

	public boolean crearEmpleado(Empleado p) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean existeEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean existeContraseña(String contraseña) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean login(Empleado e) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean borrarEmpleado(Empleado e) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean actualizarEmpleado(Empleado e) {
		// TODO Auto-generated method stub
		return false;
	}

	public Empleado getEmpleado(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
