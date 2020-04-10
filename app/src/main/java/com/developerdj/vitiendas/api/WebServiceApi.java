package com.developerdj.vitiendas.api;

import com.developerdj.vitiendas.model.Login;
import com.developerdj.vitiendas.model.Respuesta;
import com.developerdj.vitiendas.model.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface WebServiceApi {

    @POST("api/v1/auth/login")
    Call<Respuesta<User>> login(@Body Login login);
}
