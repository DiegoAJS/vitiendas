package com.developerdj.vitiendas.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.developerdj.vitiendas.R;
import com.developerdj.vitiendas.model.Cliente;
import com.developerdj.vitiendas.ui.adapter.holder.ClienteHolder;
import com.developerdj.vitiendas.ui.adapter.interfaces.ItemClickListener;
import com.developerdj.vitiendas.ui.adapter.interfaces.OnLoadMoreListener;

import java.util.List;

public class AdapterRecyclerView<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements ItemClickListener {

    private Context context;
    private List<T> items;

    OnLoadMoreListener loadMoreListener;
    boolean isLoading = false, isMoreDataAvailable = true;

    private static final int TYPE_CLIENTE = 0;


    public AdapterRecyclerView(@NonNull List<T> items, Context context) {
        this.items = items;
        this.context=context;
    }

    @Override
    public int getItemViewType(int position) {
        if (items.get(position) instanceof Cliente) {
            return TYPE_CLIENTE;
        } else
            throw new RuntimeException("ItemViewType unknown");
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        RecyclerView.ViewHolder viewHolder=null;
        switch (viewType){
            case TYPE_CLIENTE:
                viewHolder = new ClienteHolder(inflater.inflate(R.layout.holder_cliente,parent,false),this);break;


        }
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        if(position>=getItemCount()-1 && isMoreDataAvailable && !isLoading && loadMoreListener!=null){
            isLoading = true;
            loadMoreListener.onLoadMore();
        }

        if(getItemViewType(position)==TYPE_CLIENTE){
            ((ClienteHolder)holder).bindData(context,(Cliente) items.get(position));
        }

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onItemClick(View view, int position) {
        switch (getItemViewType(position))
        {
            case TYPE_CLIENTE:
                //InmuebleActivity.createInstance(context,(Propiedad) items.get(position));break;

        }
    }

    public void setMoreDataAvailable(boolean moreDataAvailable) {
        isMoreDataAvailable = moreDataAvailable;
    }

    /* notifyDataSetChanged is final method so we can't override it
         call adapter.notifyDataChanged(); after update the list
         */
    public void notifyDataChanged(){
        notifyDataSetChanged();
        isLoading = false;
    }

    public void setLoadMoreListener(OnLoadMoreListener loadMoreListener) {
        this.loadMoreListener = loadMoreListener;
    }


    //viewHolder Load
    static class LoadHolder extends RecyclerView.ViewHolder{
        public LoadHolder(View itemView) {
            super(itemView);
        }
    }

}
