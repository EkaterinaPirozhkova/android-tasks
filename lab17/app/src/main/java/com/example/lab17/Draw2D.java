package com.example.lab17;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class Draw2D extends View {

    private Paint mPaint = new Paint();
    private Rect mRect = new Rect();
    private Bitmap mBitmap;

    public Draw2D(Context context) {
        super(context);
        Resources res = this.getResources();
        mBitmap = BitmapFactory.decodeResource(res, R.drawable.cat);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        int width = canvas.getWidth();
        int height = canvas.getHeight();

        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.WHITE);
        canvas.drawPaint(mPaint);

        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.YELLOW);
        canvas.drawCircle(width - 110, 110, 100, mPaint);

        mPaint.setColor(Color.GREEN);
        canvas.drawRect(0, height - 150, width, height, mPaint);

        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        mPaint.setTextSize(50);
        canvas.drawText("Лужайка только для котов", 0, height - 150, mPaint);

        int x = width - 170;
        int y = 190;
        mPaint.setColor(Color.GRAY);
        mPaint.setTextSize(35);
        String str2rotate = "Лучик солнца!";
        canvas.save();
        canvas.rotate(-45, x + mRect.exactCenterX(), y + mRect.exactCenterY());
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawText(str2rotate, x - 250, y, mPaint);
        canvas.restore();
        @SuppressLint("DrawAllocation") Bitmap resizedBitmap = Bitmap.createScaledBitmap(
                mBitmap, 500, 300, false);
        canvas.drawBitmap(resizedBitmap, width - resizedBitmap.getWidth() + 20,
                height - resizedBitmap.getHeight() - 80, mPaint);
    }
}
