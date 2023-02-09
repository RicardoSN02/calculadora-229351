package mx.itson.edu.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var boton0: Button = findViewById(R.id.button0)
        var boton1: Button = findViewById(R.id.button1)
        var boton2: Button = findViewById(R.id.button2)
        var boton3: Button = findViewById(R.id.button3)
        var boton4: Button = findViewById(R.id.button4)
        var boton5: Button = findViewById(R.id.button5)
        var boton6: Button = findViewById(R.id.button6)
        var boton7: Button = findViewById(R.id.button7)
        var boton8: Button = findViewById(R.id.button8)
        var boton9: Button = findViewById(R.id.button9)
        var botonResultado: Button = findViewById(R.id.buttonResultado)
        var botonDel: Button = findViewById(R.id.buttonDelete)
        var botonSumar: Button = findViewById(R.id.buttonSuma)
        var botonRestar: Button = findViewById(R.id.buttonResta)
        var botonMultiplicar: Button = findViewById(R.id.buttonMultiplicar)
        var botonDividir: Button = findViewById(R.id.buttonDividir)
        var txtArriba: TextView = findViewById(R.id.textViewArriba)
        var txtAbajo: TextView = findViewById(R.id.textViewAbajo)

        boton0.setOnClickListener{
            txtAbajo.setText(txtAbajo.text.toString()+'0')
        }

        boton1.setOnClickListener{
            txtAbajo.setText(txtAbajo.text.toString()+'1')
        }

        boton2.setOnClickListener{
            txtAbajo.setText(txtAbajo.text.toString()+'2')
        }

        boton3.setOnClickListener{
            txtAbajo.setText(txtAbajo.text.toString()+'3')
        }

        boton4.setOnClickListener{
            txtAbajo.setText(txtAbajo.text.toString()+'4')
        }

        boton5.setOnClickListener{
            txtAbajo.setText(txtAbajo.text.toString()+'5')
        }

        boton6.setOnClickListener{
            txtAbajo.setText(txtAbajo.text.toString()+'6')
        }

        boton7.setOnClickListener{
            txtAbajo.setText(txtAbajo.text.toString()+'7')
        }

        boton8.setOnClickListener{
            txtAbajo.setText(txtAbajo.text.toString()+'8')
        }

        boton9.setOnClickListener{
            txtAbajo.setText(txtAbajo.text.toString()+'9')
        }

        botonResultado.setOnClickListener{
            var operador: Char = txtArriba.text.toString().last()
            var numero: String = txtArriba.text.toString().dropLast(1)
            var numeroArriba: Float = numero.toFloat()
            var numeroAbajo: Float = txtAbajo.text.toString().toFloat()

            var resultado: Float = 0f
            when (operador) {
                '+' -> resultado = numeroArriba+numeroAbajo
                '-' -> resultado = numeroArriba-numeroAbajo
                '/' -> resultado = numeroArriba/numeroAbajo
                '*' -> resultado = numeroArriba*numeroAbajo
                else->{ // Note the block
                    txtArriba.setText("error")
                    txtAbajo.setText("switch")
                }
            }

            txtAbajo.setText(resultado.toString())
            txtArriba.setText("")
        }

        botonDel.setOnClickListener{
             txtAbajo.setText("")
             txtArriba.setText("")
        }

        botonSumar.setOnClickListener {
            if (txtArriba.text.toString().equals("", true)) {
                txtArriba.setText(txtAbajo.text.toString() + '+')
                txtAbajo.setText("")
            } else {
                botonResultado.performClick()

                txtArriba.setText(txtAbajo.text.toString()+'+')
                txtAbajo.setText("")
            }
        }

        botonDividir.setOnClickListener{
            if(txtArriba.text.toString().equals("",true)){
                txtArriba.setText(txtAbajo.text.toString()+'/')
                txtAbajo.setText("")
            }else{
                botonResultado.performClick()
                txtArriba.setText(txtAbajo.text.toString()+'/')
                txtAbajo.setText("")
            }
        }

        botonRestar.setOnClickListener{
            if(txtArriba.text.toString().equals("",true)){
                txtArriba.setText(txtAbajo.text.toString()+'-')
                txtAbajo.setText("")
            }else{
                botonResultado.performClick()
                txtArriba.setText(txtAbajo.text.toString()+'-')
                txtAbajo.setText("")
            }
        }

        botonMultiplicar.setOnClickListener{
            if(txtArriba.text.toString().equals("",true)){
                txtArriba.setText(txtAbajo.text.toString()+'*')
                txtAbajo.setText("")
            }else{
                botonResultado.performClick()
                txtArriba.setText(txtAbajo.text.toString()+'*')
                txtAbajo.setText("")

            }
        }


    }
}