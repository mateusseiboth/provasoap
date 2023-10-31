package br.seisbot.soap;

import br.seisbot.soap.servico.RepetilSIB;
import jakarta.xml.ws.Endpoint;

public class App {
    public static void main( String[] args ) {
    	String porta = "8081";
		System.out.println("Running on port: " + porta);
		Endpoint.publish("http://localhost:"+porta+"/repetil", new RepetilSIB());
   
    }
}
