package pe.edu.upeu.app;



import pe.edu.upeu.dao.CategoriaDAO;
import pe.edu.upeu.gui.MainGUI;

public class App {

    public static void main(String[] args) {
        System.out.println("Hola");
        CategoriaDAO daoCat=new CategoriaDAO();
        daoCat.registrarCategoria();
        daoCat.reporteCategoria();
    
    }
    
}