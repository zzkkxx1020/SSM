package com.cm.dao;

import com.cm.model.AdminModel;

import java.util.List;

public interface AdminDao {
    List<AdminModel> getAllAdmin();

    AdminModel getById(int id);
}
