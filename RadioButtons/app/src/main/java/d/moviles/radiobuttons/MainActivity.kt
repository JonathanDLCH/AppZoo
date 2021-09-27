package d.moviles.radiobuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declarar dos objetos para su uso
        val visitar: Button = findViewById(R.id.btnVisitar)
        val imgV = findViewById<ImageView>(R.id.imgPrincipal)
        val text:TextView = findViewById(R.id.txtDescripcion)

        //RadioButton
        val rdgroup:RadioGroup = findViewById(R.id.rGroup)
        val btn1:RadioButton = findViewById(R.id.btnAguila)
        val btn2:RadioButton = findViewById(R.id.btnLobo)
        val btn3:RadioButton = findViewById(R.id.btnOso)
        val btn4:RadioButton = findViewById(R.id.btnElefante)
        val btn5:RadioButton = findViewById(R.id.btnDelfin)
        val btn6:RadioButton = findViewById(R.id.btnTortuga)

        val principal = animalesZoo("Seleccione una opcion",R.drawable.zoo)
        val aguila = animalesZoo("Águila es el nombre dado a las aves de presa, del orden de Accipitriformes, (o Falconiformes acorde a una clasificación anterior),familia Accipitridae, subfamilia Buteoninae. Pertenecen a varios géneros, los cuales están sujetos a una reclasificación más adecuada puesto que los expertos no llegan a una opinión consensuada.\n Las águilas se caracterizan principalmente por su gran tamaño, constitución robusta, cabeza y pico pesados. Las diversas especies y subespecies de águilas pueden encontrarse en casi cualquier parte del mundo excepto en la Antártida. ",R.drawable.aguila)
        val lobo = animalesZoo("El lobo (Canis lupus) es una especie de mamífero placentario del orden de los carnívoros. El perro doméstico (Canis familiaris) se consideraba miembro de la misma especie según distintos indicios, la secuencia del ADN y otros estudios genéticos.Hoy en día se considera una especie distinta.\n El primer registro fósil data de hace ochocientos mil años. Antaño los lobos fueron abundantes y se distribuían por Norteamérica y Eurasia.\n Actualmente, por una serie de razones relacionadas con el hombre, los lobos habitan únicamente en una muy limitada porción del que antes fue su territorio.",R.drawable.lobo)
        val oso = animalesZoo("Los osos o úrsidos (Ursidae) son una familia de mamíferos omnívoros. Son animales de gran tamaño, generalmente omnívoros ya que, a pesar de su temible dentadura, comen frutos, raíces e insectos, además de carne.\n Con sus pesados cuerpos y sus poderosas mandíbulas, los osos se encuentran entre los mayores carnívoros que viven en la Tierra. ",R.drawable.oso)
        val elefante = animalesZoo("Los elefantes o elefántidos (Elephantidae) son una familia de mamíferos placentarios del orden Proboscidea. Antiguamente se clasificaban, junto con otros mamíferos de piel gruesa, en el orden, ahora inválido, de los paquidermos (Pachydermata).\n Existen hoy en día tres especies y diversas subespecies. Entre los géneros extintos de esta familia destacan los mamuts.",R.drawable.elefante)
        val delfin = animalesZoo("Los delfines (Delphinidae), llamados también delfines oceánicos para distinguirlos de los platanistoideos o delfines de río, son una familia de cetáceos odontocetos muy heterogénea, que comprende 37 especies actuales. Miden entre 2 y 8 metros de largo, con el cuerpo fusiforme y la cabeza de gran tamaño, el hocico alargado y solo un espiráculo en la parte superior de la cabeza (orificio respiratorio que muchos animales marinos tienen como contacto del aire o agua con su sistema respiratorio interno). Son carnívoros estrictos.\n Están entre las especies más inteligentes que habitan en el planeta. Se encuentran relativamente cerca de las costas y a menudo interactúan con el ser humano. ",R.drawable.delfin2)
        val tortuga = animalesZoo("Las tortugas o quelonios (Testudines) forman un orden de reptiles (Sauropsida) caracterizados por tener un tronco ancho y corto, y un caparazón que protege los órganos internos de su cuerpo. Son el grupo de reptiles más antiguo que existe ya que perdura desde el periodo Triásico.\nLa característica más importante del esqueleto de las tortugas es que una gran parte de su columna vertebral está soldada a la parte dorsal del caparazón. El esqueleto hace que la respiración sea imposible por movimiento de la caja torácica; se realiza principalmente por la contracción de los músculos abdominales modificados que funcionan de modo análogo al diafragma de los mamíferos y por movimientos de bombeo de la faringe. ",R.drawable.tortuga)

        //Creamos lista mutable
        var lista_animales:MutableList<animalesZoo> = mutableListOf()

        lista_animales.add(aguila)
        lista_animales.add(lobo)
        lista_animales.add(oso)
        lista_animales.add(elefante)
        lista_animales.add(delfin)
        lista_animales.add(tortuga)
        lista_animales.add(principal)

        btnVisitar.setOnClickListener {
            var indice:Int = 6
            val opcionRg:Int = rdgroup.checkedRadioButtonId
            when(opcionRg){
                btn1.id ->{indice=0}
                btn2.id ->{indice=1}
                btn3.id ->{indice=2}
                btn4.id ->{indice=3}
                btn5.id ->{indice=4}
                btn6.id ->{indice=5}
                else->{
                    indice=6
                    Toast.makeText(this,"Seleccione una opcion",Toast.LENGTH_LONG).show()
                }
            }
            imgV.setImageResource(lista_animales[indice].img)
            text.setText(lista_animales[indice].txt)

        }
    }
}

data class animalesZoo(val txt:String,val img:Int)