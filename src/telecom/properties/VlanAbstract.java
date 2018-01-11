/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telecom.properties;

import br.net.gvt.efika.customer.EfikaCustomer;
import java.math.BigInteger;

/**
 *
 * @author G0041775
 */
public abstract class VlanAbstract extends ValidavelAbs implements Validavel {

    private Integer cvlan;

    private Integer svlan;

    private BigInteger pctDown, pctUp;

    private EnumEstadoVlan state;

    public VlanAbstract(String nome) {
        super("VLAN");
    }
    

    public VlanAbstract(Integer cvlan, Integer svlan, EnumEstadoVlan estado) {
        super("VLAN");
        this.cvlan = cvlan;
        this.svlan = svlan;
        this.state = estado;
    }

    @Deprecated
    public VlanAbstract(Integer p100, Integer cvlan) {
        super("VLAN");
        this.cvlan = p100;
        this.svlan = cvlan;
        this.state = EnumEstadoVlan.UP;
    }

    public EnumEstadoVlan getState() {
        return state;
    }

    public void setState(EnumEstadoVlan state) {
        this.state = state;
    }

    public Integer getCvlan() {
        return cvlan;
    }

    public void setCvlan(Integer cvlan) {
        this.cvlan = cvlan;
    }

    public Integer getSvlan() {
        return svlan;
    }

    public void setSvlan(Integer svlan) {
        this.svlan = svlan;
    }

    public BigInteger getPctDown() {
        return pctDown;
    }

    public void setPctDown(BigInteger pctDown) {
        this.pctDown = pctDown;
    }

    public BigInteger getPctUp() {
        return pctUp;
    }

    public void setPctUp(BigInteger pctUp) {
        this.pctUp = pctUp;
    }

    @Override
    public abstract Boolean validar(EfikaCustomer e);

}
