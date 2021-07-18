package pe.edu.upeu.modelo;
import lombok.Data;

@Data
public class ProductoTO {
  //idProducto	nombre	preUnitario	porceUtil	unidadMed	idCateg	stock
  public  String idProducto, nombre, unidadMed, idCateg;
  public  double preUnitario, porcentUtil, stock;
public void setIdCateg(String read) {
}
public void setIdProducto(String generarId) {
}
public void setNombre(String read) {
}
public void setUnidadMed(String read) {
}
public void setPreUnitario(double read) {
}
public void setPorcentUtil(double read) {
}
public void setStock(double read) {
}
  
}
