package DriverCaseMenegement.DriverCaseMenegement.repository;

import DriverCaseMenegement.DriverCaseMenegement.model.Cases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CasesRepo extends JpaRepository<Cases,String> {
}
