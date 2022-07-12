package com.imagen01.imagen01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		 
		 //hilo para intenciones explicitas 
        Thread thread_1 = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(4000); // dura 4 seg y llama a la siguiente activity 
                    Intent intentSplash = new Intent(getApplicationContext(), Main2Activity.class );
                    startActivity(intentSplash);
                    finish();
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        };
        thread_1.start();
    }
}
