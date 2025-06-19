package vcmsa.ci.musicplaylistmanager

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

class DetailedViewScreen : AppCompatActivity() {

    private lateinit var exitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view_screen)


            songname= intent.getStringArrayListExtra("song name") ?: arrayListOf()
            artistname = intent.getStringArrayListExtra("artist name") ?: arrayListOf()
            rating = intent.getIntegerArrayListExtra("rating") ?: arrayListOf()
            comments = intent.getStringArrayListExtra("comments") ?: arrayListOf()
            songdetails= findViewById(R.id.song_details_display_Textview)

        //Get the details passed from MainScreenActivity
        val songname = intent.getStringArrayExtra("song name")
        val artistname = intent.getBooleanArrayExtra("artist name")
        val rating = intent.getBooleanArrayExtra("rating")
        val comments = intent.getBooleanArrayExtra("comments")
        val songdetails = intent.getBooleanArrayExtra("songdetails")

            val feedback = if (rating >= 1) {
                "succesfully added"
            } else {

            "Please ensure that your rating is between 1-5"
        }
        feedbackTextView.text = feedback

        val calculateAverage = findViewById<Button>(R.id.calculate_average)
        val averageRating = findViewById<TextView>(R.id.average_rating)
        val exitButton = findViewById<Button>(R.id.exit_btn)
        val reviewTextView = findViewById<TextView>(R.id.calculate_average)


            // Set click listener for the exit button
            exitButton.setOnClickListener {
                finishAffinity()
                exitProcess(0)


            }
        }
    }
