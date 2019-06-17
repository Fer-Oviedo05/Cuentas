package Banco.Cuentas;

/**
 * Clase que permite modelar a los empleados
 */

public class Ejecutivo {
 public int no_empleado;
 public String tipo, nombre, RFC, dir, tel, pass;
 public double sueldo;
 
 /**
   * Constructor que recibe par�metros
   * @param nombre El nombre del ejecutivo 
   * @param tipo Tipo de ejecutivo 
   * @param rfc RFC del ejecutivo
   * @param dir La direcci�n del Ejecutivo
   * @param tel El tel�fono del ejecutivo
   * @param no_e N�mero de ejecutivo
   * @param pass La contrase�a del ejecutivo
   * @param sueldo El sueldo del ejecutivo
   */
 
	 public Ejecutivo(
		   int no_e,
		   String tipo,
		   String nombre,
		   String rfc,
		   String dir,
		   String tel,
		   double sueldo,
		   String pass
		 ) {
		  this.no_empleado = no_e;
		  this.tipo = tipo;
		  this.nombre = nombre;
		  this.RFC = rfc;
		  this.dir = dir;
		  this.tel = tel;
		  this.sueldo = sueldo;
		  this.pass = pass;
	 }
 
  /**
   * M�todo para establecer el tipo de cuenta que maneja el ejecutivo
   * @param tipo El tipo de cuenta que maneja el ejecutivo
   */
  public void setTipo(String tipo){
   this.tipo = tipo;
  }
  
  /**
   * M�todo para obtener el tipo de cuenta que maneja el ejecutivo
   * @return String El tipo de cuenta que maneja el ejecutivo
   */
  public String getTipo(){
    return tipo;
  }
  
  /**
   * M�todo para establecer RFC del ejecutivo
   * @param rfce RFC del ejecutivo
   */
  public void setRFCE(String rfce){
    RFC = rfce;
  }
  
  /**
   * M�todo para obtener RFC del ejecutivo
   * @return String RFC del ejecutivo
   */
  public String getRFC(){
    return RFC;
  }
  
    /**
   * M�todo para establecer el nombre del ejecutivo
   * @param nombre El nombre del ejecutivo
   */
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  
  /**
   * M�todo para obtener el nombre del ejecutivo
   * @return String El nombre del ejecutivo
   */
  public String getNombre(){
    return nombre;
  }
  
    /**
   * M�todo para establecer la direcci�n del ejecutivo
   * @param dir La direcci�n del ejecutivo
   */
  public void setDir(String dir){
    this.dir = dir;
  }
  
  /**
   * M�todo para obtener la direcci�n del ejecutivo
   * @return String La direcci�n del ejecutivo
   */
  public String getDir(){
    return dir;
  }
  
 /**
   * M�todo para establecer el sueldo del ejecutivo
   * @param sueldo El sueldo del ejecutivo
   */
  public void setSueldo(double sueldo){
    this.sueldo = sueldo;
  }
  
 /**
   * M�todo para obtener el sueldo del ejecutivo
   * @return double El sueldo del ejecutivo
   */
  public double getSueldo(){
    return sueldo;
  }
  
  /**
   * M�todo para establecer el tel�fono del ejecutivo 
   * @param tel Tel�fono del ejecutivo
   */
  public void setTel(String tel){
    this.tel = tel;
  }
  
  /**
   * M�todo para obtener el tel�fono del ejecutivo
   * @return String Tel�fono del ejecutivo
   */
  public String getTel(){
    return tel;
  }
  
 /**
   * M�todo para establecer la contrase�a del ejecutivo 
   * @param pass La contrase�a del ejecutivo
   */
  public void setPass(String pass){
    this.pass = pass;
  }
  
  /**
   * M�todo para obtener la contrase�a del ejecutivo
   * @return String La contrase�a del ejecutivo
   */
  public String getPass(){
    return pass;
  }
  
  /**
   * M�todo para establecer el n�mero del ejecutivo 
   * @param no_e El n�mero del ejecutivo
   */
  public void setNo_empleado(int no_e){
    no_empleado = no_e;
  }
  
  /**
   * M�todo para obtener el n�mero del ejecutivo
   * @return int El n�mero del ejecutivo
   */
  public int getNo_empleado(){
    return no_empleado;
  }
  
  public String toTableString(boolean cabecera) {
		String table = "";
		
		if(cabecera) {
			table += "\n | #empleado | nombre | tipo | rfc | direccion de casa | telefono | sueldo | \n\n";
		}
		
		table += " | " 
				+ this.getNo_empleado() + " | " 
				+ this.getNombre() +  " | " 
				+ this.getTipo() + " | " 
				+ this.getRFC() + " | " 
				+ this.getDir() + " | " 
				+ this.getTel() + " | " 
				+ this.getSueldo() + " | " 
				+ "\n"
		;
		
		return table;
  }
 
}