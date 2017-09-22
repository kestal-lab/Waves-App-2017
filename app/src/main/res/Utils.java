import com.google.firebase.database.DatabaseReference;

/**
 * Created by aryan on 22/9/17.
 */

public class Utils {
    private static DatabaseReference mDatabase;

    public static FirebaseDatabase getDatabase() {
        if (mDatabase == null) {
            mDatabase = FirebaseDatabase.getInstance();
            mDatabase.setPersistenceEnabled(true);
        }
        return mDatabase;
    }

}