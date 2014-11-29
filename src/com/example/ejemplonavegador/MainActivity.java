package com.example.ejemplonavegador;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {

	private WebView mWebView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mWebView = (WebView) findViewById(R.id.webview);
		mWebView.loadUrl("http://www.mercadolibre.com.mx");
		WebSettings webSettings = mWebView.getSettings();
		webSettings.setJavaScriptEnabled(true);


	}

	
}
