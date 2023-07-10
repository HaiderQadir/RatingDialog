package com.hq.ratingdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fmL = supportFragmentManager
        var io: RatingDialog = RatingDialog(
            RatingModel(
                " Your Opinion Matters! ",
                "We value your feedback! Help us improve our dialog box feature with your valuable input.",
                " ",
                " ",
                false,
                2
            )
        )
        io.show(fmL, "")

    }
}