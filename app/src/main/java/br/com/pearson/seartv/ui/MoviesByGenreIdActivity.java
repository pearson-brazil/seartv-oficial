package br.com.pearson.seartv.ui;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;

import br.com.pearson.seartv.R;
import br.com.pearson.seartv.model.Movie;
import butterknife.Bind;

public class MoviesByGenreIdActivity extends BaseActivity {

    @Bind(R.id.lst_movies)
    RecyclerView lstMovies;

    private Context context;
    private ArrayList<Movie> movies;
    private MoviesAdapter moviesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_by_genre_id);

        this.context = this;
        setHomeButton();

        fillInformation();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    private void fillInformation() {
        movies = new ArrayList();
        addMockedMovies(movies);
        moviesAdapter = new MoviesAdapter(context, movies);

        lstMovies.setAdapter(moviesAdapter);
        lstMovies.setItemAnimator(new DefaultItemAnimator());
        lstMovies.setLayoutManager(new LinearLayoutManager(this));
    }

    private void addMockedMovies(ArrayList<Movie> movies) {
        Movie movie = new Movie();
        movie.setOriginal_title("Whiplash");
        movie.setTitle("Whiplash");
        movie.setVote_average(7.8);
        movies.add(movie);

        Movie movie2 = new Movie();
        movie2.setOriginal_title("Whiplash 2");
        movie2.setTitle("Whiplash 2");
        movie2.setVote_average(6.8);
        movies.add(movie2);

        Movie movie3 = new Movie();
        movie3.setOriginal_title("Whiplash 3");
        movie3.setTitle("Whiplash 3");
        movie3.setVote_average(7.8);
        movies.add(movie3);

        Movie movie4 = new Movie();
        movie4.setOriginal_title("Whiplash 4");
        movie4.setTitle("Whiplash 4");
        movie4.setVote_average(6.8);
        movies.add(movie4);
    }
}
