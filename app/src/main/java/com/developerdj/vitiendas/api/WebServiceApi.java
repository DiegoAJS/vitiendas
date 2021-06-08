package com.developerdj.vitiendas.api;

import com.developerdj.vitiendas.model.Cliente;
import com.developerdj.vitiendas.model.Login;
import com.developerdj.vitiendas.model.Respuesta;
import com.developerdj.vitiendas.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface WebServiceApi {

    @POST("api/v1/auth/login")
    Call<Respuesta<User>> login(@Body Login login);

    //clientes
    @GET("")
    Call<Respuesta<List<Cliente>>> getClientes(@Header("Authorization") @)
}
