
package Controladores;
import Modelos.Producto;
import jakarta.persistence.*;
import java.util.List;
public class ProductoControlador {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProductoPU");
    
    public void create(Producto producto) { 
        EntityManager em = emf.createEntityManager(); 
        em.getTransaction().begin();
        em.persist(producto);
        em.getTransaction().commit(); 
        em.close();
    }
    
    public void update(Producto producto) { 
        EntityManager em = emf.createEntityManager(); 
        
        em.getTransaction().begin();
        em.merge(producto); 
        em.getTransaction().commit();
        em.close();
    }
    
    
    public void destroy(int id) { 
        EntityManager em = emf.createEntityManager(); 
        Producto pro = em.find(Producto.class, id); 
        
        em.getTransaction().begin();
        em.remove(pro);
        em.getTransaction().commit();
        em.close();
    }
    
    public Producto findById(int id) { 
        Producto produc = null; 
        EntityManager em = emf.createEntityManager(); 
        produc = em.find(Producto.class, id); 
        em.close();  
        return produc; 
    }
    
    public List<Producto> allProductos() { 
        EntityManager em = emf.createEntityManager(); 
        TypedQuery<Producto> query = em.createQuery("SELECT e FROM Producto e", Producto.class); 
        List<Producto> productos = query.getResultList(); 
        em.close();
        return productos; 
    }
    
    
}
