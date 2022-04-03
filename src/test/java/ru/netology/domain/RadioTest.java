package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);

        int expected = 7;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.nextStation();

        int expected = 3;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(3);
        radio.prevStation();

        int expected = 2;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextStationAfterMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.nextStation();
        radio.nextStation();
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevStationAfterMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.prevStation();
        radio.prevStation();
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = radio.getCurrentStation();
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationOverMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = radio.getCurrentStation();
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);
        radio.increaseCurrentVolume();

        int expected = 3;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(3);
        radio.decreaseCurrentVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeToMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);

        radio.increaseCurrentVolume();
        radio.increaseCurrentVolume();
        radio.increaseCurrentVolume();

        int expected = radio.getMaxVolume();
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeToMin() {
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
    void shouldSetCurrentVolumeOverMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

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
