package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int stationsAmount = 10;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int stationsAmount) {
        this.stationsAmount = stationsAmount;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getStationsAmount() {
        return stationsAmount;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > (stationsAmount - 1)) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation == (stationsAmount - 1)) {
            currentStation = 0;
            return;
        }
        currentStation = currentStation + 1;
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = (stationsAmount - 1);
            return;
        }
        currentStation = currentStation - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseCurrentVolume() {
        if (currentVolume < maxVolume)
            currentVolume = currentVolume + 1;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume > minVolume)
            currentVolume = currentVolume - 1;
    }
}
