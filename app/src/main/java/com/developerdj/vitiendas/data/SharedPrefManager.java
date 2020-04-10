package com.developerdj.vitiendas.data;

import android.content.Context;
import android.content.SharedPreferences;

import com.developerdj.vitiendas.model.User;

public class SharedPrefManager {

    private static final String SHARED_PREFERENCES = "SHARED_PREFERENCES";
    private static final String SHARED_PREFERENCES_ID = "SHARED_PREFERENCES_ID";
    private static final String SHARED_PREFERENCES_USER_NAME = "SHARED_PREFERENCES_USER_NAME";
    private static final String SHARED_PREFERENCES_NAME = "SHARED_PREFERENCES_NAME";
    private static final String SHARED_PREFERENCES_LAST_NAME = "SHARED_PREFERENCES_LAST_NAME";
    private static final String SHARED_PREFERENCES_EMAIL = "SHARED_PREFERENCES_EMAIL";
    private static final String SHARED_PREFERENCES_IMG = "SHARED_PREFERENCES_IMG";

    private static final String SHARED_PREFERENCES_API_TOKEN = "SHARED_PREFERENCES_API_TOKEN";

    private static final String SHARED_PREFERENCES_BRANCHOFFICE="SHARED_PREFERENCES_BRANCHOFFICE";
    private static final String SHARED_PREFERENCES_WAREHOUSE="SHARED_PREFERENCES_WAREHOUSE";

    private static SharedPrefManager instance;
    private Context context;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    private SharedPrefManager(Context context){
        this.context = context;
        sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public static synchronized SharedPrefManager getInstance(Context context){
        if(instance == null){
            instance = new SharedPrefManager(context);
        }
        return instance;
    }

    public void saveUser(User user){
        editor.putString(SHARED_PREFERENCES_ID, user.getId());
        editor.putString(SHARED_PREFERENCES_USER_NAME, user.getUsername());
        editor.putString(SHARED_PREFERENCES_NAME, user.getName());
        editor.putString(SHARED_PREFERENCES_LAST_NAME, user.getLastName());
        editor.putString(SHARED_PREFERENCES_EMAIL, user.getEmail());
        editor.putString(SHARED_PREFERENCES_IMG, user.getImg());

        editor.putString(SHARED_PREFERENCES_API_TOKEN,user.getApiToken());
        editor.putString(SHARED_PREFERENCES_BRANCHOFFICE,user.getBranchOffice());
        editor.putString(SHARED_PREFERENCES_WAREHOUSE,user.getWarehouse());
        editor.apply();
    }

    public boolean isLoggedIn(){
        if(sharedPreferences.getString(SHARED_PREFERENCES_ID, null)!=null){
            return true;
        }
        return false;
    }

    public User getUser(){
        User user = new User(
                sharedPreferences.getString(SHARED_PREFERENCES_ID, null),
                sharedPreferences.getString(SHARED_PREFERENCES_USER_NAME, null),
                sharedPreferences.getString(SHARED_PREFERENCES_NAME, null),
                sharedPreferences.getString(SHARED_PREFERENCES_LAST_NAME, null),
                sharedPreferences.getString(SHARED_PREFERENCES_EMAIL, null),
                sharedPreferences.getString(SHARED_PREFERENCES_IMG, null),
                sharedPreferences.getString(SHARED_PREFERENCES_API_TOKEN, null),
                sharedPreferences.getString(SHARED_PREFERENCES_BRANCHOFFICE, null),
                sharedPreferences.getString(SHARED_PREFERENCES_WAREHOUSE, null)
        );
        return user;
    }

    public void logOut(){
        editor.clear();
        editor.apply();
    }
}
