package dumyprojects.com.userdetails.helperClasses;

import java.net.URI;

/**
 * Created by lenovo on 8/30/2018.
 */

public class GetterClass {

String status;
String result;
int mu_Id;
String mu_Name;
String mu_Email_Id;
int mu_MobileNo;
String mu_PersonalEmail;
String mu_ProfileImage;
int mu_UserType;
Boolean mu_IsActive;
Boolean mu_IsDeleted;
String mu_PartyCode;
String mu_UserRole;


    public GetterClass(String status, String result) {
        this.status = status;
        this.result= result;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getResult() {
        return result;
    }

    public GetterClass(int mu_Id, String mu_Name, String mu_Email_Id, int mu_MobileNo, String mu_PersonalEmail, String mu_ProfileImage, int mu_UserType, Boolean mu_IsActive, Boolean mu_IsDeleted, String mu_PartyCode, String mu_UserRole) {
        this.mu_Id = mu_Id;
        this.mu_Name = mu_Name;
        this.mu_Email_Id = mu_Email_Id;
        this.mu_MobileNo = mu_MobileNo;
        this.mu_PersonalEmail = mu_PersonalEmail;
        this.mu_ProfileImage = mu_ProfileImage;
        this.mu_UserType = mu_UserType;
        this.mu_IsActive = mu_IsActive;
        this.mu_IsDeleted = mu_IsDeleted;
        this.mu_PartyCode = mu_PartyCode;

        this.mu_UserRole = mu_UserRole;
    }

    public int getMu_Id() {
        return mu_Id;
    }

    public String getMu_Name() {
        return mu_Name;
    }

    public String getMu_Email_Id() {
        return mu_Email_Id;
    }

    public int getMu_MobileNo() {
        return mu_MobileNo;
    }

    public String getMu_PersonalEmail() {
        return mu_PersonalEmail;
    }

    public String getMu_ProfileImage() {
        return mu_ProfileImage;
    }

    public int getMu_UserType() {
        return mu_UserType;
    }

    public Boolean getMu_IsActive() {
        return mu_IsActive;
    }

    public Boolean getMu_IsDeleted() {
        return mu_IsDeleted;
    }

    public String getMu_PartyCode() {
        return mu_PartyCode;
    }

    public String getMu_UserRole() {
        return mu_UserRole;
    }
}
