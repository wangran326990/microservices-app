package com.easybank.accounts.controller;

import com.easybank.accounts.constants.AccountConstants;
import com.easybank.accounts.dto.CustomerDto;
import com.easybank.accounts.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping(path = "api", produces = (MediaType.APPLICATION_JSON_VALUE))
public class AccountsController {
    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountConstants.STATUS_201, AccountConstants.MESSAGE_201));
    }

}
