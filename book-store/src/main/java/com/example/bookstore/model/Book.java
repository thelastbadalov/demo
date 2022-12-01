package com.example.bookstore.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
private String name;
private String author;
private Integer stock;
private Double price;

}
