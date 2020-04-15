package com.example.demo.model;

public class VersionConfig {
    private int id;
    private String latestVersion;
    private String currentVersion;
    private int isNeedUpgrade;
    private int userId;

    public VersionConfig() {

    }

    public VersionConfig(int id, int isNeedUpgrade, int userId, String latestVersion, String currentVersion) {
        this.id =id;
        this.isNeedUpgrade = isNeedUpgrade;
        this.userId=userId;
        this.latestVersion=latestVersion;
        this.currentVersion=currentVersion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    public int getIsNeedUpgrade() {
        return isNeedUpgrade;
    }

    public void setIsNeedUpgrade(int isNeedUpgrade) {
        this.isNeedUpgrade = isNeedUpgrade;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
