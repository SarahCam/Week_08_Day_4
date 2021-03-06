package models;

import behaviours.IPlay;
import behaviours.ISell;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name="instruments")
@Inheritance(strategy= InheritanceType.JOINED)
public abstract class Instrument implements IPlay, ISell {

    private int id;
    private String colour;
    private String type;
    protected int buyPrice;
    protected int sellPrice;

    public Instrument() {
    }

    public Instrument(String colour, String type, int buyPrice, int sellPrice) {
        this.colour = colour;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="colour")
    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Column(name="type")
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name="buy_price")
    public int getBuyPrice() {
        return this.buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    @Column(name="sell_price")
    public int getSellPrice() {
        return this.sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }
}
