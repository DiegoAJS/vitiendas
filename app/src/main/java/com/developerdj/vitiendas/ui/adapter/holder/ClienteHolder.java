package com.developerdj.vitiendas.ui.adapter.holder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.developerdj.vitiendas.R;
import com.developerdj.vitiendas.model.Cliente;
import com.developerdj.vitiendas.ui.adapter.interfaces.ItemClickListener;

public class ClienteHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    private TextView tv_razonsocial_holder_cliente, tv_categoria_holder_cliente, tv_ciudad_holder_cliente, tv_zona_holder_cliente,
            tv_direccion_holder_cliente, tv_numero_holder_cliente, tv_email_holder_cliente;
    private ItemClickListener listener;

    public ClienteHolder(View v, ItemClickListener listener){
        super(v);

        tv_razonsocial_holder_cliente = (TextView)v.findViewById(R.id.tv_razonsocial_holder_cliente);
        tv_categoria_holder_cliente = (TextView)v.findViewById(R.id.tv_categoria_holder_cliente);
        tv_ciudad_holder_cliente = (TextView)v.findViewById(R.id.tv_ciudad_holder_cliente);;
        tv_zona_holder_cliente  = (TextView)v.findViewById(R.id.tv_zona_holder_cliente);
        tv_direccion_holder_cliente = (TextView)v.findViewById(R.id.tv_direccion_holder_cliente);
        tv_numero_holder_cliente = (TextView)v.findViewById(R.id.tv_numero_holder_cliente);
        tv_email_holder_cliente = (TextView)v.findViewById(R.id.tv_email_holder_cliente);

        this.listener = listener;
        v.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        listener.onItemClick(v, getAdapterPosition());
    }

    public void bindData(Context context, Cliente cliente){
        tv_razonsocial_holder_cliente.setText(cliente.getRazonSocial());
        tv_categoria_holder_cliente.setText(cliente.getCategoria());
        tv_ciudad_holder_cliente.setText(cliente.getCiudad());
        tv_zona_holder_cliente.setText(cliente.getZona());
        tv_direccion_holder_cliente.setText(cliente.getDireccion());
        tv_numero_holder_cliente.setText(cliente.getCelular());
        tv_email_holder_cliente.setText(cliente.getCorreo());
    }
}
