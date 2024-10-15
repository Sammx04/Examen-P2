package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaz.IProveedor;
import model.Proveedor;
import model.Usuario;

public class ProveedorImp implements IProveedor{

	public void RegistrarProveedor(Proveedor proveedor) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_HUAMANNUEVO");
		//para administrar las trasacciones
		EntityManager em=emf.createEntityManager();
		//inciamos las transacciones
		em.getTransaction().begin();
		//invocamos el metodo persistence, que nos permite inserardatos  la base de datos
		em.persist(proveedor);
		//confirmamos la transaccion
		em.getTransaction().commit();
		//cerramos la transaccion
		em.close();
		
	}

	public void ActalizarProveedor(Proveedor proveedor) {
		// nos conectamos con la Uidad de Persistencia
				//para registrar los datos
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_HUAMANNUEVO");
				EntityManager em=emf.createEntityManager();
				try{
				em.getTransaction().begin();
				//invocamos el metodo actualizar
				em.merge(proveedor);
				em.getTransaction().commit();
				}catch(RuntimeException ex){
					ex.getMessage();
				}finally {
					em.close();	
				}
		
	}

	public void EliminarProveedor(Proveedor proveedor) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_HUAMANNUEVO");
		EntityManager em=emf.createEntityManager();
		
		try{
		em.getTransaction().begin();
	    //recuperamos el codio eliminar
		Proveedor elimpro=em.find(Proveedor.class, proveedor.getIdproveedor());
		//aplicamos una condicion
		if(elimpro!=null){
			//invocamos el metodo eliminar
			em.remove(elimpro);
			em.getTransaction().commit();
		}//fin de la condicion
		}catch (RuntimeException ex){
			//aplicamos una condicion
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
			ex.getMessage();
		}finally {
			em.close();	
		}
		
	}

	public List<Proveedor> Listado() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_HUAMANNUEVO");
		EntityManager em=emf.createEntityManager();
		List<Proveedor> list=null;
		try{
		em.getTransaction().begin();
		//aplicamos consultas JPQL
		list=em.createQuery("select p from Proveedor p", Proveedor.class).getResultList();
		em.getTransaction().commit();
		}catch(RuntimeException ex){
			
			ex.getMessage();
		}finally {
			em.close();	}
		
		return list;
	}

	public Proveedor BuscarProveedor(Proveedor proveedor) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_HUAMANNUEVO");
		EntityManager em=emf.createEntityManager();
		Proveedor buscarpro=null;
		try{
		em.getTransaction().begin();
		buscarpro=em.find(Proveedor.class, proveedor.getIdproveedor());
		em.getTransaction().commit();
		}catch(RuntimeException ex){
			ex.getMessage();
		}finally {
			em.close();	
			}
		return buscarpro;
	}

}
