package vn.edu.vlu.kiemtra_laptrinhungdungdidong_2274802010148

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvEmailProfile = findViewById<TextView>(R.id.tvEmailProfile)
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        val email = intent.getStringExtra("KEY_EMAIL")
        tvEmailProfile.text = email

        btnLogout.setOnClickListener {
            finish()
        }
    }
}