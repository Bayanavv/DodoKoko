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
import android.view.MotionEvent;
import android.view.View;
import android.os.Handler;

public class GameView extends View {

    Handler handler;
    Runnable runnable;
    final int UPDATE_MILLIS=30;
    Bitmap background;
    Bitmap ground;
    Display display;
    Point point;
    int dWidth, dHeight;
    Rect rect;
    Bitmap[] urod;
    int urodFrame = 0;
    int velocity=0,gravity=3;
    int urodX,urodY;




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
        background = BitmapFactory.decodeResource(getResources(),R.drawable.dodokokobackgroundsolidcolor);
        ground = BitmapFactory.decodeResource(getResources(),R.drawable.dodokokoground);
        display = ((Activity)getContext()).getWindowManager().getDefaultDisplay();
        point = new Point();
        display.getSize(point);
        dWidth = point.x;
        dHeight = point.y;
        rect = new Rect(0,0,dWidth,dHeight);
        urod = new Bitmap[2];
        urod[0] = BitmapFactory.decodeResource(getResources(),R.drawable.dodokokoaccound);
        urod[1] = BitmapFactory.decodeResource(getResources(),R.drawable.dodokokoaccound2);
        urodX = dWidth/2 - urod[0].getWidth()/2;
        urodY = dHeight/2 - urod[0].getHeight()/2;


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //we"ll draw our view inside onDraw()
        //draw the background on the canvas
        //canvas.drawBitmap(background,0,0,null);
        canvas.drawBitmap(background,null,rect,null);
        if(urodFrame == 0){
            urodFrame = 1;
        }else {
            urodFrame = 0;
        }

        if(urodY < dHeight - urod[0].getHeight() || velocity < 0){//בדרך הזו המכוער לא יודר מתחת לגבולות המסך
            velocity += gravity;//כשהמכוער נופל הוא ניהיה יותר ויותר מהר כשה-velocity גדל על ידי ה gravity בכול פעם
            urodY += velocity;

        }


        //we want the urod to be displayed at the center
        //both urod[0] and urod[1], have the same dimensions
        canvas.drawBitmap(urod[urodFrame],urodX, urodY,null);
        canvas.drawBitmap(ground,0, 1320,null);

        handler.postDelayed(runnable,UPDATE_MILLIS);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        if(action == MotionEvent.ACTION_DOWN) {//that is tap detected on screen
            //here we want the bird to move upwards by some unity
            velocity = -30;
        }
        return true;//אומר שביגלל שזה נכון לא צריכים עוד שום דבר מהאנדרואיד
    }
}
