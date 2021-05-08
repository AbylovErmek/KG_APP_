package geektech.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerActivity extends AppCompatActivity {
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        initRecycler();
    }

    private void initRecycler(){
        rv = findViewById(R.id.recycler);
        Adapter adapter = new Adapter();
        rv.setAdapter(adapter);
        adapter.addItem(new Model("1", "Clock", "Bishkek", System.currentTimeMillis()));
        adapter.addItem(new Model("2", "Clock", "Batken", System.currentTimeMillis()));
        adapter.addItem(new Model("3", "Clock", "Ysyk-Kol", System.currentTimeMillis()));
        adapter.addItem(new Model("4", "Clock", "Osh", System.currentTimeMillis()));
        adapter.addItem(new Model("5", "Clock", "Djalal-Abad", System.currentTimeMillis()));
    }
}