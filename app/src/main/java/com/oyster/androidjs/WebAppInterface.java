package com.oyster.androidjs;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by 85224 on 2017-08-08.
 *  출처: http://202psj.tistory.com/923 [알레폰드의 IT 이모저모]

 */

public class WebAppInterface {


    Context mContext;
    /** Instantiate the interface and set the context */
    WebAppInterface(Context c) {
        mContext = c;
    }
    /** Show a toast from the web page */
    @JavascriptInterface
    public void showToast(String toast) {

        new AlertDialog.Builder(mContext)
                //		.setIcon(R.drawable.naver)
                .setMessage("나는 팝업창입니다. 냠냠 " + toast)
                .setNegativeButton("네", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(mContext, "open", Toast.LENGTH_SHORT).show();
                    }
                })
                .setPositiveButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(mContext, "close", Toast.LENGTH_SHORT).show();
                    }
                }).show();

    }


}
