package com.example.myapplication2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication2.databinding.FragmentBlank1Binding


class BlankFragment1 : Fragment() {

    private var _binding: FragmentBlank1Binding? = null

    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBlank1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Here you can use binding to access your views
        binding.button.setOnClickListener {
            val action = BlankFragment1Directions.actionBlankFragment1ToBlankFragment2()
            findNavController().navigate(action)
            // For example: binding.textView.text = "Hello"
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
