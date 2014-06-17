package com.aureus.ceegpredictor;
import android.content.Context;
import android.webkit.WebView;

import com.aureus.ceegpredictor.R;


public class GifWebView extends WebView {

	public GifWebView (Context c, String path) {
		super(c);
		loadUrl(path);
	}
}

