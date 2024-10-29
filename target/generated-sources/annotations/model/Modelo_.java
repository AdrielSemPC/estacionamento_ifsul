package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Marca;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-10-22T11:54:22", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Modelo.class)
public class Modelo_ { 

    public static volatile SingularAttribute<Modelo, Marca> marca;
    public static volatile SingularAttribute<Modelo, Integer> ID;
    public static volatile SingularAttribute<Modelo, String> descricao;

}