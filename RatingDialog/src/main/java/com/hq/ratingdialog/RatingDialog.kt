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
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.bumptech.glide.Glide

/**
 * @author Haider Qadir
 **/
class RatingDialog(ratingModel: RatingModel) : DialogFragment() {

    private var TAG = "RATING_DIALOG"

    lateinit var mTitleTV: TextView
    lateinit var mDetailTV: TextView
    lateinit var mCommentsET: EditText
    lateinit var mImageView: ImageView
    lateinit var mRatingBar: RatingBar

    private val THRESHOLD = ratingModel.mThreshold
    private val mTitle = ratingModel.mTitle
    private val mDetail = ratingModel.mDetail
    private val mAnimation = ratingModel.mAnimation
    private val mDialogCancelable = ratingModel.mDialogCancelable

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_rating_dialog, container)
    }

    override fun onStart() {
        super.onStart()
        val dialog = dialog
        if (dialog != null) {
            dialog!!.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog!!.setCancelable(mDialogCancelable)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, android.R.style.ThemeOverlay_Material_Dialog_Alert)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        var mDoneBtn: TextView = view.findViewById(R.id.doneButton)
        mTitleTV = view.findViewById(R.id.titlelTextView)
        mDetailTV = view.findViewById(R.id.detailTextView)
        mCommentsET = view.findViewById(R.id.userFeedbackEditText)
        mImageView = view.findViewById(R.id.imageViewGif)
        mRatingBar = view.findViewById(R.id.ratingBar)
        var mGetComments: Editable? = mCommentsET.text

        mTitleTV.text = mTitle
        mDetailTV.text = mDetail


        mRatingBar.onRatingBarChangeListener =
            RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->
                if (mRatingBar.rating <= THRESHOLD) {
                }
            }

        mDoneBtn.setOnClickListener(View.OnClickListener {
            val getRating: Float = mRatingBar.rating
            Log.d(TAG, "RATING: $getRating")

            if (getRating <= THRESHOLD && mCommentsET.text.isEmpty()) {
                Toast.makeText(
                    context, R.string.lowRating, Toast.LENGTH_SHORT
                ).show()
            } else if (getRating == 5f && mAnimation) {
                Glide.with(this).load(R.drawable.congratulations_gif)
                    .into(mImageView)
            } else {
                dialog!!.dismiss()
            }
        })
        showsDialog
    }


}




