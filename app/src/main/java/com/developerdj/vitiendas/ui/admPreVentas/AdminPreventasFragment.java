package com.developerdj.vitiendas.ui.admPreVentas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.bumptech.glide.Glide;
import com.developerdj.vitiendas.R;
import com.developerdj.vitiendas.ui.home.HomeViewModel;

public class AdminPreventasFragment extends Fragment {

    private AdminPreventasViewModel adminPreventasViewModel;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        adminPreventasViewModel =
                ViewModelProviders.of(this).get(AdminPreventasViewModel.class);
        View root = inflater.inflate(R.layout.fragment_preventas, container, false);

        adminPreventasViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}
