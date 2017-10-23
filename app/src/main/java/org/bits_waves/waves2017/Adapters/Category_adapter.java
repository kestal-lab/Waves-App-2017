package org.bits_waves.waves2017.Adapters;


/**
 * Created by Keshav on 17-Oct-17.
 */


import android.content.Context;

import org.bits_waves.waves2017.Adapters.EventAdapter;
import org.bits_waves.waves2017.ListItems.EventItem;

import java.util.List;


public class Category_adapter extends EventAdapter {
    public Category_adapter(List<EventItem> moviesList, Context context) {
        super(moviesList, context);
    }
}
