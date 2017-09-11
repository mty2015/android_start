package hongfuli.github.com.androidstart;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by lihongfu on 17/9/8.
 */

public class SurfaceViewCourseActivity extends Activity implements SurfaceHolder.Callback {
    private SurfaceView mSurfaceView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.surfaceview_course_layout);

        mSurfaceView = (SurfaceView) findViewById(R.id.surface_view);
        mSurfaceView.getHolder().addCallback(this);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

        System.out.println("============= surfaceCreated" + this);
        Canvas canvas = holder.lockCanvas();
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        canvas.drawLine(0, 0, 100, 100, paint);
        holder.unlockCanvasAndPost(canvas);
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        System.out.println("=============== surfaceChanged " + format + " == " + width  + "===" + height);

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

        System.out.println("============= surfaceClosed");
    }
}
