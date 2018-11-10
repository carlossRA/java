package modelo.mongodb;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

public class DAOIncidencia {

	private DBBroker db;
	private MongoCollection<Document> coleccion;

	public DAOIncidencia() {
		
		db = new DBBroker();
		coleccion = db.devolverColeccion("Incidencias");
	}
	
	public List<Document> consultarIncidenciasPropias(String idEmpleado) {
		List<Document> incidencias = new ArrayList<Document>();
		Document documento = new Document();
		MongoCursor<Document> elementos = db.documentosEnColeccion(coleccion);
		while(elementos.hasNext()) {
			documento = elementos.next();
			if(documento.get("idEmpleado").toString().equalsIgnoreCase(idEmpleado))
				incidencias.add(documento);
		}
		
		return incidencias;
		
	}
	
	public List<Document> consultarIncidenciasGestor(){
		List<Document> incidencias = new ArrayList<Document>();
		Document documento = new Document();
		MongoCursor<Document> elementos = db.documentosEnColeccion(coleccion);
		while(elementos.hasNext()) {
			documento = elementos.next();
			if(!documento.get("estado").toString().equalsIgnoreCase("Resuelta"))
				incidencias.add(documento);
		}
		return incidencias;		
	}
	
}
