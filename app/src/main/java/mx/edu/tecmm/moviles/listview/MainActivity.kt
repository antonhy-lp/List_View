package mx.edu.tecmm.moviles.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    var lugares = arrayOf("Tequila","Amatitan","La Venta","Arenal","Guadalajara",
        "Tala","Magdalena","San Andres","Santa Teresa","Hostotipaquillo","Santa Lusia","Santiaguito")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var textView: TextView
        textView = findViewById(R.id.textView)

        var listView: ListView =
            findViewById(R.id.list_view_lugares)

        val adaptador = ArrayAdapter(this,R.layout.list_item,lugares)

        listView.adapter = adaptador

        listView.onItemClickListener = object: AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?,
                                        p1: View?, pos: Int,
                                        p3: Long) {

                //Escuchar
                val item =
                    listView.getItemAtPosition(pos)
                as String
                Log.e("ListViewEvento", item)
                textView.text = item
            }


            }


        }
        }