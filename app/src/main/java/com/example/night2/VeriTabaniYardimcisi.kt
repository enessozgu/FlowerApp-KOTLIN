package com.example.night2

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class VeriTabaniYardimcisi(context: Context) :SQLiteOpenHelper(context,"users",null,1){
    companion object {
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "kullanici_db"
        private const val TABLE_NAME = "kullanici"
        private const val KEY_ID = "id"
        private const val KEY_NAME = "isim"
        private const val KEY_PASSWORD = "sifre"
    }




    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE users (kullanici_id INTEGER PRIMARY KEY AUTOINCREMENT"+",username TEXT,password TEXT );")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS users")
        onCreate(db)
    }

    fun addUser(name: String, password: String): Long {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(KEY_NAME, name)
        contentValues.put(KEY_PASSWORD, password)
        val id = db.insert(TABLE_NAME, null, contentValues)
        db.close()
        return id
    }




    fun kontrol(vt: VeriTabaniYardimcisi,name: String): users? {
        val db = vt.writableDatabase
        val cursor = db.query(

            VeriTabaniYardimcisi.TABLE_NAME,
            arrayOf(
                VeriTabaniYardimcisi.KEY_ID,
                VeriTabaniYardimcisi.KEY_NAME,
                VeriTabaniYardimcisi.KEY_PASSWORD
            ),
            "${VeriTabaniYardimcisi.KEY_NAME} = ?",
            arrayOf(name),
            null,
            null,
            null,
            null
        )

        var kullanici: users? = null

        if (cursor.moveToFirst()) {
            val id = cursor.getInt(cursor.getColumnIndex("kullanici_id"))
            val kullaniciAdi = cursor.getString(cursor.getColumnIndex("username"))
            val sifre = cursor.getString(cursor.getColumnIndex("password"))
            kullanici = users(id, kullaniciAdi, sifre)
        }

        cursor.close()
        return kullanici
    }








}