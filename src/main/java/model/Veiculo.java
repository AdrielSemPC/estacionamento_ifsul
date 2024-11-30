/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
    protected int ID;
    
    @Column(nullable = false, length = 7)
    protected String placa;
    
    @Column(nullable = false, length = 25)
    protected String cor;
    
    @ManyToOne
    @JoinColumn(name = "modelo_id")
    protected Modelo modelo;
    
    @Enumerated(EnumType.STRING)
    protected TipoVeiculo tipo;
    
    @OneToMany(mappedBy = "veiculo")
    protected List<RegEntradaSaida> listaRegEntradaSaida;
    
    @ManyToOne
    @JoinColumn(name = "veiculo_proprietario")
    protected Pessoa proprietario;
    
    public Veiculo(){
        listaRegEntradaSaida = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        return this.modelo.getDescricao()+"; Cor: "+this.cor+" - Placa: "+this.placa+" - Veículo: privado";
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.ID;
        hash = 61 * hash + Objects.hashCode(this.placa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veiculo other = (Veiculo) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return Objects.equals(this.placa, other.placa);
    }
    
    
}
