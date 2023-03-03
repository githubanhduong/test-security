package com.cybersoft.demospringboot.controller;

import com.cybersoft.demospringboot.model.AccountModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/{id}/{customerName}")
    public ResponseEntity<?> index(@PathVariable int id,                        // co 2 cach khai bao path variable
                                   @PathVariable("customerName") String customer,
                                   @RequestParam(required = false, defaultValue = "") String address  //@RequestParam(required = true/false, default="")
                                    ){

        return new ResponseEntity<>(
                "Hello restful api" + id + " - " + customer + " - " + address, HttpStatus.INTERNAL_SERVER_ERROR
        );
    }

    /** co 3 kieu truyen ngan param trong spring
     *  1) URL Encoded : Truyen du lieu ngam khong dinh kem file
     *  2) form-data : Truyen du lieu ngam co dinh kem file
     *  3) raw body  : Truyen du lieu ngam dang JSON (@RequestBody truyen ngan trong method get)
     * */

    @GetMapping("/{id}")
    public ResponseEntity<?> insertAccount(
            @PathVariable int id,
            @RequestBody AccountModel accountModel
    ){
//        AccountModel accountModel = new AccountModel();

//        accountModel.setId(id);
//        accountModel.setCustomerName("abcd");
//        accountModel.setAge(15);

        return new ResponseEntity<>(accountModel, HttpStatus.OK);
    }

}
