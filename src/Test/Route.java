package Test;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Route implements Serializable {

    @OneToMany(targetEntity = Stop.class)
    private List<Stop> stopCodes;

    @Id
    private String routeName;

    public Route() {

    }

    public List<Stop> getStopCodes() {
        return this.stopCodes;
    }

    public void setStopCodes(List<Stop> stopCodes) {
        this.stopCodes = stopCodes;
    }

    public String getRouteName() {
        return this.routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }
}
