package com.leo104.firebase.model;

public class Message {
    private String text;  // 메시지 내용
    private String senderId;  // 발신자 ID
    private String receiverId;  // 수신자 ID
    private String type;  // 메시지 유형 (텍스트, 이미지, 비디오 등)
    private String timestamp;  // 메시지 생성 시간

    public Message(String s, String image) {}

    public Message(String text, String senderId, String receiverId, String type, String timestamp) {
        this.text = text;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.type = type;
        this.timestamp = timestamp;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}

