package com.example.bookstore.model;

import lombok.*;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Entity(name = "bookOrder")
@Data
@Builder
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Order {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

private String userName;
private Double totalPrice;
@Column
@ElementCollection(targetClass = Integer.class)
private List<Integer> bookList;
}
