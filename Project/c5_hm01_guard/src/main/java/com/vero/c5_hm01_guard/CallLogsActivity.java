package com.vero.c5_hm01_guard;

import java.util.List;

import domain.ContactBean;
import engine.ReadContactsEngine;


/**
 * 电话日志导入联系人
 */
public class CallLogsActivity extends BaseFriendsCallSmsActivity {

    /**
     * 提取数据的核心方法,需要覆盖此方法完成数据的显示
     * @return
     */
    @Override
    public List<ContactBean> getDatas() {
        return ReadContactsEngine.readCallLog(getApplicationContext());
    }
}
