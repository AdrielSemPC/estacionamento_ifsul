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
@DiscriminatorValue("OFICIAL")
public class VeiculoOficial extends Veiculo{
    
    private String renavan;
    
    private String chassi;

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    
    
    @Override
    public String toString(){
        return this.modelo.getDescricao()+"; Cor: "+this.cor+" - Placa: "+this.placa+" - Veículo: oficial";
    }
}
