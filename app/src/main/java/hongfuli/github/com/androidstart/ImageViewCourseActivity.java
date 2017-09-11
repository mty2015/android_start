package hongfuli.github.com.androidstart;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by lihongfu on 17/9/7.
 */

public class ImageViewCourseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ImageView imageView = new ImageView(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(400, 400);
        imageView.setLayoutParams(layoutParams);


        Bitmap bitmap = Bitmap.createBitmap(400, 400, Bitmap.Config.ARGB_8888);

        Paint paint = new Paint();
        paint.setColor(Color.RED);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawLine(0, 0, 100, 100, paint);
//        getResources().getDrawable(R.drawable.notice, null).draw(canvas);
        Bitmap lBit = BitmapFactory.decodeResource(getResources(), R.drawable.liumm);
        canvas.drawBitmap(lBit, null, new Rect(0, 0, 400, 400), null);


//        imageView.setImageDrawable(getResources().getDrawable(R.drawable.liumm, null));
//        canvas.drawBitmap(lBit, 0, 0, null);

        imageView.setImageBitmap(bitmap);

        setContentView(imageView);
    }
}
