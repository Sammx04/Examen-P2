package Interfaz;

import java.util.List;

import model.Usuario;

public interface IUsuario {
	void RegistrarUsuario (Usuario usuario);
	void ActalizarUsuario(Usuario usuario);
	void EliminarUsuario(Usuario usuario);
	List<Usuario> Listado();
	Usuario BuscarUsuario(Usuario usuario);

}
