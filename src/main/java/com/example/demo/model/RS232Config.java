package com.example.demo.model;

public class RS232Config {
    private int id;
    private int baudRate;
    private int dataBit;
    private int stopBit;
    private String checked;
    private String fluidControl;
    private String controlMode;
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBaudRate() {
        return baudRate;
    }

    public void setBaudRate(int baudRate) {
        this.baudRate = baudRate;
    }

    public int getDataBit() {
        return dataBit;
    }

    public void setDataBit(int dataBit) {
        this.dataBit = dataBit;
    }

    public int getStopBit() {
        return stopBit;
    }

    public void setStopBit(int stopBit) {
        this.stopBit = stopBit;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public String getFluidControl() {
        return fluidControl;
    }

    public void setFluidControl(String fluidControl) {
        this.fluidControl = fluidControl;
    }

    public String getControlMode() {
        return controlMode;
    }

    public void setControlMode(String controlMode) {
        this.controlMode = controlMode;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
