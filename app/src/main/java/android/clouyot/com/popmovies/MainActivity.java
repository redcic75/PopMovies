package android.clouyot.com.popmovies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Appeler activity_main.xml
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mettre le Fragment MovieGridFragment dans l'activité
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.main_container, new MovieGridFragment())
                    .commit();
        }
    }
}
