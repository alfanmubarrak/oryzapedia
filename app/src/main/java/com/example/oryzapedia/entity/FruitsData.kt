package com.example.oryzapedia.entity
import com.example.oryzapedia.R
object FruitsData {

    private val fruitNames = arrayOf(
        "Begonia",
        "Daun Dollar",
        "Daun Puring",
        "Gelombang Cinta",
        "Kadaka (Tanduk Majengan)",
        "Kuping Gajah",
        "Lidah Mertua",
        "Lili Paris",
        "Monstera",
        "Pisang Hias",
        "Pucuk Merah",
        "Sirih Gading",
        "Sri Rejeki",
        "Suplir",
        "Tanduk Rusa"
    )

    private val fruitEnglish = arrayOf(
        "Begonia Glabra",
        "Ficus Pumila",
        "Codiaeum Variegatum",
        "Anthurium Plowmanii",
        "Asplenium Nidus",
        "Anthurium Crystallinum",
        "Sansevieria Trifasciata",
        "Chlorophytum Comosum",
        "Monstera Deliciosa",
        "Calathea SP",
        "Syzygium Myrtifolium",
        "Epipremnum Aureum",
        "Diaffenbachia",
        "Adiatum SP",
        "Platycerium"
    )

    private val fruitDetails = arrayOf(
        "Begonia adalah salah satu tanaman hias daun yang sangat digemari oleh pecinta tanaman hias di luar negeri. Namun, tanaman hias daun yang memiliki ciri khas warna-warna kontras dan pola simetris pada daunnya ini baru populer di Indonesia belum lama ini.\n" +
                "Untuk Toppers yang bosan dengan warna hijau yang monoton, tanaman Begonia bisa jadi alternatif untuk menambah koleksi tanaman hias daun ini.\n",
        "Daun Dollar yang memiliki nama lain Daun Dollar adalah tanaman hias daun yang unik karena daunnya yang tebal dan tampilannya yang mengkilap, membuat tanaman ini terlihat seperti tanaman plastik.\n" +
                "Tanaman hias daun satu ini sangat cocok untuk dijadikan dekorasi asri dalam ruangan. Satu lagi daya tarik dari tanaman ini adalah kepercayaan bahwa tanaman ini mampu mendatangkan keberuntungan.\n",
        "Tak semua tanaman hias daun identik dengan warna hijau yang asri dan menyejukkan, ada pula tanaman hias daun yang disukai justru karena daun dari tanaman tersebut memiliki warna-warna cerah yang mencolok seperti Tanaman Hias Daun Puring.\n" +
                "Hadir dengan warna kemerahan dan keunguan yang bergradasi dengan hijaunya daun menjadikan suasana taman bisa jadi lebih hidup.\n",
        "Tanaman hias daun satu ini merupakan salah satu yang paling populer. Terkenal akan bentuk daunnya yang besar dan bergelombang, tanaman gelombang cinta ini tepat dijadikan tanaman hias baik untuk menghias taman ataupun mengisi pojok ruang atau teras rumah.",
        "Tanaman dengan nama latin Aspienium Scorpio dan juga lebih dikenal dengan nama Pakis Sarang Burung adalah tanaman hias daun yang tak kalah cantik dan cukup mudah tumbuh dan dirawat.\n" +
                "Ciri dari tanaman hias daun ini adalah warna hijaunya yang cerah serta daun memanjang dengan pinggiran yang bergelombang.\n",
        "Satu lagi tanaman hias daun populer Indonesia yang wajib melengkapi koleksi tanaman di taman, Kuping Gajah. Dinamakan Kuping Gajah karena tanaman hias satu ini memiliki bentuk daun yang melebar.\n" +
                "Ditambah tulang daun menjari yang berwarna kontras dari warna daun membuat tampilan tanaman hias daun ini semakin menarik.\n",
        "Tak kalah populer dari tanaman hias daun sebelumnya, Sansevieria yang lebih terkenal dengan nama Lidah Mertua adalah tanaman hias daun lainnya yang bisa Toppers pilih untuk melengkapi koleksi tanaman hias dirumah.\n" +
                "Memiliki pola daun memanjang keatas dengan aksen warna menguning pada bagian pinggirannya, tanaman hias daun ini juga digemari karena khasiatnya mengurangi radiasi dan juga polusi udara.\n",
        "Lili Paris merupakan alternatif tanaman hias daun untuk Toppers yang memiliki lahan terbatas karena ukuran tanaman ini yang tak terlalu besar. Tak hanya ditanam di taman atau pot bunga, Lili Paris juga bisa dijadikan tanaman gantung.\n" +
                "Tanaman hias daun satu ini juga sangat mudah dirawat dan mampu beradaptasi dengan berbagai lingkungan sehingga cocok untuk dijadikan tanaman hias outdoor ataupun indoor.\n",
        "Tanaman hias daun satu ini merupakan salah satu tanaman dekorasi kekinian yang sangat digemari saat ini. Bentuk daun menjadi dengan ciri khas lubang-lubang membuat Monstera sangat unik dan kerap menjadi pilihan dekorasi asri untuk hunian-hunian modern masa kini.",
        "Karakteristik dari Calathea adalah warna daun yang belang-belang membuat tampilannya mampu memberikan warna berbeda pada taman di rumah. Tanaman hias daun ini sendiri memiliki banyak varian yang menawarkan pola serta komposisi warna yang berbeda-beda.",
        "Sesuai dengan namanya, tanaman hias daun selanjutnya ini memiliki bagian pucuk tunas yang berwarna kemerahan. Tanaman ini bisa tumbuh menjadi besar dan rimbun sehingga kerap dijadikan sebagai tanaman pagar atau pembatas di taman.",
        "Sangat mudah dirawat dan ditemukan, Sirih Gading bisa menjadi alternatif tanaman hias daun selanjutnya untuk menghiasi taman rumahmu. Sifatnya yang merambat membuat tanaman hias daun ini tepat untuk menghiasi dinding atau dijadikan tanaman gantung.\n" +
                "Warnanya yang hijau cerah membuat suasana menjadi lebih segar dengan kehadiran tanaman Sirih Gading ini.\n",
        "Sri Rejeki atau Aglaonema adalah tanaman hias daun yang cukup populer di Indonesia. Umumnya, tanaman ini tak tahan terhadap sinar matahari langsung sehingga lebih sering dijadikan hiasan untuk di dalam ruangan.\n" +
                "Salah satu alasan mengapa tanaman hias daun ini digemari adalah kepercayaan masyarakat yang percaya bahwa tanaman ini bisa membawa keberuntungan.\n",
        "Selain tanaman Sirih Gading, tanaman hias daun lain yang juga bisa jadikan tanaman gantung adalah Suplir. Telah lama populer di Indonesia, Suplir termasuk tanaman hias daun yang cukup mudah ditemui dan mudah dirawat karena habitatnya yang lembab sesuai dengan iklim Indonesia.",
        "Dikenal juga dengan nama Simbar Menjangan, Tanduk Rusa adalah tanaman hias daun yang sangat umum ditemui di negara-negara beriklim tropis\n" +
                "Untuk bisa menanam tanaman ini, Toppers harus memiliki pohon untuk dijadikan ‘inang’ agar tanaman ini bisa hidup. Bentuknya yang sangat unik membuat tanaman hias daun ini sangat populer.\n"
    )

    private val fruitsImages = intArrayOf(
        R.drawable.begonia,
        R.drawable.daundolar,
        R.drawable.daunpuring,
        R.drawable.gelombangcinta,
        R.drawable.kadaka,
        R.drawable.kupinggajah,
        R.drawable.lidahmertua,
        R.drawable.liliparis,
        R.drawable.monstera,
        R.drawable.calathea,
        R.drawable.pucukmerah,
        R.drawable.sirihgading,
        R.drawable.srirejeki,
        R.drawable.suplir,
        R.drawable.tandukrusa
    )

    private val fruitBenefit = arrayOf(

        //Alpukat
        "Meningkatkan rasa kenyang\n" +
                "Menurunkan berat badan\n" +
                "Menjaga kesehatan jantung\n" +
                "Menjaga kesehatan rambut\n" +
                "Mencegah penyakit kanker\n" +
                "Menurunkan kolesterol\n" +
                "Menyehatkan kulit\n" +
                "Mengurangi risiko stroke\n" +
                "Menjaga gula darah\n" +
                "Mencegah diabetes",

        //Anggur
        "Mencegah penyakit kanker\n" +
                "Menjaga kesehatan jantung\n" +
                "Menurunkan tekanan darah tinggi\n" +
                "Mencegah daibetes\n" +
                "Menjaga kesehatan kulit\n" +
                "Mencegah penyakit usus\n" +
                "Mengobati asma\n" +
                "Mencegah penuaan dini\n" +
                "Menurunkan berat badan\n" +
                "Mencerdaskan otak",

        //Apel
        "Melindungi sel-sel otak dari demensia pada hari tua\n" +
                "Menstabilkan gula darah\n" +
                "Menurunkan resiko stroke\n" +
                "Mengatasi anemia\n" +
                "Menurunkan berat badan\n" +
                "Melancarkan pencernaan\n" +
                "Menguatkan tulang dan gigi\n" +
                "Meningkatkan kemampuan memori otak\n" +
                "Melawan radikal bebas\n" +
                "Menjaga kesehatan usus",

        //Belimbing
        "Menurunkan berat badan\n" +
                "Mengendalikan kadar gula darah\n" +
                "Memperkuat sistem imunitas\n" +
                "Meredakan sakit maag\n" +
                "Mengurangi resiko penyakit stroke\n" +
                "Mencegah kanker\n" +
                "Meningkatkan kekebalan tubuh\n" +
                "Menyembuhkan masalah kulit\n" +
                "Mengobati sariawan\n" +
                "Mengurangi kadar kolesterol",

        //Blueberry
        "Menigkatkan daya tahan tubuh\n" +
                "Stimulasi otak\n" +
                "Baik untuk kulit kering\n" +
                "Membantu menajamkan penglihatan\n" +
                "Mencegah penyakit kanker\n" +
                "Mencegah resiko terkena tulang keropos\n" +
                "Menjaga kesehatan jantung\n" +
                "Menurunkan gula darah\n" +
                "Mengurangi lemak badan\n" +
                "Baik untuk pertumbuhan tulang bayi",

        //Buah_Naga
        "Melindungi tubuh dari radikal bebas\n" +
                "Menjaga kelancaran metabolisme tubuh\n" +
                "Mencegah dan meringankan kram otot\n" +
                "Menjaga kesehatan jantung\n" +
                "Memelihara kekuatan tulang\n" +
                "Mencegah penyakit kanker\n" +
                "Meningkatkan nafsu makan\n" +
                "Melancarkan peredaran darah\n" +
                "Mengatasi anemia\n" +
                "Mencegah diabetes",

        //Ceri
        "Melindungi tubuh dari peradangan\n" +
                "Melindungi tubuh dari radikal bebas\n" +
                "Menurunkan berat badan\n" +
                "Menjaga kesehatan jantung\n" +
                "Menurunkan resiko asam urat\n" +
                "Mengurangi kadar kolesterol\n" +
                "Mencegah penyakit kanker\n" +
                "Meningkatkan kualitas tidur\n" +
                "Membantu menajamkan penglihatan\n" +
                "Meningkatkan sistem kekebalan tubuh",

        //Duku
        "Meningkatkan sistem imun\n" +
                "Melancarkan sistem pencernaan\n" +
                "Sumber antioksidan\n" +
                "Menjaga kesehatan gigi dan gusi\n" +
                "Mengurangi kadar kolesterol\n" +
                "Mengobati diare\n" +
                "Menjaga kesehatan kulit\n" +
                "Mencegah penuaan dini\n" +
                "Mengurangi kadar kolesterol\n" +
                "Menurunkan berat badan",

        //Durian
        "Menjaga kesehatan tulang\n" +
                "Membantu meringankan depresi\n" +
                "Meningkatkan kualitas tidur\n" +
                "Melancarakan sistem pencernaan\n" +
                "Mengatasi anemia\n" +
                "Menjaga kesehatan jantung\n" +
                "Meningkatkan sistem imun\n" +
                "Mencegah penuaan dini\n" +
                "Memelihara kekuatan tulang\n" +
                "Mempertahankan tingkat tekanan darah",

        //Jambu
        "Mengobati demam berdarah\n" +
                "Mempertahankan tingkat tekanan darah\n" +
                "Mengobati sariawan\n" +
                "Melancarakan sistem pencernaan\n" +
                "Mengurangi kadar kolesterol\n" +
                "Mengatasi anemia\n" +
                "Menjaga kesehatan mata\n" +
                "Mengobati diare\n" +
                "Menjaga gula darah\n" +
                "Menjaga kesehatan jantung",

        //Jeruk
        "Menigkatkan daya tahan tubuh\n" +
                "Mencegah penyakit kanker\n" +
                "Menjaga tekanan darah tetap normal\n" +
                "Mengurangi kadar kolesterol\n" +
                "Melancarakan sistem pencernaan\n" +
                "Mengurangi stres dan depresi" +
                "Memelihara kekuatan tulang\n" +
                "Menurunkan berat badan\n" +
                "Menjaga gula darah\n" +
                "Memperbaiki suasana hati",

        //Pisang
        "Sebagai sumber energi\n" +
                "Melancarakan sistem pencernaan\n" +
                "Meredakan sakit maag\n" +
                "Mengobati diare\n" +
                "Mengatasi anemia\n" +
                "Memperbaiki suasana hati\n" +
                "Menjaga kesehatan kulit\n" +
                "Mengobati jerawat\n" +
                "Menjaga kesehatan jantung\n" +
                "Menjaga kesehatan tulang",

        //Rambutan
        "Menjaga kesehatan jantung\n" +
                "Mencegah penyakit ginjal\n" +
                "Menjaga kesehatan tulang\n" +
                "Mengatasi hipertensi/darah tinggi\n" +
                "Meningkatkan metabolisme tubuh\n" +
                "Menjaga kesehatan jantung\n" +
                "Menurunkan berat badan\n" +
                "Menjaga kesehatan kulit\n" +
                "Mencegah penyakit kanker\n" +
                "Mengobati sembelit",

        //Stroberi
        "Menjaga kesehatan jantung\n" +
                "Mencegah penuaan dini\n" +
                "Memperkuat daya tahan tubuh\n" +
                "Mengurangi peradangan dalam tubuh\n" +
                "Menjaga ksehatan mata\n" +
                "Mencegah penyakit kanker\n" +
                "Mengobati nyeri sendi dan asam urat\n" +
                "Mencegah penyakit kanker\n" +
                "Mengatasi hipertensi/darah tinggi\n" +
                "Mengendalikan kadar gula darah"
    )


    val listData: ArrayList<Fruits>
        get() {
            val list = arrayListOf<Fruits>()
            for (position in fruitNames.indices) {
                val fruits = Fruits()
                fruits.name = fruitNames[position]
                fruits.english_name = fruitEnglish[position]
                fruits.detail = fruitDetails[position]
                fruits.photo = fruitsImages[position]
                fruits.benefits = fruitBenefit[position]
                list.add(fruits)
            }
            return list
        }
}