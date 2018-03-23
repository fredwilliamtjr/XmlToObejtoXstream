package br.com.fwtj.XmltoObjeto;

import java.util.Date;
import java.util.List;

public class Produto {

    private List<Object> det;

    public List<Object> getDet() {
        return det;
    }

    public void setDet(List<Object> det) {
        this.det = det;
    }

    @Override
    public String toString() {
        return "Produto{" + "det=" + det + '}';
    }

    
    
    

}
