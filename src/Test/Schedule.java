package Test;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Schedule implements Serializable {

    @Id
    private Integer scheduleId;

    @OneToOne(targetEntity = Bus.class)
    private Bus bus;

    @Basic
    private double arrTime;

    public Schedule() {

    }

    public Integer getScheduleId() {
        return this.scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Bus getBus() {
        return this.bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public double getArrTime() {
        return this.arrTime;
    }

    public void setArrTime(double arrTime) {
        this.arrTime = arrTime;
    }
}
