package Test;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Line implements Serializable {

    @OneToMany(targetEntity = Bus.class)
    private List<Bus> buses;

    @OneToMany(targetEntity = Route.class)
    private List<Route> routes;

    @Id
    private Integer lineNum;

    public Line() {

    }

    public List<Bus> getBuses() {
        return this.buses;
    }

    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }

    public List<Route> getRoutes() {
        return this.routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    public Integer getLineNum() {
        return this.lineNum;
    }

    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }
}
