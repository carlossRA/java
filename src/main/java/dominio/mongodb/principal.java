package dominio.mongodb;

public class principal {
public static void main(String[]args) {
	DAOempleado emp =new DAOempleado();
	emp.db.existeContrasena("hola");
	System.out.println("acabó");
	
}
}
