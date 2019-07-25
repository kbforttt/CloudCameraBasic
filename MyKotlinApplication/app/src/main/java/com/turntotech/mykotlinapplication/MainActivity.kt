package com.turntotech.mykotlinapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {



    var leftCount = 0
    var rightCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addToLeft()
        addToLeft()
        addToLeft()
        addToLeft()

        addToRight()
        addToRight()
        addToRight()
        addToRight()
        addToRight()
        addToRight()
        addToRight()

    }

    fun addToLeft() {
        val detailsFragment = SampleFragment()

        detailsFragment.text = "Left Fragments Count " + (++leftCount)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.Container_LEFT, detailsFragment)
            .addToBackStack(null)
            .commit()
    }

    fun addToRight() {
        val detailsFragment = SampleFragment()

        detailsFragment.text = "Right Fragments Count " + (++rightCount)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.Container_RIGHT, detailsFragment)
            .addToBackStack(null)
            .commit()
    }

    fun bottomBarButtonClicked(view: View) {

        when (view.id) {
            R.id.bottonLeft -> {
                findViewById<View>(R.id.Container_LEFT).visibility = View.VISIBLE
                findViewById<View>(R.id.Container_RIGHT).visibility = View.INVISIBLE
            }
            R.id.bottonRight ->{
                findViewById<View>(R.id.Container_RIGHT).visibility = View.VISIBLE
                findViewById<View>(R.id.Container_LEFT).visibility = View.INVISIBLE
            }
          }


    }
}
