package DriverCaseMenegement.DriverCaseMenegement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Traffic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TId;
    public String TName;
    public String TRank;

    public int getTId() {
        return TId;
    }

    public void setTId(int TId) {
        this.TId = TId;
    }

    public String getTName() {
        return TName;
    }

    public void setTName(String TName) {
        this.TName = TName;
    }

    public String getTRank() {
        return TRank;
    }

    public void setTRank(String TRank) {
        this.TRank = TRank;
    }
}
