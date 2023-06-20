package DriverCaseMenegement.DriverCaseMenegement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Cases {
    @Id
    public String CasesName;
    public Date TDate;
    public String Location;


    public String getCasesName() {
        return CasesName;
    }

    public void setCasesName(String casesName) {
        CasesName = casesName;
    }

    public Date getTDate() {
        return TDate;
    }

    public void setTDate(Date TDate) {
        this.TDate = TDate;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}
