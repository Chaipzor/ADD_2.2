package dam2.add.p22.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dam2.add.p22.model.Usuario;
import dam2.add.p22.servicios.UsuarioService;
import dam2.add.p22.util.EncriptarJasypt;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/registro")
public class RegistroController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistroController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String texto = "";
		String referencia = "/jsp/registro.jsp";
		boolean repetir = false;

		// Obtenemos los datos de registro del formulario
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String email = request.getParameter("email");
		int telefono = Integer.parseInt(request.getParameter("telefono"));
		String pass = request.getParameter("pass");
		String pass2 = request.getParameter("pass2");
		String provincia = request.getParameter("provincia");
		String idioma = (String) request.getSession().getAttribute("idioma");

		// Se comprueba el email introducido
		int comprobacion = UsuarioService.comprobarEmail(email);
		// Si ya estaba registrado
		if (comprobacion != -1) {
			texto = "Email ya registrado.";
			referencia = "/jsp/registro.jsp";
		} // Si no existía
		else {
			// Se comprueba la doble contraseña
			boolean comprobacionDoblePass = UsuarioService.comprobacionDoblePass(pass, pass2);
			if (!comprobacionDoblePass) {
				texto = "Las contraseñas no coinciden.";
			} else {
				texto = "Usuario registrado.";
				pass = EncriptarJasypt.encriptar(pass);
				UsuarioService.crearUsuario(new Usuario(nombre, apellidos, email, telefono, pass, false, idioma, provincia));
			}
		}
		request.setAttribute("provincias", ProvinciasController.cargarProvincias());
		request.setAttribute("listaContactos", UsuarioService.obtenerTodosSinAdmin());
		request.setAttribute("repetir", repetir);
		request.setAttribute("texto", texto);
		request.getRequestDispatcher(referencia).forward(request, response);
	}

}
