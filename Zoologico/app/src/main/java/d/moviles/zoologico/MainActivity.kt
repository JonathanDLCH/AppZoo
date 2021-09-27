package d.moviles.zoologico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAguila.setOnClickListener {
            startActivity(Intent(this,Aguila::class.java))
        }
        btnLobo.setOnClickListener {
            startActivity(Intent(this,Lobo::class.java))
        }
        btnOso.setOnClickListener {
            startActivity(Intent(this,Oso::class.java))
        }
        btnElefante.setOnClickListener {
            startActivity(Intent(this,Elefante::class.java))
        }
        btnDelfin.setOnClickListener {
            startActivity(Intent(this,Delfin::class.java))
        }
        btnTortuga.setOnClickListener {
            startActivity(Intent(this,Tortuga::class.java))
        }


    }
}