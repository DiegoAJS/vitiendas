package com.developerdj.vitiendas;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.developerdj.vitiendas.data.SharedPrefManager;
import com.developerdj.vitiendas.model.User;
import com.developerdj.vitiendas.ui.signin.SignInActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private TextView tvNombreApellido,tvUsername;
    private ImageView ivImg;

    private AppBarConfiguration mAppBarConfiguration;
    private User user;

    public static void createInstance(Context context) {
        Intent intent = getLaunchIntent(context);
        context.startActivity(intent);
    }

    public static Intent getLaunchIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)setAction("Action", null).show();
                SharedPrefManager.getInstance(getApplicationContext()).logOut();finish();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_caja, R.id.nav_clientes, R.id.nav_pre_ventas,
                R.id.nav_stock_producto, R.id.nav_mis_ventas)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        settingView();
        isLogin();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void settingView(){
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        View headerView = navigationView.getHeaderView(0);
        tvNombreApellido = (TextView) headerView.findViewById(R.id.tv_nav_header_title);
        tvUsername = (TextView) headerView.findViewById(R.id.tv_nav_header_subtitle);
        ivImg = (ImageView) headerView.findViewById(R.id.iv_icon_user);
    }

    public void isLogin(){

        if (SharedPrefManager.getInstance(this).isLoggedIn()) {
            user = SharedPrefManager.getInstance(this).getUser();
            Log.d("TAG1",user.toString());
            updateView();
        }else {
            SignInActivity.createInstance(this);
            finish();
        }
    }

    public void updateView(){
        tvNombreApellido.setText(user.getName()+" "+user.getLastName());
        tvUsername.setText("< "+user.getUsername()+" >");
        Glide.with(this)
                .load(user.getImg())
                .into(ivImg);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SharedPrefManager.getInstance(this).logOut();
    }
}
