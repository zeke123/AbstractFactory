package com.zhoujian.abstractfactory.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.zhoujian.abstractfactory.R;
import com.zhoujian.abstractfactory.factory.MailSendFactory;
import com.zhoujian.abstractfactory.factory.SmsSendFatory;
import com.zhoujian.abstractfactory.impl.Sender;
import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 抽象工厂模式：
 工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，
 这违背了闭包原则，所以，从设计角度考虑，有一定的问题，如何解决？
 就用到抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，
 不需要修改之前的代码

 */


public class MainActivity extends Activity {

    @InjectView(R.id.bt_send_mail)
    Button mBtSendMail;
    @InjectView(R.id.bt_send_sms)
    Button mBtSendSms;
    private Sender mSender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        clickEvent();
    }

    private void clickEvent()
    {

        mBtSendMail.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                MailSendFactory mailSendFactory = new MailSendFactory(MainActivity.this);
                mSender = mailSendFactory.produde();
                mSender.send();
            }
        });

        mBtSendSms.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                SmsSendFatory mSmsSendFatory= new SmsSendFatory(MainActivity.this);
                mSender = mSmsSendFatory.produde();
                mSender.send();
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
