package me.luisc.micurriculum

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val workHistory = findViewById<Button>(R.id.btnExperienciaLaboral)
        workHistory.setOnClickListener {
            val irAExperienciaLaboral = Intent(getApplicationContext(), WorkHistory::class.java)
            startActivity(irAExperienciaLaboral)
        }

        val llamarBtn = findViewById<Button>(R.id.btnLlamar)
        llamarBtn.setOnClickListener {
            println("Llamando...")

            val phoneUri = Uri.parse("tel:+59597350*")
            val callIntent = Intent(Intent.ACTION_DIAL,phoneUri)
            startActivity(callIntent)
        }

        val emailBtn = findViewById<Button>(R.id.btnCorreo)
        emailBtn.setOnClickListener {
            println("Emaileando...")

            val emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.setType("plain/text")
            intent.data = Uri.parse("mailto:")
            emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("luiscardozocarr*@gmail.com"))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Lindo CV.... ")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Me gustó tu CV. Me gustaría contratarte para <<describir trabajo>>")
            startActivity(emailIntent)
        }


        val whatsappBtn = findViewById<Button>(R.id.btnWhatsapp)
        whatsappBtn.setOnClickListener {
            println("Whatsapeando...")

            val whatsAppIntent = Intent(Intent.ACTION_SEND)
            whatsAppIntent.setType("plain/text")
            whatsAppIntent.putExtra(Intent.EXTRA_TEXT, "Hola Luis")
            whatsAppIntent.setPackage("com.whatsapp")
            //try {
                startActivity(whatsAppIntent)
            /*} catch (e: Exception) {
                println("Error. WhatsApp no instalado?")
                println(e)
            }
            */
        }
    }
}
