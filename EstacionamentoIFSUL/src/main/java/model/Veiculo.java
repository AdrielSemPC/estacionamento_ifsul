/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 20241PF.CC0029
 */
public class Veiculo {
    private int ID;
    private String placa, cor;
    private Modelo modelo;
    private TipoVeiculo tipo;
    
    private List<RegEntradaSaida> listaRegEntradaSaida;
    
    private Pessoa proprietario;
    
    public Veiculo(){
        listaRegEntradaSaida = new ArrayList<>();
    }
    
    public Veiculo(String placa, TipoVeiculo tipo){
        this.placa = placa;
        this.tipo = tipo;
        listaRegEntradaSaida = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVeiculo tipo) {
        this.tipo = tipo;
    }
    
    public void addEntradaSaida(RegEntradaSaida entradasaida){
        listaRegEntradaSaida.add(entradasaida);
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    public List<RegEntradaSaida> getListaRegEntradaSaida() {
        return listaRegEntradaSaida;
    }
    
}
