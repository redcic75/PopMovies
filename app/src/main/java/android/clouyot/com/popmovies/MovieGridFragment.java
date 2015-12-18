package android.clouyot.com.popmovies;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class MovieGridFragment extends Fragment {

    public MovieGridFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_movie_grid, container, false);

        GridView mGridView = (GridView) rootView.findViewById(R.id.movie_grid_view);
        mGridView.setAdapter(new ImageAdapter(getContext()));

        return rootView;
    }
}


