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
public class VlanBanda extends VlanAbstract {

    public VlanBanda() {
        super(null, null, null);
    }

    @Override
    public String getNome() {
        return "Vlan Banda Larga";
    }

    public VlanBanda(Integer cvlan, Integer svlan, EnumEstadoVlan estado) {
        super(cvlan, svlan, estado);
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        if(getCvlan()==null || getSvlan() == null){
            return false;
        }
        return this.getSvlan().equals(e.getRede().getRin()) && this.getCvlan().equals(e.getRede().getCvlan()) && this.getState().equals(EnumEstadoVlan.UP);
    }
}
