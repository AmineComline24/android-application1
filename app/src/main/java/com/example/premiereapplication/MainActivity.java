package com.example.premiereapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleOk(View view) {
        String prenom = ((EditText) findViewById(R.id.prenom)).getText().toString();
        String nom = ((EditText) findViewById(R.id.nom)).getText().toString();
        String email = ((EditText) findViewById(R.id.email)).getText().toString();
        String naissance = ((EditText) findViewById(R.id.naissance)).getText().toString();
        String description = ((EditText) findViewById(R.id.description)).getText().toString();
        String commentaire = ((EditText) findViewById(R.id.commentaire)).getText().toString();

        String notificationMessage = "Nouveau formulaire soumis:\n" +
                "Prénom: " + prenom + "\n" +
                "Nom: " + nom + "\n" +
                "Email: " + email + "\n" +
                "Date de naissance: " + naissance + "\n" +
                "Description: " + description + "\n" +
                "Commentaire: " + commentaire;

        NotificationHelper.sendNotification(this, "Nouveau formulaire soumis", notificationMessage);
    }
}
