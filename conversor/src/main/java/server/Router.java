package server;

import spark.Spark;
import spark.TemplateEngine;
import spark.utils.HandlebarsTemplateEngineBuilder;

public class Router {

	
	public static void configure(){
		/*		
		Old but gold
		Spark.staticFiles.location("/public");
		//Spark.get("Hola", Controller::saludar);
		Spark.get("Hola/:nombre/:edad", Controller::saludar);
		//Spark.get("Hola", (req,res) ->  {throw new RuntimeException("Se cayo el sistema");});
		*/
		
		
		TemplateEngine engine = HandlebarsTemplateEngineBuilder.create().build();
		Spark.staticFiles.location("/public");
		Spark.get("conversor", Controller::mostrarFormulario, engine);
		Spark.get("conversor/kelvin", Controller::convertir, engine);
		//Spark.get("Hola", Controller::convertir);
		//Spark.get("Hola", (req,res) ->  {throw new RuntimeException("Se cayo el sistema");});
		
	}
}
