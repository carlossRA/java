package modelo.mongodb;

import java.util.Random;

public class Fichaje {

	private String idFichaje, idEmpleado, fechaFichaje, horaFichaje, horaCierre;
	DAOFichaje dao = new DAOFichaje();
	Random aleatorio = new Random(System.currentTimeMillis());
	String [] abecedario = {"A", "B", "C", "D", "E", "F", "G", "H","I", "J", "K", "L", "M",
			"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
	
	public Fichaje(String idEmpleado, String fechaFichaje, String horaFichaje) {
		this.idFichaje = abecedario[(int) Math.round(Math.random() * 26 )] + Integer.toString(aleatorio.nextInt(1000))
		+ abecedario[(int) Math.round(Math.random() * 26 )] + Integer.toString(aleatorio.nextInt(1000));
		this.idEmpleado = idEmpleado;
		this.fechaFichaje = fechaFichaje;
		this.horaFichaje = horaFichaje;
		dao.abrirFichaje(this);		
	}
	
	public void cerrarFichaje(String horaCierre) {
		this.horaCierre = horaCierre;
		dao.cerrarFichaje(this);
	}

	public String getIdFichaje() {
		return idFichaje;
	}

	public void setIdFichaje(String idFichaje) {
		this.idFichaje = idFichaje;
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


	
}
