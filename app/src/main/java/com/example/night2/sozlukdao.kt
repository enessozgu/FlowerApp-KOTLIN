package com.example.night2

import SozlukVeriTabani
import android.content.ContentValues
import android.database.Cursor

class sozlukdao {

    fun kelimeEkle(vt:SozlukVeriTabani,turkce: String, ingilizce: String) {
        val db = vt.writableDatabase
        val values = ContentValues()
        values.put("turkce", turkce)
        values.put("ingilizce", ingilizce)
        db.insert("sozluk", null, values)
        db.close()
    }


    fun getAnlam(vt:SozlukVeriTabani,kelime: String): String? {
        val db = vt.writableDatabase
        val cursor: Cursor = db.rawQuery("SELECT ingilizce FROM sozluk WHERE turkce=?", arrayOf(kelime))
        var anlam: String? = null
        if (cursor.moveToFirst()) {
            anlam = cursor.getString(0)
        }
        cursor.close()
        db.close()
        return anlam
    }




    }





