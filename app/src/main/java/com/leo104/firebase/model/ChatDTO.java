package com.leo104.firebase.model;


public class ChatDTO {

    private String userName;
    private String message;
    private String imageUri;

    private String userPrimary;

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    private Long timestamp;

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public ChatDTO() {}

    public String getUserPrimary() {
        return userPrimary;
    }

    public void setUserPrimary(String userPrimary) {
        this.userPrimary = userPrimary;
    }

    public ChatDTO(String userPrimary, String userName, String message,String imageUri) {
        this.userPrimary = userPrimary;
        this.userName = userName;
        this.message = message;
        this.imageUri = imageUri;
    }



    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public String getMessage() {
        return message;
    }}
