package com.dicoding.submission1;

import java.util.ArrayList;

public class PlayerData {
    private static String[] playerNames= {
            "Lionel Messi",
            "Cristiano Ronaldo",
            "Kylian Mbappe",
            "Eden Hazard",
            "Luka Modric",
            "Frenkie De Jong",
            "Virgil Van Dijk",
            "Sergio Ramos",
            "Marcelo Viera",
            "Matthijs De Light",
            "Alisson Backer"

    };
    private static String[] birthOfDate={
            "24 Juni 1987",
            "05 February 1985",
            "20 Desember 1998",
            "07 Januari 1991",
            "09 September 1985",
            "12 Mei 1997",
            "08 Juli 1991",
            "30 Maret 1986",
            "12 Mei 1988",
            "12 Agustus 1999",
            "02 Oktober 1992"

    };
    private static String[] salary={
            "22,8 Juta EUR",
            "31 Juta EUR",
            "17,5 Juta EUR",
            "10,4 Juta EUR",
            "9,36 Juta EUR",
            "16 Juta EUR",
            "200,000 Pounds",
            "10,4 Juta EUR",
            "8 Juta EUR",
            "11 Juta EUR",
            "4,6 Juta EUR",
            "12 Juta EUR",
    };
    private static String[] currentClub={
            "Barcelona",
            "Juventus",
            "Paris Saint Germain",
            "Real Madrid",
            "Real Madrid",
            "Barcelona",
            "Liverpool",
            "Real Madrid",
            "Real Madrid",
            "Juventus",
            "Liverpool"

    };
    private static String[] description = {
            "Lionel Andrés \"Leo\" Messi adalah seorang pemain sepak bola Argentina yang saat ini bermain untuk FC Barcelona dan merupakan kapten tim nasional sepak bola Argentina dan FC Barcelona, bermain sebagai penyerang. Ia adalah pencetak gol terbanyak Barcelona sepanjang sejarah",
            "Cristiano Ronaldo dos Santos Aveiro, OIH atau lebih dikenal Cristiano Ronaldo merupakan seorang pemain sepak bola Portugal. Ia dapat berposisi sebagai sayap kiri atau kanan serta penyerang tengah. Saat ini ia bermain untuk tim Italia, Juventus dan untuk tim nasional Portugal",
            "Kylian Mbappé Lottin adalah seorang pemain sepak bola profesional Prancis yang bermain sebagai penyerang untuk Paris Saint-Germain dan tim nasional Prancis.",
            "Eden Hazard merupakan seorang pemain sepak bola berkebangsaan Belgia yang bermain untuk klub Real Madrid di Liga Spanyol mulai bulan Juni 2019 dan timnas Belgia. Ia dapat bermain pada posisi gelandang serang dan Gelandang sayap.",
            "Luka Modrić [ˈluːka ˈmɔːdritɕ] adalah pemain sepak bola profesional berkebangsaan Kroasia yang bermain sebagai gelandang untuk Real Madrid di La Liga Spanyol dan tim nasional Kroasia.",
            "Frenkie de Jong adalah seorang pemain sepakbola profesional Belanda yang bermain sebagai gelandang untuk klub Spanyol Barcelona dan Timnas Belanda.",
            "Virgil van Dijk adalah seorang pemain sepak bola profesional Belanda yang bermain sebagai bek tengah di Liga Inggris untuk klub Liverpool dan kapten yang tim nasional sepak bola Belanda. Dianggap sebagai salah satu bek terbaik di dunia, ia dikenal karena kekuatan, kepemimpinan, dan kemampuan aerialnya",
            "Sergio Ramos merupakan seorang pemain sepak bola asal Spanyol yang bermain pada posisi bertahan. Saat ini ia bermain untuk klub Spanyol, Real Madrid yang bermain di La Liga. Ia juga bermain untuk tim nasional Spanyol",
            "Marcelo Vieira da Silva Júnior adalah seorang pemain sepak bola Brasil yang bermain untuk Real Madrid dan tim nasional sepak bola Brasil. Marcelo konon berbakat dengan kemampuan teknis yang besar, tendangan keras, dan passing yang baik.",
            "Matthijs de Ligt adalah pemain sepak bola profesional asal Belanda yang bermain sebagai bek tengah untuk klub Serie A, Juventus dan juga tim nasional Belanda.",
            "Alisson Becker lahir di Novo Hamburgo, 2 Oktober 1992; umur 27 tahun adalah seorang pemain sepak bola berkewarganegaraan Brasil yang bermain untuk klub Liverpool F.C. pada posisi Penjaga gawang. Alisson Becker bermain untuk klub Liverpool sejak tahun 2018, dan membela tim nasional Brasil sejak tahun 2015",

    };
    public static int[] photo={
            R.drawable.messi,
            R.drawable.ronaldo,
            R.drawable.mbappe,
            R.drawable.hazard,
            R.drawable.modric,
            R.drawable.dejong,
            R.drawable.vandijk,
            R.drawable.ramos,
            R.drawable.marcelo,
            R.drawable.delight,
            R.drawable.alisson,
    };

    public static String[] url={
            "https://www.youtube.com/watch?v=FpeiRBTX7mk",
            "https://www.youtube.com/watch?v=o6Jo2hW6gHI",
            "https://www.youtube.com/watch?v=P4AfSRQ_u-0",
            "https://www.youtube.com/watch?v=R_Qj0JIec9Y",
            "https://www.youtube.com/watch?v=jQfowFfaSDo",
            "https://www.youtube.com/watch?v=2gRX6ftcOMI",
            "https://www.youtube.com/watch?v=IkOWWXAK7Cg",
            "https://www.youtube.com/watch?v=4Bnd1YfwUCU",
            "https://www.youtube.com/watch?v=5X_w0cyFSOQ",
            "https://www.youtube.com/watch?v=PlKTVnn-bLE",
            "https://www.youtube.com/watch?v=muQzI4uwwDs"

    };
    static ArrayList<Player> getListData() {
        ArrayList<Player> list = new ArrayList<>();
        for (int position = 0; position < playerNames.length; position++) {
            Player player = new Player();
            player.setName(playerNames[position]);
            player.setDetail(description[position]);
            player.setPhoto(photo[position]);
            player.setSalary(salary[position]);
            player.setCurrent_club(currentClub[position]);
            player.setBirthOfDate(birthOfDate[position]);
            player.setUrl(url[position]);
            list.add(player);
        }
        return list;
    }
}