package bayanavv.dodokoko.dodokoko;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.os.Handler;

public class GameView extends View {

    Handler handler;
    Runnable runnable;
    final int UPDATE_MILLIS=30;
    Bitmap background;
    Display display;
    Point point;
    int dWidth, dHeight;
    Rect rect;

    //this is our custom View Class
    public GameView(Context context) {
        super(context);
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                invalidate();//this will can on Draw
            }
        };
        background = BitmapFactory.decodeResource(getResources(),R.drawable.dodokokobackground2);
        display = ((Activity)getContext()).getWindowManager().getDefaultDisplay();
        point = new Point();
        display.getSize(point);
        dWidth = point.x;
        dHeight = point.y;
        rect = new Rect(0,0,dWidth,dHeight);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //we"ll draw our view inside onDraw()
        //draw the background on the canvas
        //canvas.drawBitmap(background,0,0,null);
        canvas.drawBitmap(background,null,rect,null);
        handler.postDelayed(runnable,UPDATE_MILLIS);
    }
}
