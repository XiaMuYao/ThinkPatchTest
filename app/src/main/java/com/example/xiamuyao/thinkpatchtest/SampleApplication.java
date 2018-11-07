package com.example.xiamuyao.thinkpatchtest;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * ================================================
 * 作    者：夏沐尧  Github地址：https://github.com/XiaMuYaoDQX
 * 版    本：1.0
 * 创建日期： 2018/11/4
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class SampleApplication extends TinkerApplication {
    public SampleApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.example.xiamuyao.thinkpatchtest.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}