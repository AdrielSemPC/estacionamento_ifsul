package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Modelo;
import model.TipoVeiculo;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-10-22T11:54:22", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Veiculo.class)
public class Veiculo_ { 

    public static volatile SingularAttribute<Veiculo, TipoVeiculo> tipo;
    public static volatile SingularAttribute<Veiculo, String> cor;
    public static volatile SingularAttribute<Veiculo, Integer> ID;
    public static volatile SingularAttribute<Veiculo, Modelo> modelo;
    public static volatile SingularAttribute<Veiculo, String> placa;

}