package com.zhoujian.abstractfactory.factory;

import android.content.Context;

import com.zhoujian.abstractfactory.bean.MailSend;
import com.zhoujian.abstractfactory.impl.Provider;
import com.zhoujian.abstractfactory.impl.Sender;

/**
 * Created by zhoujian on 2016/12/1.
 */

public class MailSendFactory  implements Provider
{

    private Context mContext;

    public MailSendFactory(Context mContext)
    {
        this.mContext= mContext;
    }

    @Override
    public Sender produde()
    {
        return new MailSend(mContext);
    }
}
