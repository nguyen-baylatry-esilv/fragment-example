package fr.esilv.fragmentexample.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import fr.esilv.fragmentexample.R
import fr.esilv.fragmentexample.activities.SecondActivity
import kotlinx.android.synthetic.main.fragment_main.mainFragmentButton

class MainFragment : Fragment() {
	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
	                          savedInstanceState: Bundle?): View? {
		return inflater.inflate(R.layout.fragment_main, container, false)
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		mainFragmentButton.setOnClickListener(OnMainFragmentButtonClickListener())
	}

	private inner class OnMainFragmentButtonClickListener : View.OnClickListener {
		override fun onClick(v: View) {
			startActivity(Intent(v.context, SecondActivity::class.java))
		}
	}
}