package com.example.mislugares;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;

public class  MainActivity extends ListActivity{
    public BaseAdapter adaptador;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adaptador = new MiAdaptador(this);
        /*adaptador = new ArrayAdapter<String>(this,
                R.layout.elemento_lista,
                R.id.nombre,
                Lugares.listaNombres());*/
        setListAdapter(adaptador);
    }
}

/*public class MainActivity extends ActionBarActivity {
    private Button bAcercade;
    private Button bSalir;
    private Button bVistaLugar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bAcercade = (Button) findViewById(R.id.button3);
        bAcercade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    lanzarAcercaDe(null);
            }
        });

        bSalir = (Button) findViewById(R.id.button4);
        bSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        bVistaLugar = (Button) findViewById(R.id.button2);
        bVistaLugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarVistasLugar(null);
            }
        });


        *//*if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }*//*
    }

    public void lanzarAcercaDe(View view){
        Intent i = new Intent(this, acercade.class);
        startActivity(i);
    }

    public void lanzarVistasLugar(View view){
        final EditText entrada = new EditText(this);
        entrada.setText("0");
        new AlertDialog.Builder(this).setTitle("Seleccione un lugar")
                .setMessage("Introduzca un Id")
                .setView(entrada)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        long id = Long.parseLong(entrada.getText().toString());
                        Intent i = new Intent(MainActivity.this, VistaLugar.class);
                        i.putExtra("id", id);
                        startActivity(i);
                    }})
                .setNegativeButton("Cancelar", null)
                .show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    *//**
     * A placeholder fragment containing a simple view.
     *//*
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }*/
