package com.the_phyrus.layoutsmateriallesson4.coordinator

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.fragment.app.Fragment
import com.the_phyrus.layoutsmateriallesson4.coordinator.behavior.AlphaBehaviour
import com.the_phyrus.layoutsmateriallesson4.databinding.FragmentCoordinatorBinding

class CoordinatorFragment : Fragment() {

    private var _binding: FragmentCoordinatorBinding? = null
    private val binding: FragmentCoordinatorBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCoordinatorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.alphaButton.setOnClickListener {
            Log.d("@@@", "onViewCreated: хахаха") //невидимая кнопка всё равно жмётся))
        }
        val params = (binding.alphaButton.layoutParams as CoordinatorLayout.LayoutParams)
        params.behavior = AlphaBehaviour(requireContext())
        binding.alphaButton.layoutParams = params
    }

    companion object {

        @JvmStatic
        fun newInstance() = CoordinatorFragment()
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

}