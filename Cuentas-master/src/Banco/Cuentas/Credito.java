package Banco.Cuentas;

/*
 * Clase que permite modelar una Cuenta de Cr�dito a partir de una Cuenta
*/

public class Credito extends Cuenta{
	
  public String no_tarjeta, fecha_pago, fecha_vencimiento;
  public double importe_credito, MCU;
  
  /**
   * Constructor que recibe par�metros
   * @param ej El nombre del ejecutivo
   * @param nc El nombre del cliente
   * @param t El tel�fono del cliente
   * @param c El correo del cliente 
   * @param e El estado del que el cliente proviene
   * @param no_c El n�mero de cliente 
   * @param fa Fecha de apertura
   * @param fp Fecha de pago
   * @param no_s El n�mero de sucursal
   * @param no_t El n�mero de tarjeta
   * @param fv Fecha de vencimiento
   * @param ic Importe de cr�dito
   * @param mcu Monto de cr�dito utilizado
   */
  
  public Credito(
                 String ej,
                 String nc,
                 int no_c,
                 String fa, 
                 int no_s,
                 String e,
                 String c,
                 String t, 
                 String no_t,
                 String fp,
                 String fv,
                 double ic,
                 double mcu
                ){
    super(ej, nc, no_c, fa, no_s, e, c, t);
    this.no_tarjeta = no_t;
    this.fecha_pago = fp;
    this.fecha_vencimiento = fv;
    this.importe_credito = ic;
    this.MCU = mcu;
  }
  
  /**
   * M�todo para establecer el n�mero de tarjeta
   * @param no_t El n�mero de tarjeta
   */
  public void setNo_tarjeta(String no_t){ no_tarjeta = no_t; }
  
  /**
   * M�todo para obtener el n�mero de tarjeta
   * @return String El n�mero de tarjeta
   */
  public String getNo_tarjeta(){ return no_tarjeta; }
  
  /**
   * M�todo para establecer la fecha de pago
   * @param fp La Fecha pago
   */
  public void setFecha_pago(String fp){ fecha_pago = fp; }
  
  /**
   * M�todo para obtener la fecha de pago
   * @return String La Fecha pago
   */
  public String getFecha_pago(){ return fecha_pago; }
  
  /**
   * M�todo para establecer la fecha de vencimiento
   * @param fv La Fecha vencimiento
   */
  public void setFecha_vencimiento(String fv){ fecha_vencimiento = fv; }
  
  /**
   * M�todo para obtener la fecha de vencimiento
   * @return String La Fecha vencimiento
   */
  public String getFecha_vencimiento(){ return fecha_vencimiento; }
  
  /**
   * M�todo para establecer el importe de cr�dito
   * @param ic El importe de cr�dito
   */
  public void setImporte_credito(double ic){ importe_credito = ic; }
  
  /**
   * M�todo para obtener el importe de cr�dito
   * @return double El importe de cr�dito
   */
  public double getImporte_credito(){ return importe_credito; }
  
  /**
   * M�todo para establecer el monto de cr�dito utilizado
   * @param mcu El monto de cr�dito utilizado
   */
  public void setMCU(double mcu){ MCU = mcu; }
  
  /**
   * M�todo para obtener el monto de cr�dito utilizado
   * @return double El monto de cr�dito utilizado
   */
  public double getMCU(){ return MCU; }
  
  public String toTableString(boolean cabecera) {
		String table = "";
		
		if(cabecera) {
			table += "\n | #cliente | apertura | pago | vencimiento | nombre | #tarjeta | estado | email | telefono | sucursal | importe credito | monto de credito utilizado | \n\n";
		}
		
		table += " | " 
				+ super.getNo_cliente() + " | " 
				+ super.getFecha_apertura() +  " | " 
				+ this.getFecha_pago() + " | " 
				+ this.getFecha_vencimiento()  + " | "  
				+ super.getNombre_cliente() + " | " 
				+ this.getNo_tarjeta() + " | " 
				+ super.getEstado() + " | " 
				+ super.getCorreo() + " | " 
				+ super.getTelefono() + " | " 
				+ super.getNo_sucursal() + " | " 
				+ this.getImporte_credito() + " | "
				+ this.getMCU() + " | "
				+ "\n"
		;
		
		return table;
  }
  
  public String toStringOptions() {
	String options = "\n" 
					+ "# Numero de cliente: "
					+ this.getNo_cliente() + "\n"
					+ "# Apertura: "
					+ this.getFecha_apertura() + "\n"
					+ "# Pago: "
					+ this.getFecha_pago() + "\n"
					+ "# Vencimiento: "
					+ this.getFecha_vencimiento() + "\n"
					+ "# Nombre: "
					+ super.getNombre_cliente() + "\n"
					+ "# Numero de tarjeta: "
					+ this.getNo_tarjeta() + "\n"
					+ "# Estado: "
					+ super.getEstado() + "\n"
					+ "# Correo: "
					+ super.getCorreo() + "\n"
					+ "# Telefono: "
					+ super.getTelefono() + "\n"
					+ "# Sucursal: "
					+ super.getNo_sucursal() + "\n"
					+ "# Importe de credito: "
					+ this.getImporte_credito() + "\n"
					+ "# Monto de credito utilizado: "
					+ this.getMCU() + "\n"
					+ "\n"
	;
	return options;
  }
  
}
