/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telecom.config;

import fulltest.ValidacaoResult;


/**
 *
 * @author G0042204
 */
public abstract class ConfiguracaoPorta {

    private ValidacaoResult estadoPorta;

    private ValidacaoResult vlanBanda;

    private ValidacaoResult vlanVoip;

    private ValidacaoResult vlanVod;

    private ValidacaoResult vlanMulticast;

    private ValidacaoResult parametros;

    private ProfileConfig profile;

    public ConfiguracaoPorta() {
    }

    public ValidacaoResult getEstadoPorta() {
        return estadoPorta;
    }

    public void setEstadoPorta(ValidacaoResult estadoPorta) {
        this.estadoPorta = estadoPorta;
    }

    public ValidacaoResult getVlanBanda() {
        return vlanBanda;
    }

    public void setVlanBanda(ValidacaoResult vlanBanda) {
        this.vlanBanda = vlanBanda;
    }

    public ValidacaoResult getVlanVoip() {
        return vlanVoip;
    }

    public void setVlanVoip(ValidacaoResult vlanVoip) {
        this.vlanVoip = vlanVoip;
    }

    public ValidacaoResult getVlanVod() {
        return vlanVod;
    }

    public void setVlanVod(ValidacaoResult vlanVod) {
        this.vlanVod = vlanVod;
    }

    public ValidacaoResult getVlanMulticast() {
        return vlanMulticast;
    }

    public void setVlanMulticast(ValidacaoResult vlanMulticast) {
        this.vlanMulticast = vlanMulticast;
    }

    public ValidacaoResult getParametros() {
        return parametros;
    }

    public void setParametros(ValidacaoResult parametros) {
        this.parametros = parametros;
    }

    public ProfileConfig getProfile() {
        return profile;
    }

    public void setProfile(ProfileConfig profile) {
        this.profile = profile;
    }

}
