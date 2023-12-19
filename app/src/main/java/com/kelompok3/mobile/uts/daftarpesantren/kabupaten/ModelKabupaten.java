package com.kelompok3.mobile.uts.daftarpesantren.kabupaten;

import java.io.Serializable;
public class ModelKabupaten implements Serializable {

    String id;
    String nama;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
