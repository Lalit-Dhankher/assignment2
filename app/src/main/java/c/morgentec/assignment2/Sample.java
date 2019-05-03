package c.morgentec.assignment2;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;


public class Sample extends FragmentActivity {

        TabLayout tlSample;
        ViewPager vpSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        tlSample=findViewById(R.id.tlSample);
        vpSample=findViewById(R.id.vpSample);

        tlSample.setupWithViewPager(vpSample);

        vpSample.setAdapter(new SampleAdapter(this, getSupportFragmentManager()));

//        tlSample.setupWithViewPager(vpSample);
//// addOnPageChangeListener event change the tab on slide
//        vpSample.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tlSample));
//        return view;


    }
}
