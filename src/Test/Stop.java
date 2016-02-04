package Test;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Stop implements Serializable {

    @Id
    private String stopCode;

    public Stop() {

    }

    public String getStopCode() {
        return this.stopCode;
    }

    public void setStopCode(String stopCode) {
        this.stopCode = stopCode;
    }
}
