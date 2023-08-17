package com.hq.ratingdialog

/**
 * @author Haider Qadir
 **/
class RatingModel {

    var mTitle: String
    var mDetail: String
    var mComment: String
    var mSubmit: String
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