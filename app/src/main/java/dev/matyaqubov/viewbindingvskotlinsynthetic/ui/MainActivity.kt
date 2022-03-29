package dev.matyaqubov.viewbindingvskotlinsynthetic.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dev.matyaqubov.viewbindingvskotlinsynthetic.R
import dev.matyaqubov.viewbindingvskotlinsynthetic.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_home.*



class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        
        binding.btnClick.setOnClickListener {
            Toast.makeText(this, "Assalom men Binding", Toast.LENGTH_SHORT).show()
        }
        
//        //otvoradi
//        btn_click_home.setOnClickListener {
//            Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
//        }
        
        

    }
}