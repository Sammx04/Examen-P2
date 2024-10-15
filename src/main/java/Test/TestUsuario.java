package Test;

import java.util.List;

import DaoImp.UsuarioImp;
import model.Usuario;

public class TestUsuario {

	public static void main(String[] args) {
		Usuario tblusu=new Usuario();
		UsuarioImp usuimp=new UsuarioImp();
		
		/*
		tblusu.setNombre("David");
		tblusu.setPassword("123");
		usuimp.RegistrarUsuario(tblusu);
		System.out.println("Datos Registrados");
		
		tblusu.setNombre("Nataly");
		tblusu.setPassword("123");
		usuimp.RegistrarUsuario(tblusu);
		System.out.println("Datos Registrados");
		*/
		
		/*
		//Actualizar
		tblusu.setIdusuario(2);
		tblusu.setNombre("Brenda");
		tblusu.setPassword("1234");
		usuimp.ActalizarUsuario(tblusu);
		System.out.println("Datos Actualizados");
        */
		
		/*
		//Eliminar
		tblusu.setIdusuario(2);
		usuimp.EliminarUsuario(tblusu);
		System.out.println("Dato Eliminado");
		*/
		
		/*
		//Listar
		List<Usuario> listadousuario=usuimp.Listado();
		//aplicamos el bucle for
		for(Usuario lis:listadousuario){
			//imprimimos en la pantalla los datos de la BD
			System.out.println(" codigo "+lis.getIdusuario()+
					           " nombre "+lis.getNombre()+
					           " contraseña "+lis.getPassword());				            
		}
		*/
		
		//Buscar
		tblusu.setIdusuario(1);
		Usuario buscarusu=usuimp.BuscarUsuario(tblusu);
		System.out.println(" codigo "+buscarusu.getIdusuario()+
		                   " nombre "+buscarusu.getNombre()+
		                   " contraseña "+buscarusu.getPassword());
		                   		
	}

}
