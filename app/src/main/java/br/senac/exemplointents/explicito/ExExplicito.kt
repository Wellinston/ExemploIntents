package br.senac.exemplointents.explicito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exemplointents.R
import br.senac.exemplointents.databinding.ActivityExExplicitoBinding

class ExExplicito : AppCompatActivity() {
    //late init = será inicializado quando der a condição
    lateinit var binding: ActivityExExplicitoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExExplicitoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //abrir a tela desejada
        binding.buttonIr.setOnClickListener {
            //instanciando intent
            val intent = Intent(this, ExExplicitoDetalhe::class.java)
            startActivity(intent)

        }
    }
}