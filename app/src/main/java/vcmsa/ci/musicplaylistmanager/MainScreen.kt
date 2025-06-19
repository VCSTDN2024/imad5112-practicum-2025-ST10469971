package vcmsa.ci.musicplaylistmanager

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainScreen : AppCompatActivity() {

    private lateinit var addtoplaylist: Button
    private lateinit var songdetails: TextView
    private lateinit var songname: EditText
    private lateinit var artistname: EditText

    private lateinit var radioGroupRating: RadioGroup
    private lateinit var rdoRating1: RadioButton
    private lateinit var rdoRating2: RadioButton
    private lateinit var rdoRating3: RadioButton
    private lateinit var rdoRating4: RadioButton
    private lateinit var rdoRating5: RadioButton

    private lateinit var usercomments: EditText
    private lateinit var btnClearInputs: Button
    private lateinit var nextbtn: Button
    private lateinit var btnExit: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)

        addtoplaylist = findViewById(addtoplaylist)
        songdetails = findViewById(songdetails)
        songname = findViewById(songname)
        artistname = findViewById(artistname)

        radioGroupRating = findViewById(R.id.rdoGroupRating)
        rdoRating1 = findViewById(R.id.rdoRating1)
        rdoRating2 = findViewById(R.id.rdoRating2)
        rdoRating3 = findViewById(R.id.rdoRating3)
        rdoRating4 = findViewById(R.id.rdoRating4)
        rdoRating5 = findViewById(R.id.rdoRating5)

        usercomments = findViewById(usercomments)
        nextbtn = findViewById(nextbtn)
        btnClearInputs = findViewById(R.id.clear_inputs_btn)
        btnExit = findViewById(R.id.exit_btn)


        // Button to navigate to Detailed View Screen
        nextbtn.setOnClickListener {
            startActivity(Intent(this, DetailedViewScreen::class.java))
        }

        // Button to clear data
        clearinputsbtn.setOnClickListener {
            radioGroupRating.clearData()
            Toast.makeText(this, "Data cleared.", Toast.LENGTH_SHORT).show()
            updateAverageSongRating()


        }
    }
}
