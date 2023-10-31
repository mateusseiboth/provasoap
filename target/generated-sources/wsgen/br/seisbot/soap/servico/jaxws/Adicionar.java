
package br.seisbot.soap.servico.jaxws;

import br.seisbot.soap.modelo.Repetil;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "adicionar", namespace = "http://servico.soap.seisbot.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adicionar", namespace = "http://servico.soap.seisbot.br/")
public class Adicionar {

    @XmlElement(name = "arg0", namespace = "")
    private Repetil arg0;

    /**
     * 
     * @return
     *     returns Repetil
     */
    public Repetil getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(Repetil arg0) {
        this.arg0 = arg0;
    }

}
