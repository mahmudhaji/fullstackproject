package DriverCaseMenegement.DriverCaseMenegement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Driver {
    @Id
    private String LicenceNo;
    public String FName;
    public String Gender;
    public int Age;

    public String getLicenceNo() {
        return LicenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        LicenceNo = licenceNo;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
