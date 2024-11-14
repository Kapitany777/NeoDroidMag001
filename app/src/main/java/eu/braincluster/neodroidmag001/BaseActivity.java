package eu.braincluster.neodroidmag001;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import eu.braincluster.neodroidmag001.singletons.GlobalData;

public abstract class BaseActivity extends AppCompatActivity
{
    // region Singletons
    private GlobalData globalData;
    // endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        globalData = GlobalData.getInstance();

        initializeBinding();
        initializeComponent();
    }

    public void initializeBinding()
    {
    }

    public void initializeComponent()
    {
    }

    public GlobalData getGlobalData()
    {
        return globalData;
    }
}
