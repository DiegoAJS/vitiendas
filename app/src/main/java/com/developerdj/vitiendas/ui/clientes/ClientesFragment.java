package com.developerdj.vitiendas.ui.clientes;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.developerdj.vitiendas.R;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.textfield.TextInputEditText;

public class ClientesFragment extends Fragment {

    private TextInputEditText et_textSeach;
    private Spinner sp_categoria, sp_ciudad, sp_zona;
    private TextView tv_button_buscar;
    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        setHasOptionsMenu(true);
        View root = inflater.inflate(R.layout.fragment_clientes, container, false);
        NavigationView navigationView = (NavigationView) root.findViewById(R.id.nav_filter);
        et_textSeach = (TextInputEditText)navigationView.findViewById(R.id.textInputEditSearch);
        sp_categoria = (Spinner) navigationView.findViewById(R.id.sp_categoria);
        sp_ciudad = (Spinner) navigationView.findViewById(R.id.sp_ciudad);
        sp_zona = (Spinner)navigationView.findViewById(R.id.sp_zona);
        tv_button_buscar = (TextView) navigationView.findViewById(R.id.tv_button_search);
        recyclerView = (RecyclerView) root.findViewById(R.id.recyclerView_list_clientes);

        return root;
    }

    @Override
    public void onStart() {
        super.onStart();
        loadDatos();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        // TODO Add your menu entries here
        inflater.inflate(R.menu.menu_filter, menu);
        super.onCreateOptionsMenu(menu, inflater);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_filter:
                openFilter();break;
            case R.id.action_add:
                addCliente();

        }
        return true;

    }

    private void openFilter(){
        DrawerLayout drawer = (DrawerLayout) getActivity().findViewById(R.id.filter_layout);
        if (!drawer.isDrawerOpen(GravityCompat.END)) {
            drawer.openDrawer(GravityCompat.END);
        }else
            drawer.closeDrawer(GravityCompat.END);
    }
    private void addCliente(){

    }

    public void loadDatos(){

    }
}
