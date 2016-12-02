package com.zhoujian.abstractfactory.bean;

import android.content.Context;
import android.widget.Toast;

import com.zhoujian.abstractfactory.impl.Sender;

/**
 * Created by zhoujian on 2016/12/1.
 *
 * 用于发送邮件的类
 */

public class MailSend implements Sender
{

    private Context mContext;

    public MailSend(Context mContext)
    {
        this.mContext = mContext;
    }

    @Override
    public void send()
    {
        Toast.makeText(mContext, "发送邮件", Toast.LENGTH_SHORT).show();

    }
}
