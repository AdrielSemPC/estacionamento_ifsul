/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 20241PF.CC0029
 */
public class EntradaSaidaOficial extends RegEntradaSaida {
    private int quilometragemRegistrada;
    private Pessoa motorista;
    
    public EntradaSaidaOficial(TipoEntradaSaida tipo, Veiculo veiculo, Pessoa motorista){
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
