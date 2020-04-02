package com.developerdj.vitiendas.model;

import com.google.gson.annotations.SerializedName;

public class User extends Data {

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
    private int status;

}
