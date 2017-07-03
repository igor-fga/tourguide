package com.example.android.tourguide;

import android.os.Bundle;
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
        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager());

        // Sete o adapter no view pager
        viewPager.setAdapter(adapter);
    }
}
