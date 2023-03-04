package uz.najot.imtihonproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import uz.najot.imtihonproject.dto.HistoryDtoByCardId;
import uz.najot.imtihonproject.entity.Card;
import uz.najot.imtihonproject.entity.History;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Repository
public interface HistoryRepository extends JpaRepository<History, Integer> {
    List<History> findByCardId(Integer id);
}