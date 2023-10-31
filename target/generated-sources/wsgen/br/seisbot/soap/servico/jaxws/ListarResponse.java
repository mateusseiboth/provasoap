
package br.seisbot.soap.servico.jaxws;

import java.util.List;
import br.seisbot.soap.modelo.Repetil;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "listarResponse", namespace = "http://servico.soap.seisbot.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarResponse", namespace = "http://servico.soap.seisbot.br/")
public class ListarResponse {

    @XmlElement(name = "return", namespace = "")
    private List<Repetil> _return;

    /**
     * 
     * @return
     *     returns List<Repetil>
     */
    public List<Repetil> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<Repetil> _return) {
        this._return = _return;
    }

}
