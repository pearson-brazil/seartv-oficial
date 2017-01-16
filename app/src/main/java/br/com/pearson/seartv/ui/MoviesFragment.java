package br.com.pearson.seartv.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import br.com.pearson.seartv.R;
import br.com.pearson.seartv.model.Movie;
import butterknife.Bind;
import butterknife.ButterKnife;

public class MoviesFragment extends Fragment {

    private Context context;

    @Bind(R.id.lst_movies)
    RecyclerView lstMovies;

    private MoviesAdapter moviesAdapter;
    private ArrayList<Movie> movies;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.context = getContext();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movies, container, false);
        ButterKnife.bind(this, view);

        fillInformation();

        return view;
    }

    private void fillInformation() {
        movies = new ArrayList();
        addMockedMovies(movies);
        moviesAdapter = new MoviesAdapter(context, movies);

        lstMovies.setAdapter(moviesAdapter);
        lstMovies.setItemAnimator(new DefaultItemAnimator());
        lstMovies.setLayoutManager(new LinearLayoutManager(getActivity()));
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
