package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ifgan on 02/07/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Cria um novo {@link CategoryAdapter} objeto.
     *
     * @param fm é o fragment manager que manterá cada estado de fragment no adapter
     *           ao longo de cada deslizada.
     */
    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * Retorna o {@link Fragment} que deve ser mostrado para o dado número de página.
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

}
