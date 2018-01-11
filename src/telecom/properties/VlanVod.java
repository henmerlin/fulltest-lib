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
public class VlanVod extends VlanAbstract {

    public VlanVod() {
        super(null, null);
    }

    @Override
    public String getNome() {
        return "Vlan VoD/IPTV";
    }

    public VlanVod(Integer cvlan, Integer svlan, EnumEstadoVlan est) {
        super(cvlan, svlan, est);
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        if (getCvlan() == null || getSvlan() == null) {
            return false;
        }
//        if (getPctDown() != null && getPctUp() != null) {
//            return this.getSvlan().equals(e.getRede().getVlanVod()) && this.getCvlan().equals(e.getRede().getCvlan())
//                    && this.getState().equals(EnumEstadoVlan.UP) 
////                    && this.getPctDown().compareTo(BigInteger.ZERO) > 0
////                    && this.getPctUp().compareTo(BigInteger.ZERO) > 0
//                    ;
//        }
        return this.getSvlan().equals(e.getRede().getVlanVod()) && this.getCvlan().equals(e.getRede().getCvlan())
                && this.getState().equals(EnumEstadoVlan.UP);
    }
}
