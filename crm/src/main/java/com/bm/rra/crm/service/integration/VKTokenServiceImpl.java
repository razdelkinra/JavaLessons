package com.bm.rra.crm.service.integration;

import com.bm.rra.crm.entity.integration.Token;
import com.bm.rra.crm.repository.TokenRepository;
import com.bm.rra.crm.repository.base.BaseRepository;
import com.bm.rra.crm.service.BaseServiceImpl;
import com.bm.rra.crm.util.helper.HTTPHelper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.URL;


@Service
public class VKTokenServiceImpl extends BaseServiceImpl<Token, Long> implements VKTokenService {

    @Value("${vk.client_id}")
    private String client_id;

    @Value("${vk.client_secret_id}")
    private String client_secret;

    @Value("${vk.redirect_uri}")
    private String redirect_uri;

    @Value("${vk.scope}")
    private String scope;

    @Value("${vk.version}")
    private String version;

    private TokenRepository tokenRepository;

    @Autowired
    private HTTPHelper jsonHelper;

    @Autowired
    public VKTokenServiceImpl(TokenRepository tokenRepository) {
        this.tokenRepository = tokenRepository;
    }

    protected BaseRepository<Token, Long> getRepository() {
        return tokenRepository;
    }

    @Override
    public void saveTokenByCode(String code) {
        try {
            URL url = new URL("https://oauth.vk.com/access_token?"
                    + "client_id=" + client_id
                    + "&client_secret=" + client_secret
                    + "&redirect_uri=" + redirect_uri
                    + "&code=" + code);
            Token token = new Gson().fromJson(jsonHelper.readUrl(url), Token.class);
            save(token);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getVKCode() {
        return "redirect:https://oauth.vk.com/authorize?"
                + "client_id=" + client_id
                + "&display=page&redirect_uri=" + redirect_uri
                + "&scope=" + scope
                + "&response_type=code&v="
                + version;
    }

    @Override
    public String getVKSAToken() {
        return "redirect:https://oauth.vk.com/authorize?"
                + "client_id=" + client_id
                + "&groups_ids=1,123456"
                + "&display=page&redirect_uri=" + redirect_uri
                + "&scope=" + scope
                + "&response_type=token&v=5.60";
    }
}
