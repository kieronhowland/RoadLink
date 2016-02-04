package Test;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Bus implements Serializable {

    @Id
    private Integer busId;

    public Bus() {

    }

    public Integer getBusId() {
        return this.busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }
}
