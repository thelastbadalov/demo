package com.example.bookstore.controller;

import com.example.bookstore.dto.BookOrderRequest;
import com.example.bookstore.model.Book;
import com.example.bookstore.model.Order;
import com.example.bookstore.service.BookService;
import com.example.bookstore.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/books")
public class BookStoreController {

private final OrderService orderService;
private final BookService bookService;

    public BookStoreController(OrderService orderService, BookService bookService) {
        this.orderService = orderService;
        this.bookService = bookService;
    }
    @PostMapping
public ResponseEntity<Order> putAnOrder(@RequestBody BookOrderRequest bookOrderRequest){
Order order=orderService.putAnOrder(bookOrderRequest.getBookIdList(),bookOrderRequest.getUserName());
return ResponseEntity.ok(order);
    }

@GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> books=bookService.getAllBooks();
return ResponseEntity.ok(books);
    }
@GetMapping("/orders")
    public ResponseEntity<List<Order>> getALLOrders(){
        List<Order> orders=orderService.getAllOrders();
        return ResponseEntity.ok(orders);
}

}
