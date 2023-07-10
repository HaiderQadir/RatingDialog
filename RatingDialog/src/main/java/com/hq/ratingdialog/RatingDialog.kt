package com.hq.ratingdialog


import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.DialogFragment

/**
 * Created by Haider on 09/12/2021
 */

class RatingDialog() : DialogFragment() {

    var TAG = "FEEDBACKDIALOG"
    val THRESHOLD = 2
    var title = "Title"
    val body = "Body"

    lateinit var mComments: EditText
    lateinit var mRatingBar: RatingBar
    lateinit var mTitle: TextView
    lateinit var mDetail: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_rating_dialog, container)
    }

    override fun onStart() {
        super.onStart()
        val dialog = dialog
        if (dialog != null) {
            dialog!!.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog!!.setCancelable(true)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, android.R.style.ThemeOverlay_Material_Dialog_Alert)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var mDoneBtn: TextView = view.findViewById(R.id.doneButton)
        mTitle = view.findViewById(R.id.titlelTextView)
        mDetail = view.findViewById(R.id.detailTextView)
        mComments = view.findViewById(R.id.userFeedbackEditText)
        mRatingBar = view.findViewById(R.id.ratingBar)
        var mGetComments: Editable? = mComments.text

        mTitle.text = title
        mDetail.text = body

        mRatingBar.onRatingBarChangeListener =
            RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->
                if (mRatingBar.rating <= THRESHOLD) {
                }
            }

        mDoneBtn.setOnClickListener(View.OnClickListener {
            val getRating: Float = mRatingBar.rating
            Log.d(TAG, "RATING$getRating")

            if (getRating <= THRESHOLD && mComments.text.isEmpty()) {
                Toast.makeText(
                    context,
                    "Please mention the reason for low rating",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                dialog!!.dismiss()
            }
        })
        showsDialog
    }


}




