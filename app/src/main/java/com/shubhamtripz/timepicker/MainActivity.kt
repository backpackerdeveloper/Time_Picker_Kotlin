package com.shubhamtripz.timepicker

import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timechoose = findViewById<Button>(R.id.timebtn)

        timechoose.setOnClickListener {
            showTimep()
        }

    }

    private fun showTimep(){

        val currentTime = Calendar.getInstance()
        val hour = currentTime.get(Calendar.HOUR_OF_DAY)
        val minute = currentTime.get(Calendar.MINUTE)

        val timePicker = TimePickerDialog(
            this,
            {_, hourOfDay, minute ->
                Toast.makeText(this, "Selected Time: $hourOfDay:$minute ", Toast.LENGTH_SHORT).show()

            },
            hour,
            minute,
            false
        )

        timePicker.show()

    }

}