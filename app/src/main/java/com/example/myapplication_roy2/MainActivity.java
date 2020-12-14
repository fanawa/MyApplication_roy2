package com.example.myapplication_roy2;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;

//public class MainActivity extends AppCompatActivity implements YouTubePlayer.OnInitializedListener {
public class MainActivity extends AppCompatActivity {


    public static final String API_KEY = "AIzaSyDkrp_fr1QDU0C0EApK4Rhzt6ejKxrflUw";
    public static final String API_KEY2 = "AIzaSyCmS-gc83nVmJ7jNN7w9yPbGyEqcRdFHqM";
    public static final String API_KEY3 = "AIzaSyC3l0Lg5WF0wrvkm6aHzy2GZEkGPn03zf0";
    public static final String API_KEY4 = "AIzaSyAJ77vDsBTCXGAFWA8uQeZikOpYmvu_CJo";
    public static final String VIDEO_ID = "CQ6dbUmU__o";          //video1
    public static final String VIDEO_ID2 = "bMirF_WKEQA";         //video2
    public static final String VIDEO_ID3 = "zZECV1OYzL0";         //video3
    public static final String VIDEO_ID4 = "" +
            "";         //video4

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("log", "onCreate");

        //video1
        YouTubePlayerFragment youTubePlayerFragment = (YouTubePlayerFragment) getFragmentManager()
                .findFragmentById(R.id.youtubeplayerfragment);

        youTubePlayerFragment.initialize
                (
                        API_KEY,
                        new YouTubePlayer.OnInitializedListener() {
                            @Override
                            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION |
                                        YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);

                                if (!wasRestored) {
                                    youTubePlayer.cueVideo(VIDEO_ID);
                                    //                                    youTubePlayer.cueVideo(VIDEO_ID2);

                                    Log.i("log", "onInitializationSuccess");
                                }
                            }

                            @Override
                            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult error) {
                                final int REQUEST_CODE = 1;

                                if (error.isUserRecoverableError()) {
                                    error.getErrorDialog(MainActivity.this, REQUEST_CODE).show();
                                } else {
                                    String errorMessage = String.format("There was an error initializing the YoutubePlayer (%1$s)", error.toString());
                                    Toast.makeText(MainActivity.this, errorMessage, Toast.LENGTH_LONG).show();
                                }
                            }
                        }
                );
        //video1 ここまで


        //video2
        YouTubePlayerFragment youTubePlayerFragment2 = (YouTubePlayerFragment) getFragmentManager()
                .findFragmentById(R.id.youtubeplayerfragment2);

        youTubePlayerFragment2.initialize
                (
                        API_KEY2,
                        new YouTubePlayer.OnInitializedListener() {
                            @Override
                            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION |
                                        YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);

                                if (!wasRestored) {
                                    youTubePlayer.cueVideo(VIDEO_ID2);

                                    Log.i("log", "onInitializationSuccess2");
                                }
                            }

                            @Override
                            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult error) {
                                final int REQUEST_CODE = 1;

                                if (error.isUserRecoverableError()) {
                                    error.getErrorDialog(MainActivity.this, REQUEST_CODE).show();
                                } else {
                                    String errorMessage = String.format("There was an error initializing the YoutubePlayer (%1$s)", error.toString());
                                    Toast.makeText(MainActivity.this, errorMessage, Toast.LENGTH_LONG).show();
                                }
                            }
                        }
                );
        //video2 ここまで


        //video3
        YouTubePlayerFragment youTubePlayerFragment3 = (YouTubePlayerFragment) getFragmentManager()
                .findFragmentById(R.id.youtubeplayerfragment3);

        youTubePlayerFragment3.initialize
                (
                        API_KEY3,
                        new YouTubePlayer.OnInitializedListener() {
                            @Override
                            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION |
                                        YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);

                                if (!wasRestored) {
                                    youTubePlayer.cueVideo(VIDEO_ID3);

                                    Log.i("log", "onInitializationSuccess3");
                                }
                            }

                            @Override
                            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult error) {
                                final int REQUEST_CODE = 1;

                                if (error.isUserRecoverableError()) {
                                    error.getErrorDialog(MainActivity.this, REQUEST_CODE).show();
                                } else {
                                    String errorMessage = String.format("There was an error initializing the YoutubePlayer (%1$s)", error.toString());
                                    Toast.makeText(MainActivity.this, errorMessage, Toast.LENGTH_LONG).show();
                                }
                            }
                        }
                );
        //video3　ここまで

        //video4
        YouTubePlayerFragment youTubePlayerFragment4 = (YouTubePlayerFragment) getFragmentManager()
                .findFragmentById(R.id.youtubeplayerfragment4);

        youTubePlayerFragment4.initialize
                (
                        API_KEY4,
                        new YouTubePlayer.OnInitializedListener() {
                            @Override
                            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION |
                                        YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);

                                if (!wasRestored) {
                                    youTubePlayer.cueVideo(VIDEO_ID4);

                                    Log.i("log", "onInitializationSuccess4");
                                }
                            }

                            @Override
                            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult error) {
                                final int REQUEST_CODE = 1;

                                if (error.isUserRecoverableError()) {
                                    error.getErrorDialog(MainActivity.this, REQUEST_CODE).show();
                                } else {
                                    String errorMessage = String.format("There was an error initializing the YoutubePlayer (%1$s)", error.toString());
                                    Toast.makeText(MainActivity.this, errorMessage, Toast.LENGTH_LONG).show();
                                }
                            }
                        }
                );
        //video4　ここまで

    }



    //[[メニューバー]] p280
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_bar, menu);

        Log.i("log", "onCreateOptionsMenu");

        return true;
    }

    //
    //    @Override
    //    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
    //
    //        switch (item.getItemId()) {
    //            case R.id.top:
    //                Intent i = new Intent(getApplication(), WebActivity.class);
    //                startActivity(i);
    //                break;
    //
    //            case R.id.store:
    //                Intent i2 = new Intent(getApplication(), StoreActivity.class);
    //                startActivity(i2);
    //                break;
    //
    //            case R.id.contact:
    //                Intent i3 = new Intent(getApplication(), ContactActivity.class);
    //                startActivity(i3);
    //                break;
    //        }
    //
    //        Log.i("log", "onCreateOptionsItemSelected");
    //
    //        return true;
    //   }
}
