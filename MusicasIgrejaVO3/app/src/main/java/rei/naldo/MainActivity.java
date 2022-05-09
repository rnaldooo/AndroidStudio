package rei.naldo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import rei.naldo.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    WebView webHtmlClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }

        webHtmlClass = (WebView) findViewById(R.id.webview);
        WebSettings ws = webHtmlClass.getSettings();
        ws.setJavaScriptEnabled(true);

        webHtmlClass.loadUrl("file:///android_asset/igreja.html");
    }


}
