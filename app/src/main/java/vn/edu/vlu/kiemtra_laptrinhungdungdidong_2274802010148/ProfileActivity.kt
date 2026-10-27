package vn.edu.vlu.kiemtra_laptrinhungdungdidong_2274802010148

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvEmailProfile = findViewById<TextView>(R.id.tvEmailProfile)
        val btnLogout = findViewById<Button>(R.id.btnLogout)
        val lvSkills = findViewById<ListView>(R.id.lvSkills)

        val email = intent.getStringExtra("KEY_EMAIL")
        tvEmailProfile.text = email

        btnLogout.setOnClickListener {
            finish()
        }

        val skills = arrayOf("Lập trình Kotlin", "Thiết kế Layout XML", "Quản lý Git/GitHub", "Xử lý Intent", "Kiến trúc Android")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, skills)
        lvSkills.adapter = adapter

        lvSkills.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = skills[position]
            Toast.makeText(this, selectedItem, Toast.LENGTH_SHORT).show()
        }
    }
}