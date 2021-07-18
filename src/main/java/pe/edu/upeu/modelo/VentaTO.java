package pe.edu.upeu.modelo;

import lombok.Data;

/**
 * VentaTO
 */
@Data
public class VentaTO {
//idVenta	DniCliente	FechaVenta	NetoTotal	igv	precioTotal

public String idVenta, idDni, fechaVenta;
public double netoTotal, igv, precioTotal;
    
}