package DriverCaseMenegement.DriverCaseMenegement.api;

import DriverCaseMenegement.DriverCaseMenegement.model.Car;
import DriverCaseMenegement.DriverCaseMenegement.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Car")
public class CarController {
    @Autowired
    public CarRepo carRepo;
    @GetMapping("/allCar")
    public List<Car> getData(){
        return carRepo.findAll();
    }

}
