package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetStationsAmountNoArgs() {
        Radio radio = new Radio();

        int expected = 10;
        int actual = radio.getStationsAmount();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationsAmount() {
        Radio radio = new Radio(30);

        int expected = 30;
        int actual = radio.getStationsAmount();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationNoArgs() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.nextStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevStationNoArgs() {
        Radio radio = new Radio();

        radio.setCurrentStation(3);
        radio.prevStation();

        int expected = 2;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextStationAfterMax() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(28);
        radio.nextStation();
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevStationAfterMin() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(1);
        radio.prevStation();
        radio.prevStation();

        int expected = 29;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationUnderMin() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(-1);

        int expected = radio.getCurrentStation();
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationOverMax() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(30);

        int expected = radio.getCurrentStation();
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeNoArgs() {
        Radio radio = new Radio();

        radio.setCurrentVolume(22);
        radio.increaseCurrentVolume();

        int expected = 23;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeNoArgs() {
        Radio radio = new Radio();

        radio.setCurrentVolume(33);
        radio.decreaseCurrentVolume();

        int expected = 32;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeToMaxNoArgs() {
        Radio radio = new Radio();

        radio.setCurrentVolume(98);

        radio.increaseCurrentVolume();
        radio.increaseCurrentVolume();
        radio.increaseCurrentVolume();

        int expected = radio.getMaxVolume();
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeToMinNoArgs() {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);

        radio.decreaseCurrentVolume();
        radio.decreaseCurrentVolume();
        radio.decreaseCurrentVolume();

        int expected = radio.getMinVolume();
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeOverMaxNoArgs() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

}
