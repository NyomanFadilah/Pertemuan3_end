package com.nyoman.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MenuHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_home);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_home);
    }

    protected void onStart(){
        super.onStart();
        Toast.makeText(context this,text "Aplikasi Dimulai", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeTextcontext this,text "Aplikasi Berhenti", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(context this,text "Aplikasi Mengulang", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(context this,text "Aplikasi Sedang Melanjutkan", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(context this,text "Aplikasi Sedang Berhenti Sebentar", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(context this,text "Aplikasi Sedang Dihancurkan", Toast.LENGTH_SHORT).show();
    }
}