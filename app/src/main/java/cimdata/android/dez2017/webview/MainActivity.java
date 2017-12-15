package cimdata.android.dez2017.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.net.URL;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    WebView browser;
    ImageButton reloadButton;
    EditText urlText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        browser = findViewById(R.id.web_acmain_browser);
        reloadButton = findViewById(R.id.btn_acmain_load);
        urlText = findViewById(R.id.etxt_acmain_url);

        reloadButton.setOnClickListener(this);

        initWebView();
        browser.loadUrl("file:///android_asset/index.html");
    }

    private void initWebView() {

        browser.setWebViewClient(new WebViewClient()); // Hier koppeln wir den Standardbrowser mit der Webview

        // Hier setzen wir ein paar Settings:
        WebSettings settings = browser.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);

    }

    @Override
    public void onClick(View v) {

        String url = String.valueOf(urlText.getText());

        // Abgleich der URL mit Whitelist, o.ä.
        // ... CODE ...

        // Anpassen der URL (prefix with http://, o.ä.)
        // ... CODE ...

        // Laden der URL mit WebView
        browser.loadUrl(url);


    }
}
