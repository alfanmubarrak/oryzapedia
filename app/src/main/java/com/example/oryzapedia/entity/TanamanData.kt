package com.example.oryzapedia.entity
import com.example.oryzapedia.R
object TanamanData {

    private val Names = arrayOf(
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

    private val EnglishNames = arrayOf(
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

    private val Details = arrayOf(
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

    private val Images = intArrayOf(
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


    val listData: ArrayList<Tanaman>
        get() {
            val list = arrayListOf<Tanaman>()
            for (position in Names.indices) {
                val tanaman = Tanaman()
                tanaman.name = Names[position]
                tanaman.english_name = EnglishNames[position]
                tanaman.detail = Details[position]
                tanaman.photo = Images[position]
                list.add(tanaman)
            }
            return list
        }
}