package com.the_phyrus.layoutsmateriallesson4.coordinator.behavior

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.appbar.AppBarLayout

// Material Lesson 4 1:50 (примерно)
class CollapseBehaviour(
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
            child.y = 0 + bar.height.toFloat() + bar.y
        } else {

        }
        return super.onDependentViewChanged(parent, child, dependency)
    }
}