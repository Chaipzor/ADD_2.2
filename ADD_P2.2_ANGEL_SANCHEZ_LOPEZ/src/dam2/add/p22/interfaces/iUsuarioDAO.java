package dam2.add.p22.interfaces;

import java.util.ArrayList;

import dam2.add.p22.model.Usuario;

public interface iUsuarioDAO {

	public ArrayList<Usuario> obtenerTodos(String query);
	
	public ArrayList<Usuario> obtenerTodosSinAdmin(String query);
	
	public int crearUsuario(Usuario user);
	
	public void modificarUsuario(int id, Usuario u);
	
	public void eliminar(int id);
	
	public Usuario obtener(int id);
}
