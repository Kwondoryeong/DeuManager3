package com.example.deumanager3;


import androidx.fragment.app.Fragment;
import androidx.appcompat.app.ActionBar;
import android.view.MenuItem;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class ToolBarFragment extends Fragment {

    ActionBar actionBar;

    public void setToolbar() {
        actionBar = ((MainActivity) getActivity()).getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true); // 뒤로가기 버튼, 디폴트로 true만 해도 백버튼이 생김
        // actionBar.setHomeAsUpIndicator(R.drawable.arrow); //뒤로가기 버튼을 본인이 만든 아이콘으로 하기 위해 필요
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item ) {
        return super.onOptionsItemSelected(item);
    }
}
