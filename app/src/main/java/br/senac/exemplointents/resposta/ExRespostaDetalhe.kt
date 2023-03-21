package br.senac.exemplointents.resposta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exemplointents.R
import br.senac.exemplointents.databinding.ActivityExExtrasDetalheBinding
import br.senac.exemplointents.databinding.ActivityExRespostaBinding
import br.senac.exemplointents.databinding.ActivityExRespostaDetalheBinding

class ExRespostaDetalhe : AppCompatActivity() {
    lateinit var binding: ActivityExRespostaDetalheBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExRespostaDetalheBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonGuerreiro.setOnClickListener {
            responder("guerreiro")

        }

        binding.buttonArqueiro.setOnClickListener {
            responder("arqueiro")
        }

        binding.buttonLadrao.setOnClickListener {
            responder("ladrao")

        }

        binding.buttonMago.setOnClickListener {
            responder("mago")

        }
    }

    fun responder(classe: String){
        val respoIntent = Intent()

        respoIntent.putExtra("classe", classe)
        setResult(RESULT_OK, respoIntent)

        finish()
    }
}