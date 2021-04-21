package com.cimb.technicaltest;

import com.sun.istack.NotNull;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class Pegawai {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Long UserId;

    @Column(nullable = false)
    @NotNull
    @NotEmpty(message = "Nama tidak boleh kosong")
    public String Nama;

    @Column(nullable = false)
    @NotNull
    @NotEmpty(message = "Alamat tidak boleh kosong")
    public String Alamat;

    public Long getId() {
        return UserId;
    }

    public void setId(Long id) {
        this.UserId = id;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String name) {
        this.Nama = name;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        this.Alamat = alamat;
    }
}
