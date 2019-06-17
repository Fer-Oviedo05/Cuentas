package Banco.Cuentas;

//import java.text.ParseException;

/**
* Clase para definir una cuenta
* @author Mar�a Fernanda Morales Oviedo
* @version Junio 2019
*/

public class Cuenta {
	
	  public String ejecutivo, nombre_cliente, estado, correo, telefono;
	  public String fecha_apertura;
	  public int no_sucursal,no_cliente;
	  
	  /**
	 * Constructor que recibe par�metros
	 * @param ejecutivo Nombre del ejecutivo
	 * @param nc El nombre del cliente
	 * @param t El tel�fono del cliente
	 * @param c El correo del cliente
	 * @param e El estado del tr�mite
	 * @param no_c El n�mero de cliente 
	 * @param fa Fecha de apertura
	 * @param no_s N�mero de surcursal
	 */
	  
	  public Cuenta(
			  String ejecutivo,
	          String nc,
	          int no_c,
	          String fa,
	          int no_s,
	          String e,
	          String c,
	          String t 
	  ){
		  this.ejecutivo = ejecutivo;
	      this.nombre_cliente = nc;
	      this.no_cliente = no_c;
	      this.fecha_apertura = fa;
	      this.no_sucursal = no_s;
	      this.estado = e;
	      this.correo = c;
	      this.telefono = t;
	  }
	  
	  /**
	 * M�todo para establecer el nombre del cliente
	 * @param nc El nombre del cliente
	 */
	public void setNombre_cliente(String nc){ nombre_cliente = nc; }
	
	/**
	 * M�todo para obtener el nombre del cliente
	 * @return String El nombre del cliente
	 */
	public String getNombre_cliente(){ return nombre_cliente; }
	  
	/**
	 * M�todo para establecer el n�mero de cliente
	 * @param no_c El nombre del cliente
	 */
	public void setNo_cliente(int no_c){ no_cliente = no_c; }
	
	/**
	 * M�todo para obtener el n�mero del cliente
	 * @return int El nombre del cliente
	 */
	public int getNo_cliente(){ return no_cliente; }
	
	/**
	 * M�todo para establecer el correo del cliente
	 * @param c El correo del cliente
	 */
	public void setCorreo(String c){ correo = c; }
	
	/**
	 * M�todo para obtener el correo del cliente
	 * @return String El correo del cliente
	 */
	public String getCorreo(){ return correo; }
	
	/**
	 * M�todo para establecer el estado del tr�mite
	 * @param e El estado del cliente
	 */
	public void setEstado(String e){ estado = e; }
	
	/**
	 * M�todo para obtener el estado del tr�mite
	 * @return String El estado del cliente
	 */
	public String getEstado(){ return estado; }
	
	/**
	 * M�todo para establecer la fecha de apertura de la cuenta
	 * @param a Fecha de apertura
	 * @param fa La fecha de apertura de la cuenta
	 */
	public void setFecha_apertura(String fa){ fecha_apertura = fa; }
	
	/**
	 * M�todo para obtener la fecha de apertura de la cuenta
	 * @return String La fecha de apertura de la cuenta
	 */
	public String getFecha_apertura(){ return fecha_apertura; }
	
	/**
	 * M�todo para establecer el n�mero de la surusal 
	 * @param no_s N�mero de la sucursal
	 */
	public void setNo_sucursal(int no_s){ no_sucursal = no_s; }
	
	/**
	 * M�todo para obtener el n�mero de la surusal
	 * @return int N�mero de la sucursal
	 */
	public int getNo_sucursal(){ return no_sucursal; }
	
	/**
	 * M�todo para establecer el tel�fono del cliente 
	 * @param t Tel�fono del cliente
	 */
	public void setTelefono(String t){ telefono = t; }
	
	/**
	 * M�todo para obtener el tel�fono del cliente
	 * @return int Tel�fono del cliente
	 */
	public String getTelefono(){ return telefono; }  
}