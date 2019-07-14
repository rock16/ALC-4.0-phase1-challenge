package com.hfad.alc4phase1challenge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALCActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        } else{
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new SSLTolerantWebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://andela.com/alc/");
    }

    private class SSLTolerantWebViewClient extends WebViewClient {
        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            handler.proceed();
        }
    }
}
