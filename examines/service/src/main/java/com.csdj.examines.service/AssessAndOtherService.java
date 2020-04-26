package com.csdj.examines.service;

import com.csdj.examines.pojo.Assess;
import com.csdj.examines.pojo.Suggest;
import com.csdj.examines.pojo.Suggestd;
import com.csdj.examines.pojo.Userinfo;

import java.util.List;

public interface AssessAndOtherService {
    Userinfo getUserOne(Integer userid);
    List<Suggest> getAllSuggest();
    List<Suggestd> getAllSuggestD();
    int addAssess(Assess assess);
}
