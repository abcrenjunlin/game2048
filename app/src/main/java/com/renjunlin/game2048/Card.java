package com.renjunlin.game2048;

import android.content.Context;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;


public class Card extends FrameLayout {
    public Card(Context context) {
        super(context);

        lable=new TextView(getContext());
        lable.setTextSize(32);
        lable.setGravity(Gravity.CENTER);
        lable.setBackgroundColor(0x33ffffff);

        LayoutParams lp=new LayoutParams(-1,-1);
        lp.setMargins(20,20,0,0);
        addView(lable,lp);

        setNum(0);
    }

    private int num=0;

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num=num;
        if(num<=0){
            lable.setText("");
        }else{
            lable.setText(num+"");
        }
    }

    public boolean equals(Card obj) {
        return getNum()==obj.getNum();
    }

    private TextView lable;
}
