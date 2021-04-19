package com.example.database.service;

import com.example.database.entity.InfectResult;

import java.util.List;

public interface CloseContactService {
    List<InfectResult> getInfectChain();
}
