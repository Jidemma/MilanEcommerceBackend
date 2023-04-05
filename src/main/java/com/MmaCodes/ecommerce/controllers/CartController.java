package com.MmaCodes.ecommerce.controllers;


import com.MmaCodes.ecommerce.documents.Cart;
import com.MmaCodes.ecommerce.model.CartItem;
import com.MmaCodes.ecommerce.services.cart.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/carts/v1/")
@RequiredArgsConstructor
public class CartController {

    final private CartService cartService;

    @PostMapping("add")
    public ResponseEntity<Cart> addToCart(@RequestBody CartItem cartItem){
        return cartService.addToCart(cartItem );
    }

    @GetMapping("carts/{id}")
    public ResponseEntity<Cart> getCart(@PathVariable String id){
        return cartService.getCart(id);
    }

    @GetMapping("carts")
    public ResponseEntity<List<Cart>> getAll(){
        return cartService.getAll();
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteCart(@PathVariable String id){
        return cartService.deleteCart(id);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Cart> updateItemQuantity(@PathVariable String id, @RequestParam int quantity){
        return cartService.updateItemQuantity(id, quantity);
    }

}
