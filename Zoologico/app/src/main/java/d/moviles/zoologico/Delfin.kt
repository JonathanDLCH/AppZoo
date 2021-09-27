package d.moviles.zoologico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_aguila.*

class Delfin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnRegresar.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}