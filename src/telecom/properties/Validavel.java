/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telecom.properties;

import br.net.gvt.efika.customer.EfikaCustomer;

/**
 *
 * @author G0041775
 */
public interface Validavel {

    public Boolean validar(EfikaCustomer cust);

    public String getNome();

}
