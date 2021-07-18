package pe.edu.upeu.modelo;
import lombok.Data;

@Data
public class VentaDetalleTO {
    //IdVEntaDetalle	IdVenta	IdProducto	precioUnit	porceUtil	cantidad	netoTotal
    public String idVentaDetalle,idVenta, idProducto;
    public double precioUnit, porcentUtil, cantiad, precioTotal;
    public double getPrecioTotal() {
        return 0;
    }
    public void setIdProducto(String read) {
    }
    public void setIdVenta(String idVenta2) {
    }
    public void setIdVentaDetalle(String generarId) {
    }
    public String getIdProducto() {
        return null;
    }
    public void setPorcentUtil(double porcentUt) {
    }
    public void setPrecioUnit(double d) {
    }
    public void setCantiad(double read) {
    }
    public int getCantiad() {
        return 0;
    }
    public int getPrecioUnit() {
        return 0;
    }
    public void setPrecioTotal(int i) {
    }

}
