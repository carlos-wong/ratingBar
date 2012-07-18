package com.carlos.test_ratingbar;


import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.support.v4.app.NavUtils;



public class MainActivity extends Activity {

	private RatingBar mSmallRatingBar;
	private RatingBar mIndicatorRatingBar;
	final String TAGS = "carlos";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
        Log.v(TAGS, "the phone dip is "+this.getResources().getDisplayMetrics().density+" and xdip is "+this.getResources().getDisplayMetrics().xdpi+" and ydip is "+this.getResources().getDisplayMetrics().ydpi);


		// We copy the most recently changed rating on to these indicator-only
		// rating bars
		mIndicatorRatingBar = (RatingBar) findViewById(R.id.indicator_ratingbar);
//		mSmallRatingBar = (RatingBar) findViewById(R.id.ratingBar1);

		// The different rating bars in the layout. Assign the listener to us.
		// ((RatingBar)findViewById(R.id.ratingbar1)).setOnRatingBarChangeListener(this);
		// ((RatingBar)findViewById(R.id.ratingbar2)).setOnRatingBarChangeListener(this);

		mIndicatorRatingBar
				.setOnRatingBarChangeListener((OnRatingBarChangeListener)new RatingBarChangeListener());
//		mSmallRatingBar
//				.setOnRatingBarChangeListener((OnRatingBarChangeListener)new RatingBarChangeListener());

	}

	private class RatingBarChangeListener implements OnRatingBarChangeListener {

		@Override
		public void onRatingChanged(RatingBar ratingBar, float rating,
				boolean fromUser) {
			final int numStars = ratingBar.getNumStars();
			Log.v(TAGS, "the numstars is"+numStars+ " crurrent is ratign is : "+ratingBar.getRating());
//			ratingBar.setRating((float) 2.5);

//			// Since this rating bar is updated to reflect any of the other
//			// rating
//			// bars, we should update it to the current values.
//			if (mIndicatorRatingBar.getNumStars() != numStars) {
//				mIndicatorRatingBar.setNumStars(numStars);
//				mSmallRatingBar.setNumStars(numStars);
//			}
//			if (mIndicatorRatingBar.getRating() != rating) {
//				mIndicatorRatingBar.setRating(rating);
//				mSmallRatingBar.setRating(rating);
//			}
//			final float ratingBarStepSize = ratingBar.getStepSize();
//			Log.v(TAGS, "the ratingBarStepSize is"+ratingBarStepSize);
//
//			if (mIndicatorRatingBar.getStepSize() != ratingBarStepSize) {
//				mIndicatorRatingBar.setStepSize(ratingBarStepSize);
//				mSmallRatingBar.setStepSize(ratingBarStepSize);
//			}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
