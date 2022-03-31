package com.example.reto_rv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.reto_rv.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeCarritoData: Array<JSONObject> = arrayOf(
            JSONObject("{\"title\": \"Libro Las mil y un noches\", \"saler\": \"Juan Perez\", \"price\": \"$1,000.00\"}"),
            JSONObject("{\"title\": \"TV LG 159-5ML\", \"saler\": \"Karla González\", \"price\": \"$39,999.00\"}"),
            JSONObject("{\"title\": \"Botas Tribaleras\", \"saler\": \"José Gomez\", \"price\": \"$1,500.00\"}"),
            JSONObject("{\"title\": \"iPhone 13 PRO MAX\", \"saler\": \"Daniel Rodríguez\", \"price\": \"$40,000.00\"}"),
            JSONObject("{\"title\": \"Jugo del Valle Durazno 3 lt\", \"saler\": \"Kenia Beltran\", \"price\": \"$40\"}"),
        )

        binding.rvCarritoEntries.adapter = MainAdapter(fakeCarritoData)
    }
}