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
    private TipoEntradaSaida entradaSaida;
    
    private Veiculo veiculo;

    public RegEntradaSaida(TipoEntradaSaida movimentacao, Veiculo veiculo){
        entradaSaida = movimentacao;
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
        return entradaSaida;
    }

    public void setEntradasaida(TipoEntradaSaida entradaSaida) {
        this.entradaSaida = entradaSaida;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
