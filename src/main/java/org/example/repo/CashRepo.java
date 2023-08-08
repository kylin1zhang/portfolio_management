package org.example.repo;

import org.example.entity.Cash;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashRepo extends JpaRepository<Cash, Integer> {

}
