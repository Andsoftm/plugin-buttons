package cordova.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Template extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
      if (action.equals("setFunctionKeyA")) {
            callbackContext.success("Echo: " + data.getString(0));
            return true;
        }
      else if action.equals("echo"){
        final String BROWSER_PACKAGE = "com.android.browser";
        final String BROWSER_CLASS = "com.android.browser.BrowserActivity";
        final String BROWSER = BROWSER_PACKAGE + "," + BROWSER_CLASS;

        final String FUNCTION_KEY_A_URI = "must://device/key_customize_a";
        Settings.Secure.putString(getContentResolver(), FUNCTION_KEY_A_URI, BROWSER);
      }
        else {
            return false;
        }
    }
}