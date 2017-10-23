package org.bits_waves.waves2017.Adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.bits_waves.waves2017.Activities.Category;
import org.bits_waves.waves2017.Activities.MainActivity;
import org.bits_waves.waves2017.ListItems.EventItem;
import org.bits_waves.waves2017.Activities.Events;
import org.bits_waves.waves2017.R;

import java.util.List;

/**
 * Created by aryan on 3/9/17.
 */

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder> {
    private List<EventItem> listItems;
    private Context context;
    private LinearLayout rootView;



    public EventAdapter(List<EventItem> moviesList, Context context) {
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
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final EventItem listItem = listItems.get(position);

        holder.head.setText(listItem.getHead());
        holder.desc.setText(listItem.getDesc());
        holder.event_venue.setText(listItem.getEvent_location());
        holder.event_time.setText(listItem.getEvent_time());
        holder.event_category.setText(listItem.getEvent_category());
        Picasso.with(context).load(listItem.getImageUrl()).fit().into(holder.imgViewIcon);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Events.class);
                intent.putExtra("event_name",listItem.getHead());
                intent.putExtra("event_image",listItem.getImageUrl());
                context.startActivity(intent);

            }
        });
        if(position % 2 == 0)
        {
            //holder.rootView.setBackgroundColor(Color.BLACK);
            holder.rel1.setBackgroundResource(R.color.blue_event);
            holder.linearLayout.setBackgroundResource(R.color.red_event);
        }
        else
        {
            //holder.rootView.setBackgroundColor(Color.WHITE);
            holder.rel1.setBackgroundResource(R.color.red_event);
            holder.linearLayout.setBackgroundResource(R.color.blue_event);
        }

        holder.event_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(context, Category.class);
                it.putExtra("category_heading",holder.event_category.getText().toString());
                context.startActivity(it);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView head;
        public TextView desc,event_time,event_venue,event_category;
        public LinearLayout linearLayout;
        public ImageView imgViewIcon;
        public RelativeLayout rel1;


        public ViewHolder(View itemView) {
            super(itemView);

            head = (TextView)itemView.findViewById(R.id.heading);
            desc = (TextView)itemView.findViewById(R.id.desc);
            imgViewIcon = (ImageView) itemView.findViewById(R.id.imageView2);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linear_lay);
            rel1 = (RelativeLayout) itemView.findViewById(R.id.main_rel_content);
            event_time = (TextView)itemView.findViewById(R.id.time_1);
            event_venue = (TextView)itemView.findViewById(R.id.location);
            event_category = (TextView) itemView.findViewById(R.id.category);
        }
    }
}
