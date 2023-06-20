package DriverCaseMenegement.DriverCaseMenegement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;
import lombok.Data;

@Entity
@Data
public class PoliceOfficer {
    @Id
    public String OfficerName;

    public String getOfficerName() {
        return OfficerName;
    }

    public void setOfficerName(String officerName) {
        OfficerName = officerName;
    }
}
