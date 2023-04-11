package com.example.moncvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Experience> experiences= new ArrayList<Experience>();
        experiences.add(new Experience("Septembre 2022", "Aujourd'hui", "La Poste", "alternant en développement web"));
        experiences.add(new Experience("Octobre 2021", "Décembre 2021", "Alexandre Gaillot", "Stage développement web"));
        experiences.add(new Experience("Août 2020", "Septembre 2020", "Adexo", "Distribution de publicité"));
        experiences.add(new Experience("Septembre 2018", "Juillet 2020", "WARNING", "Chauffeur livreur"));
        experiences.add(new Experience("février 2018", "Mars 2018", "Tessi Service", "Distribution de courrier"));
        experiences.add(new Experience("Septembre 2017", "Décembre 2017", "SEVE", "Dessinateur Industriel"));

        ListView listViewExperiences= findViewById(R.id.listViewExperiences);
        ExperienceBaseAdapter experienceAdapter= new ExperienceBaseAdapter(experiences, this);
        listViewExperiences.setAdapter(experienceAdapter);


        ArrayList<Formation> formations = new ArrayList<Formation>();
        formations.add(new Formation("2022", "Certificat développeur web et web mobile (bac +2)", "Développement d'application web et mobile en Php"));
        formations.add(new Formation("2017", "BTS CPI (bac +2)", "BTS Conception de Produit Industriels"));
        formations.add(new Formation("2015", "Bac STI2D", "Bac STI2D option ITECH"));

        ListView listViewFormations= findViewById(R.id.listViewFormations);
        FormationBaseAdapter formationAdapter= new FormationBaseAdapter(formations, this);
        listViewFormations.setAdapter(formationAdapter);

        Button button= findViewById(R.id.buttonCompetence);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivities();
            }
        });
    }

    private void switchActivities(){
        Intent intent = new Intent(this, CompetenceActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        Intent intent= new Intent(this, CompetenceActivity.class);
        startActivity(intent);
    }
}