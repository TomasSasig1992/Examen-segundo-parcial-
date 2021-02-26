package com.example.regristro;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity<camponombre, campocorreo, camponumero> extends AppCompatActivity {


            camponombre=(EditTEXT) findViewById(R.id.camponombre);
            campocorreo=(EditText) findViewById(R.id.campocorreo);
            camponumero=(EditText) findViewById(R.id.camponumero);


        }
        public void Onclick(View view){
            REGISTRO(implementation);
        }
        private void REGISTRO(Object implementation) {


            Toast.makeText(getApplicationContext(),"Id Registro: "+idResultante,Toast.LENGTH_SHORT).show();
            // Import the BoM for the Firebase platform
            implementation platform('com.google.firebase:firebase-bom:26.5.0')

            // Declare the dependencies for the desired Firebase products without specifying versions
            // For example, declare the dependencies for Firebase Authentication and Cloud Firestore
            implementation 'com.google.firebase:firebase-auth'
            implementation 'com.google.firebase:firebase-firestore'
        }