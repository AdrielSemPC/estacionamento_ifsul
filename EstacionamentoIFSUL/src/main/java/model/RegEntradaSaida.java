/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author 20241PF.CC0029
 */
public class RegEntradaSaida {
    private int ID;
    private Date data;
    private TipoEntradaSaida entradasaida;
    
    private Veiculo veiculo;

    public RegEntradaSaida(TipoEntradaSaida movimentacao, Veiculo veiculo){
        entradasaida = movimentacao;
        this.veiculo = veiculo;
        data = new Date();
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public TipoEntradaSaida getEntradasaida() {
        return entradasaida;
    }

    public void setEntradasaida(TipoEntradaSaida entradasaida) {
        this.entradasaida = entradasaida;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
