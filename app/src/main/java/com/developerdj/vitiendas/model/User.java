package com.developerdj.vitiendas.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class User implements Serializable {

    private String id;
    private String username;
    private String name;
    @SerializedName("last_name")
    private String lastName;
    private String email;
    private String cellphone;
    private String img;
    private String ci;
    private String sex;
    @SerializedName("birth_date")
    private String birthDate;
    private String occupation;
    private String phone;
    @SerializedName("person_cod")
    private String personCod;
    @SerializedName("seller_cod")
    private String sellerCod;
    @SerializedName("api_token")
    private String apiToken;
    private String status;

    private String branchOffice;
    private String warehouse;
    private int promotions;

    public User() {
    }

    public User(String id, String username, String name, String lastName, String email, String img, String apiToken, String branchOffice, String warehouse) {
        this.id = id;
        this.username=username;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.img = img;
        this.apiToken = apiToken;
        this.branchOffice = branchOffice;
        this.warehouse = warehouse;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPersonCod() {
        return personCod;
    }

    public void setPersonCod(String personCod) {
        this.personCod = personCod;
    }

    public String getSellerCod() {
        return sellerCod;
    }

    public void setSellerCod(String sellerCod) {
        this.sellerCod = sellerCod;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBranchOffice() {
        return branchOffice;
    }

    public void setBranchOffice(String branchOffice) {
        this.branchOffice = branchOffice;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public int getPromotions() {
        return promotions;
    }

    public void setPromotions(int promotions) {
        this.promotions = promotions;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", img='" + img + '\'' +
                ", ci='" + ci + '\'' +
                ", sex='" + sex + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", occupation='" + occupation + '\'' +
                ", phone='" + phone + '\'' +
                ", personCod='" + personCod + '\'' +
                ", sellerCod='" + sellerCod + '\'' +
                ", apiToken='" + apiToken + '\'' +
                ", status='" + status + '\'' +
                ", branchOffice='" + branchOffice + '\'' +
                ", warehouse='" + warehouse + '\'' +
                ", promotions=" + promotions +
                '}';
    }
}
