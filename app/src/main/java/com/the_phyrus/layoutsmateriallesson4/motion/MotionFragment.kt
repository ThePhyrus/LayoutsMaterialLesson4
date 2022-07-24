package com.the_phyrus.layoutsmateriallesson4.motion

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.the_phyrus.layoutsmateriallesson4.databinding.FragmentMotionBinding

class MotionFragment : Fragment() {

    private var _binding: FragmentMotionBinding? = null
    private val binding: FragmentMotionBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMotionBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() = MotionFragment()
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

}