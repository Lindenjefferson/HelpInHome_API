package mygroup.HelpInHome.Financeiro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mygroup.HelpInHome.Financeiro.Model.Transacao;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Integer> {
    
}
