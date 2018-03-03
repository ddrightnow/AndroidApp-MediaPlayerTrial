package com.example.android.mediaplayertria;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

//    mediaPlayer.stop();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         mediaPlayer = MediaPlayer.create(this,R.raw.dusk_till_dawn);
        //final MediaPlayer

//        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.malice);
//        mediaPlayer.start();

//        public final void play(){
//        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.malice);
//            mediaPlayer.start();
//    }

        TextView a = (TextView) findViewById(R.id.start);

        a.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

//                Toast.makeText(MainActivity.this,"Play",Toast.LENGTH_SHORT).show();
               mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mediaPlayer.release();

                        //Toast.makeText(MainActivity.this, "Finished", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(this,play);
//                startActivity(intent);
                    }});
            }
        });

        TextView b = (TextView) findViewById(R.id.stop);

        b.setOnClickListener(new View.OnClickListener() {
         //   MediaPlayer mediaPlayer = MediaPlayer.create(R.raw.malice);

            @Override
            public void onClick(View view) {

             mediaPlayer.pause();

//                Intent intent = new Intent(this, mediaPlayer.stop());
//                startActivity(intent);
            }
        });


    }
}
