package org.bits_waves.waves2017.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.bits_waves.waves2017.ListItems.NowLiveItem;
import org.bits_waves.waves2017.R;

import java.util.List;

/**
 * Created by ashish on 21/10/17.
 */

public class NowLiveAdapter extends RecyclerView.Adapter<NowLiveAdapter.ViewHolder> {
    private List<NowLiveItem> listItems;
    private Context context;
    private LinearLayout rootView;


    public NowLiveAdapter(List<NowLiveItem> moviesList, Context context) {
        this.listItems = moviesList;
        this.context = context;
    }

    @Override
    public NowLiveAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.now_live_recycler, parent, false);
        return new NowLiveAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(NowLiveAdapter.ViewHolder holder, int position) {
        final NowLiveItem listItem = listItems.get(position);
        holder.Title.setText(listItem.getTitle());
        holder.Venue.setText(listItem.getVenue());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView Title;
        public TextView Venue;
        public LinearLayout linearLayout;


        public ViewHolder(View itemView) {
            super(itemView);
            Title = (TextView) itemView.findViewById(R.id.Title);
            Venue = (TextView) itemView.findViewById(R.id.Venue);
            linearLayout = itemView.findViewById(R.id.linear_lay);
        }
    }
}
