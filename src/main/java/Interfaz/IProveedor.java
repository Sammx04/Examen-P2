package Interfaz;

import java.util.List;

import model.Proveedor;;

public interface IProveedor {
	void RegistrarProveedor (Proveedor proveedor);
	void ActalizarProveedor(Proveedor proveedor);
	void EliminarProveedor(Proveedor proveedor);
	List<Proveedor> Listado();
	Proveedor BuscarProveedor(Proveedor proveedor);

}
