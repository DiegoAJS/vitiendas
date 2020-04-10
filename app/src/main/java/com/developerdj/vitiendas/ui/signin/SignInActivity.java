package com.developerdj.vitiendas.ui.signin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.developerdj.vitiendas.MainActivity;
import com.developerdj.vitiendas.R;
import com.developerdj.vitiendas.api.WebService;
import com.developerdj.vitiendas.api.WebServiceApi;
import com.developerdj.vitiendas.data.SharedPrefManager;
import com.developerdj.vitiendas.model.Login;
import com.developerdj.vitiendas.model.Respuesta;
import com.developerdj.vitiendas.model.User;
import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignInActivity extends AppCompatActivity {

    private Button btLogin;

    private TextInputEditText etName;
    private TextInputEditText etPassword;

    private Login login;

    public static void createInstance(Context context) {
        Intent intent = getLaunchIntent(context);
        context.startActivity(intent);
    }

    public static Intent getLaunchIntent(Context context) {
        Intent intent = new Intent(context, SignInActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        setUpView();

    }

    private void setUpView(){
        etName =(TextInputEditText)findViewById(R.id.textInputEditUsuario);
        etPassword=(TextInputEditText)findViewById(R.id.textInputEditPassword);

        btLogin = findViewById(R.id.buttonLogin);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userLogin();
            }
        });
    }

    private void userLogin(){
        String name = etName.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        if(name.isEmpty()){
            etName.setError(getResources().getString(R.string.email_error));
            etName.requestFocus();
            return;
        }

        if(password.isEmpty()){
            etPassword.setError(getResources().getString(R.string.password_error));
            etPassword.requestFocus();
            return;
        }

        if(password.length()<4){
            etPassword.setError(getResources().getString(R.string.password_error_less_than));
            etPassword.requestFocus();
            return;
        }

        login = new Login();
        login.setUsername(name);
        login.setPassword(password);
        login();
    }

    private void login(){
        Call<Respuesta<User>> call = WebService
                .getInstance()
                .createService(WebServiceApi.class)
                .login(login);

        call.enqueue(new Callback<Respuesta<User>>() {
            @Override
            public void onResponse(Call<Respuesta<User>> call, Response<Respuesta<User>> response) {
                if(response.code() == 200){
                    Respuesta<User> respuesta= response.body();
                    //getMain(respuesta.getData());
                    //Log.d("TAG1", "logeado " + respuesta.toString()+" \n"+user.toString());
                    SharedPrefManager.getInstance(getApplicationContext()).saveUser(respuesta.getData());
                    getMain();
                }else if (response.code()==404){
                    Log.d("TAG1", "Usuario no existe");
                }else{
                    Log.d("TAG1", "Error Desconocido");
                }
            }

            @Override
            public void onFailure(Call<Respuesta<User>> call, Throwable t) {
                Log.d("TAG1", "Error : " + t.getMessage().toString());
            }
        });
    }

    public void getMain(){
        MainActivity.createInstance(this);
        finish();
    }

}
