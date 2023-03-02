package dam2.add.p22.dao;


import java.util.ArrayList;

import dam2.add.p22.interfaces.iUsuarioDAO;
import dam2.add.p22.model.Usuario;
import dam2.add.p22.servicios.UsuarioService;

public class UsuarioDAOMemoria implements iUsuarioDAO{
		
	private static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>() {
		{
			add(new Usuario("Angel", "Sanchez Lopez", "chaip@gmail.com", 666555444, "GCUIhlNaWp7wmXsFAMVIpabN8S6VeKYRK5xNnDDsHTlcwg3Pa477A75rEX4gkBrE", true, "es", "Madrid"));
			add(new Usuario("Michael", "Jackson", "MJ@gmail.com", 111111111, "GCUIhlNaWp7wmXsFAMVIpabN8S6VeKYRK5xNnDDsHTlcwg3Pa477A75rEX4gkBrE", false, "en", "Barcelona"));
			add(new Usuario("Paco", "Hernandez", "PH@gmail.com", 999999999, "GCUIhlNaWp7wmXsFAMVIpabN8S6VeKYRK5xNnDDsHTlcwg3Pa477A75rEX4gkBrE", false, "es", "Almeria"));
			add(new Usuario("A", "A", "A@gmail.com", 999999999, "GCUIhlNaWp7wmXsFAMVIpabN8S6VeKYRK5xNnDDsHTlcwg3Pa477A75rEX4gkBrE", false, "es", "Sevilla"));
			add(new Usuario("B", "B", "B@gmail.com", 999999999, "GCUIhlNaWp7wmXsFAMVIpabN8S6VeKYRK5xNnDDsHTlcwg3Pa477A75rEX4gkBrE", true, "es","Valencia"));
			add(new Usuario("C", "C", "C@gmail.com", 999999999, "GCUIhlNaWp7wmXsFAMVIpabN8S6VeKYRK5xNnDDsHTlcwg3Pa477A75rEX4gkBrE", false, "es","Valencia"));
		}
	};

	public ArrayList<Usuario> obtenerTodos(String query) {
		return listaUsuarios;
	}

	public ArrayList<Usuario> obtenerTodosSinAdmin(String query) {
		ArrayList<Usuario> listaSinAdmins = new ArrayList<Usuario>();
		for (Usuario usuario : listaUsuarios) {
			if (!usuario.isRol_admin()) {
				listaSinAdmins.add(usuario);
			}
		}

		return listaSinAdmins;
	}

	public int crearUsuario(Usuario usuario) {
		listaUsuarios.add(usuario);
		return 0;
	}

	public void modificarUsuario(int id, Usuario u) {
		int posicion= UsuarioService.obtenerPosicion(id);
		listaUsuarios.get(posicion).setNombre(u.getNombre());
		listaUsuarios.get(posicion).setApellidos(u.getApellidos());
		listaUsuarios.get(posicion).setEmail(u.getEmail());
		listaUsuarios.get(posicion).setTelefono(u.getTelefono());
		listaUsuarios.get(posicion).setIdioma(u.getIdioma());
	}

	public void eliminar(int id) {
		
		listaUsuarios.remove(UsuarioService.obtenerPosicion(id));
	}
	
	public Usuario obtener(int id){
		return listaUsuarios.get(UsuarioService.obtenerPosicion(id));
	}

}
