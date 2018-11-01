package modelo.mongodb;

public class Fichaje {

	private String idEmpleado, fechaFichaje, horaFichaje, horaCierre, estado;
	DAOFichaje dao = new DAOFichaje();
	
	public Fichaje(String idEmpleado, String fechaFichaje, String horaFichaje) {
		this.idEmpleado = idEmpleado;
		this.fechaFichaje = fechaFichaje;
		this.horaFichaje = horaFichaje;
		this.estado = "Abierto";
		dao.abrirFichaje(this);		
	}
	
	public void cerrarFichaje(String horaCierre, Empleado empleado) {
		this.horaCierre = horaCierre;
		dao.cerrarFichaje(empleado, this);
	}
	
	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
	public String getFechaFichaje() {
		return fechaFichaje;
	}
	public void setFechaFichaje(String fechaFichaje) {
		this.fechaFichaje = fechaFichaje;
	}
	public String getHoraFichaje() {
		return horaFichaje;
	}
	public void setHoraFichaje(String horaFichaje) {
		this.horaFichaje = horaFichaje;
	}
	public String getHoraCierre() {
		return horaCierre;
	}
	public void setHoraCierre(String horaCierre) {
		this.horaCierre = horaCierre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}


	
}
