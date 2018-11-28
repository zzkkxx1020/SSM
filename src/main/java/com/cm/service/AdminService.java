package com.cm.service;

import com.cm.dao.AdminDao;
import com.cm.model.AdminModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminService {
    @Autowired
    private AdminDao adminDao;

    public List<AdminModel> getAllAdmin() {

        return adminDao.getAllAdmin();
    }

    public AdminModel getById(int id) {
        return adminDao.getById(id);
    }
}
