package com.zhoujian.abstractfactory.factory;

import android.content.Context;

import com.zhoujian.abstractfactory.bean.SmsSend;
import com.zhoujian.abstractfactory.impl.Provider;
import com.zhoujian.abstractfactory.impl.Sender;

/**
 * Created by zhoujian on 2016/12/1.
 */

public class SmsSendFatory  implements Provider
{

    private Context mContext;

    public SmsSendFatory(Context mContext)
    {
        this.mContext = mContext;
    }

    @Override
    public Sender produde()
    {
        return new SmsSend(mContext);
    }
}
