package com.easybank.accounts.service.impl;

import com.easybank.accounts.constants.AccountConstants;
import com.easybank.accounts.dto.CustomerDto;
import com.easybank.accounts.entities.Accounts;
import com.easybank.accounts.entities.Customer;
import com.easybank.accounts.mapper.CustomerMapper;
import com.easybank.accounts.repositories.AccountsRepository;
import com.easybank.accounts.repositories.CustomerRepository;
import com.easybank.accounts.service.IAccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class AccountsServiceImpl implements IAccountsService {
    @Autowired
    private AccountsRepository accountsRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public void createAccount(CustomerDto customerDto) {
        Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
        Customer savedCustomer = customerRepository.save(customer);
        accountsRepository.save(createNewAccount(savedCustomer));
    }
    /**
     * @param customer - Customer Object
     * @return the new account details
     */
    private Accounts createNewAccount(Customer customer) {
        Accounts newAccount = new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());
        long randomAccNumber = 1000000000L + new Random().nextInt(900000000);

        newAccount.setAccountNumber(randomAccNumber);
        newAccount.setAccountType(AccountConstants.SAVINGS);
        newAccount.setBranchAddress(AccountConstants.ADDRESS);
        return newAccount;
    }
}
