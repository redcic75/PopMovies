package android.clouyot.com.popmovies;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieGridFragment extends Fragment {

    public MovieGridFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        List<String> movieList = new ArrayList<String>(Arrays.asList(
                "Le bonheur est dans le pré",
                "Armaggedon",
                "La vie est belle",
                "Suits",
                "Pour un dollar de plus"));

        ArrayAdapter<String> mMovieGridAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_movie,
                R.id.list_item_movie_element,
                movieList
        );

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_movie_grid, container, false);

        GridView mGridView = (GridView) rootView.findViewById(R.id.movie_grid_view);
        mGridView.setAdapter(mMovieGridAdapter);

        return rootView;
    }
}


