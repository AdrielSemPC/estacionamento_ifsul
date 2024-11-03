/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.*;

/**
 *
 * @author 20241PF.CC0029
 */

@Entity
@DiscriminatorValue("veiculo_oficial")
public class RegESOficial extends RegEntradaSaida {
    private int quilometragemRegistrada;
    
    @OneToOne
    @JoinColumn(name = "esoficial_motorista")
    private Pessoa motorista;
    
    public RegESOficial(TipoEntradaSaida tipo, Veiculo veiculo, Pessoa motorista){
        super(tipo, veiculo);
        this.motorista = motorista;
    }

    public int getQuilometragemRegistrada() {
        return quilometragemRegistrada;
    }

    public void setQuilometragemRegistrada(int quilometragemRegistrada) {
        this.quilometragemRegistrada = quilometragemRegistrada;
    }

    public Pessoa getMotorista() {
        return motorista;
    }

    public void setMotorista(Pessoa motorista) {
        this.motorista = motorista;
    }
}
