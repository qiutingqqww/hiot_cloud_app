package com.huatec.hiot_cloud.test.mvptest;

import com.huatec.hiot_cloud.test.mvptest.modle.User;

public class TestPresenter {
    private  TestView view;
    public TestPresenter(TestView view) {
        this.view =view;
    }
    public  void Login(User user){
        if ("qiuting".equals(user.getUserName())&& "123".equals(user.getPassword())){
            view.showMessage("登录成功");

        }else{
            view.showMessage("登录失败");
        }
    }
}
