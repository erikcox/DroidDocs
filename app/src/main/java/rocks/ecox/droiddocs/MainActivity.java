package rocks.ecox.droiddocs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        Crashlytics.setString("git_sha", BuildConfig.GIT_SHA);
        setContentView(R.layout.activity_main);

        WebView wv= (WebView)findViewById(R.id.webview);
//        WebSettings webSettings = wv.getSettings();
//        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl("file:///android_asset/reference/packages.html");
    }
}
