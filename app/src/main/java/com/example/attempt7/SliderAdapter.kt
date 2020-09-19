package com.example.attempt7

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager.widget.PagerAdapter

class SliderAdapter(var context: Context) : PagerAdapter() {
    var layoutInflater: LayoutInflater? = null
    var images = intArrayOf(
        R.drawable.groceryicon,
        R.drawable.ic_groceries,
        R.drawable.iconfinder_meat02,
        R.drawable.icfind_fruits
    )
    var headings = intArrayOf(
        R.string.first_slide_title,
        R.string.second_slide_title,
        R.string.third_slide_title,
        R.string.fourth_slide_title
    )
    var description = intArrayOf(
        R.string.first_slide_desc,
        R.string.second_slide_desc,
        R.string.third_slide_desc,
        R.string.fourth_slide_desc
    )

    override fun getCount(): Int {
        return headings.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as ConstraintLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = layoutInflater!!.inflate(R.layout.slides_layout, container, false)

//        Hooks
        val imageView = view.findViewById<ImageView>(R.id.slider_image)
        val heading = view.findViewById<TextView>(R.id.slider_heading)
        val desc = view.findViewById<TextView>(R.id.slider_desc)
        imageView.setImageResource(images[position])
        heading.setText(headings[position])
        desc.setText(description[position])
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as ConstraintLayout)
    }
}