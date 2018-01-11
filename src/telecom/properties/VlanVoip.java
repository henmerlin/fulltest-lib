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
public class VlanVoip extends VlanAbstract {

    public VlanVoip() {
        super(null, null);
    }

//    @Override
//    public String getNome() {
//        return TelecomPropertiesEnum.VlanVoip.getNome();
//    }

    public VlanVoip(Integer cvlan, Integer svlan, EnumEstadoVlan est) {
        super(cvlan, svlan, est, TelecomPropertiesEnum.VlanVoip);
    }


    @Override
    public Boolean validar(EfikaCustomer e) {
        if(getCvlan()==null || getSvlan() == null){
            return false;
        }
        return this.getSvlan().equals(e.getRede().getVlanVoip()) && this.getCvlan().equals(e.getRede().getCvlan()) && this.getState().equals(EnumEstadoVlan.UP);
    }
}
