package jonalexjm.com.appcontactosbasedatos;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import jonalexjm.com.appcontactosbasedatos.adaptadores.ContactoAdaptador;
import jonalexjm.com.appcontactosbasedatos.adaptadores.PageAdapter;
import jonalexjm.com.appcontactosbasedatos.fragment.Perfil;
import jonalexjm.com.appcontactosbasedatos.fragment.RecyclerViewFragment;
import jonalexjm.com.appcontactosbasedatos.pojo.Contacto;

public class MainActivity extends AppCompatActivity {


    public ContactoAdaptador adaptador;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout= (TabLayout) findViewById(R.id.tabLayout);
        viewPager= (ViewPager) findViewById(R.id.viewPager);
        setUpViewPager();


        if(toolbar != null){
            setSupportActionBar(toolbar);
        }

        /*



*/

        /*
        GridLayoutManager glm = new GridLayoutManager(this, 2); // fnciona con grid en caso de querer utilizar otra layout se comenta estas dos lineas
        listaContactos.setLayoutManager(glm);
*/

       // inicializarListaContactos();
      //  inicializarAdaptador();


    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        //agregamos los fragments a la lista... es decir esta son las pestañas que vamos a mostrar que se mueven de lado a lado
        fragments.add(new RecyclerViewFragment());
        fragments.add(new Perfil());

        return fragments;
    }

    private void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

    }







}
