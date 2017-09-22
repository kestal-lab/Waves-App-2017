package org.bits_waves.waves2017;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by aryan on 22/9/17.
 */
public class Utils {
    private static FirebaseDatabase mDatabase;

    public static FirebaseDatabase getDatabase() {
        if (mDatabase == null) {
            mDatabase = FirebaseDatabase.getInstance();
            mDatabase.setPersistenceEnabled(true);
        }
        return mDatabase;
    }

}