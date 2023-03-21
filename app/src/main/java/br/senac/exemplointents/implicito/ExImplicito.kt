package br.senac.exemplointents.implicito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exemplointents.R
import br.senac.exemplointents.databinding.ActivityExImplicitoBinding

class ExImplicito : AppCompatActivity() {
    lateinit var binding: ActivityExImplicitoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExImplicitoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonIr.setOnClickListener {
            val intent = Intent("br.senac.exemplointents.EXEMPLO")
            startActivity(intent)

        }
    }
}