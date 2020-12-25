package mygroup.HelpInHome.Financeiro.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import mygroup.HelpInHome.Financeiro.Model.Enum.Tipo;

@Data
@Entity
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String descricao;
    private Float valorEsperado;
    private Float valorReal;
    private Tipo tipo;
    private boolean ativo;

}