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
		db.insertarDocumento(coleccion, documento
				.append("idEmpleado", fichaje.getIdEmpleado())
				.append("fechaFichaje", fichaje.getFechaFichaje())
				.append("horaEntrada", fichaje.getHoraFichaje())
				.append("horaCierre", null)
				.append("estado", fichaje.getEstado()));
	}

	public void cerrarFichaje(Empleado empleado, Fichaje fichaje) {
		Document documento = new Document();
		Document filtro = new Document();
		Document cambio = new Document();
		filtro.put("idEmpleado", empleado.getDni());
		filtro.put("estado", "Abierto");
		cambio.put("horaCierre", fichaje.getHoraCierre());
		cambio.put("estado", "Cerrado");
		documento.put("$set", cambio);
		db.actualizarDocumento(coleccion, filtro, documento);
		fichaje.setEstado("Cerrado");
	}

}
