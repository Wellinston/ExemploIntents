package br.senac.exemplointents.extras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exemplointents.R
import br.senac.exemplointents.databinding.ActivityExExtrasBinding
import br.senac.exemplointents.databinding.ActivityExExtrasDetalheBinding

class ExExtrasDetalhe : AppCompatActivity() {
    lateinit var binding: ActivityExExtrasDetalheBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExExtrasDetalheBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nome  = intent.getStringExtra("nome")
        val codigo = intent.getIntExtra("codigo", 0)

        binding.textNome.text = "Nome: $nome"
        binding.editCodigoDetalhe.text = codigo.toString()

        binding.buttonVoltar.setOnClickListener {
        //encerra atividade atual
            finish()
        //encerra a aplicação(app)
            //finishAffinity()
        }

    }
}