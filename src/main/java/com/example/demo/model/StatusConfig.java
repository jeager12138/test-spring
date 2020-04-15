package com.example.demo.model;

public class StatusConfig {
    private int id;
    private int privacyStatus;
    private int pirStatus;
    private int alarmSoundMode;
    private int battryStatus;
    private int diskNum;
    private int cloudStatus;
    private int userId;

    public StatusConfig(){}

    public StatusConfig(int id, int privacyStatus, int pirStatus, int alarmSoundMode, int battryStatus, int diskNum, int cloudStatus, int userId) {
        this.id = id;
        this.privacyStatus = privacyStatus;
        this.pirStatus = pirStatus;
        this.alarmSoundMode = alarmSoundMode;
        this.battryStatus = battryStatus;
        this.diskNum = diskNum;
        this.cloudStatus = cloudStatus;
        this.userId = userId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrivacyStatus() {
        return privacyStatus;
    }

    public void setPrivacyStatus(int privacyStatus) {
        this.privacyStatus = privacyStatus;
    }

    public int getPirStatus() {
        return pirStatus;
    }

    public void setPirStatus(int pirStatus) {
        this.pirStatus = pirStatus;
    }

    public int getAlarmSoundMode() {
        return alarmSoundMode;
    }

    public void setAlarmSoundMode(int alarmSoundMode) {
        this.alarmSoundMode = alarmSoundMode;
    }

    public int getBattryStatus() {
        return battryStatus;
    }

    public void setBattryStatus(int battryStatus) {
        this.battryStatus = battryStatus;
    }

    public int getDiskNum() {
        return diskNum;
    }

    public void setDiskNum(int diskNum) {
        this.diskNum = diskNum;
    }

    public int getCloudStatus() {
        return cloudStatus;
    }

    public void setCloudStatus(int cloudStatus) {
        this.cloudStatus = cloudStatus;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
