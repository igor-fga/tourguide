package com.example.android.tourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Sete o conteúdo da activity para usar o arquivo de layout activity_main.xml
        setContentView(R.layout.activity_main);

        // Ache o view pager que habilitará o usuário a deslizar entre fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Crie um adapter que saiba qual fragment deve ser mostrado em cada página
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        // Sete o adapter no view pager
        viewPager.setAdapter(adapter);

        // Ache o layout da aba que mostra as abas
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // Conecte o layout da aba com o view pager. Isto irá
        //   1. Atualizar o layout da aba quando o view pager for deslizado
        //   2. Atualizar o view pager quando uma aba for selecionada
        //   3. Definir os nomes da aba do layout da aba com os títulos do adapter do view pager
        //      chamando onPageTitle()
        tabLayout.setupWithViewPager(viewPager);
    }
}
