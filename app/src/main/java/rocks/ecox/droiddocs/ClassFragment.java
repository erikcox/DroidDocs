package rocks.ecox.droiddocs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebSettings;

/**
 * Provides UI for the view with Attributes.
 */
public class ClassFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater
                .inflate(R.layout.tab_class, container, false);
        WebView wv= (WebView)view.findViewById(R.id.webviewClass);
//        WebSettings webSettings = wv.getSettings();
//        webSettings.setJavaScriptEnabled(true);
        String wvURL = "file:///android_asset/reference/classes.html";
        wv.loadUrl(wvURL);
        return view;
    }
}


