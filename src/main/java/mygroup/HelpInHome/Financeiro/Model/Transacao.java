package mygroup.HelpInHome.Financeiro.Model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Transacao implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Date data;
    private Float valor;
    private String descricao;

    @ManyToOne
    @Column(nullable = false)
    private Categoria categoria;

    @ManyToOne
    @Column(nullable = true)
    private Planejamento planejamento;

}
