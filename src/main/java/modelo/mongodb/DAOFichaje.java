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
		coleccion.insertOne(documento
				.append("_id", fichaje.getIdFichaje())
				.append("idEmpleado", fichaje.getIdEmpleado())
				.append("fechaFichaje", fichaje.getFechaFichaje())
				.append("horaEntrada", fichaje.getHoraFichaje()));	
	}

	public void cerrarFichaje(Fichaje fichaje) {
		Document documento = new Document();
		documento = db.devolverDocumento(coleccion, "_id", fichaje.getIdFichaje());
		//db.insertarDocumento(coleccion, documento, "horaCierre", fichaje.getHoraCierre());
	}

}
