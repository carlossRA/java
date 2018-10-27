package modelo.mongodb;

import org.bson.Document;

import com.mongodb.client.MongoCollection;

public class DAOFichaje {
	
	DBBroker db;
	MongoCollection<Document> coleccion;

	public DAOFichaje() {
		
		db = new DBBroker();
		coleccion = db.devolverColeccion("Fichajes");
		
	}

	public void abrirFichaje(Fichaje fichaje) {
		Document documento = new Document();
		db.insertarDocumento(coleccion, documento, "_id", fichaje.getIdFichaje());
		db.insertarDocumento(coleccion, documento, "idEmpleado", fichaje.getIdEmpleado());
		db.insertarDocumento(coleccion, documento, "fechaFichaje", fichaje.getFechaFichaje());
		db.insertarDocumento(coleccion, documento, "horaEntrada", fichaje.getHoraFichaje());		
	}

	public void cerrarFichaje(Fichaje fichaje) {
		Document documento = new Document();
		documento = db.devolverDocumento(coleccion, "_id", fichaje.getIdFichaje());
		db.insertarDocumento(coleccion, documento, "horaCierre", fichaje.getHoraCierre());
	}

}
