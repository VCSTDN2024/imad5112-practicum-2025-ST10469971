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


        songdetailsdisplayListView = findViewById(R.id.song_details_display)
        exitButton = findViewById(R.id.exit_btn)

        // Load song data into ListView
        val weatherEntries = mutableListOf<String>()
        for (i in WeatherManager.days.indices) {
            weatherEntries.add("${WeatherManager.days[i]}: Min ${WeatherManager.minTemps[i]}°C, Max ${WeatherManager.maxTemps[i]}°C, Condition: ${WeatherManager.conditions[i]}")
        }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, weatherEntries)
        weatherListView.adapter = adapter

        // Navigate back to main screen
        exitButton.setOnClickListener {
            finish()




        val reviewTextView = findViewById<TextView>(R.id.review_text_view)
        val restartBtn = findViewById<Button>(R.id.restart_button)
        val exitBtn = findViewById<Button>(R.id.exit_btn)

        //Get the questions and answers passed from ScoreActivity
        val questions = intent.getStringArrayExtra("questions")
        val answers = intent.getBooleanArrayExtra("answers")

        val reviewText = StringBuilder()
        if (questions != null && answers != null && questions.size == answers.size) {
            for (i in questions.indices) {
                reviewText.append("${i + 1}. ${questions[i]}\n")
                reviewText.append("  Answer: ${if (answers[i]) "True" else "False"}\n\n")
            }
            reviewTextView.text = reviewText.toString()
        } else {
            reviewTextView.text = "Error, please check "
        }

        // Set click listener for the reset button
        restartBtn.setOnClickListener {
            startActivity(Intent(this, MainScreen::class.java))
        }

        // Set click listener for the exit button
        exitBtn.setOnClickListener {
            finishAffinity()
            exitProcess(0)





    }
}