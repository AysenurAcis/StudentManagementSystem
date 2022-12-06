package com.example.studentmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name = "students") //Veritabanı bağlantısında tablo isminin oluşturulmasını sağlayan kısım
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // veritabanında 1-1 arttırır
    private Long id;

    // Veritabanı bağlantısında tablodaki sütunların isimlerini oluşturmak için kullanılan kısım
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

}