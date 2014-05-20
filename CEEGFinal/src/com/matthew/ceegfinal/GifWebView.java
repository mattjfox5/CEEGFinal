package com.matthew.ceegfinal;
import android.content.Context;
import android.webkit.WebView;


public class GifWebView extends WebView {

	public GifWebView (Context c, String path) {
		super(c);
		loadUrl(path);
	}
}

