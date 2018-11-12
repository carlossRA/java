package modelo.mongodb;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

public class DAOFichaje {

	private DBBroker db;
	private MongoCollection<Document> coleccion;

	public DAOFichaje() {

		db = new DBBroker();
		coleccion = db.devolverColeccion("Fichajes");

	}

	public void abrirFichaje(Fichaje fichaje) {
		Document documento = new Document();
		db.insertarDocumento(coleccion, documento
				.append("idEmpleado", fichaje.getIdEmpleado())
				.append("fechaFichaje", fichaje.getFechaFichaje())
				.append("horaEntrada", fichaje.getHoraEntrada())
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

	public boolean fichajeRealizable(String idEmpleado, String fecha) {
		Document documento = new Document();
		MongoCursor<Document> elementos = db.documentosEnColeccion(coleccion);
		while(elementos.hasNext()) {
			documento = elementos.next();
			if(documento.get("idEmpleado").toString().equalsIgnoreCase(idEmpleado))
				if(documento.get("fechaFichaje").toString().equals(fecha))
					return false;

		}
		return true;
	}

	public boolean fichajeCerrable(String idEmpleado, String fecha, String estado) {
		Document documento = new Document();
		MongoCursor<Document> elementos = db.documentosEnColeccion(coleccion);
		while(elementos.hasNext()) {
			documento = elementos.next();
			if(documento.get("idEmpleado").toString().equalsIgnoreCase(idEmpleado))
				if(documento.get("fechaFichaje").toString().equals(fecha))
					if(documento.get("estado").toString().equals(estado))
						return true;

		}
		return false;
	}
	
	public List<Document> fichajesEmpleado(String idEmpleado){
		List<Document> fichajes = new ArrayList<Document>();
		Document documento = new Document();
		MongoCursor<Document> elementos = db.documentosEnColeccion(coleccion);
		while(elementos.hasNext()) {
			documento = elementos.next();
			if(documento.get("idEmpleado").toString().equalsIgnoreCase(idEmpleado))
				fichajes.add(documento);
		}
		
		return fichajes;
	}

}
