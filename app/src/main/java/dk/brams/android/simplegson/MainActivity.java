package dk.brams.android.simplegson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private final static String JSON1 = "{ NAME: \"Albert Attard\", " +
                                        "P_LANGUAGES:\"Java\", " +
                                        "OST: 5,"+
                                        "LOCATION: \"MALTA\"" + "}";
    private final static String JSON2 = "{ NAME: \"Albert Attard\", " +
            "P_LANGUAGES:\"Java\", " +
            "OST: 5,"+
            "LOCATION: \"MALTA\", " +
            "EXAM: [{" +
            "   SUBJECT: \"Programming\", "+
            "   GRADE:   4.5" + "}, {" +
            "   SUBJECT: \"Debugging\", "+
            "   GRADE:   4.8}]" +
            "}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parse(JSON2);
    }



    public void parse( String jsonString)  {
        Gson gson = new GsonBuilder().create();
        Person p = gson.fromJson(jsonString, Person.class);
        Log.d(TAG, "GSON Output p: "+p);
    }
}
