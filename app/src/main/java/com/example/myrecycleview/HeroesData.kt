package com.example.myrecycleview

object HeroesData {
    private val data = arrayOf(
        arrayOf(
            "Spageti",
            "Spageti adalah salah satu jenis pasta yang berbentuk panjang, tipis, silindris, dan padat, yang jika diperhatikan menyerupai mie pada umumnya. Ini adalah makanan pokok dalam masakan Italia tradisional",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/Spaghettata.JPG/270px-Spaghettata.JPG"
        ),
        arrayOf(
            "Ayam Goreng",
            "Ayam goreng, juga dikenal sebagai ayam goreng selatan, adalah hidangan yang terdiri dari potongan ayam yang telah dilapisi dengan tepung atau adonan yang dibumbui dan digoreng, digoreng, digoreng, atau digoreng. Breading menambahkan lapisan renyah atau kerak ke bagian luar ayam sambil mempertahankan jus dalam daging",
            "https://img.kurio.network/wCRdpY1U8LaA8HQRH_PkVdxx34A=/1200x1200/filters:quality(80)/https://kurio-img.kurioapps.com/21/06/04/0a04bec0-2a01-4552-b6b9-0f6206089bed.jpe"
        ),
        arrayOf(
            "Rendang    ",
            "Rendang atau randang dalam bahasa Minangkabau adalah Masakan Minangkabau yang berbahan dasar daging yang berasal dari Sumatra Barat, Indonesia. Masakan merupakan olahan daging atau telur yang dimasak dalam suhu rendah dalam waktu lama dengan menggunakan aneka rempah-rempah dan santan",
            "https://asset.kompas.com/crops/a29yE_hzxM0nJBIId_Lh6aeDkok=/0x3:977x654/780x390/data/photo/2020/06/30/5efaf91e0ec2c.jpg"
        ),
        arrayOf(
            "Bakso",
            "Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia. Bakso umumnya dibuat dari campuran daging sapi giling dan tepung tapioka, tetapi ada juga bakso yang terbuat dari daging ayam, babi, ikan, udang bahkan daging kerbau               ",
            "https://img.kurio.network/xAbHWPE-jbNSWEWyRoCLxJM6sac=/1200x1200/filters:quality(80)/https://kurio-img.kurioapps.com/21/09/06/2c552606-f62f-475d-81db-e9a57e963a3f.jpe"
        ),
        arrayOf(
            "Taco",
            "Taco adalah makanan khas Meksiko yang terdiri atas gulungan atau lipatan tortilla yang diisi dengan berbagai macam masakan di dalamnya. Salah satu versi Taco terdapat di makanan khas Tex-Mex, yakni Breakfast Taco yang terdiri atas telur dadar dan kombinasi kentang, sosis dan/atau daging babi asap",
            "https://img.taste.com.au/w_-0kcUJ/taste/2016/11/aussie-style-beef-and-salad-tacos-86525-1.jpeg"
        ),
        arrayOf(
            "Susyi",
            "Susyi adalah makanan Jepang yang terdiri dari nasi yang dibentuk bersama lauk berupa makanan laut, daging, sayuran mentah atau sudah dimasak. Nasi susyi mempunyai rasa masam yang lembut karena dibumbui campuran cuka beras, garam, dan gula",
            "https://api-lotte.hollacode.com/api/static/inspirasi/1668577941434-mengenal-10-jenis-sushi-yang-populer-dan-sering-dikonsumsi.jpg"
        ),
        arrayOf(
            "Tteokbokki",
            "Tteokbokki adalah hidangan Korea berupa tepung beras yang dimasak dalam bumbu gochujang yang pedas dan manis. Tepung beras yang dipakai berbentuk bulat batang yang memanjang. Makanan ini juga termasuk dalam makanan internasional",
            "https://lzd-img-global.slatic.net/g/p/2a5d59fa3874ff1b5b6f9dadf77d08fc.jpg_720x720q80.jpg_.webp"
        ),
        arrayOf(
            "Hamburger",
            "Hamburger atau burger adalah sejenis roti berbentuk bundar yang diiris dua, dan di tengahnya diisi dengan patty yang biasanya diambil dari daging, kemudian sayur-sayuran berupa selada, tomat dan bawang bombai. Sebagai sausnya, hamburger diberi berbagai jenis saus seperti mayones, saus tomat dan sambal, serta moster",
            "https://asset.kompas.com/crops/sRANbLZly6_lk-wzwmo1gl8VY1M=/53x36:933x623/375x240/data/photo/2021/10/21/6171492e1ea12.jpg"
        ),
        arrayOf(
            "Borsch",
            "Borsch adalah sebuah sup sayuran dari masakan Ukraina, umum di Eropa Timur. Makanan ini umumnya berbahan baku ubi bit merah dengan tambahan pasta tomat, daging, sayuran, dan sebagainya sesuai selera. Berbagai varian Borsch tidak menggunakan ubi bit merah, seperti borsch hijau dan borsch putih",
            "https://natashaskitchen.com/wp-content/uploads/2018/10/Borscht-Recipe-2-600x900.jpg"
        ),
        arrayOf(
            "Paella",
            "Paella adalah hidangan nasi khas dari Valencia, Spanyol. Paella memiliki akar sejarah kuno, tetapi tampilan modernnya berasal dari pertengahan abad ke-19 di daerah sekitar Teluk Albufera di pantai timur Spanyol, bersebelahan dengan kota Valencia",
            "https://bakeitwithlove.com/wp-content/uploads/2022/06/Spanish-Seafood-Paella-sq.jpg"
        )
    )


    val listData: ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (aData in data) {
                val hero = Hero()
                hero.name = aData[0]
                hero.from = aData[1]
                hero.photo = aData[2]


                list.add(hero)
            }


            return list
        }
}

