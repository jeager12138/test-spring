package com.example.demo.service;

import com.example.demo.dao.GroupDao;
import com.example.demo.model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    @Autowired
    GroupDao groupDao;

    public List<Group> getRootByUserId(int userId) {
        if(groupDao.getRoot(userId).isEmpty()) {
            Group group = new Group(1, userId, 0, 0, 0, "root", "");
            groupDao.insertGroup(group);
        }
        return groupDao.getRoot(userId);
    }

    public Group getGroupById(int id) {
        return groupDao.getGroupById(id);
    }

    public void addGroup(Group group) {
        groupDao.insertGroup(group);
    }

    public void deleteGroup(int id) {
        groupDao.deleteGroupById(id);
    }

    public List<Group> getGroupListByParentId(int parentId) {
        return groupDao.getGroupsByParentId(parentId);
    }
}
