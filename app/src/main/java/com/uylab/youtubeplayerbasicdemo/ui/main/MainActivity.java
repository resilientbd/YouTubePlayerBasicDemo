package com.uylab.youtubeplayerbasicdemo.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.uylab.youtubeplayerbasicdemo.R;
import com.uylab.youtubeplayerbasicdemo.databinding.ActivityMainBinding;
import com.uylab.youtubeplayerbasicdemo.ui.base.BaseActivity;
import com.uylab.youtubeplayerbasicdemo.util.AppConstraints;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements YouTubePlayer.OnInitializedListener {
ActivityMainBinding mainBinding;

    @Override
    protected void startUI() {
        mainBinding= (ActivityMainBinding) getViewDataBinding();
        mainBinding.youtubeplayerview.initialize(AppConstraints.ApiKey.API_KEY,this);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        Log.d("chk","success");
        //youTubePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.CHROMELESS);
        youTubePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.MINIMAL);
        //youTubePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);
       // youTubePlayer.cueVideo("AzsiE44Lz_w");
//        List<String> videos=new ArrayList<>();
//        videos.add("AzsiE44Lz_w");
//        videos.add("aPkg2XnEmCQ");
//        videos.add("bp0AHQooVSY");
//        videos.add("0f_hewSrAH4");
//        videos.add("ompevuR1644");
       //cueVideos(videolist,index to start, start time at)
       // youTubePlayer.cueVideos(videos,2,0);
       // youTubePlayer.seekToMillis(500);
        youTubePlayer.cuePlaylist("PLw-VjHDlEOgtCjYJB1r1EkZ-AKlYv6Ozj",0,0);

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Log.d("chk","failed!");
    }
}
