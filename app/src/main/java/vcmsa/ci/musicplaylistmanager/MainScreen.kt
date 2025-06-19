package vcmsa.ci.musicplaylistmanager

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

class MainScreen : AppCompatActivity() {

    private lateinit var addtoplaylist: Button
    private lateinit var songdetails: TextView
    private lateinit var songname: EditText
    private lateinit var artistname: EditText

    private lateinit var songrating: EditText
    private lateinit var usercomments: EditText
    private lateinit var btnClearInputs: Button
    private lateinit var btnNext: Button
    private lateinit var btnExit: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)

        addtoplaylist = findViewById(R.id.btn_add_to_playlist)
        songdetails = findViewById(R.id.song_details)
        songname = findViewById(R.id.song_name)
        artistname = findViewById(R.id.artist_name)
        songrating = findViewById(R.id.song_rating)

        usercomments = findViewById(R.id.user_comments)
        btnNext = findViewById(R.id.next_btn)
        btnClearInputs = findViewById(R.id.clear_inputs_btn)
        btnExit = findViewById(R.id.exit_btn)




        //add details to playlist
        addtoplaylist.setOnClickListener {
            startActivity(Intent(this, MainScreen::class.java))
        }

        btnNext.isEnabled

        // Button to navigate to Detailed View Screen
        btnNext.setOnClickListener {
            startActivity(Intent(this, DetailedViewScreen::class.java))
        }

        // Button to clear data
        btnClearInputs.setOnClickListener {
                startActivity(Intent(this, MainScreen::class.java))
        }

            //Set the setOnClickListener for the Exit Button
            btnExit.setOnClickListener {
                finishAffinity() //Closes all activities in the app
                exitProcess(0)
            }

        }
    }

