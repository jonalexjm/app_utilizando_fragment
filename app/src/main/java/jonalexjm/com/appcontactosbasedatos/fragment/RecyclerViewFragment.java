package jonalexjm.com.appcontactosbasedatos.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import jonalexjm.com.appcontactosbasedatos.R;
import jonalexjm.com.appcontactosbasedatos.adaptadores.ContactoAdaptador;
import jonalexjm.com.appcontactosbasedatos.pojo.Contacto;

/**
 * Created by andrea on 02/07/2016.
 */
public class RecyclerViewFragment extends Fragment {

    ArrayList<Contacto> contactos;
    private RecyclerView rvContactos;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recycleview, container, false);// equivale a relacionar con el layout


        rvContactos = (RecyclerView) v.findViewById(R.id.rvContactos);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());// asi funciona con linear
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvContactos.setLayoutManager(llm);
        inicializarListaContactos();
        inicializarAdaptador();


        return v;
    }

    public void inicializarAdaptador(){
        ContactoAdaptador adaptador = new ContactoAdaptador(contactos, getActivity());
        rvContactos.setAdapter(adaptador);

    }

    public void inicializarListaContactos(){

        contactos = new ArrayList<Contacto>();


        contactos.add(new Contacto(R.drawable.linux_client_48, "john alexander jimenez", "565644444", "jonalexjm@hotmail.com"));
        contactos.add(new Contacto(R.drawable.windows_client_48, "mirian castaño", "334443343", "mrjhico@gmail.com"));
        contactos.add(new Contacto(R.drawable.mac_client_48, "cristian cepeda", "9998878776", "cristian@hotmail.com"));

    }
}
