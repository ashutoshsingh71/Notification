package com.bitgo.notification.Entities;

@Entity
public class Notification {
    String id;
    float currentPriceOfBTC ;
    BigInteger marketTradeVolume;
    int intraDayHighPrice;
    String marketCap;

    public Notification(float currentPriceOfBTC, BigInteger marketTradeVolume, int intraDayHighPrice, String marketCap) {
        this.currentPriceOfBTC = currentPriceOfBTC;
        this.marketTradeVolume = marketTradeVolume;
        this.intraDayHighPrice = intraDayHighPrice;
        this.marketCap = marketCap;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getCurrentPriceOfBTC() {
        return currentPriceOfBTC;
    }

    public void setCurrentPriceOfBTC(float currentPriceOfBTC) {
        this.currentPriceOfBTC = currentPriceOfBTC;
    }

    public BigInteger getMarketTradeVolume() {
        return marketTradeVolume;
    }

    public void setMarketTradeVolume(BigInteger marketTradeVolume) {
        this.marketTradeVolume = marketTradeVolume;
    }

    public int getIntraDayHighPrice() {
        return intraDayHighPrice;
    }

    public void setIntraDayHighPrice(int intraDayHighPrice) {
        this.intraDayHighPrice = intraDayHighPrice;
    }

    public String getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(String marketCap) {
        this.marketCap = marketCap;
    }
}

