package mygroup.HelpInHome.Financeiro.Model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "transacao")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date data;
    private Float valor;
    private String descricao;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

}
