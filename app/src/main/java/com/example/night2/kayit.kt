package com.example.night2

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.night2.databinding.KayitBinding



class kayit : Fragment() {
    private lateinit var tasarim:KayitBinding



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tasarim=KayitBinding.inflate(inflater,container,false)

        val vt=VeriTabaniYardimcisi(requireContext())

        tasarim.button4.setOnClickListener {
            val kayitisimm = tasarim.kayitisim.text.toString()
            val kayitsifree = tasarim.kayitsifre.text.toString()





            if (TextUtils.isEmpty(kayitisimm) || TextUtils.isEmpty(kayitsifree)){
                Toast.makeText(requireContext(),"hatalı",Toast.LENGTH_SHORT).show()

            }

            else{
                usersdao().kullaniciEkle(vt,kayitisimm,kayitsifree)
                Toast.makeText(requireContext(),"Kullanıcı başarıyla eklendi",Toast.LENGTH_SHORT).show()
            }




        }




        return tasarim.root
    }


}