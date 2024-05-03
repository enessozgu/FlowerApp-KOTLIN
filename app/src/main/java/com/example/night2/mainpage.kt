package com.example.night2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.night2.databinding.FragmentMainpageBinding


class mainpage : Fragment() {
    private lateinit var tasarim:FragmentMainpageBinding



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim= FragmentMainpageBinding.inflate(inflater,container,false)


       tasarim.button5.setOnClickListener {
           Navigation.findNavController(it).navigate(R.id.action_mainpage_to_cicekler)
       }

















        return tasarim.root
    }


}