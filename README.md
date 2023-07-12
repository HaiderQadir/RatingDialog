# RatingDialog
![ ](https://img.shields.io/badge/-JitPack-red?labelColor=gray&style=for-the-badge)
![ ](https://img.shields.io/badge/Release-v2.0-blue?labelColor=gray&style=for-the-badge)

⚡ A powerful & easy to use rating and feedback library for Android ⚡
 
## To get a Git project into your build:
#### Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:
````
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
````
#### Step 2. Add the dependency
 
````
dependencies {
	implementation 'com.github.HaiderQadir:RatingDialog:Tag'
}
````

*👉 Replace Tag with the latest released version*

## How to use

````
var fragmentManager = supportFragmentManager
var ratingDialog:RatingDialog = RatingDialog(
	RatingModel("Title", "Detail", "Comments",
			"Submit", true, 3))

ratingDialog.show(fragmentManager, "")  
````
Call this above snippet in your `onCreate()`  method of your main Activity.
### The constructor requires 6 data items mentioned below 
- `Title` for Feedback Dialog Box as a String
- `Details` for Feedback Dialog Box as a String
- `Comments` For Feedback Dialog Box as a String
- `Submit` Button Text for Feedback Dialog Box as a String
- `isCancelable` property for Dialog box a Boolean
- `Threshhold` as an Integer

 ## Key Features 🎯
- **View Pager**: Simple and Easy Implementation of View Pager.
- **Indicator**: Indicator for View Pager ensures the track of View Pager status.
- **Custom Rounded View Pager UI**: Custom design for View Pager items.
- **Secure**: Your data, your control. Always.
- **Compatible**: Android 24 or upper.
- **Open Source**: Freedom is beautiful, so is AndroidViewPager. Open source and free to use.
##
 <p align="center">
  <img src="https://github.com/HaiderQadir/RatingDialog/blob/development/design/rating_dialog_ss1.png" width="350" title="hover text">
 </p>

 <p align="center">
     <img src="https://github.com/HaiderQadir/RatingDialog/blob/development/design/rating_dialog_ss2.png" width="380" title="hover text">
 </p>

 <p align="center">
       <img src="https://github.com/HaiderQadir/RatingDialog/blob/development/design/rating_dialog_ss3.png" width="400" title="hover text">
 </p>


 ## License 📄
Copyright 2023 Haider Qadir
