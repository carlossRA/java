package modelo.mongodb;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

public class Incidencia {
	
	private String idEmpleado, tipo, mensaje, fechaInicio, fechaFin, comentario;
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
		
	}
	
	/*Método para consultar las incidencias que hace el propio empleado
	 * Es necesario pasarle el idEmpleado del empleado que haya iniciado sesión para que pueda filtrarlo en la BD
	 * Devuelve una lista que contiene todas sus incidencias con cualquier campo que sea necesario mostrar en la tabla
	 * Se usa en la interfaz de consultas de incidencia del empleado*/
	public List<Incidencia> consultarIncidenciasPropias(String idEmpleado) {
		List<Document> listaDocIncidencias = new ArrayList<Document>();
		List<Incidencia> listaIncidenciasPropias = new ArrayList<Incidencia>();
		listaDocIncidencias = dao.consultarIncidenciasPropias(idEmpleado);
		listaIncidenciasPropias = listaIncidencias(listaDocIncidencias);
		
		return listaIncidenciasPropias;
	}
	
	/*Método para que el gestor consulte las incidencias de los demás empleados
	 * No es necesario pasarle parámetros, ya que devuelve todas las incidencias que haya en la colección a excepción
	 * de las que estén resultas (se controla en el DAOIncidencia)
	 * Devuelve una lista que contiene todas sus incidencias con cualquier campo que sea necesario mostrar en la tabla
	 * Se usa en la interfaz de consultas de incidencia del gestor*/
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

}
