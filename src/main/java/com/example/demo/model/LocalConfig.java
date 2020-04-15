package com.example.demo.model;

public class LocalConfig {
    private int id;
    private String protocolType;
    private String playPerformance;
    private String fileFormat;
    private String ruleMsg;
    private String posMsg;
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    public String getPlayPerformance() {
        return playPerformance;
    }

    public void setPlayPerformance(String playPerformance) {
        this.playPerformance = playPerformance;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public String getRuleMsg() {
        return ruleMsg;
    }

    public void setRuleMsg(String ruleMsg) {
        this.ruleMsg = ruleMsg;
    }

    public String getPosMsg() {
        return posMsg;
    }

    public void setPosMsg(String posMsg) {
        this.posMsg = posMsg;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
