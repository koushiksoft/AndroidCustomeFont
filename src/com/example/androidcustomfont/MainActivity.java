package com.example.androidcustomfont;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	  @Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			/*
			 * Use TypeFace to custom font text! Once create instance of TypeFace
			 * then use "tv.setTypeface(tf);" all text where ever you want to use!
			 * Download font style and store into assets directory. I have created
			 * fonts directory
			 */
			Typeface typeface = Typeface.createFromAsset(getAssets(),
					"fonts/Jellyka_Estrya_Handwriting.ttf"); // Set font style
																// location

			TextView tv = (TextView) findViewById(R.id.text_view);
			tv.setTypeface(typeface);
		}
	}
