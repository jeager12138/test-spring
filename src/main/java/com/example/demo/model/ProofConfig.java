package com.example.demo.model;

public class ProofConfig {
    private int id;
    private int userId;
    private String rtspProof;
    private String webProof;

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

    public String getRtspProof() {
        return rtspProof;
    }

    public void setRtspProof(String rtspProof) {
        this.rtspProof = rtspProof;
    }

    public String getWebProof() {
        return webProof;
    }

    public void setWebProof(String webProof) {
        this.webProof = webProof;
    }
}
