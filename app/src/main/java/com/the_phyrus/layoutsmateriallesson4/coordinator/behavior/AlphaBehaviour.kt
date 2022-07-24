package com.the_phyrus.layoutsmateriallesson4.coordinator.behavior

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.appbar.AppBarLayout
import kotlin.math.abs


// Material Lesson 4 1:50 (примерно) 2:43 подытог
class AlphaBehaviour(
    context: Context,
    attrs: AttributeSet? = null
) :
    CoordinatorLayout.Behavior<View>(context, attrs) {

    override fun layoutDependsOn(
        parent: CoordinatorLayout,
        child: View,
        dependency: View
    ): Boolean {
        return (dependency is AppBarLayout)
    }

    override fun onDependentViewChanged(
        parent: CoordinatorLayout,
        child: View,
        dependency: View
    ): Boolean {
        if (dependency is AppBarLayout) {
            val bar = dependency as AppBarLayout
            child.alpha = 1 - abs(2.1f * bar.y) / bar.height.toFloat()
            child.x =
                (bar.width.toFloat() - child.width) * (1 - abs(2 * bar.y) / bar.height.toFloat())
        } else {

        }
        return super.onDependentViewChanged(parent, child, dependency)
    }
}