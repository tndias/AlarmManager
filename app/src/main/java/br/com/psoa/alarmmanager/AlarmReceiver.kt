package br.com.psoa.alarmmanager

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.widget.Toast

/**
 * Created by logonrm on 17/02/2018.
 */
class AlarmReceiver  : BroadcastReceiver(){

    lateinit var mp : MediaPlayer;

    override fun onReceive(context: Context?, intent: Intent?) {
        val i = Intent(context, MeuServico::class.java)
        i.putExtra("teste", "oi")
        context?.startService(i)
    }
}