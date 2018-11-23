package modelo.mongodb;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.types.ObjectId;

public class Incidencia {

	private String idEmpleado, emailEmpleado, tipo, mensaje, fechaInicio, fechaFin, comentario;
	private ObjectId _id;
	private DAOIncidencia dao = new DAOIncidencia();

	public Incidencia() {

	}

	public Incidencia(String idEmpleado, String tipo, String mensaje, String fechaInicio, String fechaFin, String comentario) {
		this.idEmpleado = idEmpleado;
		this.tipo = tipo;
		this.mensaje = mensaje;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.comentario = comentario;
		dao.registrarIncidencia(this);

	}

	public Incidencia(ObjectId _id, String idEmpleado, String tipo, String mensaje, String fechaInicio, String fechaFin, String comentario) {
		Empleado empleado = new Empleado();
		this._id = _id;
		this.idEmpleado = idEmpleado;
		this.emailEmpleado = empleado.emailEmpleado(idEmpleado);
		this.tipo = tipo;
		this.mensaje = mensaje;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.comentario = comentario;

	}

	/////////////ANA///////////////////////
	public boolean IncidenciaCorrecta(String idEmpleado, String tipo, String mensaje) {		
		return dao.comprobarIncidencia(idEmpleado, tipo, mensaje);
	}

	public List<Document> IncidenciasEmpleado(String idEmpleado){
		return dao.IncidenciasEmpleado(idEmpleado);
	}
	/////////////////////////////////////////


	public List<Incidencia> consultarIncidenciasPropias(String idEmpleado) {
		List<Document> listaDocIncidencias = new ArrayList<Document>();
		List<Incidencia> listaIncidenciasPropias = new ArrayList<Incidencia>();
		listaDocIncidencias = dao.consultarIncidenciasPropias(idEmpleado);
		listaIncidenciasPropias = listaIncidencias(listaDocIncidencias);

		return listaIncidenciasPropias;
	}
	
	public List<Incidencia> consultarIncidenciasGestor() {
		List<Document> listaDocIncidencias = new ArrayList<Document>();
		List<Incidencia> listaIncidenciasPropias = new ArrayList<Incidencia>();
		listaDocIncidencias = dao.consultarIncidenciasGestor();
		listaIncidenciasPropias = listaIncidencias(listaDocIncidencias);

		return listaIncidenciasPropias;
	}

	public List<Incidencia> listaIncidencias(List<Document> listaDocIncidencias){
		List<Incidencia> listaIncidenciasPropias = new ArrayList<Incidencia>();
		Document documentoIncidencia = new Document();
		for(int i = 0; i < listaDocIncidencias.size(); i++) {
			documentoIncidencia = listaDocIncidencias.get(i);
			Incidencia incidenciaPropia = new Incidencia(
					documentoIncidencia.getObjectId(_id),
					documentoIncidencia.get("idEmpleado").toString(),
					documentoIncidencia.get("tipo").toString(),
					documentoIncidencia.get("mensaje").toString(),
					documentoIncidencia.get("fechaInicio").toString(),
					documentoIncidencia.get("fechaFin").toString(),
					documentoIncidencia.get("comentario").toString()
					);
			listaIncidenciasPropias.add(incidenciaPropia);
		}
		return listaIncidenciasPropias;
	}

	public void cambiarMensaje(String idEmpleado, String comentario, String nuevoMensaje) {
		dao.cambiarMensaje(idEmpleado, comentario, nuevoMensaje);
	}

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getEmailEmpleado() {
		return emailEmpleado;
	}

	public void setEmailEmpleado(String emailEmpleado) {
		this.emailEmpleado = emailEmpleado;
	}

}
