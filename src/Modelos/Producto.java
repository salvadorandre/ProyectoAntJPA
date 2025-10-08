
package Modelos;

import jakarta.persistence.*; 

@Entity
public class Producto {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id; 
    @Basic
    private String nombre; 
    private String codigo; 
    private int unidades; 
    private String proveedor; 
    
    public Producto() {}
    
    public Producto(int id, String nombre, String codigo, int unidades, String proveedor) { 
        this.id = id; 
        this.nombre = nombre; 
        this.codigo = codigo; 
        this.unidades = unidades; 
        this.proveedor = proveedor; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    
    
    
    
}
