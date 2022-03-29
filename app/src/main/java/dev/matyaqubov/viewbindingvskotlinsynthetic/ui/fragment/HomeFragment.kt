package dev.matyaqubov.viewbindingvskotlinsynthetic.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import dev.matyaqubov.viewbindingvskotlinsynthetic.R
import dev.matyaqubov.viewbindingvskotlinsynthetic.databinding.FragmentHomeBinding
import dev.matyaqubov.viewbindingvskotlinsynthetic.ui.viewBinding


class HomeFragment : Fragment(R.layout.fragment_home) {
    private val binding by viewBinding { FragmentHomeBinding.bind(it) }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.tvHome.setOnClickListener {

        }
    }













//    private var _bn:FragmentHomeBinding?=null
//    private val bn get() = _bn!!
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        _bn= FragmentHomeBinding.bind(view)
//        bn.tvHome.setOnClickListener {
//            Toast.makeText(requireContext(), "salom", Toast.LENGTH_SHORT).show()
//        }
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        _bn=null
//    }
}