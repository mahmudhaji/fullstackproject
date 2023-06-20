package DriverCaseMenegement.DriverCaseMenegement.repository;

import DriverCaseMenegement.DriverCaseMenegement.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepo extends JpaRepository<Driver,String> {

}
