package com.example.night2

import android.content.ContentValues

class usersdao {

    fun kullaniciEkle(vt:VeriTabaniYardimcisi,username:String,password:String){

        val db=vt.writableDatabase
        val values= ContentValues()

        values.put("username",username)
        values.put("password",password)

        db.insertOrThrow("users",null,values)
        db.close()

    }


    fun kullaniciGuncelle(vt:VeriTabaniYardimcisi,kullanici_id:Int,username:String,password:String){

        val db=vt.writableDatabase
        val values= ContentValues()

        values.put("username",username)
        values.put("password",password)

        db.update("users",values,"kullanici_id=?", arrayOf(kullanici_id.toString()))
        db.close()

    }











    fun tumKisiler(vt: VeriTabaniYardimcisi): ArrayList<users> {
        val uyelerArrayList = ArrayList<users>()
        val db = vt.writableDatabase
        val cursor = db.rawQuery("SELECT * FROM users", null)

        while (cursor.moveToNext()) {
            val uye = users(
                cursor.getInt(cursor.getColumnIndex("kullanici_id")),
                cursor.getString(cursor.getColumnIndex("username")),
                cursor.getString(cursor.getColumnIndex("password"))
            )
            uyelerArrayList.add(uye) // Oluşturulan nesneyi listeye ekle
        }

        cursor.close()
        db.close()

        return uyelerArrayList
    }



    fun kullaniciGiris(vt: VeriTabaniYardimcisi, username: String, password: String): Boolean {
        val db = vt.readableDatabase
        val selection = "username = ? AND password = ?"
        val selectionArgs = arrayOf(username, password)
        val cursor = db.query("users", null, selection, selectionArgs, null, null, null)
        val count = cursor.count
        cursor.close()
        db.close()

        return count > 0 // Eğer kullanıcı varsa true, yoksa false döndürür.
    }















}
