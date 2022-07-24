package com.the_phyrus.layoutsmateriallesson4.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.the_phyrus.layoutsmateriallesson4.databinding.FragmentConstraintBinding

class ConstraintFragment : Fragment() {

    private var _binding: FragmentConstraintBinding? = null
    private val binding: FragmentConstraintBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentConstraintBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.materialButton1.visibility = View.GONE  //не сработает, пока кнопки в единой группе  //FIXME
        binding.materialButton2.visibility = View.GONE  //не сработает, пока кнопки в единой группе  //FIXME
        binding.materialButton3.visibility = View.GONE  //не сработает, пока кнопки в единой группе  //FIXME

        binding.buttons.visibility = View.VISIBLE // а так всё работает
    }

    companion object {

        @JvmStatic
        fun newInstance() = ConstraintFragment()
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

}