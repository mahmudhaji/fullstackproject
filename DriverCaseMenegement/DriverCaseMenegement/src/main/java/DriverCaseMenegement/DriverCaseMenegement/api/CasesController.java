package DriverCaseMenegement.DriverCaseMenegement.api;

import DriverCaseMenegement.DriverCaseMenegement.model.Cases;
import DriverCaseMenegement.DriverCaseMenegement.repository.CasesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Cases")
public class CasesController {
    @Autowired
    public CasesRepo casesRepo;
    @GetMapping("/allCases")
    public List<Cases> getData(){
        return casesRepo.findAll();
    }
}
