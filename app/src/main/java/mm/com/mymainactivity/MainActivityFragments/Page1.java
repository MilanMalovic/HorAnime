package mm.com.mymainactivity.MainActivityFragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import mm.com.mymainactivity.R;

public class Page1 extends Fragment {
    private View convertView;

    //constructor default
    public Page1(){};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(convertView==null) {

            convertView = inflater.inflate(R.layout.page_1, container, false);
        }
        return convertView;

    }


}
