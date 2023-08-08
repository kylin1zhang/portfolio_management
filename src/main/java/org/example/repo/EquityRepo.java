package org.example.repo;

import org.example.entity.Equity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface EquityRepo extends JpaRepository<Equity,Integer> {

}
