package com.demo.service;


import com.demo.domain.User;
import com.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Downey.hz on 2016/8/23.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository repositoty;

    public User findByid(Integer id){
        System.out.println("啊哈哈"+repositoty.findOne(id));
        return repositoty.findOne(id);
    }

    /*public static Integer id;
    public static Integer defaultPageSize=10;


    public String insert(User user) throws HzbuviException {//增加
        String userLoginName = user.getLoginName();
        ValueUtil.verify(userLoginName,"userLoginNameNull");
        User uu=repositoty.findByLoginName(userLoginName);
        ValueUtil.verify(user.getPassword(),"userPasswordNull");
        ValueUtil.verify(user.getRealName(),"userRealNameNull");
        ValueUtil.verify(user.getCreator(),"CreatorNull");
        if(ValueUtil.isEmpity(uu)){
            Date data=Encode.getTime();
            user.setCreateTime(data);
            String salt= Encode.getSalt(6);
            String password=Encode.hashPassword(user.getPassword(),salt);
            user.setId(getNextID());
            user.setSalt(salt);
            user.setPassword(password);
            user.setIsDelete(DeleteEnum.NOT_DELETE);
            repositoty.save(user);
            return ("create success");
        }else
            return "User already exists";
    }

      public String delete(Integer id)throws HzbuviException{
          ValueUtil.verify(id,"idNull");
          User user= repositoty.findById(id);
          user.setIsDelete(DeleteEnum.DELETED);
          UserData.removeUser(id);
          return "success";
    }
    public List<User> updateLoad(int id){
        List<User> list=new ArrayList<User>();
        User user=repositoty.findOne(id);
        list.add(user);
        return list;
    }
    public String updateSave(Integer id,String newLoginName,String newpassword) {
        User user = repositoty.findById(id);
        String Loginname = user.getLoginName();
        String saltl = user.getSalt();
        String c = user.getCreator();
        if (!newLoginName.equals(Loginname)&&null==repositoty.findByLoginName(newLoginName)||newLoginName.equals(Loginname)) {
                String n = Encode.hashPassword(newpassword, saltl);
                Date data = Encode.getTime();
                user.setModifyTime(data);
                user.setPassword(n);
                user.setLoginName(newLoginName);
                user.setModifier(c);
                repositoty.save(user);
                return ("update success");
        }
            return "user is exist";
    }
    public PageResult searchUser(String loginName, Integer pageNumber)throws HzbuviException {
        //  realName = "%" + realName + "%";
        Pageable pageable = new PageRequest(ValueUtil.coalesce(pageNumber, 0), defaultPageSize);
        Page<User> list = repositoty.findByLoginName(pageable, loginName);
        if(null!=list&&list.getContent().size()>0) {
            if (list.getContent().get(0).getIsDelete().equals(DeleteEnum.DELETED)){
                throw new HzbuviException("userNotExist");
            } else {
                return PageUtil.toPage(list, pageNumber);
            }
        }else
            throw new HzbuviException("userNotExist");
    }
    public PageResult searchAll(Integer pageNumber) {
        Pageable pageable = new PageRequest(ValueUtil.coalesce(pageNumber,0),defaultPageSize);
        Page<User> items = repositoty.findByIsDelete(pageable,DeleteEnum.NOT_DELETE);
        return  PageUtil.toPage(items,pageNumber);
    }

    @Transactional
    public  User hello(Integer id){
        User user = repositoty.findOne(id);
//       Hibernate.initialize(user.getItems());
        System.out.println(user.getItems().toString());
        return user;
    }*/
}
