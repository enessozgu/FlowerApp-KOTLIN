package com.example.night2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.night2.databinding.ActivityCiceklerBinding

class cicekler : AppCompatActivity() {
    private lateinit var tasarim:ActivityCiceklerBinding
    private lateinit var adapter: Adapter
    private lateinit var list: ArrayList<Info>


    override fun onCreate(savedInstanceState: Bundle?) {
        tasarim= ActivityCiceklerBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(tasarim.root)





        tasarim.recyclerView.setHasFixedSize(true)

        list= ArrayList()
        list.add(Info(R.drawable.papatya,"PAPATYA","Tek veya çok yıllık otsu karakterde bir bitkidir. Kokulu, beyaz ve sarı renkli çiçekleri vardır. Çiçek tablasının içi boştur. Ilıman iklim koşullarında nisan sonu ve haziran arasında çiçek açar."))
        list.add(Info(R.drawable.menekse,"MENEKŞE","Genellikle uzun ömürlü olabilen menekşe türü, bazen dönemlik de yaşayabilir. Yaprakları kalp şeklini andırır ve düzensiz, asimetrik (çarpık) çiçekleri bulunur."))
        list.add(Info(R.drawable.orkide,"ORKİDE","Orkide çiçeği, uzun bir gövdeye ve küçük yapraklara sahip olan bir çiçektir. Zarafetin sembolü olan orkide çiçeği narin ve güzel bir çiçektir. Pek çok renk seçeneği olan orkide çiçekleri narin görünse de oldukça dayanıklı olan çiçeklerdir."))
        list.add(Info(R.drawable.antoryum,"ANTORYUM","Tek veya çok yıllık otsu karakterde bir bitkidir. Kokulu, beyaz ve sarı renkli çiçekleri vardır. Çiçek tablasının içi boştur. Ilıman iklim koşullarında nisan sonu ve haziran arasında çiçek açar."))
        list.add(Info(R.drawable.begonya,"BEGONYA","Genellikle uzun ömürlü olabilen menekşe türü, bazen dönemlik de yaşayabilir. Yaprakları kalp şeklini andırır ve düzensiz, asimetrik (çarpık) çiçekleri bulunur."))
        list.add(Info(R.drawable.acelya,"AÇELYA","Orkide çiçeği, uzun bir gövdeye ve küçük yapraklara sahip olan bir çiçektir. Zarafetin sembolü olan orkide çiçeği narin ve güzel bir çiçektir. Pek çok renk seçeneği olan orkide çiçekleri narin görünse de oldukça dayanıklı olan çiçeklerdir."))
        list.add(Info(R.drawable.akasyaciceg,"AKASYA","Tek veya çok yıllık otsu karakterde bir bitkidir. Kokulu, beyaz ve sarı renkli çiçekleri vardır. Çiçek tablasının içi boştur. Ilıman iklim koşullarında nisan sonu ve haziran arasında çiçek açar."))
        list.add(Info(R.drawable.sakayik,"ŞAKAYIK","Zarif görünümü ve hoş kokusuyla dikkat çeken şakayık çiçeği, iç mekanlara canlılık katıyor. Farklı renklerde ve çeşitlerde şakayık çiçekleri bulunuyor. Bu çiçekler, genellikle şık aranjmanlar oluşturmak ve balkonları dekore etmek amacıyla kullanılıyor. İlkbahar kokusunu anımsatan şakayık, insan zihnini dinginleştirerek sakinleştirici bir etki bırakıyor. Şakayıklar genellikle buket halinde bulunsa da saksılarda da büyütülebiliyor. Bahar aylarında açılan şakayık çiçeği buketi etrafına hafif ve tatlı bir koku yayıyor. Şakayık çiçeği uygun şartlar sağlandığında nisan ayında açmaya başlıyor. Verimli sonuçlar almak için ideal sıcaklık değeri ve su ihtiyacını eksiksiz şekilde karşılamak önemli. Mineral açısından zengin bir toprak seçerek çiçeğinizi sorunsuz bir şekilde büyütebilirsiniz."))
        list.add(Info(R.drawable.aslanagi,"ASLANAĞZI","Orkide çiçeği, uzun bir gövdeye ve küçük yapraklara sahip olan bir çiçektir. Zarafetin sembolü olan orkide çiçeği narin ve güzel bir çiçektir. Pek çok renk seçeneği olan orkide çiçekleri narin görünse de oldukça dayanıklı olan çiçeklerdir."))

        adapter= Adapter(list)
        tasarim.recyclerView.adapter=adapter
        tasarim.recyclerView.layoutManager=LinearLayoutManager(this)









    }
}