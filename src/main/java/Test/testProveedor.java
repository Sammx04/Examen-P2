package Test;

import java.util.Date;
import java.util.List;

import DaoImp.ProveedorImp;
import model.Proveedor;

public class testProveedor {

	public static void main(String[] args) {
		Proveedor tblpro=new Proveedor();
		ProveedorImp proimp=new ProveedorImp();
		Date fecha=new Date();
		Date fechasql=new Date(fecha.getTime());
		
		/*
		tblpro.setNombre("FarmaPeru");
		tblpro.setRuc("987");
		tblpro.setRsocial("nada");
		tblpro.setEmail("fernando@gmail.com");
		tblpro.setFechaing(fechasql);
		proimp.RegistrarProveedor(tblpro);
		System.out.println("datos registrados");
		
		/*
		tblpro.setNombre("Luis");
		tblpro.setRuc("123");
		tblpro.setRsocial("hola");
		tblpro.setEmail("Luis@gmail.com");
		tblpro.setFechaing(fechasql);
		proimp.RegistrarProveedor(tblpro);
		System.out.println("datos registrados");
		*/
		
		
		//ACTUALIZAR
		tblpro.setIdproveedor(3);
		tblpro.setNombre("farmachile");
		tblpro.setRuc("431");
		tblpro.setRsocial("xd");
		tblpro.setEmail("nataly@gmail.com");
		tblpro.setFechaing(fechasql);
		proimp.ActalizarProveedor(tblpro);
		System.out.println("datos actualizados");
		
		
		/*
		//Eliminar
		tblpro.setIdproveedor(2);
		proimp.EliminarProveedor(tblpro);
		System.out.println("datos eliminado");
		*/
		
		/*
		//Listar
		List<Proveedor> listadoproveedor=proimp.Listado();
		//aplicamos el bucle for
		for(Proveedor lis:listadoproveedor){
			//imprimimos en la pantalla los datos de la BD
			System.out.println(" codigo "+lis.getIdproveedor()+
					           " nombre "+lis.getNombre()+
					           " apellido "+lis.getRuc()+
					           " email "+lis.getRsocial()+
					           " telefono "+lis.getEmail()					           
					           );
					           
		}
		*/
		/*
		//buscar
		tblpro.setIdproveedor(1);
		Proveedor buscarpro=proimp.BuscarProveedor(tblpro);
		System.out.println(" codigo "+buscarpro.getIdproveedor()+
					           " nombre "+buscarpro.getNombre()+
					           " apellido "+buscarpro.getRuc()+
					           " email "+buscarpro.getRsocial()+
					           " telefono "+buscarpro.getEmail()
					           );
*/
	}

}
