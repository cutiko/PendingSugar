package cl.cutiko.estresless.background;

import android.os.AsyncTask;
import android.util.Log;

import cl.cutiko.estresless.models.Pending;

/**
 * Created by cutiko on 14-03-17.
 */

public class BulkCreate extends AsyncTask<Void, Integer, String> {


    @Override
    protected String doInBackground(Void... params) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            Pending pending = new Pending();
            pending.setName(String.valueOf(i));
            pending.setDone(false);
            pending.save();
        }

        long end = System.currentTimeMillis();
        long diff = end - start;
        return String.valueOf(diff);
    }

    @Override
    protected void onPostExecute(String s) {
        Log.d("BULK_INSERT", s);
    }
}
