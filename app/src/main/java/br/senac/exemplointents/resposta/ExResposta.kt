package br.senac.exemplointents.resposta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exemplointents.R
import br.senac.exemplointents.databinding.ActivityExRespostaBinding

class ExResposta : AppCompatActivity() {
    lateinit var binding: ActivityExRespostaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExRespostaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonIr.setOnClickListener {
            val i = Intent(this, ExRespostaDetalhe::class.java)
            startActivityForResult(i, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 1 && resultCode == RESULT_OK && data != null) {
           val classe = data.getStringExtra("classe")

            when(classe) {
                "guerreiro" -> {
                    binding.buttonIr.text = "Classe: Guerreiro"
                    binding.buttonIr.setBackgroundColor(getColor(R.color.guerreiro))
                }
                "mago" -> {
                    binding.buttonIr.text = "Classe: Mago"
                    binding.buttonIr.setBackgroundColor(getColor(R.color.mago))
                }
                "arqueiro" -> {
                    binding.buttonIr.text = "Classe: Arqueiro"
                    binding.buttonIr.setBackgroundColor(getColor(R.color.arqueiro))
                }
                "ladrao" -> {
                    binding.buttonIr.text = "Classe: Ladrão"
                    binding.buttonIr.setBackgroundColor(getColor(R.color.ladrao))
                }
                else -> {
                    binding.buttonIr.text = "Esolher"
                    binding.buttonIr.setBackgroundColor(getColor(R.color.purple_200))
                }
            }
        }
    }
}