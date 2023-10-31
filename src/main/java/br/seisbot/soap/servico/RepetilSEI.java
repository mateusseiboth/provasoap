package br.seisbot.soap.servico;

import java.util.List;

import br.seisbot.soap.modelo.Repetil;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding (style = Style.DOCUMENT)
public interface RepetilSEI {
	
	@WebMethod
	public Repetil adicionar(Repetil repetil);
	
	
	@WebMethod
	public List<Repetil> listar();
	
	@WebMethod
	public Repetil ler(String id);
}
