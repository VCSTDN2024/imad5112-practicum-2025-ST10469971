package vcmsa.ci.musicplaylistmanager

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    private lateinit var OpenButton: Button
    private lateinit var ExitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        OpenButton = findViewById(R.id.open_btn)
        ExitButton = findViewById(R.id.exit_btn)

        //Set the setOnClickListener for the Open Button
        OpenButton.setOnClickListener {
            //Start the input screen activity
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
        }
        //Set the setOnClickListener for the Exit Button
        ExitButton.setOnClickListener {
            finishAffinity() //Closes all activities in the app
            exitProcess(0)


        }
    }
}


