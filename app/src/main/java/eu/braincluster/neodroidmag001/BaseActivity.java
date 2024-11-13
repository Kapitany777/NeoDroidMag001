package eu.braincluster.neodroidmag001;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import eu.braincluster.neodroidmag001.singletons.GlobalData;

public abstract class BaseActivity extends AppCompatActivity
{
    // region Singletons
    protected GlobalData globalData;
    // endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        globalData = GlobalData.getInstance();
    }
}
