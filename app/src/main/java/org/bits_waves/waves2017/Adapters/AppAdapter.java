package org.bits_waves.waves2017.Adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.bits_waves.waves2017.ListItems.AppItem;
import org.bits_waves.waves2017.R;

import java.util.List;

/**
 * Created by keshav on 10/9/17.
 */

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.ViewHolder> {
    private List<AppItem> listItems;
    private Context context;
    private String str;



    public AppAdapter(List<AppItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.our_team_fragement_app_card_view, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        AppItem listItem = listItems.get(position);
        holder.name.setText(listItem.getName());
        holder.email.setText(listItem.getEmail());
        holder.number.setText(listItem.getNumber());
        str=holder.number.getText().toString();
        holder.number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(context,"number",Toast.LENGTH_LONG).show();
                //String str=holder.number.getText().toString();
                Intent it=new Intent(Intent.ACTION_DIAL);
                it.setData(Uri.parse("tel:"+str));
                context.startActivity(it);


            }
        });

        Picasso.with(context).load(listItem.getImageUrl()).fit().into(holder.imgViewIcon);

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView email;
        public TextView number;
        //public LinearLayout linearLayout;
        public ImageView imgViewIcon;

        public ViewHolder(View itemView) {
            super(itemView);

            name = (TextView)itemView.findViewById(R.id.name);
            email = (TextView)itemView.findViewById(R.id.email);
            number = (TextView)itemView.findViewById(R.id.number);

            imgViewIcon = (ImageView) itemView.findViewById(R.id.imageView3);

        }
    }
}
