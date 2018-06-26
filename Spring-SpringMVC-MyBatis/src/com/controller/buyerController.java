package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.service.Impl.BbsBuyerServiceImpl;

@Controller
public class buyerController {
@Autowired
private BbsBuyerServiceImpl bbsbuyer;

}
