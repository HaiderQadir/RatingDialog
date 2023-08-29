package com.hq.ratingdialog

/**
 * @author Haider Qadir
 **/
class RatingModel {

    var mTitle: String
    var mDetail: String
    var mComment: String
    var mSubmit: String
    var mAnimation: Boolean = false
    var mDialogCancelable: Boolean = false
    var mThreshold: Int = 0

    constructor(
        mTitle: String,
        mDetail: String,
        mComment: String,
        mSubmit: String,
        mAnimation: Boolean,
        mDialogCancelable: Boolean,
        mThreshold: Int
    ) {
        this.mTitle = mTitle
        this.mDetail = mDetail
        this.mComment = mComment
        this.mSubmit = mSubmit
        this.mAnimation = mAnimation
        this.mDialogCancelable = mDialogCancelable
        this.mThreshold = mThreshold
    }
}