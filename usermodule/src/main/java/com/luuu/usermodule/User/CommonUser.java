package com.luuu.usermodule.User;

/**
 * Created by luuu on 2018/2/12.
 */

public class CommonUser {

    private String userID;          //用户Id(唯一标识)
    private String userNickName;    //用户昵称
    private String userPhone;       //用户手机号(唯一标识)
    private String userEmail;       //用户邮箱(唯一标识)
    private String userName;        //用户真名
    private String userIdCard;      //用户身份证号码
    private String userSex;         //用户性别
    private String userBirthDay;    //用户出生年月日

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserIdCard() {
        return userIdCard;
    }

    public void setUserIdCard(String userIdCard) {
        this.userIdCard = userIdCard;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserBirthDay() {
        return userBirthDay;
    }

    public void setUserBirthDay(String userBirthDay) {
        this.userBirthDay = userBirthDay;
    }
}
