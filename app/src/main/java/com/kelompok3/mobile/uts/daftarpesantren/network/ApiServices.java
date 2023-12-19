package com.kelompok3.mobile.uts.daftarpesantren.network;

public class ApiServices {

    public static String BASEURL_PROV = "https://api-pesantren-indonesia.vercel.app/provinsi.json";
    public static String BASEURL_KAB = "https://api-pesantren-indonesia.vercel.app/kabupaten/{id_provinsi}.json";
    public static String BASEURL_PESANTREN = "https://api-pesantren-indonesia.vercel.app/pesantren/{id_kab_kota}.json";
}
