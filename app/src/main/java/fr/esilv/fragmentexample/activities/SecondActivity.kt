package fr.esilv.fragmentexample.activities

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import fr.esilv.fragmentexample.R
import fr.esilv.fragmentexample.fragments.SecondFragment

class SecondActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_second)
	}

	//this method is called by the Button in activity_second.xml. the android:onClick attribute binds with this method.
	fun showFragment(view: View) {
		view.visibility = View.GONE
		supportFragmentManager.beginTransaction()
				.apply {
					//the id passed as parameter is the id of the FrameLayout defined in activity_second.xml.
					replace(R.id.contentFrame, SecondFragment())
					//the transaction has to be committed for changes to happen.
					commit()
				}

	}
}