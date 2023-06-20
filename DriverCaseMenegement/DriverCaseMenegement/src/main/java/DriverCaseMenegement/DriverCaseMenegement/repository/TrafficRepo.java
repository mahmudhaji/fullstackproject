package DriverCaseMenegement.DriverCaseMenegement.repository;

import DriverCaseMenegement.DriverCaseMenegement.model.Traffic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrafficRepo extends JpaRepository<Traffic,Integer> {
}
