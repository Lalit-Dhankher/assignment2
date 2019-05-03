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


public class EighthFragment extends Fragment {
    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_eighth,container,false);
        return view;
    }

    public static EighthFragment newInstance(String text) {
        EighthFragment eighthFragment = new EighthFragment();
        Bundle b = new Bundle();
        b.putString("msg", text);

        eighthFragment.setArguments(b);
        return eighthFragment;
    }
}
