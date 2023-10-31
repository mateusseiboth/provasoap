package br.seisbot.soap.servico;

import java.util.ArrayList;
import java.util.List;

import br.seisbot.soap.modelo.Repetil;
import jakarta.jws.WebService;
import java.util.UUID;


@WebService(endpointInterface = "br.seisbot.soap.servico.RepetilSEI")
public class RepetilSIB implements RepetilSEI{
	
	private ArrayList<Repetil> repeteis = new ArrayList<Repetil>();

	@Override
	public Repetil adicionar(Repetil repetil) {
		UUID uuid = UUID.randomUUID();
		repetil.setId(uuid.toString());
        try {
        	repeteis.add(repetil);
        	return repetil;
        } catch (Exception e) {
            System.out.println(e);      
        }
        return repetil;
	}
	
	
	@Override
	public List<Repetil> listar() {
        return repeteis;
	}

	@Override
	public Repetil ler(String id) {
		Repetil repetil = new Repetil(); 
        try {
        	for(Repetil r : repeteis) {
        		if(r.getId() == id) {
        			repetil = r;
        		}
        	}
        } catch (Exception e) {
           System.out.println(e);           
        }
        return repetil;
	}

}
