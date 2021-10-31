package live.page.chen.first.settings;

import android.app.UiModeManager;
import android.os.Bundle;

import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.SwitchPreferenceCompat;

import live.page.chen.first.R;

public class SettingsFragment extends PreferenceFragmentCompat {
    public UiModeManager uiManager;

    public SettingsFragment(UiModeManager uiManager) {
        this.uiManager = uiManager;
    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.settings_application, rootKey);
        SwitchPreferenceCompat darkmode = findPreference("nightMode");
        darkmode.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                uiManager.setNightMode(UiModeManager.MODE_NIGHT_YES);
                return true;
            }
        });

    }
}
