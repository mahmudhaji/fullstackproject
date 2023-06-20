package DriverCaseMenegement.DriverCaseMenegement.repository;

import DriverCaseMenegement.DriverCaseMenegement.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CarRepo extends JpaRepository<Car,String> {
}
