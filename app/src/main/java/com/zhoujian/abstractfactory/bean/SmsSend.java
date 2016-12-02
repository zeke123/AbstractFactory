package com.zhoujian.abstractfactory.bean;

import android.content.Context;
import android.widget.Toast;
import com.zhoujian.abstractfactory.impl.Sender;

/**
 * Created by zhoujian on 2016/12/1.
 *
 * 用于发送短信的类
 */

public class SmsSend implements Sender
{

    private Context mContext;


    public SmsSend(Context mContxt)
    {

        this.mContext = mContxt;
    }

    @Override
    public void send()
    {
        Toast.makeText(mContext, "发送短信", Toast.LENGTH_SHORT).show();
    }
}
