package rocks.ecox.droiddocs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebSettings;

/**
 * Provides UI for the view with Index.
 */
public class IndexFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater
                .inflate(R.layout.tab_index, container, false);
        WebView wv= (WebView)view.findViewById(R.id.webviewIndex);
//        WebSettings webSettings = wv.getSettings();
//        webSettings.setJavaScriptEnabled(true);
        String wvURL = "file:///android_asset/reference/packages.html";
        wv.loadUrl(wvURL);
        return view;
    }
}


