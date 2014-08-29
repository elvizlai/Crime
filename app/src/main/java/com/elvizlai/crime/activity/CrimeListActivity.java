package com.elvizlai.crime.activity;

import android.support.v4.app.Fragment;

import com.elvizlai.crime.fragment.CrimeListFragment;

/**
 * Created by Elvizlai on 14-8-25.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
