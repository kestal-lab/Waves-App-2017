package org.bits_waves.waves2017;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by aryan on 3/9/17.
 */

public class RTDAdapter extends RecyclerView.Adapter<RTDAdapter.ViewHolder> {
    private List<RTDItem> listItems;
    private Context context;
    private LinearLayout rootView;


    public RTDAdapter(List<RTDItem> moviesList, Context context) {
        this.listItems = moviesList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.event_recycler, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final RTDItem listItem = listItems.get(position);
        holder.head.setText(listItem.getHead());
        holder.desc.setText(listItem.getDesc());
        Picasso.with(context).load(listItem.getImageUrl()).fit().into(holder.imgViewIcon);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Events.class);
                context.startActivity(intent);
            }
        });
        if(position % 2 == 0)
        {
            //holder.rootView.setBackgroundColor(Color.BLACK);
            holder.linearLayout.setBackgroundResource(R.color.black);
        }
        else
        {
            //holder.rootView.setBackgroundColor(Color.WHITE);
            holder.linearLayout.setBackgroundResource(R.color.white);
        }
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView head;
        public TextView desc;
        public LinearLayout linearLayout;
        public ImageView imgViewIcon;

        public ViewHolder(View itemView) {
            super(itemView);

            head = (TextView)itemView.findViewById(R.id.heading);
            desc = (TextView)itemView.findViewById(R.id.desc);
            imgViewIcon = (ImageView) itemView.findViewById(R.id.imageView2);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linear_lay);
        }
    }
}
