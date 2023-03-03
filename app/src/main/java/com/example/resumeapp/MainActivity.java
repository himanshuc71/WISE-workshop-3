package com.example.resumeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final String experienceText = "Inchoandum affirmabam et aliquandiu ex to ad. Aspi inge mihi sed hic qui. Infusus remanet nul creatum odoratu sum sap quomodo membris. Visione vis ignorem hic quaedam dem nul deumque invenit cognita. Si ac clarae initio fallam admisi. Patrocinio quantumvis collabitur sed agi mutationem cavillandi. Facile causam somnia sex qui summae. Nisi ex bere mali ne esto duce eo jure ii. In si in quibusdam separatum facultate vi. Ut aliquibus terminari in soliditas. \n" +
            "\n" +
            "Incedere nihilque recensui sensibus lectione im id. Ipsammet actualis quanquam rei parentes cur augeatur credimus pla via. Exempli ubi numquam mei ineunte rom exigere fictile. Spectatum simplicia im persuadet se. Vul potentiam una concursum cerebella persuasum. Theologiae attingebam si ac solutiones se necessitas ne realitatis. Clara quare culpa ii de alias. Imo duce sit illa ulla vos mea. Deo hae spero age nullo magna putat ego certi. Vi discere referam ac ab nostrae co nunquam. ";
    final String skillsText = "Technical: Java, Android Dev" +
            "\n" +
            "Soft: Leadership, teamwork";
    final String projectsText = "Realiter reperiri collecta at an in. Quodque ne im ab ex hominem usitata apertum. Tum judicium sua age automata eos quicquam. Si confirmari persuadeor praemissae satyriscos cogitantem et et. Cavillandi conjunctam credidisse de ex dissimilem gi integritas imaginandi. Examino plausum sub attendo hos.";
    final String educationText = "Simon Fraser University\nBachelors in Computer Science\nGPA - 4.0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // to hide app title bar
        getSupportActionBar().hide();
        Log.i("app", "application starting");

        setLinkedInHyperLink();
        createHeadlineSection();
        createExperienceSection();
        createSkillsSection();
        createProjectsSection();
        createEducationSection();
        Toast.makeText(this, "Let's learn how to write basic android application!", Toast.LENGTH_LONG).show();
    }

    private void setLinkedInHyperLink() {
        TextView linkedIn = findViewById(R.id.linkedIn);
        linkedIn.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void createEducationSection() {
        TextView education = findViewById(R.id.educationView);
        education.setText(educationText);
        Log.i("education", "education added");
    }

    private void createProjectsSection() {
        TextView experience = findViewById(R.id.projectsView);
        experience.setText(projectsText);
        Log.i("projects", "projects added");
    }

    private void createSkillsSection() {
        TextView experience = findViewById(R.id.skillsView);
        experience.setText(skillsText);
        Log.i("skills", "skills added");
    }

    private void createExperienceSection() {
        TextView experience = findViewById(R.id.experienceView);
        experience.setText(experienceText);
        Log.i("experience", "experience added");
    }

    private void createHeadlineSection() {
        TextView email = findViewById(R.id.email);
        TextView phoneNumber = findViewById(R.id.phoneNumber);
        phoneNumber.setText(R.string.phoneNumberText);
        email.setText(R.string.emailText);
        Log.i("headline", "headline added");
    }

    public void switchActivity(View view) {
//        Toast.makeText(this, "Let's learn how to switch activities!", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplicationContext(), OtherActivity.class);
        startActivity(intent);
        Log.i("Info", "Switch to next activity button pressed!");
    }
}