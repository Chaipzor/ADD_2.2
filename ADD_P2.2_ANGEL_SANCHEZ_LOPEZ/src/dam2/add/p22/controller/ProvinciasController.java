package dam2.add.p22.controller;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import dam2.add.p22.api.LeerJsonUrl;
import dam2.add.p22.model.Provincia;

public class ProvinciasController {

	public static List<Provincia> cargarProvincias() {

		String cadenaJson = LeerJsonUrl
				.leerUrl("https://raw.githubusercontent.com/IagoLast/pselect/master/data/provincias.json");

		Provincia[] provincias = new Gson().fromJson(cadenaJson, Provincia[].class);
		List<Provincia> p = Arrays.asList(provincias);
		p.sort(Comparator.comparing(Provincia::getNm));
		return p;
	}

}
