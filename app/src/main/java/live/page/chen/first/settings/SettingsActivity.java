package live.page.chen.first.settings;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import live.page.chen.first.R;

public class SettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
        UiModeManager uiManager = (UiModeManager) getSystemService(Context.UI_MODE_SERVICE);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.settings, new SettingsFragment(uiManager))
                .commit();

    }

}