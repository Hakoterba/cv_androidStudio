package com.example.moncvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CompetenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competences);

        ArrayList<Langage> langages= new ArrayList<Langage>();
        langages.add(new Langage("PHP", 4));
        langages.add(new Langage("Symfony", 4));
        langages.add(new Langage("Javascript", 3));

        ListView listViewLangages= findViewById(R.id.listViewLangages);
        LangageBaseAdapter adapter= new LangageBaseAdapter(langages, this);
        listViewLangages.setAdapter(adapter);


        ArrayList<Projet> projet = new ArrayList<Projet>();
        projet.add(new Projet("J'ai pas mis de projet sur mon github", "J'ai juste mis mon lien", "https://github.com/Hakoterba"));

        ListView listViewProjets= findViewById(R.id.listViewProjets);
        ProjetBaseAdapter projetAdapter= new ProjetBaseAdapter(projet, this);
        listViewProjets.setAdapter(projetAdapter);
    }
}