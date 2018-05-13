package models;

import behaviours.IPlay;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public abstract class Instrument extends StockItem implements IPlay {
    private String colour;
    private InstrumentType type;

    public Instrument(){
    }

    public Instrument(String colour, InstrumentType type, int costPrice, int retailPrice) {
        super(costPrice, retailPrice);
        this.colour = colour;
        this.type = type;
    }



    @Column(name="colour")
    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    @Column(name="type")
    public InstrumentType getType() {
        return this.type;
    }
}
