/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author 20241PF.CC0029
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_veiculo_es", discriminatorType = DiscriminatorType.STRING)
@Table(name = "tb_entradasaida")
public class RegEntradaSaida implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int ID;
    
    @Column(nullable = false)
    private Date data;
    
    @Enumerated(EnumType.STRING)
    private TipoEntradaSaida entradaSaida;
    
    @ManyToOne
    @JoinColumn(name = "es_veiculo")
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
