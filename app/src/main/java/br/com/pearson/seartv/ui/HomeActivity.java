package br.com.pearson.seartv.ui;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import br.com.pearson.seartv.R;

public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setHomeButton();
        setToolbarTitle(R.string.movies);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
            case R.id.about:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
