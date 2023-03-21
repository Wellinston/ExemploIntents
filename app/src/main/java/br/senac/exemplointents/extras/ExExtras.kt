package br.senac.exemplointents.extras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exemplointents.R
import br.senac.exemplointents.databinding.ActivityExExtrasBinding
import br.senac.exemplointents.explicito.ExExplicitoDetalhe

class ExExtras : AppCompatActivity() {
    lateinit var binding: ActivityExExtrasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExExtrasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonIr.setOnClickListener {
            val i = Intent(this, ExExtrasDetalhe::class.java)

            i.putExtra("nome", binding.editTextTextPersonName.text.toString())
            i.putExtra("nome", binding.editCodigo.text.toString().toInt())

            startActivity(i)
        }
    }


}