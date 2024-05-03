package com.example.night2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.night2.databinding.AnasayfaBinding



class anasayfa : Fragment() {
private lateinit var tasarim:AnasayfaBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tasarim=AnasayfaBinding.inflate(inflater,container,false)







        tasarim.button2.setOnClickListener {




            Navigation.findNavController(it).navigate(R.id.action_anasayfa_to_kayit)
        }

        tasarim.button.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.action_anasayfa_to_giris)
        }























        return tasarim.root
    }


}