
package Modelos;

import Controladores.ProductoControlador;
import java.util.List;
import javax.swing.JOptionPane;

public class Controladora {
    
    ProductoControlador control = new ProductoControlador(); 
    
    public void guardarProducto(String producto, String codigo, int unidades, String proveedor) { 
        Producto productoGuardar = new Producto(); 
        productoGuardar.setNombre(producto);
        productoGuardar.setCodigo(codigo);
        productoGuardar.setUnidades(unidades);
        productoGuardar.setProveedor(proveedor);
        
        control.create(productoGuardar);
        
        JOptionPane.showMessageDialog(null, "El producto fue guardado con exito");
    }
    
    
    public List<Producto> traerTodosProductos() { 
        List<Producto> productos = null; 
        productos = control.allProductos(); 
        return productos; 
    }

    public void eliminarProducto(int idProducto) {
        control.destroy(idProducto);
        JOptionPane.showMessageDialog(null, "Producto eliminado correctamente");
    }

    public Producto findProducto(int idProducto) {
        return control.findById(idProducto); 
    }

    public void actualizarProducto(Producto producto, String nombreProduct, String codigoProduct, int unidadProducto, String proveedorProduct) {
        producto.setNombre(nombreProduct);
        producto.setCodigo(codigoProduct);
        producto.setUnidades(unidadProducto);
        producto.setProveedor(proveedorProduct);
        
        control.update(producto);
        
        JOptionPane.showMessageDialog(null, "Producto actualizado correctamente");
    }
}
