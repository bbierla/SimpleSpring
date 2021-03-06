package bb.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by bartosz on 08.07.16.
 */

public class DeviceDTO {

    private int id;
    private String name;
    private String cost;
    private boolean broken; //true -> broken

    public DeviceDTO() {
    }

    public DeviceDTO(String name, String cost, boolean broken) {
        this.name = name;
        this.cost = cost;
        this.broken = broken;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public boolean isBroken() {
        return broken;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }
}
