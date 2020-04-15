package com.example.demo.model;

public class ChannelConfig {

    private int id;
    private String deviceSerial;
    private String ipcSerial;
    private int channelNo;
    private String deviceName;
    private String channelName;
    private int status;
    private String isShared;
    private String picUrl;
    private int isEncrypt;
    private int videoLevel;
    private int relatedIpc;
    private int userId;

    public ChannelConfig() {
    }
    public ChannelConfig(int id, String deviceSerial, String ipcSerial, int channelNo, String deviceName, String channelName, int status, String isShared, String picUrl, int isEncrypt, int videoLevel, int relatedIpc, int userId) {
        this.id = id;
        this.deviceSerial = deviceSerial;
        this.ipcSerial = ipcSerial;
        this.channelNo = channelNo;
        this.deviceName = deviceName;
        this.channelName = channelName;
        this.status = status;
        this.isShared = isShared;
        this.picUrl = picUrl;
        this.isEncrypt = isEncrypt;
        this.videoLevel = videoLevel;
        this.relatedIpc = relatedIpc;
        this.userId = userId;
    }

    public String getDeviceSerial() {
        return deviceSerial;
    }

    public void setDeviceSerial(String deviceSerial) {
        this.deviceSerial = deviceSerial;
    }

    public String getIpcSerial() {
        return ipcSerial;
    }

    public void setIpcSerial(String ipcSerial) {
        this.ipcSerial = ipcSerial;
    }

    public int getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(int channelNo) {
        this.channelNo = channelNo;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getIsShared() {
        return isShared;
    }

    public void setIsShared(String isShared) {
        this.isShared = isShared;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public int getIsEncrypt() {
        return isEncrypt;
    }

    public void setIsEncrypt(int isEncrypt) {
        this.isEncrypt = isEncrypt;
    }

    public int getVideoLevel() {
        return videoLevel;
    }

    public void setVideoLevel(int videoLevel) {
        this.videoLevel = videoLevel;
    }

    public int getRelatedIpc() {
        return relatedIpc;
    }

    public void setRelatedIpc(int relatedIpc) {
        this.relatedIpc = relatedIpc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
