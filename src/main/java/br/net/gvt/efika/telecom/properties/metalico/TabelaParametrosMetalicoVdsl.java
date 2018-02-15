/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.telecom.properties.metalico;

/**
 *
 * @author G0042204
 */
public class TabelaParametrosMetalicoVdsl extends TabelaParametrosMetalico{

    private Double snrDown1, snrDown2,
            snrUp1, snrUp2,
            atnDown1, atnDown2,
            atnUp1, atnUp2;

    public Boolean validar(TabelaParametrosMetalicoVdsl t) {
        return this.snrDown1 >= t.getSnrDown1()
                && this.snrDown2 >= t.getSnrDown2()
                && this.snrUp1 >= t.getSnrUp1()
                && this.snrUp2 >= t.getSnrUp2()
                && this.atnDown1 >= t.getAtnDown1()
                && this.atnDown2 >= t.getAtnDown2()
                && this.atnUp1 >= t.getAtnUp1()
                && this.atnUp2 >= t.getAtnUp2()
                && super.validar(t);
    }

    public Double getSnrDown1() {
        return snrDown1;
    }

    public void setSnrDown1(Double snrDown1) {
        this.snrDown1 = snrDown1;
    }

    public Double getSnrDown2() {
        return snrDown2;
    }

    public void setSnrDown2(Double snrDown2) {
        this.snrDown2 = snrDown2;
    }

    public Double getSnrUp1() {
        return snrUp1;
    }

    public void setSnrUp1(Double snrUp1) {
        this.snrUp1 = snrUp1;
    }

    public Double getSnrUp2() {
        return snrUp2;
    }

    public void setSnrUp2(Double snrUp2) {
        this.snrUp2 = snrUp2;
    }

    public Double getAtnDown1() {
        return atnDown1;
    }

    public void setAtnDown1(Double atnDown1) {
        this.atnDown1 = atnDown1;
    }

    public Double getAtnDown2() {
        return atnDown2;
    }

    public void setAtnDown2(Double atnDown2) {
        this.atnDown2 = atnDown2;
    }

    public Double getAtnUp1() {
        return atnUp1;
    }

    public void setAtnUp1(Double atnUp1) {
        this.atnUp1 = atnUp1;
    }

    public Double getAtnUp2() {
        return atnUp2;
    }

    public void setAtnUp2(Double atnUp2) {
        this.atnUp2 = atnUp2;
    }

}
