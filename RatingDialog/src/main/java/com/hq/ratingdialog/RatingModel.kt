package com.hq.ratingdialog

class RatingModel {

    lateinit var mTitle: String
    lateinit var mDetail: String
    lateinit var mComment: String
    lateinit var mSubmit: String
    var mDialogCancelable: Boolean = false
    var mThreshold: Int = 0

    constructor(
        mTitle: String,
        mDetail: String,
        mComment: String,
        mSubmit: String,
        mDialogCancelable: Boolean,
        mThreshold: Int
    ) {
        this.mTitle = mTitle
        this.mDetail = mDetail
        this.mComment = mComment
        this.mSubmit = mSubmit
        this.mDialogCancelable = mDialogCancelable
        this.mThreshold = mThreshold
    }
}