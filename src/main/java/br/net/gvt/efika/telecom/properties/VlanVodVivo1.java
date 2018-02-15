/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.telecom.properties;

import br.net.gvt.efika.customer.model.customer.EfikaCustomer;

public class VlanVodVivo1 extends VlanVod {

    private Integer vlanFixo;

    public VlanVodVivo1(Integer vlanFixo) {
        this.vlanFixo = vlanFixo;
    }

    public Integer getVlanFixo() {
        return vlanFixo;
    }

    public void setVlanFixo(Integer vlanFixo) {
        this.vlanFixo = vlanFixo;
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        if (getSvlan() == null) {
            return false;
        }
        return this.vlanFixo.compareTo(this.getSvlan()) == 0;
    }

}
