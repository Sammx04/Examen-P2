package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaz.IUsuario;
import model.Usuario;

public class UsuarioImp implements IUsuario{

	public void RegistrarUsuario(Usuario usuario) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_HUAMANNUEVO");
		//para administrar las trasacciones
		EntityManager em=emf.createEntityManager();
		//inciamos las transacciones
		em.getTransaction().begin();
		//invocamos el metodo persistence, que nos permite inserardatos  la base de datos
		em.persist(usuario);
		//confirmamos la transaccion
		em.getTransaction().commit();
		//cerramos la transaccion
		em.close();
		
	}

	public void ActalizarUsuario(Usuario usuario) {
		// nos conectamos con la Uidad de Persistencia
		//para registrar los datos
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_HUAMANNUEVO");
		EntityManager em=emf.createEntityManager();
		try{
		em.getTransaction().begin();
		//invocamos el metodo actualizar
		em.merge(usuario);
		em.getTransaction().commit();
		}catch(RuntimeException ex){
			ex.getMessage();
		}finally {
			em.close();	
		}
		
	}

	public void EliminarUsuario(Usuario usuario) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_HUAMANNUEVO");
		EntityManager em=emf.createEntityManager();
		
		try{
		em.getTransaction().begin();
	    //recuperamos el codio eliminar
		Usuario elimusu=em.find(Usuario.class, usuario.getIdusuario());
		//aplicamos una condicion
		if(elimusu!=null){
			//invocamos el metodo eliminar
			em.remove(elimusu);
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

	public List<Usuario> Listado() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_HUAMANNUEVO");
		EntityManager em=emf.createEntityManager();
		List<Usuario> list=null;
		try{
		em.getTransaction().begin();
		//aplicamos consultas JPQL
		list=em.createQuery("select u from Usuario u", Usuario.class).getResultList();
		em.getTransaction().commit();
		}catch(RuntimeException ex){
			
			ex.getMessage();
		}finally {
			em.close();	}
		
		return list;
	}

	public Usuario BuscarUsuario(Usuario usuario) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_HUAMANNUEVO");
		EntityManager em=emf.createEntityManager();
		Usuario buscarusu=null;
		try{
		em.getTransaction().begin();
		buscarusu=em.find(Usuario.class, usuario.getIdusuario());
		em.getTransaction().commit();
		}catch(RuntimeException ex){
			ex.getMessage();
		}finally {
			em.close();	
			}
		return buscarusu;
	}

}
