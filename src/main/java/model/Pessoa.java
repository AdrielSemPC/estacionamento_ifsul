/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author 20241PF.CC0029
 */

@Entity
@Table(name = "tb_pessoa")
public class Pessoa implements Serializable{
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int ID;
    @Column(name = "nome", length = 50, nullable = false)
    private String nome;
    @Column(name = "telefone", length = 11, nullable = false)
    private String telefone;
    @Column(name = "email", length = 50)
    private String email;
    @Enumerated(EnumType.STRING)
    private VinculoPessoa vinculoPessoa;

    private List<Veiculo> listaVeiculos;
    
    public Pessoa(){
        listaVeiculos = new ArrayList<>();
    }
    
    public Pessoa(int ID, String nome, String telefone, String email, VinculoPessoa vinculoPessoa){
        this.ID = ID;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        listaVeiculos = new ArrayList<>();
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public VinculoPessoa getVinculoPessoa() {
        return vinculoPessoa;
    }

    public void setVinculoPessoa(VinculoPessoa vinculoPessoa) {
        this.vinculoPessoa = vinculoPessoa;
    }
    
    public void addVeiculo(Veiculo veiculo){
        listaVeiculos.add(veiculo);
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }
    
}
