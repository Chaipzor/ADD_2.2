package dam2.add.p22.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios") 
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	private static int idGlobal = 3;
	
	@Column
	private String nombre;
	@Column
	private String apellidos;
	@Column
	private String email;
	@Column
	private int telefono;
	@Column
	private String pass;
	@Column
	private boolean rol_admin;
	@Column
	private String idioma;
	@Column
	private String provincia;

	public Usuario(String nombre, String apellidos, String email, int telefono, String pass, boolean rol_admin, String idioma, String provincia) {
		super();
		this.id = idGlobal;
		idGlobal++;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.telefono = telefono;
		this.pass = pass;
		this.rol_admin = rol_admin;
		this.idioma = idioma;
		this.provincia = provincia;
	}

	public Usuario() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public boolean isRol_admin() {
		return rol_admin;
	}

	public void setRol_admin(boolean rol_admin) {
		this.rol_admin = rol_admin;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public static void setIdGlobal(int idGlobal) {
		Usuario.idGlobal = idGlobal+1;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
}
