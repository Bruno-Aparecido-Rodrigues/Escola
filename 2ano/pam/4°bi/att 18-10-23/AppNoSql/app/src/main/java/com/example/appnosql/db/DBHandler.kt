import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.appnosql.model.CourseModel

class DBHandler // creating a constructor for our database handler.
    (context: Context?) :
    SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION) {
    // below method is for creating a database by running a sqlite query
    override fun onCreate(db: SQLiteDatabase) {
        // on below line we are creating an sqlite query and we are
        // setting our column names along with their data types.
        val query = ("CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + NAME_COL + " TEXT,"
                + ENDERECO_COL + " TEXT,"
                + BAIRRO_COL + " TEXT,"
                + CEP_COL + " TEXT,"
                + CIDADE_COL + " TEXT,"
                + ESTADO_COL + " TEXT,"
                + TELEFONE_COL + " TEXT,"
                + CELULAR_COL + " TEXT)")

        // at last we are calling a exec sql method to execute above sql query
        db.execSQL(query)
    }

    // this method is use to add new course to our sqlite database.
    fun addNewperson(
        pessoalnome: String?,
        pessoalendereco: String?,
        pessoalbairro: String?,
        pessoalcep: String?,
        pessoalcidade: String?,
        pessoalestado: String?,
        pessoaltelefone: String?,
        pessoalcelular: String?
    ) {
        // on below line we are creating a variable for
        // our sqlite database and calling writable method
        // as we are writing data in our database.
        val db = this.writableDatabase
        // on below line we are creating a
        // variable for content values.
        val values = ContentValues()
        // on below line we are passing all values
        // along with its key and value pair.
        values.put(NAME_COL, pessoalnome)
        values.put(ENDERECO_COL, pessoalendereco)
        values.put(BAIRRO_COL, pessoalbairro)
        values.put(CEP_COL, pessoalcep)
        values.put(CIDADE_COL, pessoalcidade)
        values.put(ESTADO_COL, pessoalestado)
        values.put(TELEFONE_COL, pessoaltelefone)
        values.put(CELULAR_COL, pessoalcelular)
        // after adding all values we are passing
        // content values to our table.
        db.insert(TABLE_NAME, null, values)
        // at last we are closing our
        // database after adding database.
        db.close()
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // this method is called to check if the table exists already.
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME)
        onCreate(db)
    }

    companion object {
        // creating a constant variables for our database.
        // below variable is for our database name.
        private const val DB_NAME = "coursedb"

        // below int is our database version
        private const val DB_VERSION = 1

        // below variable is for our table name.
        private const val TABLE_NAME = "mycourses"

        // below variable is for our id column.
        private const val ID_COL = "id"

        // below variable is for our course name column
        private const val NAME_COL = "nome"

        // below variable id for our course duration column.
        private const val ENDERECO_COL = "endereco"

        // below variable for our course description column.
        private const val BAIRRO_COL = "bairro"

        // below variable is for our course tracks column.
        private const val CEP_COL = "CEP"

        // below variable is for our course name column
        private const val CIDADE_COL = "cidade"

        // below variable id for our course duration column.
        private const val ESTADO_COL = "estado"

        // below variable for our course description column.
        private const val TELEFONE_COL = "telefone"

        // below variable is for our course tracks column.
        private const val CELULAR_COL = "celular"
    }

    // we have created a new method for reading all the courses.
    fun readCourses(): ArrayList<CourseModel>? {
        // on below line we are creating a database for reading our database.
        val db = this.readableDatabase

        // on below line we are creating a cursor with query to read data from database.
        val cursorpessoal: Cursor = db.rawQuery("SELECT * FROM $TABLE_NAME", null)

        // on below line we are creating a new array list.
        val pessoalModelArrayList: ArrayList<CourseModel> = ArrayList()

        // moving our cursor to first position.
        if (cursorpessoal.moveToFirst()) {
            do {
                // on below line we are adding the data from cursor to our array list.
                pessoalModelArrayList.add(
                    CourseModel(
                        cursorpessoal.getString(1),
                        cursorpessoal.getString(4),
                        cursorpessoal.getString(2),
                        cursorpessoal.getString(3)
                    )
                )
            } while (cursorpessoal.moveToNext())
            // moving our cursor to next.
        }
        // at last closing our cursor and returning our array list.
        cursorpessoal.close()
        return pessoalModelArrayList
    }
}
