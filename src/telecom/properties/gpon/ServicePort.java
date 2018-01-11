/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telecom.properties.gpon;

/**
 *
 * @author G0041775
 */
public class ServicePort {

    private Integer index, vlanId, vpi, flowPara, rx, tx;

    private Boolean state;

    public ServicePort() {
    }

    public ServicePort(Boolean exists) {
        if(!exists){
            index = 0;
            vlanId = 0;
            vpi = 0;
            flowPara = 0;
            rx = 0;
            tx = 0;
            state = false;
        }
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getVlanId() {
        return vlanId;
    }

    public void setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
    }

    public Integer getVpi() {
        return vpi;
    }

    public void setVpi(Integer vpi) {
        this.vpi = vpi;
    }

    public Integer getFlowPara() {
        return flowPara;
    }

    public void setFlowPara(Integer flowPara) {
        this.flowPara = flowPara;
    }

    public Integer getRx() {
        return rx;
    }

    public void setRx(Integer rx) {
        this.rx = rx;
    }

    public Integer getTx() {
        return tx;
    }

    public void setTx(Integer tx) {
        this.tx = tx;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

}
