
package br.seisbot.soap.servico.jaxws;

import br.seisbot.soap.modelo.Repetil;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "adicionarResponse", namespace = "http://servico.soap.seisbot.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adicionarResponse", namespace = "http://servico.soap.seisbot.br/")
public class AdicionarResponse {

    @XmlElement(name = "return", namespace = "")
    private Repetil _return;

    /**
     * 
     * @return
     *     returns Repetil
     */
    public Repetil getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Repetil _return) {
        this._return = _return;
    }

}
