package uz.najot.imtihonproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.najot.imtihonproject.entity.Card;

@Repository
public interface CardRepository extends JpaRepository<Card,Integer> {
}