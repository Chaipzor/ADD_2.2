package dam2.add.p22.config;

import dam2.add.p22.servicios.UsuarioService;

public class ConfigInicio {
	
	static String persistencia = ConfigFichero.getParametro("bd.persistencia");
	public static void cargar() {
		UsuarioService.persistencia(persistencia);
	}
}
