package com.example.night2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.night2.databinding.FragmentGirisBinding


class giris : Fragment() {
    private lateinit var tasarim:FragmentGirisBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim= FragmentGirisBinding.inflate(inflater,container,false)

        val vt=VeriTabaniYardimcisi(requireContext())


        tasarim.button3.setOnClickListener {
            val username = tasarim.girisisim.text.toString() // Kullanıcı adını EditText'ten al
            val password = tasarim.girissifre.text.toString() // Şifreyi EditText'ten al
            val girdiBasarili = usersdao().kullaniciGiris(vt, username, password)

            if (girdiBasarili) {
                Navigation.findNavController(it).navigate(R.id.action_giris_to_mainpage)
            } else {
                Toast.makeText(context, "Kullanıcı adı veya şifre hatalı", Toast.LENGTH_SHORT).show()
                // Giriş başarısızsa, kullanıcıya uygun mesajı göster
            }
        }


















        return tasarim.root
    }


}