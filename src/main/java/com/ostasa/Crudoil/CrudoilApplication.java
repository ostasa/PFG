package com.ostasa.Crudoil;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CrudoilApplication {
static String urlApi= "https://sedeaplicaciones.minetur.gob.es/ServiciosRESTCarburantes/PreciosCarburantes/EstacionesTerrestres/";
static ArrayList<Gasolinera> gasolineras = new ArrayList<>();
	public static void main(String[] args) {
		SpringApplication.run(CrudoilApplication.class, args);
		llamadaApi(urlApi);
	}
public static void llamadaApi(String urlApi){
	RestTemplate restTemplate = new RestTemplate();
	// try {
		HttpEntity<String> entity = new HttpEntity<String>("");
		ResponseEntity<String> response = restTemplate.exchange(urlApi, HttpMethod.GET, entity, String.class);
		System.out.println("Result - status (" + response.getStatusCode() + ") has body: " + response.hasBody());
		//System.out.println(response);
		//final Type tipoListaGasolineras = new TypeToken<Clase<Gasolinera>>(){}.getType();
		final String FORMATO_FECHA = "dd/MM/yyyy HH:mm:ss";
	final DateFormat DF = new SimpleDateFormat(FORMATO_FECHA);
	final Gson gson = new GsonBuilder().setDateFormat(FORMATO_FECHA).create();
		Clase clas =gson.fromJson(response.getBody(), Clase.class);
		gasolineras =  clas.getGasol();
		System.out.println(clas.Fecha);
		System.out.println("ESTE ES RESULTADO " + clas.gasol.size());
	 	System.out.println("ESTE ES RESULTADO " + gasolineras.size());
	// 	resultado = resul.getResultado();
	//  } catch (Exception eek) {
	// 	 System.out.println(resultado);
	// 	if (resultado.equals("ERROR") ) {
	// 		informe.sumarCorrectos();
	// 		System.out.println("Toca OK");
	// 	} else {
	// 		 informe.sumarErrores();
	// 		 logs.escribirArc(mensaje);
	// 		 System.out.println("Toca OK pero lo da mal");
	// 		String seguir = "";
	// 		System.out.println("Press Enter key to continue...");
	// 		try {
	// 			seguir = x.nextLine();
	// 		} catch (Exception e) {
	// 		}
	//}
// 	 }
// 	long fin = System.currentTimeMillis();
	 
// 	double tiempo = (double) ((fin - inicio)/1000);
	 
// 	System.out.println(tiempo +" segundos");
// }
}
}
