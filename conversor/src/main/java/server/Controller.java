package server;

import java.util.HashMap;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class Controller {

	
	public static ModelAndView mostrarFormulario(Request request, Response response){
		/*double celsius = Double.parseDouble(request.queryParams("celsius"));
		double kelvin = celsius +273; //new ConversorAKelvin().convertir(celsius);
		double fahrenheit = (celsius*1.8) + 32;
		//return "Celsius = "+ celsius + "°C Kelvin = " + (celsius + 273) + "°K \n" + "Fahrenheit = " + (celsius * 1.8 + 32) + "°F";
		
		HashMap<Object, Object> viewModel = new HashMap<>();
		viewModel.put("celsius",celsius);
		viewModel.put("kelvin", kelvin);
		viewModel.put("fahrenheit",fahrenheit);
		
		*/
		HashMap<Object, Object> viewModel = new HashMap<>();
		return new ModelAndView(viewModel, "formularioConversor.hbs");
	}
	
	public static ModelAndView convertir(Request request, Response response){
		double celsius = Double.parseDouble(request.queryParams("celsius"));
		double kelvin = celsius +273; //new ConversorAKelvin().convertir(celsius);
		double fahrenheit = (celsius*1.8) + 32;
		//return "Celsius = "+ celsius + "°C Kelvin = " + (celsius + 273) + "°K \n" + "Fahrenheit = " + (celsius * 1.8 + 32) + "°F";
		
		HashMap<Object, Object> viewModel = new HashMap<>();
		viewModel.put("celsius",celsius);
		viewModel.put("kelvin", kelvin);
		viewModel.put("fahrenheit",fahrenheit);
		
		return new ModelAndView(viewModel, "resultadoKelvin.hbs");
	}
}

