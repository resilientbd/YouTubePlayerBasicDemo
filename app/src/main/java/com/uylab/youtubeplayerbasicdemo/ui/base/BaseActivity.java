package com.uylab.youtubeplayerbasicdemo.ui.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.google.android.youtube.player.YouTubeBaseActivity;

public abstract class BaseActivity extends YouTubeBaseActivity {
    ViewDataBinding viewDataBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewDataBinding= DataBindingUtil.setContentView(this,setLayoutId());
        startUI();
    }

    public ViewDataBinding getViewDataBinding() {

        return viewDataBinding;
    }

    protected abstract void startUI();

    protected abstract int setLayoutId();
}
