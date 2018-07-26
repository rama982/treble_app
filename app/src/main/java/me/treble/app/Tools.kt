package me.treble.app

import android.content.Context
import android.media.AudioManager
import android.os.SystemProperties

object Tools {
    lateinit var audioManager: AudioManager
    val vendorFp = SystemProperties.get("ro.vendor.build.fingerprint")

    fun startup(ctxt: Context) {
        audioManager = ctxt.getSystemService(AudioManager::class.java)
    }
}