package org.bits_waves.waves2017;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.bits_waves.waves2017.R;
import org.bits_waves.waves2017.WinnerItem;

import java.util.List;

/**
 * Created by aryan on 11/7/17.
 */

public class NewWinnerAdapter extends RecyclerView.Adapter<NewWinnerAdapter.ViewHolder> {

    private List<WinnerItem> listItems;
    private Context context;

    public NewWinnerAdapter(List<WinnerItem> listItem, Context context) {
        this.listItems = listItem;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.winner_recycler, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final WinnerItem listItem = listItems.get(position);
        holder.winner_name.setText(listItem.getWin_name());
        holder.event_name.setText(listItem.getEvent_Name());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView winner_name;
        public TextView event_name;
        public LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            event_name = (TextView)itemView.findViewById(R.id.event_name);
            winner_name = (TextView)itemView.findViewById(R.id.winner_name);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linear_lay);
        }
    }
}
