package com.bm.rra.crm.service.integration;


import com.bm.rra.crm.entity.integration.Token;
import com.bm.rra.crm.service.BaseService;

public interface VKTokenService extends BaseService<Token, Long> {

    String getVKCode();

    String getVKSAToken();

    void saveTokenByCode(String code);
}
