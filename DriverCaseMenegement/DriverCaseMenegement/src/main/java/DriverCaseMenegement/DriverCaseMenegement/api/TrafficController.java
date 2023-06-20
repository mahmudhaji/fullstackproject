package DriverCaseMenegement.DriverCaseMenegement.api;

import DriverCaseMenegement.DriverCaseMenegement.model.Traffic;
import DriverCaseMenegement.DriverCaseMenegement.repository.TrafficRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Traffic")
public class TrafficController {
    @Autowired
    public TrafficRepo trafficRepo;
    @GetMapping("/allTraffic")
    public List<Traffic> getData(){
        return trafficRepo.findAll();

    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getByID(@PathVariable int id){
        try {
            Optional<Traffic> optionalTraffic = trafficRepo.findById(id);
            if (optionalTraffic.isPresent()){
                return  new ResponseEntity<>(optionalTraffic, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Traffic are not found",HttpStatus.NOT_FOUND);
            }
        }catch (Exception exception){
            return new ResponseEntity<>("Traffic are not added",HttpStatus.BAD_REQUEST);
        }
    }
}
