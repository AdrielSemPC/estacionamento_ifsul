/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.print.DocFlavor.STRING;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author 20241PF.CC0029
 */

@Entity
@Table(name = "tb_veiculos")
public class Veiculo implements Serializable {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int ID;
    
    @Column(nullable = false, length = 7)
    private String placa;
    
    @Column(nullable = false, length = 25)
    private String cor;
    
    @ManyToOne
    @JoinColumn(name = "modelo_id")
    private Modelo modelo;
    
    @Enumerated(EnumType.STRING)
    private TipoVeiculo tipo;
    
    @OneToMany(mappedBy = "veiculo")
    private List<RegEntradaSaida> listaRegEntradaSaida;
    
    @ManyToOne
    @JoinColumn(name = "veiculo_proprietario")
    private Pessoa proprietario;
    
    public Veiculo(){
        listaRegEntradaSaida = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        return this.modelo.getDescricao()+"; Cor: ("+this.cor+") - Placa: ("+this.placa+")";
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
