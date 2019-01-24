package ir.mftvanak.mftsundays;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TestDatabase extends SQLiteOpenHelper {

    String TABLE_NAME = "students";

    String createTable = "" +

            "CREATE TABLE " + TABLE_NAME
            + "("
            + ""
            + "_id INTEGER PRIMARY KEY AUTOINCREMENT,"
            + "name TEXT,"
            + "family TEXT,"
            + "grade INTEGER"
            + ""
            + ")";

    public TestDatabase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    void insertToDB(String name, String family, int grade) {

        String insertIntoDb = ""
                + "INSERT INTO " + TABLE_NAME + "( name , family , grade )"
                + "VALUES (" + "'" + name + "'"
                + "," + "'" + family + "'"
                + "," + grade
                + ")"
                + "";

        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(insertIntoDb);

        db.close();
    }


    public String getStudentsNames() {
        String names = "";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT name from " + TABLE_NAME, null);

        while (cursor.moveToNext()){
           names += cursor.getString(0) + "\n";
        }

        db.close();
        return names;
    }
}
