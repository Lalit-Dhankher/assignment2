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

public class FirstFragment extends Fragment {
    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first,container,false);
        return view;
    }

    public static FirstFragment newInstance(String text) {
        FirstFragment firstFragment = new FirstFragment();
        Bundle b = new Bundle();
        b.putString("msg", text);

        firstFragment.setArguments(b);
        return firstFragment;
    }
}