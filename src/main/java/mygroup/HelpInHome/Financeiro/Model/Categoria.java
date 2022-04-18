package mygroup.HelpInHome.Financeiro.Model;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;
import mygroup.HelpInHome.Financeiro.Model.Enum.Tipo;

@Data
@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Float valorEsperado;
    private Float valorReal;
    private Tipo tipo;
    private boolean ativo;

}