package live.page.chen.first.settings;

import android.app.UiModeManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceManager;
import androidx.preference.SwitchPreferenceCompat;

import live.page.chen.first.R;
import live.page.chen.first.utils.Fx;

public class SettingsFragment extends PreferenceFragmentCompat {

    public UiModeManager uiManager;

    public void setUiManager(UiModeManager uiManager) {
        this.uiManager = uiManager;
    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.settings_application, rootKey);
        UiModeManager uiManager = (UiModeManager) getContext().getSystemService(Context.UI_MODE_SERVICE);

        SwitchPreferenceCompat darkmode = findPreference("nightMode");
        darkmode.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                uiManager.setNightMode(darkmode.isChecked() ?
                        UiModeManager.MODE_NIGHT_YES :
                        UiModeManager.MODE_NIGHT_NO
                );
                return true;
            }
        });

    }

    private void testPrefs() {

    }

}
