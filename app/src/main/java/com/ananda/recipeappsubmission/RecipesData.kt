package com.ananda.recipeappsubmission

object RecipesData {

    private val recipeNames = arrayOf("Tumis Taoge Tomat",
    "Telur Rebus Sambal Bawang",
    "Telur Balado",
    "Croffle",
    "Oseng Sawi Putih",
    "Takoyaki Mie",
    "Telur Dadar Tahu",
    "Cumi Sambal Hijau",
    "Ikan Asin Balado",
    "Bihun Bumbu Bawang",
    )

    private val cookTime = arrayOf("20 Menit",
    "35 Menit",
    "45 Menit",
    "20 Menit",
    "40 Menit",
    "30 Menit",
    "40 Menit",
    "55 Menit",
    "65 Menit",
    "25 Menit",
    )

    private val foodPortion = arrayOf("1 Porsi untuk 2 Orang",
    "1 Porsi untuk 3 Orang",
    "1 Porsi untuk 5-6 Orang",
    "1 Porsi untuk 3 Orang",
    "1 Porsi untuk 2 Orang",
    "1 Porsi untuk 4 Orang",
    "1 Porsi untuk 3 Orang",
    "1 Porsi untuk 2 Orang",
    "1 Porsi untuk 5-6 Orang",
    "1 Porsi untuk 1 Orang",
    )

    private val foodBahan = arrayOf("""&#8226; 350 gram taoge besar<br />
        |&#8226; bersihkan 15 batang kucai<br />
        |&#8226; iris 3 cm 3 buah tomat<br />
        |&#8226; iris tipis  6 butir bawang merah<br />
        |&#8226; iris tipis  4 siung bawang putih<br />
        |&#8226; iris tipis  3 buah cabai merah<br />
        |&#8226; iris serong  1 cm lengkuas<br />
        |&#8226; memarkan<br />
        |&#8226; 2 lembar daun salam<br />
        |&#8226; 100 ml air<br />
        |&#8226; 1/2 sdt garam<br />
        |&#8226; 1/2 sdt merica bubuk<br />
        |&#8226; 1/4 gula pasir<br />
        |&#8226; 3 sdm minyak untuk menumis<br />""".trimMargin(),

        """&#8226; 3 butir telur ayam<br />
        |&#8226; 3 siung bawang putih, geprek<br />
        |&#8226; 10 buah cabai rawit<br />
        |&#8226; 10 butir bawang merah<br />
        |&#8226; garam, gula dan kaldu bubuk secukupnya<br />
        |&#8226; minyak secukupnya<br />""".trimMargin(),

        """&#8226; 5 butir telur ayam<br />
        |&#8226; 2 lembar daun jeruk<br />
        |&#8226; Minyak, secukupnya<br />
        |&#8226; Air, secukupnya<br />
        |&#8226; 7 siung bawang merah3 siung bawang putih<br />
        |&#8226; 10 buah cabai keriting<br />
        |&#8226; 7 buah cabai merah besar, buang isinya<br />
        |&#8226; 4 buah cabai rawit<br />
        |&#8226; 1 buah tomat<br />
        |&#8226; 1 sdt gula pasir<br />
        |&#8226; 1 sdt garam<br />
        |&#8226; 1 sdt terasi sangrai<br />
        |&#8226; Penyedap masakan, secukupnya jika suka<br />""".trimMargin(),

        """&#8226; 750 gram puff pastry instan<br />
        |&#8226; Tepung terigu secukupnya untuk taburan<br />
        |&#8226; Mentega secukupnya untuk olesan cetakan<br />
        |&#8226; Gula pasir secukupnya untuk taburan<br />
        |&#8226; Air matang untuk celupan<br />""".trimMargin(),

        """&#8226; 1 buah/bonggol sawi putih potong-potong<br />
        |&#8226; 1 buah jagung manis, serut<br />
        |&#8226; 3 siung bawang putih cincang<br />
        |&#8226; Secukupnya cabai<br />
        |&#8226; Gula garam kaldu bubuk secukupnya<br />
        |&#8226; Air secukupnya<br />""".trimMargin(),

        """&#8226; 1/2 bungkus mie<br />
        |&#8226; 3 butir telur, kocok lepas<br />
        |&#8226; 2 sdm tepung terigu<br />
        |&#8226; 4 sdm susu cair<br />
        |&#8226; 1/2 bagian wortel, rebus sebentar, iris halus<br />
        |&#8226; 1 buah smoked beef, iris halus<br />
        |&#8226; 1 batang daun bawang, iris halus<br />
        |&#8226; Garam, Lada, sedikit kaldu bubuk<br />""".trimMargin(),

        """&#8226; 2 butir telur<br />
        |&#8226; 2 tahu, haluskan<br />
        |&#8226; 2 butir bawang merah, iris tipis<br />
        |&#8226; 2 cabai merah, iris serong<br />
        |&#8226; cabai rawit, iris<br />
        |&#8226; daun bawang, iris<br />
        |&#8226; garam dan lada secukupnya<br />""".trimMargin(),

        """&#8226; cumi 500 gr<br />
        |&#8226; pokak secukupnya<br />
        |&#8226; garam/penyedap<br />
        |&#8226; bombay iris secukupnya<br />
        |&#8226; potongan tomat/dadu<br />
        |&#8226; air jeruk nipis<br />
        |&#8226; daun jeruk nipis<br />""".trimMargin(),

        """&#8226; minyak goreng secukupnya<br />
        |&#8226; 100 gram ikan asin pakang<br />
        |&#8226; 1 sdt garam<br />
        |&#8226; 10 buah cabai merah (halus)<br />
        |&#8226; 8 sdm gula pasir (bisa disesuaikan selera)<br />
        |&#8226; 4 siung bawang putih (halus)<br />
        |&#8226; 50 cc air putih (halus)<br />
        |&#8226; 2 sdm asam jawa (diseduh air hangat)<br />
        |&#8226; 5 butir bawang merah (halus)<br />""".trimMargin(),

        """&#8226; 100 gram bihun<br />
        |&#8226; 1 sdt garam<br />
        |&#8226; 2 siung bawang putih<br />
        |&#8226; 3 siung bawang merah<br />
        |&#8226; lada bubuk dan kaldu bubuk secukupnya<br />
        |&#8226; minyak secukupnya<br />
        |&#8226; 1 batang daun bawang, iris tipis<br />""".trimMargin(),

    )

    private val foodInstruction = arrayOf("""<ol><li>Tumis bawang merah dan bawang putih, tambahkan cabai, lengkuad, dan daun salam. Masak hingga harum sambil diaduk-aduk.</li>
        |<li>Masukkan irisan tomat, aduk. Tuangi air, bubuhi garam, merica bubuk, dan gula pasir. Masak hingga mengental</li>
        |<li>Masukkan taoge dan kucai, aduk rata. Angkat, sajikan bersama nasi hangat</li></ol>""".trimMargin(),

        """<ol><li>Rebus telur hingga matang, kupas dan belah menjadi dua. Taruh di atas piring.</li>
        |<li>Haluskan bawang merah dan cabai rawit, tidak perlu terlalu halus. Bisa juga menghaluskannya menggunakan blender.</li>
        |<li>Panaskan 4 sdm minyak goreng, masukkan bawang putih dan tumis hingga matang menggunakan api kecil. Jika sudah mulai kecokelatan, angkat bawang putih.</li>
        |<li>Masukkan cabai dan bawang yang sudah dihaluskan, tumis hingga matang. Masukkan garam, gula dan kaldu bubuk secukupnya, aduk rata lagi. Angkat.</li>
        |<li>Tuang sambal bawang di atas telur rebus, siap dinikmati bersama nasi hangat.</li></ol>""".trimMargin(),

        """<ol><li>Rebus telur hingga matang. Kupas kulit telur kemudian goreng dengan api besar agar warna dan tekstur telur lebih cantik.</li>
        |<li>Haluskan semua bumbu kecuali daun jeruk.</li>
        |<li>Panaskan minyak, tumis bumbu yang telah dihaluskan hingga harum. Tambahkan daun jeruk.</li>
        |<li>Tambahkan sedikit air kemudian aduk rata, masak hingga mendidih.</li>
        |<li>Masukkan telur yang telah digoreng, masak selama beberapa menit hingga air cukup asat dan bumbu meresap.</li>
        |<li>Angkat telur balado yang telah matang, sajikan selagi masih hangat.</li></ol>""".trimMargin(),

        """<ol><li>Taburi alas memasak dengan tepung terigu dan letakkan selembar puff pastry di atasnya, Bunda. Setelahnya, potong puff menjadi segitiga dengan ukuran sesuai selera.</li>
        |<li>Regangkan puff segitiga kemudian iris sedikit di bagian bawahnya.</li>
        |<li>Setelahnya, gulung puff hingga menyerupai bentuk croissant. Lakukan hingga puff habis.</li>
        |<li>Tutup dengan plastik wrap kemudian diamkan selama 5-15 menit hingga adonan mengembang.</li>
        |<li>Panaskan cetakan waffle dengan api kecil kemudian Olesi dengan mentega.</li>
        |<li>Ambil adonan croissant kemudian celupkan ke dalam air, Bunda. Setelahnya, celupkan ke gula pasir. Ulangi sebanyak dua kali kemudian lakukan sampai adonan habis.</li>
        |<li>Setelah cetakan panas, masukkan adonan croissant ke dalam cetakan dan tutup cetakan. Masak kelama 2 sampai 3 menit lalu balik cetakan agar croffle matang merata.</li>
        |<li>Buka cetakan dan angkat. Croffle buatan Bunda siap disajikan.</li></ol>""".trimMargin(),

        """<ol><li>Tumis bawang putih sampai harum, masukkan cabai uleg, jagung, dan air</li>
        |<li>Tunggu sampai jagung empuk/cukup matang</li>
        |<li>Masukkan sawi putih, tambah garam gula dan kaldu bubuk</li>
        |<li>Aduk rata tunggu sawi layu, matikan kompor</li>
        |<li>Sajikan pada mangkuk.</li></ol>""".trimMargin(),

        """Rebus matang mi, tiriskan dan sisihkan</li>
        |<li>Larutkan tepung terigu dengan susu cair, aduk sampai tidak bergerindil</li>
        |<li>Masukkan telur, smocked beef, daun bawang, garam, lada, kaldu, telur, dan mie, aduk rata</li>
        |<li>Tuang kedalam cetakan takoyaki, masak sampai matang dengan api kecil dan pan ditutup.</li></ol>""".trimMargin(),

        """<ol><li>Campur tahu yang telah dihaluskan dengan telur. Tambahkan irisan bawang merah, cabai merah, daun bawang, garam dan lada, aduk rata</li>
        |<li>Panas minyak agak banyak hingga benar-benar panas, goreng hingga matang, angkat dan tiriskan</li>
        |<li>Sajikan hangat-hangat.</li></ol>""".trimMargin(),

        """<ol><li>Bersihkan cuci, potong-potong.
        |<li>Sirami dengan air jeruk nipis dan garam diamkan 5 menit kemudian bilas, goreng cumi sebentar dan tiriskan</li>
        |<li>Cuci pokak, goreng sebentar, sisihkan</li>
        |<li>Ulek kasar cabai, garam/penyedap</li>
        |<li>Panaskan minyak, masukkan bombai, potongan tomat sampai layu, masukkan cabai ulek dan daun jeruk</li>
        |<li>Masukkan cumi dan pokak aduk-aduk sampai tercampur rata sajikan.</li></ol>""".trimMargin(),

        """<ol><li>Goreng ikan asin sampai menguning dengan api sedang, lalu sisihkan sebentar</li>
        |<li>Tumis bumbu yang sudah dihaluskan, kemudian tambahkan asam jawa, gula pasir dan garam secukupnya</li>
        |<li>Kalau sudah, kecilkan api, masukkan ikan asin pakang yang sudah digoreng tadi ke bumbu. Aduk sampai bumbu meresap sempurna.</li></ol>""".trimMargin(),

        """<ol><li>Rendam bihun dengan air panas hingga empuk dan mengembang. Tiriskan</li>
        |<li>Haluskan bawang putih dan bawang merah</li>
        |<li>Tumis bumbu hingga matang, masukkan garam, kaldu bubuk dan lada bubuk. Aduk sebentar</li>
        |<li>Masukkan bihun dan aduk rata dengan bumbu. Tabur daun bawang di akhir, aduk rata. Matikan api</li>
        |<li>Bihun bumbu bawang siap disajikan.</li></ol>""".trimMargin(),

    )

    private val foodImages = intArrayOf(R.drawable.asset_tauge,
        R.drawable.telur_bawang,
        R.drawable.telur_balado,
        R.drawable.croffle,
        R.drawable.oseng_sawi,
        R.drawable.takoyaki,
        R.drawable.telur_dadar,
        R.drawable.cumi_hijau,
        R.drawable.ikan_balado,
        R.drawable.bihun_bawang,
        )

    val listData: ArrayList<Recipe>
        get() {
            val list = arrayListOf<Recipe>()
            for (position in recipeNames.indices) {
                val recipe = Recipe()
                recipe.name = recipeNames[position]
                recipe.cookTime = cookTime[position]
                recipe.foodPortion = foodPortion[position]
                recipe.foodBahan = foodBahan[position]
                recipe.foodInstruction = foodInstruction[position]
                recipe.foodPhoto = foodImages[position]

                list.add(recipe)
            }
            return list
        }

    fun getData(pos: Int): Recipe {
        val recipe = Recipe()
        recipe.name = recipeNames[pos]
        recipe.cookTime = cookTime[pos]
        recipe.foodPortion = foodPortion[pos]
        recipe.foodBahan = foodBahan[pos]
        recipe.foodInstruction = foodInstruction[pos]
        recipe.foodPhoto = foodImages[pos]

        return recipe
    }
}