package c.morgentec.assignment2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SixthFragment extends Fragment {
    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sixth,container,false);
        return view;
    }

    public static SixthFragment newInstance(String text) {
        SixthFragment sixthFragment = new SixthFragment();
        Bundle b = new Bundle();
        b.putString("msg", text);

        sixthFragment.setArguments(b);
        return sixthFragment;
    }
}