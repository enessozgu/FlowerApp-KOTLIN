import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.night2.sozlukdao

abstract class SozlukVeriTabani(context: Context?) : SQLiteOpenHelper(context, "sozluk", null, 1) {

    abstract fun sozlukDao(): sozlukdao

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE sozluk (id INTEGER PRIMARY KEY AUTOINCREMENT, turkce TEXT, ingilizce TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS sozluk")
        onCreate(db)
    }
}
