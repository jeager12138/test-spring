package com.example.demo.service;


import com.example.demo.dao.BaseConfigDao;
import com.example.demo.dao.ChannelConfigDao;
import com.example.demo.dao.StatusConfigDao;
import com.example.demo.dao.VersionConfigDao;
import com.example.demo.model.BaseConfig;
import com.example.demo.model.ChannelConfig;
import com.example.demo.model.StatusConfig;
import com.example.demo.model.VersionConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceConfigService {
    @Autowired
    VersionConfigDao versionConfigDao;
    @Autowired
    ChannelConfigDao channelConfigDao;
    @Autowired
    BaseConfigDao baseConfigDao;
    @Autowired
    StatusConfigDao statusConfigDao;

    public void updateVersionConfig(VersionConfig versionConfig) {
        if(versionConfigDao.getVersionConfig(versionConfig.getUserId()) == null) {
            versionConfigDao.insertVersionConfig(versionConfig);
            return;
        }
        versionConfigDao.updateVersionConfigByUserId(versionConfig);
    }

    public void updateChannelConfig(ChannelConfig channelConfig) {
        if(channelConfigDao.getChannelConfig(channelConfig.getUserId()) == null) {
            channelConfigDao.insertChannelConfig(channelConfig);
            return;
        }
        channelConfigDao.updateChannelConfigByUserId(channelConfig);
    }

    public void updateBaseConfig(BaseConfig baseConfig) {
        if(baseConfigDao.getBaseConfig(baseConfig.getUserId()) == null) {
            baseConfigDao.insertBaseConfig(baseConfig);
            return;
        }
        baseConfigDao.updateBaseConfigByUserId(baseConfig);
    }

    public void updateStatusConfig(StatusConfig statusConfig) {
        if(statusConfigDao.getStatusConfig(statusConfig.getUserId()) == null) {
            statusConfigDao.insertStatusConfig(statusConfig);
            return;
        }
        statusConfigDao.updateStatusConfigByUserId(statusConfig);
    }



}
