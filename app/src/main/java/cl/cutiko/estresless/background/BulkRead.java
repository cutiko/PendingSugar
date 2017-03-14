package cl.cutiko.estresless.background;

import android.os.AsyncTask;
import android.util.Log;

import java.util.List;

import cl.cutiko.estresless.models.Pending;

/**
 * Created by cutiko on 14-03-17.
 */

public class BulkRead extends AsyncTask<Void, Integer, String> {
    @Override
    protected String doInBackground(Void... params) {
        long start = System.currentTimeMillis();
        List<Pending> pendings = Pending.listAll(Pending.class);
        long end = System.currentTimeMillis();
        long diff = end - start;
        return String.valueOf(diff);
    }

    @Override
    protected void onPostExecute(String s) {
        Log.d("BULK_READ", s);
    }
}
