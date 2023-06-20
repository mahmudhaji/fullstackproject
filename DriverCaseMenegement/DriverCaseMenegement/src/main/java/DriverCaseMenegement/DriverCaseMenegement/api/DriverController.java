package DriverCaseMenegement.DriverCaseMenegement.api;

import DriverCaseMenegement.DriverCaseMenegement.model.Driver;
import DriverCaseMenegement.DriverCaseMenegement.repository.DriverRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Driver")
public class DriverController {
    @Autowired
    public DriverRepo driverRepo;
    @GetMapping("/allDriver")
    public List<Driver> getData(){
        return driverRepo.findAll();
    }
    @PostMapping("/Driver")
    public ResponseEntity postDriver(Driver driver){
        driverRepo.save(driver);

        return new ResponseEntity<>("Data posted successfully", HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity AddNew(@RequestBody Driver driver){
        try { Driver driver1 = driverRepo.save(driver);
            return new ResponseEntity<>("driver are added",HttpStatus.OK);

         } catch (Exception exception){
            return new ResponseEntity<>("Driver are not added",HttpStatus.BAD_REQUEST);
        }
    }
    // add by ID
}
