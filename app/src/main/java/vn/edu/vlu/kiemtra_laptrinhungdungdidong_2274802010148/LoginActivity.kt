package vn.edu.vlu.kiemtra_laptrinhungdungdidong_2274802010148

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val edtPassword = findViewById<EditText>(R.id.edtPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvStatus = findViewById<TextView>(R.id.tvStatus)

        btnLogin.setOnClickListener {
            val email = edtEmail.text.toString().trim()
            val password = edtPassword.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()) {
                tvStatus.text = "Lỗi: Vui lòng nhập đầy đủ Email và Mật khẩu"
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                tvStatus.text = "Lỗi: Email sai định dạng"
            } else if (password.length < 6) {
                tvStatus.text = "Lỗi: Mật khẩu phải có ít nhất 6 ký tự"
            } else {
                tvStatus.text = "Xác thực thành công!"

                val intent = Intent(this, ProfileActivity::class.java)
                intent.putExtra("KEY_EMAIL", email)
                startActivity(intent)
            }
        }
    }
}