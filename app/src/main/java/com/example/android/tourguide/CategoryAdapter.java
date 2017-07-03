package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ifgan on 02/07/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    /** Contexto do aplicativo */
    private Context mContext;

    /**
     * Crie um novo {@link CategoryAdapter} objeto.
     *
     * @param context é o contexto do aplicativo
     * @param fm é o fragment manager que manterá cada estado do fragmento no adapter ao longo de swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Returna o {@link Fragment} que deve ser mostrado para o dado número de página.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantFragment();
        } else if (position == 1) {
            return new BarFragment();
        } else if (position == 2) {
            return new BaladasFragment();
        } else {
            return new PasseiosFragment();
        }
    }

    /**
     * Retorna o número total de páginas.
     */
    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.restaurantes);
        } else if (position == 1) {
            return mContext.getString(R.string.bares);
        } else if (position == 2) {
            return mContext.getString(R.string.baladas);
        } else {
            return mContext.getString(R.string.passeios);
        }
    }

}
