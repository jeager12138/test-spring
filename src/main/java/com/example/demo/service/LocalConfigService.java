package com.example.demo.service;

import com.example.demo.dao.LocalConfigDao;
import com.example.demo.model.LocalConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalConfigService {
    @Autowired
    LocalConfigDao localConfigDao;


    public LocalConfig getLocalConfigByUserId(int userid) {
        if(localConfigDao.getLocalConfig(userid) == null) {
            LocalConfig localConfig = new LocalConfig();
            localConfig.setFileFormat("JPEG");
            localConfig.setPlayPerformance("最短时延");
            localConfig.setPosMsg("开启");
            localConfig.setProtocolType("TCP");
            localConfig.setRuleMsg("开启");
            localConfig.setUserId(userid);

            localConfigDao.insertLocalConfig(localConfig);
        }
        return localConfigDao.getLocalConfig(userid);
    }

    public void updateLocalConfig(LocalConfig localConfig) {
        localConfigDao.updateLocalById(localConfig);
    }
}
