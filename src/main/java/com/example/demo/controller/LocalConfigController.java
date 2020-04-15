package com.example.demo.controller;


import com.example.demo.model.LocalConfig;
import com.example.demo.service.LocalConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@Controller
public class LocalConfigController {
    @Autowired
    LocalConfigService localConfigService;

    @RequestMapping(path = {"/getLocalConfig"})
    @ResponseBody
    public Map<String, Object> getLocalConfig(@RequestBody Map m) {
        int userId = Integer.parseInt(m.get("userId").toString());
        LocalConfig localConfig = localConfigService.getLocalConfigByUserId(userId);

        Map<String, Object> ret = new HashMap<>();
        ret.put("config", localConfig);
        return ret;
    }

    @RequestMapping(path = {"/updateLocalConfig"})
    @ResponseBody
    public Map<String, Object> updateLocalConfig(@RequestBody Map m) {
        int id = Integer.parseInt(m.get("id").toString());
        String protocolType = m.get("protocolType").toString();
        String playPerformance = m.get("playPerformance").toString();
        String fileFormat = m.get("fileFormat").toString();
        String ruleMsg = m.get("ruleMsg").toString();
        String posMsg = m.get("posMsg").toString();

        LocalConfig localConfig = new LocalConfig();
        localConfig.setId(id);
        localConfig.setRuleMsg(ruleMsg);
        localConfig.setProtocolType(protocolType);
        localConfig.setPosMsg(posMsg);
        localConfig.setPlayPerformance(playPerformance);
        localConfig.setFileFormat(fileFormat);

        localConfigService.updateLocalConfig(localConfig);

        Map<String, Object> ret = new HashMap<>();
        ret.put("code", 0);
        return ret;
    }
}
