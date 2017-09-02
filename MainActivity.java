package example.imagegallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gvDemo = (GridView) findViewById(R.id.gvDemo);

        gvDemo.setAdapter(new ImageAdapter(this));
    }
}
