package mygroup.HelpInHome.Financeiro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mygroup.HelpInHome.Financeiro.Model.Planejamento;

@Repository
public interface PlanejamentoRepository extends JpaRepository<Planejamento, Integer> {
    
}
