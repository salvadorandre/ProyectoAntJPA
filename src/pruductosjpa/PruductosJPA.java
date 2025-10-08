
package pruductosjpa;

import Interfaces.ProductoInterfaz;

public class PruductosJPA {

    public static void main(String[] args) {
        
        ProductoInterfaz interfaz = new ProductoInterfaz(); 
        interfaz.setTitle("Productos");
        interfaz.setLocationRelativeTo(null);
        interfaz.setVisible(true);
    }
    
}
