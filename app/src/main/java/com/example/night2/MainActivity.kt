package com.example.night2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val vt=VeriTabaniYardimcisi(this)

        //  usersdao().kullaniciEkle(vt,"enes","enes")


        // usersdao().kullaniciGuncelle(vt,3,"kotlin","kotlin")

          val kisiListe=usersdao().tumKisiler(vt)


          for (k in kisiListe){
            Log.e("Uye id = ",(k.kullanici_id).toString())
            Log.e("Uye isim = ",k.username)
            Log.e("Uye sifre = ",k.password)
        }




    }


    }
