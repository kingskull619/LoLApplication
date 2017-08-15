package com.kingskull.lolapplication.models.pojos.item;

/**
 * Created by Carlos on 06/02/2016.
 */
public class GoldDto {

    private int base;
    private boolean purchasable;
    private int sell;
    private int total;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public boolean isPurchasable() {
        return purchasable;
    }

    public void setPurchasable(boolean purchasable) {
        this.purchasable = purchasable;
    }

    public int getSell() {
        return sell;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
