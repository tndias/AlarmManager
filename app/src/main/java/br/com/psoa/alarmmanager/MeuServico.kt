package br.com.psoa.alarmmanager

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.util.Log

/**
 * Created by logonrm on 17/02/2018.
 */
class MeuServico : Service() {

    lateinit var mp : MediaPlayer

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        if(intent?.extras != null)
            Log.i("TIAGO", intent?.getStringExtra("teste"))

        mp = MediaPlayer.create(this, R.raw.alarmclock)
        mp.start()

        return START_REDELIVER_INTENT
    }


    override fun onBind(intent: Intent?): IBinder ?{
        return null
    }
}